package com.example.esprims.domaine;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
//@Table(name="category")
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private long id;
    @Column (name = "nom")
    private String nom;
    @Column (name="description")
    private String description;

   @OneToMany (mappedBy = "category")
    private List<Produit> produits;

//    @ManyToOne
//    @JoinColumn(name="produit_id", referencedColumnName = "id")
//    private Produit produit;
}


