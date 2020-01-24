package com.jaakkomantyla.rest.restserver;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.Optional;

//rest controller with simple rest request mappings for handling data in 'customer' database
@RestController
public class MyRestController {

    @Autowired
    CustomerRepository database;

    // Getting all customers → HTTP GET in url `customers`

    @RequestMapping("/customers")
    public Iterable<Customer> getAllCustomers(){
    return (database.findAll());
    }

    // Getting customer with an ID → HTTP GET in url `customers/1` where 1 is id

    @RequestMapping(value = "/customers/{id}", method = RequestMethod.GET)
    public Optional<Customer> getCustomer(@PathVariable("id") long id){

        return (database.findById(id));
    }

    //Deleting a customer with an ID → HTTP DELETE in url `customers/1` where 1 is id
    @RequestMapping(value="/customers/{id}", method = RequestMethod.DELETE)
    public void delete(@PathVariable("id") long id){
        database.deleteById(id);
    }

    // Adding a customer → HTTP POST in url `customers`
    @RequestMapping(value="/customers", method = RequestMethod.POST)
    public Customer post(@RequestBody Customer customer){
        return database.save(customer);
    }
}
