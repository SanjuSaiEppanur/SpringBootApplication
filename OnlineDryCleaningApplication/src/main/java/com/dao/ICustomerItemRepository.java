package com.dao;



import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.bean.CustomerItem;

/************************************************************************************************      
 *          Description     IPaymentRepository is an interface which extends JPA repository.
 *          				This class belongs to DAO layer. It is used to perform CRUD operations
 *          				with our entities by defining JPA repositories for automatic 
 *          				and intelligent implementations.                     					  
 **************************************************************************************************/
@Repository
public interface ICustomerItemRepository extends JpaRepository<CustomerItem, Long> {

	@Query(value = "SELECT customerItem FROM CustomerItem customerItem WHERE customerItem.customer.userId=:customerId")
	List<CustomerItem> getItemsByCustomer(@Param(value = "customerId") String customerId);

}
