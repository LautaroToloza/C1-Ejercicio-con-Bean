
package ar.com.lautaro.clases;

import java.io.Serializable;

public class Buzos extends Productos implements Serializable {

    // Campos 
    private String talle;
    private String color;

    // Constructor vacio
    public Buzos() {
    }

    // Constructor 
    public Buzos(String talle, String color, double precio, String marca) {
        super(precio, marca);
        this.talle = talle;
        this.color = color;
    }

    // Getter y Setter
    public String getTalle() {
        return talle;
    }

    public void setTalle(String talle) {
        this.talle = talle;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    // toString
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Buzos{");
        sb.append(super.toString());
        sb.append(", talle= ").append(talle);
        sb.append(", color= ").append(color);
        sb.append('}');
        return sb.toString();
    }

}
