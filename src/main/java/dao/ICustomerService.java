package dao;
import entity.Customer;

public interface ICustomerService{
 void getCustomerById(int customerId);
 void getCustomerByUsername(String username);
 void registerCustomer(Customer customer);
 boolean updateCustomer(Customer customer);
 void deleteCustomer(int customerId);
 boolean authenticateCustomer(String username,String password);
}
