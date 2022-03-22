package ar.com.lautaro.test;

import ar.com.lautaro.clases.*;
//import java.text.DecimalFormat;
import java.util.*;
import java.util.Random;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class test {

    public static void main(String[] args) {

        /*
    //1) Los campos de las clases hijas deben ser private y la de la padre protected.
    //2) Debemos tener acceso a todos los campos (getter y setter).
    //3) Contructor vacio si o si.
    //4) Serializable implementado en todas las clases. (implements Serializable)
        
    Consigna:
    Convertir el proyecto a javaBean y el nombre de los packages tienen que tener
    la extension ar.com y como dominio su nombre "ar.com.lautaro.loQueSigue"
    en el main deben hacer una lista que cargue aleatoriamente
    o dinamicamente 2 productos.
         */
//      Inicio del programa de Productos(Buzo y Zapatillas)
        Ejecutar();
    }

    public static String cargarTexto(String texto) {
        Scanner leer = new Scanner(System.in);
        System.out.println(texto);
        String tex = leer.nextLine();
        return tex;
    }

    public static double cargarPrecio(String texto) {
        Scanner leer = new Scanner(System.in);
        System.out.println(texto);
        double precio = leer.nextDouble();
        return precio;
    }

    public static int cargarNumero(String texto) {
        Scanner leer = new Scanner(System.in);
        System.out.println(texto);
        int numero = leer.nextInt();
        return numero;
    }

    public static void Buzo(int cantidad) {
        String[] talle = new String[cantidad];
        String[] color = new String[cantidad];
        double[] precio = new double[cantidad];
        String[] marca = new String[cantidad];

        Random r1 = new Random();
//        DecimalFormat df = new DecimalFormat("#.00");
        for (int i = 0; i < cantidad; i++) {
            talle[i] = JOptionPane.showInputDialog("Ingrese el talle del buzo (" + (i + 1) + "):");
            color[i] = JOptionPane.showInputDialog("Ingrese el color del buzo (" + (i + 1) + "):");
            double rdo = r1.nextDouble(5000, 12501);
            precio[i] = Math.round(rdo);
            marca[i] = JOptionPane.showInputDialog("Ingrese la marca del buzo (" + (i + 1) + "):");
//            talle[i]= cargarTexto("Ingrese el talle del buzo ("+(i+1)+"):");
//            color[i] = cargarTexto("Ingrese el color del buzo ("+(i+1)+"):");
//            precio[i] = cargarPrecio("Ingrese el precio del buzo ("+(i+1)+"):");
//            marca[i] = cargarTexto("Ingrese la marca del buzo ("+(i+1)+"):");
        }

        for (int i = 0; i < cantidad; i++) {
            Productos b1 = new Buzos(talle[i], color[i], precio[i], marca[i]);
            JOptionPane.showMessageDialog(null, b1.toString());
//          System.out.println(b1.toString());
        }
    }

    public static void Zapatilla(int cantidad) {
        List<Integer> talle = new ArrayList<>();
        List<Double> precio = new ArrayList<>();
        List<String> marca = new ArrayList<>();
        for (int i = 0; i < cantidad; i++) {
            talle.add(cargarNumero("Ingrese el talle de la zapatilla (" + (i + 1) + "):"));
            precio.add(cargarPrecio("Ingrese el precio de la zapatilla (" + (i + 1) + "):"));
            marca.add(cargarTexto("Ingrese la marca de la zapatilla (" + (i + 1) + "):"));
        }
        for (int i = 0; i < cantidad; i++) {
            Productos z1 = new Zapatillas(talle.get(i), precio.get(i), marca.get(i));
            System.out.println(z1);
        }

    }

    public static void Ejecutar() {
        int cantidad = cargarNumero("Ingrese la cantidad de productos a cargar: ");
        Buzo(cantidad);
        Zapatilla(cantidad);
    }
}
