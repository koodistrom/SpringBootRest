package com.jaakkomantyla.rest.restserver;

import org.springframework.data.repository.CrudRepository;

//repository extends CrudRepository so Spring Boot data handles automatically this interfaces interaction with db
public interface CustomerRepository extends CrudRepository<Customer, Long> {

}
