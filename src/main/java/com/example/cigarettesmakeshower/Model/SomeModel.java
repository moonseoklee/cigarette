package com.example.cigarettesmakeshower.Model;



import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Data
public class SomeModel {

    @Id
    @GeneratedValue
    private int id;

    private String title;
    private Integer price;
}
