/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractfactory;

/**
 *
 * @author Keons
 */
public class DVD_CapaDoble extends DVD {
 
    @Override
    public String getCapacidad() {
            return "9.1GB";
    }
 
    @Override
    public String getNombre() {
            return "DVD Capa Doble";
    }
 
    @Override
    public int getPrecio() {
            return 10;
    }
}
