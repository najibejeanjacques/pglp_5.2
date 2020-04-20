package gl_pack;

public interface CustomerDAO<T> {

	public int InsertCustomer(T t);
	public boolean deleteCustomer(T t);
	public void updateCustomer();
	public void findAllCustomer();
	
}
