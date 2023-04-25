package espritds.sky_wejden.Entiries;

import com.fasterxml.jackson.annotation.JsonIgnore;
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
public class Cours extends BaseEntity{

    //@Id
    //@GeneratedValue(strategy = GenerationType.IDENTITY)
    //private Long numCours;
    private int niveau;
    private TypeCours typeCours;
    private Support support;
    private Float prix;
    private int creneau;

    @JsonIgnore
    @OneToMany(mappedBy = "cour",cascade = CascadeType.REMOVE)
    private List<Inscription> inscriptions;


    //@OneToMany(mappedBy="cour")
    //private List<Moniteur> moniteurs;

    //Inscription hya qui gere la relation


    //cascade = CascadeType.REMOVE : pour ki tfasakh cours yetfaskhou les inscr elli teb3inou
}
