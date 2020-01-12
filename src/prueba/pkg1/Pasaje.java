
package prueba.pkg1;


public class Pasaje {
private double distancia,cantDias;
private final double precio=35.00; 

    public Pasaje(double distancia, double cantDias) {
        this.distancia = distancia;
        this.cantDias = cantDias;
    }

    public double getDistancia() {
        return distancia;
    }

    public void setDistancia(double distancia) {
        this.distancia = distancia;
    }

    public double getCantDias() {
        return cantDias;
    }

    public void setCantDias(double cantDias) {
        this.cantDias = cantDias;
    }


   
public double valorPasaje(){
    double valorTotal=0;
    
    if(this.distancia>1000 && this.cantDias>7){
        valorTotal=(this.distancia *this.precio)*.7;
    }else{
        valorTotal=this.distancia *this.precio;
    }
    
    return valorTotal;
}

}
