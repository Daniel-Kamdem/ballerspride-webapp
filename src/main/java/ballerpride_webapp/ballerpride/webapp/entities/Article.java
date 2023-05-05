package ballerpride_webapp.ballerpride.webapp.entities;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)

@NoArgsConstructor
@AllArgsConstructor
public class Article {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(nullable = false)
    private String libelle;

    @Column(nullable = false)
    private int stockTailleChaussette;

//    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
//    private int idCommande;



}
