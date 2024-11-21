package pe.edu.i202121068.cl1_jpa_data_abanto_garcia.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString

public class Country {
    @Id
    private String code;
   @Column(nullable = false)
    private String name;
    @Column(nullable = false)
    private String continent;
    @Column(nullable = false)
    private String region;
    @Column(nullable = false)
    private Double surfaceArea;
    private Integer indepYear;
    @Column(nullable = false)
    private Integer population;
    private Double lifeExpectancy;
    private Double gNP;
    private Double gNPOld;
    @Column(nullable = false)
    private String localName;
    @Column(nullable = false)
    private String governmentForm;
    private String headOfState;
    private Integer capital;
   @Column(nullable = false)
    private String code2;
    @OneToMany(mappedBy = "country", cascade = {CascadeType.PERSIST, CascadeType.REMOVE})
    private List<City> cities;
    @OneToMany(mappedBy = "country", cascade = {CascadeType.PERSIST, CascadeType.REMOVE})
    private List<CountryLanguage> languages;


}
