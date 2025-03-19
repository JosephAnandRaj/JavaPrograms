package FMCG;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.File;
import org.apache.commons.io.FileUtils;

public class LoginTestWithExcel {

    public static void main(String[] args) throws InterruptedException {
        // Set the path to chromedriver
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Josep\\Desktop\\WebDrivers\\chromedriver.exe");

        // Initialize WebDriver
        WebDriver driver = new ChromeDriver();	
        driver.manage().window().maximize();

        try (FileInputStream file = new FileInputStream("C:\\Users\\Josep\\Desktop\\FMCG AUTOMATION\\Excels\\LoginTestWithExcel.xlsx");
             // Initialize Excel workbook
             Workbook workbook = new XSSFWorkbook(file);
             FileOutputStream outFile = new FileOutputStream("C:\\Users\\Josep\\Desktop\\FMCG AUTOMATION\\Excels\\LoginTestWithExcel.xlsx")) {

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
                String password = null;
                Cell passwordCell = row.getCell(1);
                if (passwordCell != null) {
                    if (passwordCell.getCellType() == CellType.STRING) {
                        password = passwordCell.getStringCellValue();
                    } else if (passwordCell.getCellType() == CellType.NUMERIC) {
                        password = String.valueOf((int) passwordCell.getNumericCellValue());
                    }
                }

                // Navigate to the login page
                driver.get("http://fmcg.sanfmcg.com/");

                // Enter user ID
                WebElement userIDField = driver.findElement(By.id("txtUserName"));
                userIDField.sendKeys(userID);

                // Enter password
                WebElement passwordField = driver.findElement(By.id("txtPassWord"));
                passwordField.sendKeys(password);
                Thread.sleep(3000);

                // Locate and click the login button
                try {
                    WebElement loginButton = driver.findElement(By.id("btnLogin"));
                    loginButton.click();

                    // Wait for the login process to complete (you should use WebDriverWait instead of Thread.sleep)
                    Thread.sleep(3000);

                    // Example: Check if login is successful by verifying if a specific element exists on the page
                    WebElement logoutButton = driver.findElement(By.xpath("//*[@id=\"ctl00_Label1\"]"));
                    if (logoutButton.isDisplayed()) {
                        System.out.println("Login successful for user: " + userID);
                        Cell statusCell = row.createCell(2); // Assuming status column is at index 2
                        statusCell.setCellValue("Pass");
                    } else {
                        System.out.println("Login failed for user: " + userID);
                        Cell statusCell = row.createCell(2); // Assuming status column is at index 2
                        statusCell.setCellValue("Fail");
                        // Capture screenshot on failure
                        captureScreenshot(driver, "C:\\Users\\Josep\\Desktop\\FMCG AUTOMATION\\Screenshots\\LoginTestWithExcel", "login_fail_" + userID + ".png");
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                    Cell statusCell = row.createCell(2); // Assuming status column is at index 2
                    statusCell.setCellValue("Fail");
                    // Capture screenshot on error
                    captureScreenshot(driver, "C:\\Users\\Josep\\Desktop\\FMCG AUTOMATION\\Screenshots\\LoginTestWithExcel", "login_error_" + userID + ".png");
                }
            }

            // Write changes to the Excel file
            workbook.write(outFile);

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            // Close the browser
            driver.quit();
        }
    }

    // Method to capture screenshot
    public static void captureScreenshot(WebDriver driver, String directoryPath, String screenshotFile) {
        try {
            File screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(screenshot, new File(directoryPath + File.separator + screenshotFile));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
