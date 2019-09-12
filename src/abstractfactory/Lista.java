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
public class Lista {
    private Nodo head;
    private int sizeBRDoble;
    private int sizeBRSimp;
    private int sizeDVDDoble;
    private int sizeDVDSimp;
  
    public Lista(){
        this.head= null;
        this.sizeBRDoble = 0;
        this.sizeBRSimp = 0;
        this.sizeDVDSimp = 0;
        this.sizeDVDDoble = 0;
    }
    /**
     * Función para saber si la lista está vacía
     * @return true si está vacía o false si no lo está
     */
    public boolean isEmpty(){
        return this.head == null;
    }
    
    
    /**
     * Función qe crea un nodo a partir de los datos que se ingresen y lo pone al inicio de la lista
     * @param data 
     */
    public void insertFirst(String disco, String capa){
        if (head==null){
            head = new Nodo(disco,capa);
        }
        else{
          Nodo temp = head;
          Nodo newNodo = new Nodo(disco,capa);
          newNodo.setNext(temp);
          head = newNodo;          
        }
        if(capa.equals("Doble")){
            if(disco.equals("DVD")){
                sizeDVDDoble++;
            }else{
                sizeBRDoble++;              
            }
        }else{
            if(disco.equals("DVD")){
                sizeDVDSimp++;         
            }else{
                sizeBRSimp++;   
            }
        }

    }
    
    /**
     * Método para imprimir en consola una lista
     * @param list  Lista que se quiere imprimir
     */
    public void printList(Lista list) { 
        
        Nodo current = list.head; 
   
        System.out.print("Lista: "); 
        while (current != null) { 
            System.out.print("Discos BluRay Capa Doble: " + this.getSizeBRDoble() + "\n"+ 
                             "Discos BluRay Capa Simple: " + this.getSizeBRSimp() + "\n"+
                             "Discos DVD Capa Doble: " + this.getSizeDVDDoble() + "\n"+
                             "Discos DVD Capa Simple: " + this.getSizeDVDSimp() + "\n"+
                             "Monto a pagar: " + this.getPrecio(list) + "\n"+
                             "¿Desea Realizar la compra?"
                            ); 
   
            current = current.getNext(); 
        } 
    }

    public Nodo getHead() {
        return head;
    }
    /**
     * Función para saber el tamaño de la lista
     * @return El tamaño de la lista
     */
    
    public int getPrecio(Lista list){
        Nodo current = list.head;
        int precio = 0;
        while(current != null){
            precio += current.getDisco().getPrecio();
            current = current.getNext();
        }
        return precio;
    }
    
    public int getSizeDVDDoble() {
        return sizeDVDDoble;
    }
    
    public int getSizeDVDSimp() {
        return sizeDVDSimp;
    }
    
    public int getSizeBRSimp() {
        return sizeBRSimp;
    }
    
    public int getSizeBRDoble() {
        return sizeBRDoble;
    }
    
    
    
}
