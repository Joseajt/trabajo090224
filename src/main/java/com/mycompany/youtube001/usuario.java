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
    public string nombre;
    public video videosubido;

    public usuario(string nombre) {
        this.nombre = nombre;
    }

    public string getNombre() {
        return nombre;
    }

    public void setNombre(string nombre) {
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
 