/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.youtube001;

/**
 *
 * @author josej
 */
public class video {
   public string titulo;
   public int duracionsegundos;
   public string url;

    public video(string titulo, int duracionsegundos, string url) {
        this.titulo = titulo;
        this.duracionsegundos = duracionsegundos;
        this.url = url;
    }

    public string getTitulo() {
        return titulo;
    }

    public void setTitulo(string titulo) {
        this.titulo = titulo;
    }

    public int getDuracionsegundos() {
        return duracionsegundos;
    }

    public void setDuracionsegundos(int duracionsegundos) {
        this.duracionsegundos = duracionsegundos;
    }

    public string getUrl() {
        return url;
    }

    public void setUrl(string url) {
        this.url = url;
    }
   
   
}
