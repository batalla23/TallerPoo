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

    public Producto(String nombre, long costo, String tipo, boolean contado) {
        this.nombre = nombre;
        this.costo = costo;
        this.tipo = tipo;
        this.contado = contado;
        calcularValores(); // 👈 Calcular todo al crear el producto
    }
    
    // 🔧 NUEVO: Método que calcula todo de una vez
    private void calcularValores() {
        // Calcular descuento e incremento
        if (this.contado) {
            this.incremento = 0;
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
                default:
                    this.descuento = 0;
            }
        } else {
            this.descuento = 0;
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
                default:
                    this.incremento = 0;
            }
        }
        
        // Calcular IVA y Total
        this.iva = (long) ((this.costo + this.incremento - this.descuento) * 0.18);
        this.total = this.costo + this.incremento - this.descuento + this.iva;
    }
   
    // Getters y Setters
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
        calcularValores(); // 👈 Recalcular cuando cambia el costo
    }
    
    public String getTipo() {
        return tipo;
    }
    
    public void setTipo(String tipo) {
        this.tipo = tipo;
        calcularValores(); // 👈 Recalcular cuando cambia el tipo
    }
    
    public boolean isContado() {
        return contado;
    }
    
    public void setContado(boolean contado) {
        this.contado = contado;
        calcularValores(); // 👈 Recalcular cuando cambia contado
    }
    
    // 🔧 Getters modificados - ya no calculan, solo retornan
    public long getDescuento() {
        return this.descuento;
    }

    public long getIncremento() {
        return this.incremento;
    }
    
    public long getTotal() {
        return this.total;
    }
    
    public long getIva() {
        return this.iva;
    }
    
    // ❌ Eliminar setTotal() - no debería modificarse manualmente
    
    @Override
    public String toString() {
        return "Producto{" + "nombre=" + nombre
                + ", costo=" + costo
                + ", tipo=" + tipo
                + ", contado=" + contado
                + ", descuento=" + descuento
                + ", incremento=" + incremento
                + ", iva=" + iva
                + ", total=" + total + '}';
    }
}