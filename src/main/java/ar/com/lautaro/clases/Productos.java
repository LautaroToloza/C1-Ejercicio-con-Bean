package ar.com.lautaro.clases;

import java.io.Serializable;

public abstract class Productos implements Serializable {

    // Campos
    protected int idProducto;
    protected static int contadorProducto;
    protected double precio;
    protected String marca;

    // Constructor vacio
    public Productos() {
    }

    // Constructor 
    public Productos(double precio, String marca) {
        this.idProducto = ++Productos.contadorProducto;
        this.precio = precio;
        this.marca = marca;
    }

    // Getter y Setter
    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    // toString
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("idProducto= ").append(idProducto);
        sb.append(", precio= ").append(precio);
        sb.append(", marca= ").append(marca);
        return sb.toString();
    }

}
