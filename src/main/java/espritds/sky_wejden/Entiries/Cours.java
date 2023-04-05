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
public class Cours {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long numCours;
    private int niveau;
    private TypeCours typeCours;
    private Support support;
    private Float prix;
    private int creneau;

    @OneToMany(mappedBy = "cour",cascade = CascadeType.REMOVE)
    private List<Inscription> inscriptions;


    //@OneToMany(mappedBy="cour")
    //private List<Moniteur> moniteurs;

    //Inscription hya qui gere la relation


    //cascade = CascadeType.REMOVE : pour ki tfasakh cours yetfaskhou les inscr elli teb3inou
}
