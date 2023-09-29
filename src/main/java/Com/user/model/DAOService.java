package Com.user.model;

import java.sql.ResultSet;

public interface DAOService {
public void connectionDB();
public boolean verifyCredentials(String Email, String Password);
public void saveReg(String name, String email, String mobile, String city);
public ResultSet listRegistration();
public void DeleteRegistration(String email);
public void UpdateReg(String email, String mobile);
//public boolean signup(String fullname, String email, String password);
 
}
