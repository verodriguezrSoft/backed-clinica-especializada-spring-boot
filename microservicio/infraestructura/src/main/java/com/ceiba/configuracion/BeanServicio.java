package com.ceiba.configuracion;

import com.ceiba.usuario.puerto.dao.DaoFestivo;
import com.ceiba.usuario.puerto.repositorio.RepositorioCita;
import com.ceiba.usuario.puerto.repositorio.RepositorioMedico;
import com.ceiba.usuario.puerto.repositorio.RepositorioUsuario;
import com.ceiba.usuario.puerto.repositorio.RespositorioFestivo;
import com.ceiba.usuario.servicio.cita.ServicioActualizarCita;
import com.ceiba.usuario.servicio.cita.ServicioCrearCita;
import com.ceiba.usuario.servicio.cita.ServicioEliminarCita;
import com.ceiba.usuario.servicio.festivo.ServicioActualizarFestivo;
import com.ceiba.usuario.servicio.festivo.ServicioCrearFestivo;
import com.ceiba.usuario.servicio.festivo.ServicioEliminarFestivo;
import com.ceiba.usuario.servicio.medico.ServicioActualizarMedico;
import com.ceiba.usuario.servicio.medico.ServicioCrearMedico;
import com.ceiba.usuario.servicio.medico.ServicioEliminarMedico;
import com.ceiba.usuario.servicio.usuario.ServicioActualizarUsuario;
import com.ceiba.usuario.servicio.usuario.ServicioCrearUsuario;
import com.ceiba.usuario.servicio.usuario.ServicioEliminarUsuario;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class BeanServicio {

    // USUARIOS
    @Bean
    public ServicioCrearUsuario servicioCrearUsuario(RepositorioUsuario repositorioUsuario) {
        return new ServicioCrearUsuario(repositorioUsuario);
    }

    @Bean
    public ServicioEliminarUsuario servicioEliminarUsuario(RepositorioUsuario repositorioUsuario) {
        return new ServicioEliminarUsuario(repositorioUsuario);
    }

    @Bean
    public ServicioActualizarUsuario servicioActualizarUsuario(RepositorioUsuario repositorioUsuario) {
        return new ServicioActualizarUsuario(repositorioUsuario);
    }

    // CITAS
    @Bean
    public ServicioCrearCita servicioCrearCita(RepositorioCita repositorioCita, DaoFestivo daoFestivo){
        return new ServicioCrearCita(repositorioCita, daoFestivo);
    }

    @Bean
    public ServicioActualizarCita servicioActualizarCita(RepositorioCita repositorioCita, DaoFestivo daoFestivo){
        return new ServicioActualizarCita(repositorioCita, daoFestivo);
    }

    @Bean
    public ServicioEliminarCita servicioEliminarCita(RepositorioCita repositorioCita){
        return new ServicioEliminarCita(repositorioCita);
    }

    // MEDICA
    @Bean
    public ServicioCrearMedico servicioCrearMedico(RepositorioMedico repositorioMedico){
        return new ServicioCrearMedico(repositorioMedico);
    }

    @Bean
    public ServicioActualizarMedico servicioActualizarMedico(RepositorioMedico repositorioMedico){
        return new ServicioActualizarMedico(repositorioMedico);
    }

    @Bean
    public ServicioEliminarMedico servicioEliminarMedico(RepositorioMedico repositorioMedico){
        return new ServicioEliminarMedico(repositorioMedico);
    }

    // Festivos
    @Bean
    public ServicioCrearFestivo servicioCrearFestivo(RespositorioFestivo respositorioFestivo){
        return new ServicioCrearFestivo(respositorioFestivo);
    }

    @Bean
    public ServicioActualizarFestivo servicioActualizarFestivo(RespositorioFestivo respositorioFestivo){
        return new ServicioActualizarFestivo(respositorioFestivo);
    }

    @Bean
    public ServicioEliminarFestivo servicioEliminarFestivo(RespositorioFestivo respositorioFestivo){
        return new ServicioEliminarFestivo(respositorioFestivo);
    }

    @Bean
    public WebMvcConfigurer corsConfigure() {
        return new WebMvcConfigurer() {
            @Override
            public void addCorsMappings(CorsRegistry registry) {
                registry.addMapping("/**").allowedOrigins("http://localhost:4200").allowedMethods("*").allowedHeaders("*");
            }
        };
    }

}
