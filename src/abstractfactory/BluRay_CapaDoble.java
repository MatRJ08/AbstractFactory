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
public class BluRay_CapaDoble extends BluRay {
 
    @Override
    public String getCapacidad() {
            return "17.4GB";
    }
 
    @Override
    public String getNombre() {
            return "BluRay Capa Doble";
    }
 
    @Override
    public String getPrecio() {
            return "28.00$";
    }
}
