package program;

import java.sql.Connection;

import com.codoid.products.exception.FilloException;
import com.codoid.products.fillo.Fillo;
import com.codoid.products.fillo.Recordset; 

public class Part2fillo {
	public static void main(String[] args) throws FilloException {
		Fillo fillo=new Fillo();
		 com.codoid.products.fillo.Connection connection= fillo.getConnection("C:/Users/swethash/Desktop/Selenium excel.xlsx");
		  //String strQuery="Select * from Sheet1 where Details='77'";
          //Recordset recordset=connection.executeQuery(strQuery);
        
          //while(recordset.next())
          //{
          //System.out.println(recordset.getField("Name"));
          //}    
          
         String strQuery="INSERT INTO sheet1(id,name,age) VALUES('3','girija','23')";
         connection.executeUpdate(strQuery);
         String strQuery1="Update Sheet1 Set name='Valli' where ID=2 and age='20'";
         connection.executeUpdate(strQuery1);
          //recordset.close();
          //connection.close();
	}}
