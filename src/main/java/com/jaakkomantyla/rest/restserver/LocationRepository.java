package com.jaakkomantyla.rest.restserver;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

//repository extends CrudRepository so Spring Boot data handles automatically this interfaces interaction with db
public interface LocationRepository extends CrudRepository<Location, Integer> {

    //methods that Spring data generates sql queries from
    List<Location> findByLatitude(Double latitude);
    List<Location> findByLatitudeOrderByLongitudeDesc(Double latitude);
}
