/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejextrapoo3;

/**
 *
 * @author Usuario
 */
public class Pass {
    private String nombre;
    private String pass;
    private long DNI;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public long getDNI() {
        return DNI;
    }

    public void setDNI(long DNI) {
        this.DNI = DNI;
    }

    public Pass(String nombre, String pass, long DNI) {
        this.nombre = nombre;
        this.pass = pass;
        this.DNI = DNI;
    }

    public Pass() {
      nombre = "Belen Taborda"; 
      DNI = 37821798;
    }
}
