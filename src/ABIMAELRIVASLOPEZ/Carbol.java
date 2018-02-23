
package ABIMAELRIVASLOPEZ;


public class Carbol {
    String nombre,puesto;
    double sueldo;

    public String getNombre() {
        return nombre;
    }

    public String getZona() {
        return puesto;
    }

    public double getAlturamedia() {
        return sueldo;
    }

    public Carbol() {
    }

    public Carbol(String nombre, String puesto, double sueldo) {
        this.nombre = nombre;
        this.puesto = puesto;
        this.sueldo = sueldo;
    }

    @Override
    public String toString() {
       
           return "Nombre:" + nombre +"          Puesto:"+puesto+ "          Sueldo: $" + sueldo;
           
    }
    
    
}
