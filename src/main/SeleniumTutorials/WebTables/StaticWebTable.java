package WebTables;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class StaticWebTable {
    public static WebDriver driver;
    public static String url="https://omayo.blogspot.com/";
    public static String browser="chrome";

    public static void voidLaunchBrowser(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.get("https://omayo.blogspot.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        System.out.println(driver.getTitle());
    }
    public static void main(String[] args) {

        WebElement totalTableData= driver.findElement(By.xpath("//table[@id='table1']"));
        String tableData=totalTableData.getText();
        System.out.println("Table Data is: "+tableData);
        WebElement totalHeadersData =driver.findElement(By.xpath("//table[@id='table1']//thead//tr"));
        String headersData=totalHeadersData.getText();
        Dimension headersDataSize= totalHeadersData.getSize();
        System.out.println(headersDataSize);
        System.out.println("Headers Data is: "+headersData);
        List<WebElement> totalRowsData =driver.findElements(By.xpath("//table[@id='table1']//tbody//tr"));
       /* String rowsData=totalRowsData.getText();
        Dimension rowsDataSize= totalRowsData.getSize();
        System.out.println(rowsDataSize);
        System.out.println("Rows Data is: "+rowsData);*/
        for (WebElement row:totalRowsData){
            System.out.println("Rows Data is: "+row.getText());
        }
        printValue(2,3);
        driver.quit();
    }

   public static void printValue(int rowNumber, int columnNumber){
        WebElement cellData=driver.findElement(By.xpath("//table[@id='table1']//tbody//tr["+rowNumber+"]//td["+columnNumber+"]"));
        String cellDataValue=cellData.getText();
        System.out.println("Cell Data is: "+cellDataValue);
    }
}
