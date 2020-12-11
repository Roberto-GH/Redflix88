package com.G3M4E5.Redflix88.modelos;

import javax.persistence.*;

/**
 *
 * @author Roberto Londoño
 */
@Entity
@Table(name = "usuario")
public class Usuario {
    
    @Id
    @Column(name = "alias")
    private String alias;
    
    @Column(name = "nombres")
    private String nombres;
    
    @Column(name = "apellidos")
    private String apellidos;
    
    @Column(name = "email")
    private String email;
    
    @Column(name = "celular")
    private String celular;
    
    @Column(name = "contraseña")
    private String contrasenia;

    public Usuario() {
    }

    public Usuario(String alias, String nombres, String apellidos, String email, 
            String celular, String contrasenia) {
        this.alias = alias;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.email = email;
        this.celular = celular;
        this.contrasenia = contrasenia;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }

    @Override
    public String toString() {
        return "Usuario{" + "alias=" + alias + ", nombres=" + nombres + ", "
                + "apellidos=" + apellidos + ", email=" + email + ", celular=" 
                + celular + ", contrasenia=" + contrasenia + '}' + "\n";
    }
    
}
