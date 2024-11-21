package pe.edu.i202121068.cl1_jpa_data_abanto_garcia.entity;

import jakarta.persistence.*;
import lombok.*;


@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class City {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer iD;
    @Column(nullable = false)
    private String name;

    @ManyToOne (cascade= {CascadeType.PERSIST, CascadeType.REMOVE})
    @JoinColumn (name = "CountryCode")
    private Country country;

    @Column(nullable = false)
    private String District;
    @Column(nullable = false)
    private Integer Population;

}
