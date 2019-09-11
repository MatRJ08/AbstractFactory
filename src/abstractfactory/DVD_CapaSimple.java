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
public class DVD_CapaSimple extends DVD {
 
    @Override
    public String getCapacidad() {
            return "4.7GB";
    }
 
    @Override
    public String getNombre() {
            return "DVD Capa Simple";
    }
 
    @Override
    public String getPrecio() {
            return "5.00$";
    }
}
