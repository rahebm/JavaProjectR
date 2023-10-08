package Class29;

import utils.ExcelReader;

import java.io.IOException;
import java.util.List;
import java.util.Map;

public class ExcelReaderTester2 {
    public static void main(String[] args) throws IOException {
       List<Map<String,String>> data= ExcelReader.readExcelData("C:\\Users\\Raheb\\IdeaProjects\\JavaprojectR\\Files\\Task1.xlsx");
        System.out.println(data);

    }


}
