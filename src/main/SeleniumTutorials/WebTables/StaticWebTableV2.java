
package WebTables;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class StaticWebTableV2 {
    public static WebDriver driver;
    public static String url="https://omayo.blogspot.com/";
    public static String browser="chrome";

    public static void  launchBrowser(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.get("https://omayo.blogspot.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        System.out.println(driver.getTitle());
    }
    public static void main(String[] args) {
    launchBrowser();
    //totalHeaderRows();
    //totalBodyRows();
        getCellData(1,1,"Kishorel");
    quitBrowser();
    }

   public static void printValue(int rowNumber, int columnNumber){
        WebElement cellData=driver.findElement(By.xpath("//table[@id='table1']//tbody//tr["+rowNumber+"]//td["+columnNumber+"]"));
        String cellDataValue=cellData.getText();
        System.out.println("Cell Data is: "+cellDataValue);
    }

    public static void totalHeaderRows(){
        WebElement totalHeaderRowsData =driver.findElement(By.xpath("//table[@id='table1']//thead//tr"));
        String rowsHeadersData=totalHeaderRowsData.getText();
        int numberOfHeaders=totalHeaderRowsData.findElements(By.tagName("th")).size();
        System.out.println("Number of Headers: "+numberOfHeaders);
        Dimension rowsDataSize= totalHeaderRowsData.getSize();
        System.out.println(rowsDataSize);
        System.out.println("Rows Header Data is: "+rowsHeadersData);
    }
    public static void totalBodyRows(){
        WebElement totalBodyRowsData =driver.findElement(By.xpath("//table[@id='table1']//tbody/tr//td"));
        String rowsBodyData=totalBodyRowsData.getText();
        Dimension rowsDataSize= totalBodyRowsData.getSize();
        System.out.println(rowsDataSize);
        System.out.println("Rows Body Data is: "+rowsBodyData);
    }

    public static void totalRowsData(){
        List<WebElement> totalRowsData =driver.findElements(By.xpath("//table[@id='table1']//tbody//tr"));
        for (WebElement row:totalRowsData){
            System.out.println("Rows Data is: "+row.getText());
        }
    }

    public static void  getCellData(int rowNumber, int columnNumber,String KeyWord) {
        WebElement cellDataKeyWord = driver.findElement(By.xpath("//table[@id='table1']//tbody//tr//td"));
        String cellDataKeyName = cellDataKeyWord.getText();
        if(cellDataKeyName.equalsIgnoreCase(KeyWord)){
        WebElement cellDataValue= driver.findElement(By.xpath("//table[@id='table1']//tbody//tr[" + rowNumber + "]//td[" + columnNumber + "]"));
            String cellDataKeyValue = cellDataValue.getText();
            System.out.println("Cell Data is: " + cellDataKeyValue);
        }
    }


    public static void quitBrowser(){
        driver.quit();
    }
}

