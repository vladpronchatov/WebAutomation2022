package ghfetch;

import datasource.ConnectToExcelFile;

import java.io.IOException;

public class FetchGHSteps {

    ConnectToExcelFile excelFile = new ConnectToExcelFile();

    public String[] getDataFromExcelFile() throws IOException {
        String path = System.getProperty("user.dir")+"/data/gh-test-steps.xls";
        String[] data = excelFile.fileReader2(path,0);

        return data;
    }

}