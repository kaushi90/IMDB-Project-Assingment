package framwork.utility;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DatabaseReader {
    public void readExcel(String filePath,String fileName,String sheetName) throws IOException {
        File file =    new File("D:\\imdbProject\\DAO\\"+"Register");
        FileInputStream inputStream = new FileInputStream(file);
        Workbook registeremails = null;
        registeremails = new XSSFWorkbook(inputStream);
        Sheet sheet1 = registeremails.getSheet(sheetName);
        int rowCount = registeremails.getLastRowNum()-registeremails.getFirstRowNum();
        for (int i = 0; i < rowCount+1; i++) {

            Row row = registeremails.getRow(i);
            for (int j = 0; j < row.getLastCellNum(); j++) {


                System.out.print(row.getCell(j).getStringCellValue()+"|| ");
                 return;
            }

            System.out.println();
        }

    }


}
