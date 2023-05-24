package com.example.heritage.Services;

import com.example.heritage.Entities.Etudiant;
import com.example.heritage.Entities.Personne;
import com.example.heritage.Entities.Professeur;
import com.example.heritage.Repositories.PersonneRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
@Service
@Transactional
public class AddPersonneServiceImp implements AddPersonneService{

    @Autowired
    PersonneRepository pr ;

    @Override
    public Etudiant addEtudiant() {
        Etudiant e = new Etudiant();
        e.setId(1);
        e.setNom("oussama");
        e.setDatenaissance(new Date());
        e.setNote(10);
        return pr.save(e);
    }

    @Override
    public Professeur addProfesseur() {
        Professeur p = new Professeur();
        p.setId(1);
        p.setNom("oussama");
        p.setDatenaissance(new Date());
        p.setMatiere("Arabe");
        return pr.save(p);
    }
}
