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
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

public class RunMultipleIdDifferentBrowserParallel {

    static String excel = "C:\\Users\\Josep\\Desktop\\FMCG AUTOMATION\\Excels\\RunMultipleIDDifferentBrowserParallel.xlsx";
    static String screenshot = "C:\\Users\\Josep\\Desktop\\FMCG AUTOMATION\\Screenshots\\RunMultipleIDDifferentBrowserParallel";

    public static void main(String[] args) {
        // Set the paths to the drivers
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Josep\\Desktop\\WebDrivers\\chromedriver.exe");
        System.setProperty("webdriver.edge.driver", "C:\\Users\\Josep\\Desktop\\WebDrivers\\msedgedriver.exe");
        System.setProperty("webdriver.gecko.driver", "C:\\Users\\Josep\\Desktop\\WebDrivers\\geckodriver.exe");

        try (FileInputStream file = new FileInputStream(excel);
             // Initialize Excel workbook
             Workbook workbook = new XSSFWorkbook(file);
             FileOutputStream outFile = new FileOutputStream(excel)) {

            Sheet sheet = workbook.getSheetAt(0);

            int numRows = sheet.getPhysicalNumberOfRows(); // Get the total number of rows in the sheet

            ExecutorService executorService = Executors.newFixedThreadPool(numRows); // Set the thread pool size based on the number of rows excluding the heading row

            // Define a CountDownLatch object with a count of 3
            CountDownLatch latch = new CountDownLatch(3);

            // Iterate over each row in the Excel sheet
            for (int i = 1; i <= sheet.getLastRowNum(); i++) { // Start from 1 as the first row contains headers
                Row row = sheet.getRow(i);

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
                        executorService.execute(new LoginTask(userID, password, driver, row, latch));
                    }
                } finally {
                    if (driver != null) {
                        // driver.quit(); // Removed this line to keep the browser open for all logins
                    }
                }
            }

            // Wait for all login tasks to complete
            executorService.shutdown();
            executorService.awaitTermination(Long.MAX_VALUE, TimeUnit.NANOSECONDS);

            // Write changes to the Excel file
            workbook.write(outFile);
        } catch (IOException | InterruptedException e) {
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
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Method to click the login button
 // Method to click the login button
    private static void clickLogin(WebDriver driver, String userID, Row row) {
        try {
            // Locate and click the login button
            Thread.sleep(10000);
            WebElement loginButton = driver.findElement(By.id("btnLogin"));
            loginButton.click();

            // Wait for the login process to complete
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            WebElement logoutButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("ctl00_Label1")));
            if (logoutButton.isDisplayed()) {
                String browserType = driver.getClass().getSimpleName();
                System.out.println("Login successful for user: " + userID + " using " + browserType);
                Cell statusCell = row.createCell(3); // Assuming status column is at index 3
                statusCell.setCellValue("Pass");
                captureScreenshot(driver, "C:\\Users\\Josep\\Desktop\\FMCG AUTOMATION\\Login with multiple browsers Parallel\\LoginParallelScreenshots", "login_pass_" + userID + ".png");
            } else {
                String browserType = driver.getClass().getSimpleName();
                System.out.println("Login failed for user: " + userID + " using " + browserType);
                Cell statusCell = row.createCell(3); // Assuming status column is at index 3
                statusCell.setCellValue("Fail");
                // Capture screenshot on failure
                captureScreenshot(driver, "C:\\Users\\Josep\\Desktop\\FMCG AUTOMATION\\Login with multiple browsers Parallel\\LoginParallelScreenshots", "login_fail_" + userID + ".png");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    private static void captureScreenshot(WebDriver driver, String string, String string2) {
		// TODO Auto-generated method stub
		
	}


	static class LoginTask implements Runnable {
        private final String userID;
        private final String password;
        private final WebDriver driver;
        private final Row row;
        private final CountDownLatch latch;

        public LoginTask(String userID, String password, WebDriver driver, Row row, CountDownLatch latch) {
            this.userID = userID;
            this.password = password;
            this.driver = driver;
            this.row = row;
            this.latch = latch;
        }

        @Override
        public void run() {
            login(userID, password, driver, row);

            // Decrement the latch count
            latch.countDown();

            try {
                // Wait until all browsers have received the user ID and password
                latch.await();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }

            // After all browsers have received the user ID and password, proceed to click the login button
            clickLogin(driver, userID, row);
        }
    }
}
