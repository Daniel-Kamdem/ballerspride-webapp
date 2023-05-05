package ballerpride_webapp.ballerpride.webapp.entities.sport;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)

@NoArgsConstructor
@AllArgsConstructor
public class Couleur {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(nullable = false)
    private String libelle;

//    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
//    private int idArticle;

//    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
//    private int idStock;

}