/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej5;

/**
 *
 * @author Usuario
 */
public class CuentaBancaria {

    @Override
    public String toString() {
        return "CuentaBancaria{" + "cuenta=" + cuenta + '}';
    }

    public int getCuenta() {
        return cuenta;
    }

    public void setCuenta(int cuenta) {
        this.cuenta = cuenta;
    }

    public int getDNI() {
        return DNI;
    }

    public void setDNI(int DNI) {
        this.DNI = DNI;
    }

    public int getSaldoActual() {
        return saldoActual;
    }

    public void setSaldoActual(int saldoActual) {
        this.saldoActual = saldoActual;
    }

    public CuentaBancaria( int cuenta, int DNI) {
        this.cuenta = cuenta;
        this.DNI = DNI;
    }

    public CuentaBancaria() {
    }
   private int cuenta; 
   private int DNI;
   private int saldoActual; 
   private double ingreso;
   private double retiro;

    public double getIngreso() {
        return ingreso;
    }

    public void setIngreso(double ingreso) {
        this.ingreso = ingreso;
    }

    public double getRetiro() {
        return retiro;
    }

    public void setRetiro(double retiro) {
        this.retiro = retiro;
    }
   
}
