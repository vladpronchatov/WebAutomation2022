package wsjdatafetch;

import datasource.ConnectToExcelFile;

import java.io.IOException;

public class FetchWSJSteps {

    ConnectToExcelFile excelFile = new ConnectToExcelFile();

    public String[] getDataFromExcelFile() throws IOException {
        String path = System.getProperty("user.dir")+"/data/wsj-test-steps.xls";
        String[] data = excelFile.fileReader2(path,0);

        return data;
    }
}