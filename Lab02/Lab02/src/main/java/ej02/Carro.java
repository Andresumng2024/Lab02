/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej02;

/**
 *
 * @author Multipropósito2
 */
public class Carro {
    
    private String marca;
    private String modelo;
    private String color;
    private int kilometraje;

    public Carro(String marca, String modelo, String color, int kilometraje) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.kilometraje = kilometraje;
    }

    public String getModelo() {
        return modelo;
    }

    public int getKilometraje() {
        return kilometraje;
    }

    @Override
    public String toString() {
        return "Carro [Marca=" + marca + ", Modelo=" + modelo + ", Color=" + color + ", Kilometraje=" + kilometraje + "]";
    }
}

