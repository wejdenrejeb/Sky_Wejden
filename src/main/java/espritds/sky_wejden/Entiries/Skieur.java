package espritds.sky_wejden.Entiries;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Skieur {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long numSkieur;

    private String nomS;

    private String prenomS;

    private LocalDate dateNaissance;

    private String ville;

    @OneToMany(mappedBy="skieur")
    private List<Inscription> inscriptions;

    @ManyToMany
    @JsonIgnore
    private List<Piste> pistes;

    @OneToOne (cascade= CascadeType.REMOVE)
    private Abonnement abonnement;





}
