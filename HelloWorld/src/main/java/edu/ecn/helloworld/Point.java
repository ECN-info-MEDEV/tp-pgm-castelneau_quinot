package edu.ecn.helloworld;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author erwan
 */
public class Point {
    /*Position en abscisse.*/
    int x;
    /*Position en ordonnée.*/
    int y;
    
    /**
     * Constructeur de Point.
     * @param x Position en abscisse.
     * @param y Position en ordonnée.
     */
    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
    
    /**
     * Accesseur à l'abscisse du Point.
     * @return L'abscisse du Point.
     */
    public int getX() {
        return x;
    }

    /**
     * Attributeur de l'absisse du Point.
     * @param x La nouvelle abscisse du Point.
     */
    public void setX(int x) {
        this.x = x;
    }

    /**
     * Accesseur à l'ordonnée du Point.
     * @return L'ordonnée du Point.
     */
    public int getY() {
        return y;
    }

    /**
     * Attributeur de l'ordonnée du Point.
     * @param y La nouvelle ordonnée du Point.
     */
    public void setY(int y) {
        this.y = y;
    }
}
