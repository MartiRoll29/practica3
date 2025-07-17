/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package superchino;

import javax.swing.JOptionPane;

/**
 *
 * @author Desert
 */
public class SuperChino {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        

        
        int cantProductos = Integer.parseInt(JOptionPane.showInputDialog(null, "Cantidad de productos a ingresar: "));
        Util utilidad = new Util();
        Producto productos[] = new Producto[cantProductos];
        
        
        for (int i = 0; i < productos.length; i++) {
            
            utilidad.infoInutil();

            
            productos[i].getCodigoProducto();
        
        }
        
        

        
        
        
    }
    
    
    
    
    
}
