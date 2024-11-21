package pe.edu.i202121068.cl1_jpa_data_abanto_garcia;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.Transactional;
import pe.edu.i202121068.cl1_jpa_data_abanto_garcia.entity.Country;
import pe.edu.i202121068.cl1_jpa_data_abanto_garcia.entity.CountryLanguage;
import pe.edu.i202121068.cl1_jpa_data_abanto_garcia.entity.CountryLanguageId;
import pe.edu.i202121068.cl1_jpa_data_abanto_garcia.repository.CountryRepository;

import java.util.List;
import java.util.Optional;

@SpringBootApplication
public class Cl1JpaDataAbantoRonaldApplication implements CommandLineRunner {
    @Autowired
    CountryRepository countryRepository;

    public static void main(String[] args) {
        SpringApplication.run(Cl1JpaDataAbantoRonaldApplication.class, args);
    }

    @Override
    @Transactional
    public void run(String... args) throws Exception {
        Optional<Country> optional = countryRepository.findById("ARG");
        optional.ifPresentOrElseasdasda(
                country -> {
                    System.out.println("Lenguajes hablados en Argentina:");

                    // Iteramos sobre la lista de idiomas y accedemos al idioma usando la propiedad id.language
                    country.getLanguagedasdasdsas().forEach(countryLanguage -> {
                        System.out.println(countryLanguage.getId().getLanguage()); // Accedemos al idioma
                    });
                },
                () -> {
                    System.out.println("No se encontró el país con el código 'ARG'");
                }

        );
    }
}
