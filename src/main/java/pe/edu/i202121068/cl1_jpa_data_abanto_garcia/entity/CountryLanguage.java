package pe.edu.i202121068.cl1_jpa_data_abanto_garcia.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class CountryLanguage {
    @EmbeddedId
    private CountryLanguageId id;
    private String IsOfficial;
    private Double Percentage;
    @ManyToOne(cascade= {CascadeType.PERSIST, CascadeType.REMOVE})
    @MapsId("countryCode")
    @JoinColumn (name = "CountryCode")
    private Country country;

}
