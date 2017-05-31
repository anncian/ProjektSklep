package test;

import static org.junit.Assert.*;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import projektSklepu.Produkt;
import projektSklepu.Shops;

public class Test {

	@org.junit.Test
	public void test() {
		String url = "jdbc:mysql://localhost:3306/";
		String user = "root";
		String password = "";
		
		try
		{
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			Connection con = DriverManager.getConnection(url, user, password);
			
			Statement stt = con.createStatement();
			stt.execute("USE sklep");

			
			//Create and select db
			
			ResultSet res = stt.executeQuery("SELECT * FROM  produkty");
			
			while(res.next())
			{
				Produkt produkt = new Produkt(res.getInt(1),res.getString(2),res.getString(3),res.getString(4),res.getString(5),res.getString(6),res.getString(7),res.getString(8));
				System.out.println(produkt.getId() + " " + produkt.getNazwa() + " " + produkt.getCena() + " " + produkt.getStan() + " " + produkt.getMarza() + " " + produkt.getNumer() + " " + produkt.getIleSprzedanych());
				
			}			
			
			//System.out.println()
			res.close();
			stt.close();
			con.close();
		}
		
		catch (Exception e)
		{
			e.printStackTrace();
		}
		//fail("Not yet implemented");
	}

}
