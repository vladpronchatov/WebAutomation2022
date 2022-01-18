package table;

import base.CommonAPI;
import org.openqa.selenium.By;

public class ReadTableData extends CommonAPI {
    public void readTableData(){
        String tableData = driver.findElement(By.cssSelector(".ws-table-all.notranslate tr:nth-child(3) td:nth-child(6)")).getText();
        System.out.println(tableData);
    }
}
