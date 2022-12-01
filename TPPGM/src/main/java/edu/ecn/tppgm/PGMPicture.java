/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ecn.tppgm;

/**
 *
 * @author erwan
 */
public class PGMPicture {
    
    
    public void write() {
        
    }
    
    public void threshold(int seuil) {
        for (int pixel : this.picture) {
            if (pixel < seuil) {
                pixel = 0;
            }
        }
    }
    
    public void resize(int plus) {
        for (int i = 0; i < this.width; i += 2) {
            for (int j = 0; j < this.height; j += 2) {
                this.picture.set(i*this.width + j) = 0;
            }
            
        }
        for (int i = 1; i < this.width; i += 2) {
            for (int j = 0; j < this.height; j++) {
                this.picture.set(i*this.width + j) = 0;
            }
        }
    }
}
