package net.microingenieria;

public class DeMesa extends Computador{

    public double memoriaVideo = 4;
    

    public DeMesa(double precioBase, double memoriaVideo){
        this.precioBase = precioBase;
        this.memoriaVideo = memoriaVideo;
        this.clase = 2; // DeMesa
        
    }
    public DeMesa(double monitor, double precioBase, double memoriaVideo){
        this.precioBase = precioBase;
        this.monitor = monitor;
        this.memoriaVideo = memoriaVideo;
        this.clase = 2; // DeMesa

    }
    public DeMesa(double ano, double monitor, double precioBase, double memoriaVideo){
        this.precioBase = precioBase;
        this.monitor = monitor;
        this.ano = ano;
        this.memoriaVideo = memoriaVideo;
        this.clase = 2; // DeMesa

    }
    
    public double calcularPrecio(){
        if(this.memoriaVideo<4){
            this.factor=0.9;
        }
        if(this.memoriaVideo>=4 && this.memoriaVideo<=12){
            this.factor=1.1;
        }
        if(this.memoriaVideo>12){
            this.factor=1.3;
        }
        this.precioFinal = this.precioBase * (this.ano / 2021) * (this.monitor / 16) * this.factor;
        return this.precioFinal;
    }
   }