package com.stackroute.repository;

import com.stackroute.domain.Muzix;
//import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.jpa.repository.Query;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

//@Repository
//public interface MuzixRepository extends JpaRepository<Muzix, Integer> {
//
//    @Query(value = "SELECT * FROM Muzix m WHERE m.name = :name", nativeQuery = true)
//    Muzix findByTitle(@Param("name") String name);
//}
@Repository
public interface MuzixRepository extends MongoRepository<Muzix, Integer>{
//    Muzix findByTitle(String name);

//    @Query(value = "SELECT p FROM Muzix m WHERE m.name = :name")
//    Muzix findByTitle(@Param("name") String name);
}
