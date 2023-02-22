package com.example.esprims.domaine;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@AllArgsConstructor //constructure avec parametre
@NoArgsConstructor //constructure non parametre
@Data //get et set
//@Table(name = "PRODUIT")
public class Produit  {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private long id;

    @Column(name = "REFERENCE")
    private String reference;
    @Column(name = "DESCRIPTION")
    private String description;
    @Column(name = "PRIX")
    private Double prix;

    @ManyToOne()
    @JoinColumn(name = "categ_id")
    private Category category;

//     @OneToMany (mappedBy = "produit")
//     private List<Category> categories;

}
