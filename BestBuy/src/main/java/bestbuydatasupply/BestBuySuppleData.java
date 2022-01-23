package bestbuydatasupply;

import datasource.ConnectToSqlDB;
import java.util.ArrayList;
import java.util.List;

public class BestBuySuppleData {

    public static List<String> getTestData(){
        List<String> listOfItems = new ArrayList<String>();
        listOfItems.add("Fridge");
        listOfItems.add("Dryer");
        listOfItems.add("TV");
        listOfItems.add("Macbook");
        listOfItems.add("iPhone");
        listOfItems.add("PS5");

        return listOfItems;
    }
    ConnectToSqlDB connectToSqlDB = new ConnectToSqlDB();
    public List<String> getItemListFromDB() throws Exception {
        List<String> list = connectToSqlDB.readDataBase("ItemList","items");

        return list;
    }
}