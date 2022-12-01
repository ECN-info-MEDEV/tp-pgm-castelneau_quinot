/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ecn.tppgm;

import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.LinkedList;

/**
 *
 * @author erwan
 */
public class PGMPicture {

    /** List of the picture's pixel values */
    private LinkedList<Integer> picture;
    /** width of the picture */
    private int width;
    /** length of the picture */
    private int height;

    public void creerAleatoire(String name, int size) {
        for (int x = 0; x < size; x++) {
            for (int y = 0; y < size; y++) {
            }
        }
        
                
    
    public void write() {
        
    }
    
    public void threshold(int seuil) {
        for (int pixel : this.picture) {
            if (pixel < seuil) {
                pixel = 0;
            }
        }
    }
    
    /**
     * Reads the file and initializes the picture object.
     * @param name The name of the file to read.
     */
    public void read(String name) {
        String delimiter = " ";
        Scanner scan = new Scanner(name);
        
        if (scan.hasNext()) { scan.next(); }
        boolean comment = true;
        while (scan.hasNext() && comment) {
            String line = scan.next();
            if (!line.startsWith("#")) {
                StringTokenizer tokenizer = new StringTokenizer(line, delimiter);
                if (tokenizer.hasMoreTokens()) { width = Integer.parseInt(tokenizer.nextToken()); }
                if (tokenizer.hasMoreTokens()) { height = Integer.parseInt(tokenizer.nextToken()); }
                comment = false;
            }
        }
        
        for (int l = 0; l < height; l++) {
            if (scan.hasNext()) {
                String line = scan.next();
                StringTokenizer tokenizer = new StringTokenizer(line, delimiter);
                for (int t = 0; t < width; t++) {
                    if (tokenizer.hasMoreTokens()) { picture.add(Integer.parseInt(tokenizer.nextToken())); }
                }
            }
        }
    }
    
    /**
     * Calculates the histogram of the picture and prints it.
     */
    public void histo() {
        LinkedList<Integer> histo = new LinkedList();
        for (Integer value : picture) {
            histo.set(value, histo.get(value) + 1);
        }
        
        for (int i = 0; i < histo.size(); i++) {
            if (histo.get(i) != 0) {
                System.out.println("Pixels a " + i + ": " + histo.get(i));
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
