/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package superchino;

/**
 *
 * @author Desert
 */
public class Producto {

    
    private int codigoProducto;
    private String nombreProducto;
    private String TipoProducto;
    private double precioBase;
    private double precioBruto;
    private double gananciasEsperadas;

    public Producto(int codigoProducto, String nombreProducto, String TipoProducto, double precioBase, double precioBruto, double gananciasEsperadas) {
        this.codigoProducto = codigoProducto;
        this.nombreProducto = nombreProducto;
        this.TipoProducto = TipoProducto;
        this.precioBase = precioBase;
        this.precioBruto = precioBruto;
        this.gananciasEsperadas = gananciasEsperadas;
    }

    @Override
    public String toString() {
        return "Producto{" + "codigoProducto=" + codigoProducto + ", nombreProducto=" + nombreProducto + ", TipoProducto=" + TipoProducto + ", precioBase=" + precioBase + ", precioBruto=" + precioBruto + ", gananciasEsperadas=" + gananciasEsperadas + '}';
    }
    
    public int getCodigoProducto() {
        return codigoProducto;
    }

    public void setCodigoProducto(int codigoProducto) {
        this.codigoProducto = codigoProducto;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public String getTipoProducto() {
        return TipoProducto;
    }

    public void setTipoProducto(String TipoProducto) {
        this.TipoProducto = TipoProducto;
    }

    public double getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(double precioBase) {
        this.precioBase = precioBase;
    }

    public double getPrecioBruto() {
        return precioBruto;
    }

    public void setPrecioBruto(double precioBruto) {
        this.precioBruto = precioBruto;
    }

    public double getGananciasEsperadas() {
        return gananciasEsperadas;
    }

    public void setGananciasEsperadas(double gananciasEsperadas) {
        this.gananciasEsperadas = gananciasEsperadas;
    }

    
}
