package pe.edu.i202121068.cl1_jpa_data_abanto_garcia.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import pe.edu.i202121068.cl1_jpa_data_abanto_garcia.entity.Country;
import pe.edu.i202121068.cl1_jpa_data_abanto_garcia.entity.CountryLanguage;

import java.util.List;
import java.util.Optional;

public interface CountryRepository extends CrudRepository<Country, String> {


}
