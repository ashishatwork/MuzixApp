package com.stackroute.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

//import javax.persistence.Entity;
//import javax.persistence.Id;

//@Entity
@Document
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Muzix {
    @Id
    private int id;
    private String name;
    private int rating;
    private String comments;


}
