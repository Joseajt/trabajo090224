/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.youtube001;

/**
 *
 * @author josej
 */
public class usuario {
    public String nombre;
    public video videosubido;

    public usuario(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public video getVideosubido() {
        return videosubido;
    }

    public void subirVideo(video videosubido) {
        this.videosubido = videosubido;
    }
    
    public void mostrarinfoUsuario(){
        System.out.println("Usuario"+ nombre );
        if(videosubido!=null){
            System.out.println("Ultimo video subido"+videosubido.getTitulo());
        } else{
            System.out.println("Aun no se han subido videos"); 
        }
 
    }
}
 