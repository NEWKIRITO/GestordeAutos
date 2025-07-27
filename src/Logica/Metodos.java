package Logica;

import Logica.Auto;

import java.util.Scanner;

public class Metodos {
    public void menuPrincipal() {

        Scanner sc = new Scanner(System.in);

        System.out.println("=== Menu Principal ===");

        System.out.println("1. Agregar auto. ");
        System.out.println("2. Mostrar autos registrados. ");
        System.out.println("3. Mostrar promedio de años de los autos. ");
        System.out.println("4. Salir. ");

        int opcion = sc.nextInt();

        switch (opcion) {
            case 1:
                agregarAutos();
                break;
            case 2:
                mostrarAutosRegistrados();
                break;
            case 3:
                break;
        }
    }

    public void mostrarAutosRegistrados() {
        if (Auto.autos.isEmpty()) {
            System.out.println("No hay carros registrados. ");
            return;
        }
        for (int i = 0; i < Auto.autos.size(); i++) {

            Auto auto = Auto.autos.get(i);

            System.out.println("Carro " + (i + 1) + ":");
            System.out.println("Modelo: " + auto.getModelo());
            System.out.println("Marca: " + auto.getMarca());
            System.out.println("Año: " + auto.getAnio());
            System.out.println("Color: " + auto.getColor());
            System.out.println("-------------------------");

        }
    }

    public void agregarAutos(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese su modelo: ");
        String modelo = sc.nextLine();
        System.out.println("Ingrese su marca: ");
        String marca = sc.nextLine();
        System.out.println("Ingrese su año: ");
        int anio = sc.nextInt();
        System.out.println("Ingrese su color: ");
        String color = sc.nextLine();

        sc.close();

        Auto auto = new Auto(modelo, marca, String.valueOf(anio), color);
        Auto.autos.add(auto);
    }
}
