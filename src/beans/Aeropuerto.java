/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

/**
 *
 * @author miguelavg
 */
public class Aeropuerto {
    public String nombre;
    public double x;
    public double y;
    public double costoAlmacen;
    public int capacMax;
    public int capacActual;
    public boolean principal;

    public Aeropuerto(String nombre, double x, double y, double costoAlmacen, int capacMax, int capacActual, boolean principal) {
        this.nombre = nombre;
        this.x = x;
        this.y = y;
        this.costoAlmacen = costoAlmacen;
        this.capacMax = capacMax;
        this.capacActual = capacActual;
        this.principal = principal;
    }
}
