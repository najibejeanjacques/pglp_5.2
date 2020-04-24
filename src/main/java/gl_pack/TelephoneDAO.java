package gl_pack;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class TelephoneDAO implements CustomerDAO<Personnel> {

	public int InsertCustomer(Personnel p) {
		// TODO Auto-generated method stub
		int result = 0;
		ResultSet result1 ;
		int id = 0;
		DerbyDaoFactory derby = new DerbyDaoFactory();
		try (Connection connect = derby.createConnection()) {
			PreparedStatement prepare1 = connect.prepareStatement(
					"SELECT ID FROM Personnels WHERE NOM = ? AND PRENOM = ?");
			prepare1.setString(1, p.getNom());
			prepare1.setString(2, p.getPrenom());
			result1 = prepare1.executeQuery();
			while(result1.next())
			{
				id = result1.getInt(1);
			}
			PreparedStatement prepare = connect.prepareStatement(
					"INSERT INTO Telephone (FIXPRO, PORTABLE, PERSONNELID)" +
					"VALUES (?, ?, ?)");
			prepare.setString(1, p.getNumeroListe().get(0).fixePro);
			prepare.setString(2,p.getNumeroListe().get(0).portable);
			prepare.setInt(3,id);
			result = prepare.executeUpdate();
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
		return result;
	}

	public boolean deleteCustomer(Personnel t) {
		// TODO Auto-generated method stub
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
					"SELECT FIXPRO, FIXPERSO, PORTABLE, PERSONNELID FROM telephone ");
			//prepare.setString(1, t.getNom());
			ResultSet result = prepare.executeQuery();
			System.out.println("Selection de tous les contacts des utilisateurs :");
			String colonne2,colonne1,colonne3;
			int colonne4;
			while(result.next())
			{
				 do
				 {
					 colonne1=result.getString(1);
					 colonne2=result.getString(2);
					 colonne3=result.getString(3);
					 colonne4=result.getInt(4);
					 System.out.println(colonne1+" "+colonne2+ " "+colonne3+" "+colonne4);
				 }
				 while(result.next());
			}
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
		
	}

