package espritds.sky_wejden.Entiries;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Piste {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long numPiste;

    private String nomPiste;

    private Couleur couleur;

    private Integer longeur;

    private Integer pente;

    @ManyToMany(mappedBy="pistes")
    private List<Skieur> skieurs;



}
