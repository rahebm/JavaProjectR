package Class29;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;

public class E1ExcelFile {
    public static void main(String[] args) throws IOException {

        String path = "C:\\Users\\Raheb\\IdeaProjects\\JavaprojectR\\Files\\Employees.xlsx";
        FileInputStream fis = new FileInputStream(path);
        XSSFWorkbook workbook = new XSSFWorkbook(fis);
        Sheet sheet = workbook.getSheet("Sheet1");

        for (int i = 0; i < sheet.getPhysicalNumberOfRows(); i++) {
          Row  row=sheet.getRow(i);
            for (int j = 0; j < row.getPhysicalNumberOfCells(); j++) {
            System.out.print(row.getCell(j)+"    ");

        }
            System.out.println();


    }}
}

