package FMCG;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.Duration;

public class RunMultipleIdDifferentBrowserSequential {

    public static void main(String[] args) {
        // Set the paths to the drivers
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Josep\\Desktop\\WebDrivers\\chromedriver.exe");
        System.setProperty("webdriver.edge.driver", "C:\\Users\\Josep\\Desktop\\WebDrivers\\msedgedriver.exe");
        System.setProperty("webdriver.gecko.driver", "C:\\Users\\Josep\\Desktop\\WebDrivers\\geckodriver.exe");

        try (FileInputStream file = new FileInputStream("C:\\Users\\Josep\\Desktop\\FMCG AUTOMATION\\Excels\\RunMultipleIDDifferentBrowserSequential.xlsx");
             // Initialize Excel workbook
             Workbook workbook = new XSSFWorkbook(file);
             FileOutputStream outFile = new FileOutputStream("C:\\Users\\Josep\\Desktop\\FMCG AUTOMATION\\Excels\\RunMultipleIDDifferentBrowserSequential.xlsx")) {

            Sheet joseph = workbook.getSheetAt(0);

            // Iterate over each row in the Excel sheet
            for (int i = 1; i <= joseph.getLastRowNum(); i++) { // Start from 1 as the first row contains headers
                Row row = joseph.getRow(i);

                // Read user ID, password, and browser type from the Excel sheet
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

                String browserType = row.getCell(2).getStringCellValue();

                // Perform login based on the specified browser type
                WebDriver driver = null;
                try {
                    if (browserType.equalsIgnoreCase("Chrome")) {
                        driver = new ChromeDriver();
                    } else if (browserType.equalsIgnoreCase("Edge")) {
                        driver = new EdgeDriver();
                    } else if (browserType.equalsIgnoreCase("Firefox")) {
                        driver = new FirefoxDriver();
                    } else {
                        System.out.println("Unsupported browser type: " + browserType);
                    }

                    if (driver != null) {
                        login(userID, password, driver, row);
                    }
                } finally {
                    if (driver != null) {
                        driver.quit();
                    }
                }
            }

            // Write changes to the Excel file
            workbook.write(outFile);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

 // Method to perform login
    private static void login(String userID, String password, WebDriver driver, Row row) {
        driver.manage().window().maximize();

        try {
            // Navigate to the login page
            driver.get("http://fmcg.sanfmcg.com/");

            // Enter user ID and password
            WebElement userIDField = driver.findElement(By.id("txtUserName"));
            userIDField.sendKeys(userID);

            WebElement passwordField = driver.findElement(By.id("txtPassWord"));
            passwordField.sendKeys(password);

            // Locate and click the login button
            WebElement loginButton = driver.findElement(By.id("btnLogin"));
            loginButton.click();

            // Wait for the login process to complete
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
            WebElement logoutButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("ctl00_Label1")));

            if (logoutButton.isDisplayed()) {
                String browserType = driver.getClass().getSimpleName();
                System.out.println("Login successful for user: " + userID + " using " + browserType);
                Cell statusCell = row.createCell(3); // Assuming status column is at index 3
                statusCell.setCellValue("Pass");
                captureScreenshot(driver, "C:\\Users\\Josep\\Desktop\\FMCG AUTOMATION\\Screenshots\\RunMultipleIDDifferentBrowserSequential", "login_pass_" + userID + ".png");
                driver.quit();
            } 
        } catch (Exception e) {
            String browserType = driver.getClass().getSimpleName();
            System.out.println("Login Failed for user: " + userID + " using " + browserType);
            e.printStackTrace();
            Cell statusCell = row.createCell(3); // Assuming status column is at index 3
            statusCell.setCellValue("Fail");
            // Capture screenshot on error
            captureScreenshot(driver, "C:\\Users\\Josep\\Desktop\\FMCG AUTOMATION\\Screenshots\\RunMultipleIDDifferentBrowserSequential", "login_error_" + userID + ".png");
            driver.quit();
        }
    }


    // Method to capture screenshot
    private static void captureScreenshot(WebDriver driver, String directoryPath, String screenshotFile) {
        try {
            File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(screenshot, new File(directoryPath + File.separator + screenshotFile));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
