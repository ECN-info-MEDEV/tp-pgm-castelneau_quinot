/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package edu.ecn.switchtest;

/**
 *
 * @author erwan
 */
public class SwitchTest {

    /**
     * Fonction main.
     * @param args 
     */
    public static void main(String[] args) {
        System.out.println("Hello World!");
        String color = "red";
        String colorRGB;
        
        // switch not suggested before 1.6
        if (color.equals("black")) {
            colorRGB = "000000";
        } else if (color.equals("red")) {
            colorRGB = "ff0000";
        } else if (color.equals("green")) {
            colorRGB = "008000";
        } else if (color.equals("blue")) {
            colorRGB = "0000ff";
        } else {
            colorRGB = "Invalid color";
        }
        System.out.println(colorRGB);
    }
}
