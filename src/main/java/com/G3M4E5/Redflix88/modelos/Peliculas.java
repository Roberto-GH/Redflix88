package com.G3M4E5.Redflix88.modelos;

import javax.persistence.*;

/**
 *
 * @author Roberto Londoño
 */
@Entity
@Table(name = "peliculas")
public class Peliculas {
    
    @Id
    @Column(name = "contenidos_titulo")
    private String contenidos_titulo;
    
    @Column(name = "resumen")
    private String resumen;
    
    @Column(name = "anio")
    private int anio;
    
    @Column(name = "director_iddirector")
    private String director_iddirector;

    public Peliculas(String contenidos_titulo, String resumen, int anio, String director_iddirector) {
        this.contenidos_titulo = contenidos_titulo;
        this.resumen = resumen;
        this.anio = anio;
        this.director_iddirector = director_iddirector;
    }
        
    public Peliculas() {
    }

    public String getContenidos_titulo() {
        return contenidos_titulo;
    }

    public void setContenidos_titulo(String contenidos_titulo) {
        this.contenidos_titulo = contenidos_titulo;
    }

    public String getResumen() {
        return resumen;
    }

    public void setResumen(String resumen) {
        this.resumen = resumen;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public String getDirector_iddirector() {
        return director_iddirector;
    }

    public void setDirector_iddirector(String director_iddirector) {
        this.director_iddirector = director_iddirector;
    }

    @Override
    public String toString() {
        return "Peliculas{" + "contenidos_titulo=" + contenidos_titulo 
                + ", resumen=" + resumen + ", anio=" + anio + ", director_iddirector=" 
                + director_iddirector + '}';
    }
    
    
    
}
