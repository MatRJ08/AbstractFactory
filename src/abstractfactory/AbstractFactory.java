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
public class AbstractFactory {

    /**
     * @param args the command line arguments
     */
      public static void main(String[] args) {
            FabricaDiscos fabrica;
    DVD dvd;
    BluRay bluray;
     
    fabrica = new FabricaDiscos_CapaSimple();
    dvd = fabrica.crearDVD();
    bluray = fabrica.crearBluRay();
     
    System.out.println(dvd);
    System.out.println(bluray);
     
    fabrica = new FabricaDiscos_CapaDoble();
    dvd = fabrica.crearDVD();
    bluray = fabrica.crearBluRay();
     
    System.out.println(dvd);
    System.out.println(bluray);
    }
    
}
