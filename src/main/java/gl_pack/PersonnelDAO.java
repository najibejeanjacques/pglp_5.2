package gl_pack;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import java.time.ZoneId;

public class PersonnelDAO implements CustomerDAO<Personnel> {

	public int InsertCustomer(Personnel t){
		// TODO Auto-generated method stub
		int result = 0;
		DerbyDaoFactory derby = new DerbyDaoFactory();
		try (Connection connect = derby.createConnection()) {
			PreparedStatement prepare = connect.prepareStatement(
					"INSERT INTO Personnels (NOM, PRENOM)" +
					"VALUES (?, ?)");
			prepare.setString(1, t.getNom());
			prepare.setString(2, t.getPrenom());
			System.out.println("Création " + t);
			result = prepare.executeUpdate();
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
		return result;
	}

	public boolean deleteCustomer(Personnel t) {
		// TODO Auto-generated method stub
		int result = 0;
		DerbyDaoFactory derby = new DerbyDaoFactory();
		try (Connection connect = derby.createConnection()) {
			PreparedStatement prepare = connect.prepareStatement(
					"DELETE FROM personnels "
					+ "WHERE nom = ?");
			prepare.setString(1, t.getNom());
			result = prepare.executeUpdate();
			
			System.out.println("Suppression " + t);
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}

	public void updateCustomer() {
		// TODO Auto-generated method stub
		
	}

	public void findAllCustomer() {
		// TODO Auto-generated method stub
		DerbyDaoFactory derby = new DerbyDaoFactory();
		try (Connection connect = derby.createConnection()) {
			PreparedStatement prepare = connect.prepareStatement(
					"SELECT NOM, PRENOM FROM personnels ");
			//prepare.setString(1, t.getNom());
			ResultSet result = prepare.executeQuery();
			System.out.println("Selection de tous les utilisateurs :");
			String colonne2,colonne1;
			while(result.next())
			{
				 do
				 {
					 colonne1=result.getString(1);
					 colonne2=result.getString(2);
					 System.out.println(colonne1+" "+colonne2);
				 }
				 while(result.next());
			}
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

}
