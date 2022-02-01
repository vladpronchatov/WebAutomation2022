package bestbuyfetch;

import datasource.ConnectToExcelFile;

import java.io.IOException;

public class FetchBestBuySteps {

    ConnectToExcelFile excelFile = new ConnectToExcelFile();

    public static String[] getDataFromExcelFile(String givenPath) throws IOException {
        String[] dataSource = {};
        ConnectToExcelFile connectToExcelFile = new ConnectToExcelFile();
        String path = System.getProperty("user.dir")+"/data/bb-test-steps.xls";
        dataSource = connectToExcelFile.fileReader2(path, 0);
        return dataSource;
    }
}