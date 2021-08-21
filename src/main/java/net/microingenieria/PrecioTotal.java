package net.microingenieria;
public class PrecioTotal {
    double totalComputadores = 0;
    double totalPortatiles = 0;
    double totalDeMesa =0;
    Computador[] computadores;

    public PrecioTotal(Computador[] arreglo){
        this.computadores  = arreglo;
    }

    public void mostrarTotales(){
        for(int i = 0;i< this.computadores.length;i++){
            if(true ){
                totalComputadores += computadores[i].calcularPrecio();
            }
            if(computadores[i].clase == 1 ){
                totalPortatiles += computadores[i].calcularPrecio();
            }
            if(computadores[i].clase == 2 ){
                totalDeMesa += computadores[i].calcularPrecio();
            }

        }
    
    System.out.println("La suma del precio de los computadores es de " + totalComputadores);
    System.out.println("La suma del precio de los portatiles es de " + totalPortatiles);
    System.out.println("La suma del precio de los de mesa es de " + totalDeMesa);
    }
   }