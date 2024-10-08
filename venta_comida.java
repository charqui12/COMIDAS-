/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package restuarante_real;

/**
 *
 * @author 52435
 * clase que se va a encargar de la venta de comida con 3 varieades
 */
import java.util.Scanner;
public class venta_comida {
//las 3 varieades de comida que se van a vender    
    public  float   tacos;
    public  float   tortas ;
    public PEDIDOS_PERSONALIZADOS pp = new PEDIDOS_PERSONALIZADOS();
    public VER_LA_GANANCIA vg = new VER_LA_GANANCIA();
    /////////////////////////////////7
    public float  enchiladas;
    public int  num_Or_tacos;
    public int num_tortas;
    public int num_Or_enchiladas;
    public String platilloB;
    public String  platilloC;
    public String op;
    public float precio_tacos=25;
    public float precio_tortas=45;
    public float precio_enchiladas=50;
     int  total = (int) 0.0f;
     public int  montoApagar,totalCompra,cambio;
             
     
     public double getTotal(){
     
     return total;
     
     
     }
public Scanner leer = new Scanner (System.in);



public void realizaVenta(){

    System.out.println("que desea comprar");
    System.out.println("::. tacos");
    System.out.println("::.tortas");
    System.out.println("::.enchiladas");
    System.out.println("elija la op");
    op=leer.next();
 
    switch (op){
   
        case "tacos":
            System.out.println("cuantos ordenes de tacos va a querer");
            num_Or_tacos=leer.nextInt();
            
            total=(int) (num_Or_tacos*precio_tacos);
        break;
    
        case "tortas":
            System.out.println("cuantas tortas va  a comprar");
            num_tortas=leer.nextInt();
            total=(int) (num_tortas*precio_tortas);
        break;
        
        case "enchiladas":
            System.out.println("cuantas ordenes de enchiladas va a comprar");
            num_Or_enchiladas=leer.nextInt();
            total=(int) (num_Or_enchiladas*precio_enchiladas);
            break;
    
    }

    System.out.println("el total que va a pagar es:"+total);
    System.out.println("ingresa el monto a pagar");
    montoApagar=leer.nextInt();
    
    cambio=montoApagar-total;
    System.out.println("su cambio va a hacer de"+cambio);
    
    
    
    this.total+=total;


    
    
    
    
    
    
    
    
    
    
  
    
    
}  
    
}
