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
public class Nodo {
    
    private Object data;
    private Nodo next;
    FabricaDiscos fabrica;
    private Disco disco;

    public Nodo(String tipo, String capa){
        this.next= null;
        if(tipo=="Doble"){
            fabrica = new FabricaDiscos_CapaDoble();
            if(capa.equals("DVD")){
                disco = fabrica.crearDVD();
            }else{
                disco = fabrica.crearBluRay();                
            }
        }else{
            fabrica = new FabricaDiscos_CapaSimple();
            if(capa.equals("DVD")){
                disco = fabrica.crearDVD();
            }else{
                disco = fabrica.crearBluRay();
            }
        }
    }

    public Object getData(){
        return this.data;

    }

    public void setData(Object data){
        this.data = data;

    }

    public Nodo getNext(){
        return this.next;

    }

    public void setNext(Nodo nodo){
        this.next = nodo;

    } 
    
    public Disco getDisco(){
        return this.disco;
    }
    
//    public BluRay getbluRay(){
//        return this.bluRay;
//    }
}
