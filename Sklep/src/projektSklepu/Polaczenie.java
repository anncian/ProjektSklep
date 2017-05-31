package projektSklepu;
import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
//import java.sql.SQLException;

//import java.util.Date;
public class Polaczenie {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
			
			ResultSet res = stt.executeQuery("SELECT * FROM  pracownicy");
			
			while(res.next())
			{
				Pracownik pracownik = new Pracownik(res.getInt(1),res.getString(2),res.getString(3),res.getString(4),res.getString(5),res.getString(6),res.getString(7));
				
				System.out.println(pracownik.getId() + " " + pracownik.getImie() + " " + pracownik.getNazwisko() + " " + pracownik.getPesel() + " " + pracownik.getDniWolne() + " " + pracownik.getStanowisko() + " " + pracownik.getPensja() );
				
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
	}
}
