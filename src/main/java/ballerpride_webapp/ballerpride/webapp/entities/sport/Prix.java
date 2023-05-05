package ballerpride_webapp.ballerpride.webapp.entities.sport;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)

@NoArgsConstructor
@AllArgsConstructor
public class Prix {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(nullable = false)
    private float prixShort;

    @Column(nullable = false)
    private float prixMaillot;

    @Column(nullable = false)
    private float prixChaussette;


//    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
//    @OneToOne(cascade = CascadeType.ALL)
//    @JoinColumn(name = "id", referencedColumnName = "id")
//    private int idArticle;



}
