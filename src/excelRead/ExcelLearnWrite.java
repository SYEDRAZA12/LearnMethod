package excelRead;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelLearnWrite {
    public static final String filePath = System.getProperty("user.dir") + "/DataTest/myExcel.xlsx";

    public static void main(String[] args) {
        System.out.println(System.getProperty("user.dir"));

    }
    public static void writeExcel(){
        XSSFWorkbook workbook = new XSSFWorkbook();
        XSSFSheet sheet= workbook.createSheet();
    }

}
