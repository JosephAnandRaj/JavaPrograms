package StepDefinitions;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import io.cucumber.java.en.Given;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.File;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class LoginWithMultipleUsers {
	WebDriver driver;
	ExtentReports extentReport;
	ExtentSparkReporter htmlReporter;
	ExtentTest testcase;
	
    @Given("Login the Page {string} and {string}")
    public void login_the_page(String username, String password) {
    	extentReport = new ExtentReports();
		htmlReporter = new ExtentSparkReporter("C:\\Users\\Josep\\eclipse-workspace\\Office\\src\\Output\\ExtentReport.html");
		extentReport.attachReporter(htmlReporter);
		driver = new ChromeDriver();
        driver.manage().deleteAllCookies();
		driver.get("http://fmcg.sanfmcg.com/");
		driver.manage().window().maximize();
		
		testcase = extentReport.createTest("Verify the Login with valid Credentials as MGR and Admin");
	   // testcase.log(Status.INFO, "Navigating to FMCG URL");

        try (FileInputStream file = new FileInputStream("C:\\Users\\Josep\\eclipse-workspace\\Office\\src\\Output\\RunMultipleIDDifferentBrowserSequential - Copy.xlsx");
             // Initialize Excel workbook
             Workbook workbook = new XSSFWorkbook(file);
             FileOutputStream outFile = new FileOutputStream("C:\\Users\\Josep\\eclipse-workspace\\Office\\src\\Output\\RunMultipleIDDifferentBrowserSequential - Copy.xlsx")) {

            Sheet sheet = workbook.getSheetAt(0);

            // Iterate over each row in the Excel sheet
            for (Row row : sheet) {
                // Skip header row
                if (row.getRowNum() == 0) {
                    continue;
                }

                // Read user ID from the Excel sheet
                String userID = null;
                Cell userIDCell = row.getCell(0);
                if (userIDCell != null) {
                    if (userIDCell.getCellType() == CellType.STRING) {
                        userID = userIDCell.getStringCellValue();
                    } else if (userIDCell.getCellType() == CellType.NUMERIC) {
                        userID = String.valueOf((int) userIDCell.getNumericCellValue());
                    }
                }

                // Read password from the Excel sheet
                String excelPassword = null;
                Cell passwordCell = row.getCell(1);
                if (passwordCell != null) {
                    if (passwordCell.getCellType() == CellType.STRING) {
                        excelPassword = passwordCell.getStringCellValue();
                    } else if (passwordCell.getCellType() == CellType.NUMERIC) {
                        excelPassword = String.valueOf((int) passwordCell.getNumericCellValue());
                    }
                }

                // Enter user ID and password
                WebElement userIDField = driver.findElement(By.id("txtUserName"));
                userIDField.sendKeys(userID);

                WebElement passwordField = driver.findElement(By.id("txtPassWord"));
                passwordField.sendKeys(excelPassword);
                Thread.sleep(3000);

                // Locate and click the login button
                try {
                    WebElement loginButton = driver.findElement(By.id("btnLogin"));
                    loginButton.click();
                    Thread.sleep(3000);

                    // Example: Check if login is successful by verifying if a specific element exists on the page
                    WebElement logoutButton = driver.findElement(By.xpath("//*[@id=\"ctl00_Label1\"]"));
                    if (logoutButton.isDisplayed()) {
                    	testcase.log(Status.INFO, "Navigating to Login Screen as ADMIN");
                  	  testcase.log(Status.PASS, "Login Successfull for Admin");
                        System.out.println("Login successful for user: " + userID);
                        Cell statusCell = row.createCell(2); // Assuming status column is at index 2
                        statusCell.setCellValue("Pass");
						/*
						 * try { TakesScreenshot screenshot = (TakesScreenshot) driver; File sourceFile
						 * = screenshot.getScreenshotAs(OutputType.FILE); File destinationFile = new
						 * File("Login.png"); FileHandler.copy(sourceFile, destinationFile);
						 * testcase.addScreenCaptureFromPath("Login.png"); } catch (IOException e) {
						 * e.printStackTrace(); // Or handle the exception in a way appropriate to your
						 * application }
						 */

                    } else {
                    	testcase.log(Status.INFO, "Navigating to Login Screen as MGR");
                    	 testcase.log(Status.FAIL, "Unable to Login as MGR with Valid Credentials");
                         System.out.println("Login failed for user: " + username);
                        System.out.println("Login failed for user: " + userID);
                        Cell statusCell = row.createCell(2); // Assuming status column is at index 2
                        statusCell.setCellValue("Fail");
                        // Capture screenshot on failure
                        try {
                    	    TakesScreenshot screenshot = (TakesScreenshot) driver;
                    	    File sourceFile = screenshot.getScreenshotAs(OutputType.FILE);
                    	    File destinationFile = new File("C:\\Users\\Josep\\eclipse-workspace\\Office\\src\\Output\\LoginFail.png");
                    	    FileHandler.copy(sourceFile, destinationFile);
                    	    testcase.addScreenCaptureFromPath("C:\\Users\\Josep\\eclipse-workspace\\Office\\src\\Output\\LoginFail.png");
                    	} catch (IOException e) {
                    	    e.printStackTrace(); // Or handle the exception in a way appropriate to your application
                    	}

                    }
                } catch (Exception e) {
                	testcase.log(Status.INFO, "Navigating to Login Screen as MGR");
               	 testcase.log(Status.FAIL, "Unable to Login as MGR with Valid Credentials");                     System.out.println("Login failed for user: " + username);
                	e.printStackTrace();
                    Cell statusCell = row.createCell(2); // Assuming status column is at index 2
                    statusCell.setCellValue("Fail");
                    // Capture screenshot on error
                    try {
                	    TakesScreenshot screenshot = (TakesScreenshot) driver;
                	    File sourceFile = screenshot.getScreenshotAs(OutputType.FILE);
                	    File destinationFile = new File("C:\\Users\\Josep\\eclipse-workspace\\Office\\src\\Output\\LoginError.png");
                	    FileHandler.copy(sourceFile, destinationFile);
                	    testcase.addScreenCaptureFromPath("C:\\Users\\Josep\\eclipse-workspace\\Office\\src\\Output\\LoginError.png");
                	} catch (IOException e1) {
                	    e1.printStackTrace(); // Or handle the exception in a way appropriate to your application
                	}
                }
            }

            // Write changes to the Excel file
            workbook.write(outFile);

        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        } finally {
            // Close the browser
            driver.quit();
        	extentReport.flush();

        }
    }


    }

