/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej14;

/**
 *
 * @author Usuario
 */
public class Movil {
    private String marca;
    private double precio;
    private String modelo;
    private int memoriaRAM;
    private int almacenamiento;
    private int codigo[] = new int [7];

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getMemoriaRAM() {
        return memoriaRAM;
    }

    public void setMemoriaRAM(int memoriaRAM) {
        this.memoriaRAM = memoriaRAM;
    }

    public int getAlmacenamiento() {
        return almacenamiento;
    }

    public void setAlmacenamiento(int almacenamiento) {
        this.almacenamiento = almacenamiento;
    }

    public int[] getCodigo() {
        return codigo;
    }

    public void setCodigo(int[] codigo) {
        this.codigo = codigo;
    }

    public Movil(String marca, double precio, String modelo, int memoriaRAM, int almacenamiento, int[] codigo) {
        this.marca = marca;
        this.precio = precio;
        this.modelo = modelo;
        this.memoriaRAM = memoriaRAM;
        this.almacenamiento = almacenamiento;
        this.codigo = codigo;
    }

    public Movil() {
    }
    
}
