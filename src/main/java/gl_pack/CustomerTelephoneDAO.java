package gl_pack;

public interface CustomerTelephoneDAO<T> {

	public int InsertCustomer(T t);
	public boolean deleteCustomer(int id);
	public void updateCustomer();
	public void findAllCustomer();
}
