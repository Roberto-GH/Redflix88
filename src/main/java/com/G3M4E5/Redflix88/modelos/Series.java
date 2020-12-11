package com.G3M4E5.Redflix88.modelos;

import javax.persistence.*;

/**
 *
 * @author Roberto Londoño
 */
@Entity
@Table(name = "series")
public class Series {
    
    @Id
    @Column(name = "contenidos_titulo")
    private String contenidos_titulo;
    
    @Column(name = "n_temporadas")
    private int n_temporadas;
    
    @Column(name = "n_episodios")
    private int n_episodios;

    public Series() {
    }

    public Series(String contenidos_titulo, int n_temporadas, int n_episodios) {
        this.contenidos_titulo = contenidos_titulo;
        this.n_temporadas = n_temporadas;
        this.n_episodios = n_episodios;
    }

    public String getContenidos_titulo() {
        return contenidos_titulo;
    }

    public void setContenidos_titulo(String contenidos_titulo) {
        this.contenidos_titulo = contenidos_titulo;
    }

    public int getN_temporadas() {
        return n_temporadas;
    }

    public void setN_temporadas(int n_temporadas) {
        this.n_temporadas = n_temporadas;
    }

    public int getN_episodios() {
        return n_episodios;
    }

    public void setN_episodios(int n_episodios) {
        this.n_episodios = n_episodios;
    }

    @Override
    public String toString() {
        return "Series{" + "contenidos_titulo=" + contenidos_titulo + ", n_temporadas=" 
                + n_temporadas + ", n_episodios=" + n_episodios + '}';
    }
    
}
