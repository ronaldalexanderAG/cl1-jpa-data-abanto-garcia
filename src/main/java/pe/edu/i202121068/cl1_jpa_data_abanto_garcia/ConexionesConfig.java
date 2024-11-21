package pe.edu.i202121068.cl1_jpa_data_abanto_garcia;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConexionesConfig {
    @Bean
    public HikariDataSource dataSource() {
        HikariConfig hikariConfig = new HikariConfig();

        // Configurar parámetros de HikariCP s
        hikariConfig.setJdbcUrl("jdbc:mysql://localhost:3306/world");   // URL de conexión a la base de datos
        hikariConfig.setUsername("root");
        hikariConfig.setPassword("sql123");
        hikariConfig.setDriverClassName("com.mysql.cj.jdbc.Driver");

        // Configuración personalizada para el pool de conexiones
        hikariConfig.setMaximumPoolSize(30);            // conexiones max en el pool
        hikariConfig.setMinimumIdle(4);                 // conexiones min inactivas
        hikariConfig.setIdleTimeout(4 * 60 * 1000);     // Tiempo de espera de conexiones inactivas en milisegundos (4 minutos)
        hikariConfig.setConnectionTimeout(45000);   // Tiempo máximo para obtener una conexión (45 segundos)

        return new HikariDataSource(hikariConfig);
    }
}
