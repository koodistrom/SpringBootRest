package com.jaakkomantyla.rest.restserver;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.JdbcTemplateAutoConfiguration;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.servlet.annotation.WebServlet;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@SpringBootApplication
public class RestServerApplication implements CommandLineRunner {


    @Autowired
    LocationRepository locationRepository;

    public static void main(String[] args) {
        SpringApplication.run(RestServerApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

    //testing location data handling
    /*
        //save locations
        List<Location> locations = new ArrayList();
        locations.add(new Location(5, 5));
        locations.add(new Location(5, 10));
        locations.add(new Location(5, 2));
        locations.add(new Location(6, 2));

        locationRepository.saveAll(locations);

        // Retrieve new locations
        List<Location> locs = locationRepository.findByLatitudeOrderByLongitudeDesc(5.0);

        System.out.println(locs);

     */
    }


}


