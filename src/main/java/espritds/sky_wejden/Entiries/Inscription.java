package espritds.sky_wejden.Entiries;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Inscription {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long numInscription;

    private Integer numSemaine;

    @JsonIgnore
    @ManyToOne
    private Cours cour;

    @ManyToOne
    private Skieur skieur;
}
