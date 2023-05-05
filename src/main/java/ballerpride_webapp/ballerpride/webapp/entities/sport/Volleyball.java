package ballerpride_webapp.ballerpride.webapp.entities.sport;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)

@NoArgsConstructor
@AllArgsConstructor
public class Volleyball {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;



}
