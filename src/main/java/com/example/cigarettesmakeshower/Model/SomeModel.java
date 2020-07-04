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
@Builder
public class SomeModel {

    @Id
    private int id;

    private String title;
    private Integer price;
}
