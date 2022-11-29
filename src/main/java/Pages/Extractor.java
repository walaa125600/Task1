package Pages;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Extractor {
    private static XSSFWorkbook xssfWorkbook;
    private static FileInputStream fileInputStream;

    File src = new File("Registeration.xlsx");

    public Extractor() throws IOException {
        fileInputStream = new FileInputStream(src);
        xssfWorkbook = new XSSFWorkbook(fileInputStream);
    }


    public String Locaters(int sheetNumber, int RowNumber) {
        String ColorsCSS = "";
        XSSFSheet sheet1 = xssfWorkbook.getSheetAt(sheetNumber);
        int i;
        for (i = 0; i < sheet1.getRow(RowNumber).getLastCellNum() - 1; i++) {
            String value = sheet1.getRow(RowNumber).getCell(i + 1).getStringCellValue();
            if (value.equals(""))
                break;
            else
                ColorsCSS = value;
        }


        return ColorsCSS;
    }

}
