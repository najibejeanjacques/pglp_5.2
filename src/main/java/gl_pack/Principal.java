package gl_pack;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DAOFactory derbyFactory = DAOFactory.getDAOFactory(2);
		Personnel personne1 = new Personnel.PersonnelBuilder("OUEDRAOGO", "Jamile Jean Luc")
															.build();
		Personnel personne2 = new Personnel.PersonnelBuilder("OUEDRAOGO", "Najibe Jean Jacques")
				.build();
		//derbyFactory.getPersonnelDAO().InsertCustomer(personne1);
		//derbyFactory.getPersonnelDAO().InsertCustomer(personne2);
		derbyFactory.getPersonnelDAO().findAllCustomer();
		//derbyFactory.getPersonnelDAO().deleteCustomer(personne1);
	}

}
