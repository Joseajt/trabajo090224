/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.youtube001;

/**
 *
 * @author josej
 */
public class comentarios {
    public String contenido;
     public usuario autor;

    public comentarios(String contenido, usuario autor) {
        this.contenido = contenido;
        this.autor = autor;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public usuario getAutor() {
        return autor;
    }

    public void setAutor(usuario autor) {
        this.autor = autor;
    }
    

}
