/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.youtube001;

/**
 *
 * @author josej
 */
public class visualizacion {
     usuario Espectador;
    video video;
    public visualizacion () {
    }
    public visualizacion (video Video,usuario Viewer) {
        this.Espectador= Viewer;
        this.video= Video;
    }    
    public video getVideo() {
            return video;
        }
    public void setVideo (video Video) {
            this.video= Video;
        }
    public usuario getViewer() {
            return Espectador;
        }
    public void setViewer (usuario Vierwer) {
            this.Espectador= Vierwer;
        }
        
}
