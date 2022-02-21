package googlefetch;

import datasource.ConnectToExcelFile;

import java.io.IOException;

public class FetchGoogleSteps {

    ConnectToExcelFile excelFile = new ConnectToExcelFile();

    public String[] getDataFromExcelFile() throws IOException {
        String path = System.getProperty("user.dir")+"/data/google-test-steps.xls";
        String[] data = excelFile.fileReader2(path,0);

        return data;
    }
}