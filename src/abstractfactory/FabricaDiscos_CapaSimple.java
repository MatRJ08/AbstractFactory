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
    public class FabricaDiscos_CapaSimple implements FabricaDiscos {
     
           @Override
           public BluRay crearBluRay() {
                   return new BluRay_CapaSimple();
           }
     
           @Override
           public DVD crearDVD() {
                   return new DVD_CapaSimple();
           }
     
    }
