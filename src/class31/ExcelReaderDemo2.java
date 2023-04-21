package class31;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExcelReaderDemo2 {
    public static void main(String[] args) throws IOException {

        String path="Files/Book1.xlsx";
        FileInputStream fileInputStream=new FileInputStream(path);
        XSSFWorkbook xssfWorkbook=new XSSFWorkbook(fileInputStream);
        Sheet sheet1= (Sheet) xssfWorkbook.getSheet("sheet1");
        /*
        getPhysicalNumberOfRows()
        it returns the nof shows that actually contain the dat in Excel file
         */
        int numberOfRows=sheet1.getPhysicalNumberOfRows();
        /*
        we need one loop to go through all the rows one by one
         */
        for (int i = 0; i < numberOfRows; i++) {
            Row row=sheet1.getRow(i);
            int nrOfCells=row.getPhysicalNumberOfCells();
     //Tells us how many cells contain the data
            for (int j = 0; j <nrOfCells ; j++) {
                Cell cell=row.getCell(j);
                System.out.print(cell+" ");

            }
            System.out.println();
        }

        }
        }


