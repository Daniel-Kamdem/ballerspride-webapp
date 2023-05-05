package ballerpride_webapp.ballerpride.webapp.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.Accessors;

import javax.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)

@NoArgsConstructor @AllArgsConstructor
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(nullable = false)
    private String nom;

    @Column(nullable = false)
    private String prenom;

    @Column(nullable = false)
    private int code_postal;

    @Column(nullable = false)
    private String ville;

    @Column(nullable = false)
    private String email;

    @Column(nullable = false)
    private int telephone;
}
