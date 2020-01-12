
package prueba.pkg1;

public class Prueba1 {

    public static void main(String[] args) {
Pasajero pasajero;
Pasaje pasaje;        
        pasajero=new Pasajero("100084852", "Sebastian Murillo B");
        pasaje=new Pasaje(1200, 7);
        
        System.out.println("nombre pasajero: "+pasajero.getNombre());
        System.out.println("valor pasaje :"+pasaje.valorPasaje());
        
        System.out.println("-----------------------//-------------------------");
        
        pasajero=new Pasajero("1000900114", "Laura Murillo B");
        pasaje=new Pasaje(1200,9);
        
        System.out.println("nombre pasajero: "+pasajero.getNombre());
        System.out.println("valor pasaje :"+pasaje.valorPasaje());        
        
        
    }
    
}
