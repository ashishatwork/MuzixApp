package com.stackroute.repository;

import com.stackroute.domain.Muzix;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface MuzixRepository extends JpaRepository<Muzix, Integer> {

    @Query(value = "SELECT * FROM Muzix m WHERE m.name = :name", nativeQuery = true)
    Muzix findByTitle(@Param("name") String name);
}
