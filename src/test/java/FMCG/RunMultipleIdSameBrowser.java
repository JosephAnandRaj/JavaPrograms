package FMCG;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class RunMultipleIdSameBrowser {

    public static void main(String[] args) {
        // Set the path to the Chrome driver
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Josep\\Desktop\\WebDrivers\\chromedriver.exe");

        try (FileInputStream file = new FileInputStream("C:\\Users\\Josep\\Desktop\\FMCG AUTOMATION\\Excels\\RunMultipleIDSameBrowserParallel.xlsx");
             // Initialize Excel workbook
             Workbook workbook = new XSSFWorkbook(file)) {

            Sheet sheet = workbook.getSheetAt(0);

            int numRows = sheet.getPhysicalNumberOfRows(); // Get the total number of rows in the sheet

            // Subtract 1 to exclude the heading row
          //  numRows--;

            ExecutorService executorService = Executors.newFixedThreadPool(numRows); // Set the thread pool size based on the number of rows excluding the heading row

            // Iterate over each row in the Excel sheet
            for (Row row : sheet) {
                // Skip header row
                if (row.getRowNum() == 0) {
                    continue;
                }

                // Read user ID and password from the Excel sheet
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

                // Execute login process in a separate thread for each user ID
                executorService.execute(new LoginTask(userID, password));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static class LoginTask implements Runnable {
        private String userID;
        private String password;

        LoginTask(String userID, String password) {
            this.userID = userID;
            this.password = password;
        }

        @Override
        public void run() {
            WebDriver driver = new ChromeDriver(); // Open a new Chrome browser instance

            try {
                // Maximize the browser window
                driver.manage().window().maximize();

                // Navigate to the login page
                driver.get("http://fmcg.sanfmcg.com/");

                // Enter user ID if it's not null or empty
                if (userID != null && !userID.isEmpty()) {
                    WebElement userIDField = driver.findElement(By.id("txtUserName"));
                    userIDField.sendKeys(userID);
                }

                // Enter password if it's not null or empty
                if (password != null && !password.isEmpty()) {
                    WebElement passwordField = driver.findElement(By.id("txtPassWord"));
                    passwordField.sendKeys(password);
                }

                // Locate and click the login button
                WebElement loginButton = driver.findElement(By.id("btnLogin"));
                loginButton.click();

                // Wait for the login process to complete
                WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
                wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ctl00_Label1']")));

                // Example: Check if login is successful
                System.out.println("Login successful for user: " + userID + " using Chrome" );
            } catch (TimeoutException e) {
                // Handle timeout exception (e.g., login failed)
                System.out.println("Login failed for user: " + userID + " using Chrome");
            } catch (Exception e) {
                // Handle other exceptions
                e.printStackTrace();
            } finally {
                // Close the browser
               // if (driver != null) {
                //    driver.quit();
               // }
            }
        }
    }
}
