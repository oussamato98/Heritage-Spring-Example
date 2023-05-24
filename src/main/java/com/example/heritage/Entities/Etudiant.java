package com.example.heritage.Entities;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.Inheritance;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor @NoArgsConstructor
// si on cree une personne de tyoe etudiant la valeur attribue a la colonne type sera ETUD
@DiscriminatorValue("ETUD")
public class Etudiant extends Personne{
    double note ;
}
