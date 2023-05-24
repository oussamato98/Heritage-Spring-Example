package com.example.heritage.Entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Data
@AllArgsConstructor @NoArgsConstructor
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
//la valeur par defaut du type de colonne c est varchar on peut le modifier si necessaire
//si on ne specifie pas le legth varchar vas reserver 255 et c trop
@DiscriminatorColumn(name="Type" , length=4)
public class Personne
{

    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    int id ;
    String nom;
    Date datenaissance;
}
