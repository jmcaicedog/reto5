package net.microingenieria;
public class Portatil extends Computador{

    public boolean refrigeracionLiquida = false;


    public Portatil(double precioBase, boolean refrigeracionLiquida){
        this.precioBase = precioBase;
        this.refrigeracionLiquida=refrigeracionLiquida;
        this.clase = 1; // Portátil
    }
    public Portatil(double monitor, double precioBase, boolean refrigeracionLiquida){
        this.precioBase = precioBase;
        this.monitor = monitor;
        this.refrigeracionLiquida=refrigeracionLiquida;
        this.clase = 1; // Portátil
    }
    public Portatil(double ano, double monitor, double precioBase, boolean refrigeracionLiquida){
        this.precioBase = precioBase;
        this.monitor = monitor;
        this.ano = ano;
        this.refrigeracionLiquida=refrigeracionLiquida;
        this.clase = 1; // Portátil
    }
    //Metodos
    public double calcularPrecio(){
        if(this.refrigeracionLiquida==true){
            this.factor=1.2;
        }
        else{
            this.factor=1.0;
        }

        this.precioFinal = this.precioBase * (this.ano / 2021) * (this.monitor / 16) * this.factor;
        return this.precioFinal;
    }
   }