package gl_pack;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DerbyDaoFactory extends DAOFactory {

	//public static final String DRIVER = "org.apache.derby.jdbc.EmbeddedDriver";
	public static final String DBURL = "jdbc:derby:/home/ouedraogo/Personnels;user=jacques;password=Bonsoire2017";

	
	//Méthode pour la connection
	public static Connection createConnection() throws SQLException
	{
		Connection conn = DriverManager.getConnection(DBURL);
		return conn;
	}
	
	@Override
	public PersonnelDAO getPersonnelDAO() {
		// TODO Auto-generated method stub
		return new PersonnelDAO();
	}

	@Override
	public TelephoneDAO getTelephoneDAO() {
		// TODO Auto-generated method stub
		return new TelephoneDAO();
	}

}
