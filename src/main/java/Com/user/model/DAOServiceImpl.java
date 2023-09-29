package Com.user.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DAOServiceImpl implements DAOService {
private Connection con;
private Statement Stmnt;

//@Override
//public boolean signup(String fullname, String email, String password) {
//
//	try {
//		Class.forName("com.mysql.cj.jdbc.Driver");
//		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/login","root","farooq");
//		Stmnt = con.createStatement();
//		Stmnt.executeUpdate("insert into pass values('"+fullname+"','"+email+"','"+password+"')");
//	} catch (Exception e) {
//	
//	}
//	return false;
//	}
	@Override
	public void connectionDB() {
try {
	Class.forName("com.mysql.cj.jdbc.Driver");
	con = DriverManager.getConnection("jdbc:mysql://localhost:3306/login","root","farooq");
	Stmnt = con.createStatement();
	
} catch (Exception e) {
	e.printStackTrace();  
}
	}
	@Override
	public boolean verifyCredentials(String Email, String Password) {
	try {
		ResultSet result = Stmnt.executeQuery("select * from pass where Email='"+Email+"' and password='"+Password+"'");
		return result.next();
		
	} catch (Exception e) {
		e.printStackTrace();
	}
		return false;
	}
	@Override
	public void saveReg(String name, String email, String mobile, String city) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/SaveRegistration","root","farooq");
			Stmnt = con.createStatement();
			Stmnt.executeUpdate("insert into newRegistration values('"+name+"','"+email+"','"+mobile+"','"+city+"')");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	@Override
	public ResultSet listRegistration() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/SaveRegistration","root","farooq");
			Stmnt = con.createStatement();
			ResultSet result = Stmnt.executeQuery("select * from newRegistration");
			return result;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
		
	}
	@Override
	public void DeleteRegistration(String email) {
		try{ 
			Class.forName("com.mysql.cj.jdbc.Driver");
		
		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/SaveRegistration","root","farooq");
		Stmnt = con.createStatement();
		Stmnt.executeUpdate("DELETE FROM  newRegistration  WHERE  email='"+email+"'");
		
	} catch (Exception e) {
		e.printStackTrace();
	}	
	
}


	@Override
	public void UpdateReg(String email, String mobile) {
		try{ 
			Class.forName("com.mysql.cj.jdbc.Driver");
		
		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/SaveRegistration","root","farooq");
		Stmnt = con.createStatement();
		Stmnt.executeUpdate(" UPDATE newRegistration SET mobile='"+mobile+"' WHERE  email='"+email+"'");
		
	} catch (Exception e) {
		e.printStackTrace();
	}
}
}
	
	
