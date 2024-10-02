package rough;

import java.io.IOException;

import com.utlity.Excel;

public class ExcelReder {
	
	public static void main(String[] args) throws IOException {
		
		
	Excel excel= new Excel(System.getProperty("user.dir")+"\\src\\test\\resources\\TestData\\Test.xlsx");
	
//excel.addSheet("Test_Cases");	
	
//	System.out.println(excel.addColumn("Test_Cases", "Sr._no"));
	//System.out.println(excel.addColumn("Test_Cases", "Test_Case_Name"));
	//System.out.println(excel.addColumn("Test_Cases", "Run_Mode"));
	//System.out.println(excel.addColumn("Test_Cases", "Testing_Type"));
	//System.out.println(excel.addColumn("Test_Cases", "Status"));	
	
	
//	System.out.println(excel.addSheet("Test_Data"));
	
//	System.out.println(excel.addColumn("Test_Data", "First_Name"));
//	System.out.println(excel.addColumn("Test_Data", "Last_Name"));
////	System.out.println(excel.addColumn("Test_Data", "Email_adress"));
//	System.out.println(excel.addColumn("Test_Data", "Mobile_no"));
//	System.out.println(excel.addColumn("Test_Data", "Address"));
//	System.out.println(excel.addColumn("Test_Data", "City"));
//	System.out.println(excel.addColumn("Test_Data", "zip_code"));

	
//	excel.setCellData("Test_Data", "Email_adress", 6, "Bhushan@gmil.com");
//	excel.setCellData("Test_Data", "Mobile_no", 6, "9579835596");
	
	
System.out.println(excel.getCellData("Test_Data","First_Name" , 4));
System.out.println(excel.getCellData("Test_Data","Last_Name" , 4));
System.out.println(excel.getCellData("Test_Data","Email_adress" , 4));
System.out.println(excel.getCellData("Test_Data","Mobile_no" , 4));
	
System.out.println(excel.getColumnCount("Test_Data"));	
	}

}
