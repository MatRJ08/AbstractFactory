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
public class BluRay_CapaSimple extends BluRay {
 
    @Override
    public String getCapacidad() {
            return "8.7GB";
    }
 
    @Override
    public String getNombre() {
            return "BluRay Capa Simple";
    }
 
    @Override
    public int getPrecio() {
            return 15;
    }
}
