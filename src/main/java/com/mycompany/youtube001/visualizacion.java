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
    Video Video;
    public visualizacion () {
    }
    public visualizacion (Video Video,usuario Viewer) {
        this.Espectador= Viewer;
        this.Video= Video;
    }    
    public Video getVideo() {
            return Video;
        }
    public void setVideo (Video Video) {
            this.Video= Video;
        }
    public usuario getViewer() {
            return Espectador;
        }
    public void setViewer (usuario Vierwer) {
            this.Espectador= Vierwer;
        }
        
}
