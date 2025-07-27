package Logica;

import java.util.ArrayList;

public class Auto {
    private String modelo;
    private String marca;
    private String anio;
    private String color;

    static ArrayList<Auto> autos = new ArrayList<>();

    public Auto() {
    }

    public Auto(String anio, String color, String marca, String modelo) {
        this.anio = anio;
        this.color = color;
        this.marca = marca;
        this.modelo = modelo;
    }

    public String getAnio() {
        return anio;
    }

    public void setAnio(String anio) {
        this.anio = anio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
}
