package com.ToyotaWeb.Toyota.Service;
import com.ToyotaWeb.Toyota.Model.Customer;

import org.springframework.stereotype.Service;

import java.util.List;

@Service

public interface CustomerService {
    Customer saveCustomer(Customer customer);
    List<Customer> getAllCustomers();
    Customer getCustomerById(Long id);
    Customer updateCustomer(Customer customer, Long id);
    void deleteCustomer(Long id);
}
