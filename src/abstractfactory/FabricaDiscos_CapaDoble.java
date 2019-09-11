package abstractfactory;

/**
 *
 * @author Keons
 */
    public class FabricaDiscos_CapaDoble implements FabricaDiscos {
     
           @Override
           public BluRay crearBluRay() {
                   return new BluRay_CapaDoble();
           }
     
           @Override
           public DVD crearDVD() {
                   return new DVD_CapaDoble();
           }
     
    }
