package ballerpride_webapp.ballerpride.webapp.entities.sport;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)

@NoArgsConstructor
@AllArgsConstructor
public class Stock {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(nullable = false)
    private int stockTailleShort;

    @Column(nullable = false)
    private int stockTailleChaussette;

    @Column(nullable = false)
    private int stockTailleMaillot_S;

    @Column(nullable = false)
    private int stockCouleurShort;

    @Column(nullable = false)
    private int stockCouleurMaillot;

    @Column(nullable = false)
    private int stockCouleurChaussette;

//    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
//    private int idArticle;


}