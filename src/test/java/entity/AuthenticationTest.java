package entity;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import util.DBConnUtil;
import org.junit.jupiter.api.Test;
import util.DBConnUtil;
import dao.ICustomerService;
import dao.CustomerServiceImpl;
import entity.Customer;
import dao.IVehicleService;

class AuthenticationTest {
	 
	@Test
	final void testAuthentication() {
		
		CustomerServiceImpl mockAuthentication = mock(CustomerServiceImpl.class);
     
        // Stub the isAuthenticated() method of the mock Authentication object to return true when called
         //(mockAuthentication.authenticateCustomer(any(CustomerServiceImpl.class))).thenReturn(true);
         when(mockAuthentication.authenticateCustomer(any(String.class), any(String.class))).thenReturn(true);
        
        // Call the authenticateCustomer method
        boolean authenticated = mockAuthentication.authenticateCustomer("sushma", "harshitha");
        verify(mockAuthentication, times(1)).authenticateCustomer("sushma", "harshitha");
        
        // Assert that authentication was successful
        assertTrue(authenticated);

	}

}