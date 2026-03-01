/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uts.edu.java.mundo;


public class Producto {
    
    private String nombre;
    private long costo;
    private String tipo;
    private boolean contado;
    private long descuento;
    private long incremento;
    private long total;
    private long iva;

    public Producto(String nombre, long costo, String tipo,
    boolean contado) {
        this.nombre = nombre;
        this.costo = costo;
        this.tipo = tipo;
        this.contado = contado;
    }
    public Producto() {
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public long getCosto() {
        return costo;
    }
    public void setCosto(long costo) {
        this.costo = costo;
    }
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public boolean isContado() {
        return contado;
    }
    public void setContado(boolean contado) {
        this.contado = contado;
    }
    @Override
    public String toString() {
        return "Producto{" + "nombre=" + nombre
        + ", costo=" + costo
        + ", tipo=" + tipo
        + ", contado=" + contado
        + ", descuento=" + descuento
        + ", incremento=" + incremento
        + ", total=" + total + '}';
    }

    public long getDescuento() {
        this.incremento = 0;
        if (this.contado) {
            switch(this.tipo) {
                case "AUDIO":
                    this.descuento = (long) (this.costo * 0.06);
                    break;
                case "VIDEO":
                    this.descuento = (long) (this.costo * 0.09);
                    break;
                case "LINEA":
                    this.descuento = (long) (this.costo * 0.05);
                    break;
            }
        }
        return this.descuento;
    }

    public long getIncremento() {
        this.descuento = 0;
        if (!this.contado) {
            switch(this.tipo) {
                case "AUDIO":
                    this.incremento = (long) (this.costo * 0.07);
                    break;
                case "VIDEO":
                    this.incremento = (long) (this.costo * 0.09);
                    break;
                case "LINEA":
                    this.incremento = (long) (this.costo * 0.10);
                    break;
            }
        }
        return this.incremento;
    }
    public void setTotal(long total) {
        this.total = total;
    }
    public long getTotal() {
        total = (this.costo + this.incremento
        - this.descuento + this.iva);
        return total;
    }
    public long getIva() {
        iva = (long) ((this.costo + this.incremento
        - this.descuento) * 0.18);
        return iva;
    }
    public void setIva(long iva) {
        this.iva = iva;
    }
}

