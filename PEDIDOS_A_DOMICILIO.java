/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package restuarante_real;

/**
 *
 * @author 52435
 */
import java.util.Scanner;
public class PEDIDOS_A_DOMICILIO {
    
    public PEDIDOS_PERSONALIZADOS pp = new PEDIDOS_PERSONALIZADOS();
    public VER_LA_GANANCIA vg = new VER_LA_GANANCIA();
    public String platillo_a_mandar, persona_destino, direccion, listo;
    public double precio, descuento;
    public int op;
     public boolean canceladoo;
    public float tacos;
    public float tortas;
    public float enchiladas;
    public int  precioConDescuento;
    public int montoApagar;
    public int cambio;
    public int total;
    
    
    


public Scanner leer = new Scanner (System.in);


public void realiza_pedido_domicilio(){

        System.out.println("///////////////////////////////////");
        System.out.println("BIEN VENIDOS A PEDIDOS A DOMICILIO ");
        System.out.println("//////////////////////////////////////");
        System.out.println("");
        System.out.println("platillo que quiera mandar a domicilio:");
        platillo_a_mandar=leer.nextLine();
        System.out.println("a quien sera enviado:");
        persona_destino=leer.nextLine();
        System.out.println("ingrese direccion");
        direccion=leer.nextLine();
        System.out.println("ingrese el precio ");
        precio=leer.nextDouble();
      
descuento = precio * 0.1; // le vamos a aplicar un descuento de un 10% por hacer un pedido a domicilio 

        precioConDescuento=(int) (precio-descuento);
        System.out.println("Este pedido tiene un descuento del 10%: -$" + descuento);
        System.out.println("El precio final con descuento es: $" + precioConDescuento);

        
        
        
         // Opción para cancelar el pedido
        System.out.println("¿Desea cancelar el pedido?   (si), (no)");
        String Cancelar = leer.next();
        //condicion para que el usuario elija 
        if (Cancelar.equals("Sí")) {
            canceladoo= true;
            System.out.println("Pedido cancelado.");
        } else {
            canceladoo = false;
            System.out.println("Su pedido está listo para ser enviado.");
        }
        //solicitar el monto a pagar
        System.out.println("ingres el monto a pagar");
        montoApagar=leer.nextInt();
        
        //calcular el cambio
        cambio=montoApagar- precioConDescuento;
        System.out.println("su cambio es:$"+cambio);
        

}
    
    public double getprecioConDescuento(){
        

    return precioConDescuento;
    
    
    }
    
   
            
    
    
}
