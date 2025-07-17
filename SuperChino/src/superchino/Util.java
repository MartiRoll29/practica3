/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package superchino;

import javax.swing.JOptionPane;

/**
 *
 * @author Desert
 */
public class Util {

    public void ingresaInformacion(Producto[] proc ) {
        JOptionPane.showInputDialog(null ,"Ingrese el tipo de producto 1- Alimentos 2- Bebidas 3- Higiene 4-Limpieza");
        
        proc
        JOptionPane.showInputDialog(null, "Ingrese el codigo del producto: ");
        JOptionPane.showInputDialog(null, "Ingrese el nombre del producto: ");
        JOptionPane.showInputDialog(null, "Precio base del producto: ");
        JOptionPane.showInputDialog(null, "Ganancias esperadas del producto: ");

    }
    
    public void infoInutil() {
        JOptionPane.showInputDialog(null, "Ingrese el nombre del empleado:");
        JOptionPane.showInputDialog(null, "Ingrese la cedula del super: ");
        JOptionPane.showInputDialog(null, "Ingrese el nombre del super: ");
        JOptionPane.showInputDialog(null, "Ingrese el codigo del super: ");
    }
    
    
    public void mostrarSalida(){
        
        StringBuilder resultadao = new StringBuilder();
        
    
    }
    
    public void calculos(int tipoProducto) {
        int tipo = tipoProducto;
        switch (tipo) {
            case 1:
                JOptionPane.showConfirmDialog(null, "1");
          
                break;
            case 2:
                JOptionPane.showConfirmDialog(null, "2");

                break;
                
            case 3:
                JOptionPane.showConfirmDialog(null, "3");
              
                break;
            case 4:
                JOptionPane.showConfirmDialog(null, "4");
               
                break;
            default:
                JOptionPane.showConfirmDialog(null, "error");

        }
    }
}
