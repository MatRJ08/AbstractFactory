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
public abstract class Disco{
    
    public abstract String getCapacidad();
 
    public abstract String getNombre();
 
    public abstract int getPrecio();
 
    @Override
    public String toString() {
            return getNombre() + " (" + getCapacidad() + ")";
    }
}
