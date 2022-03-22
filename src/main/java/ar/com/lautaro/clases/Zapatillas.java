package ar.com.lautaro.clases;

import java.io.Serializable;

public class Zapatillas extends Productos implements Serializable {

    // Campos
    private int talle;

    // Constructor vacio
    public Zapatillas() {
    }

    // Constructor
    public Zapatillas(int talle, double precio, String marca) {
        super(precio, marca);
        this.talle = talle;
    }

    // Getter y Setter
    public int getTalle() {
        return talle;
    }

    public void setTalle(int talle) {
        this.talle = talle;
    }

    // toString
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Zapatillas{");
        sb.append(super.toString());
        sb.append(", talle= ").append(talle);
        sb.append('}');
        return sb.toString();
    }

}
