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
public class PAGAR_PERSONAL {
    
    //variables que nos va a ayudar a manejar nestro programa 
    public String nombreTrabajador;
    public float pago_trabajador,pagoxhora,descuento_prestamo,pago_nuevo;
   
    public int op, horas_trabajadas;
    public String op1r;
    public float Pagototal;
    
    public float getPagoTotal(){
    
    return Pagototal;
    
    
    }
    
    public Scanner leer = new Scanner (System.in);
    
    
    public void Pagando_personal(){
    
        
        System.out.println("/////////////////////////////////");
        System.out.println("BIEN VENIDO A PAGANDO AL PERSONAL");
        System.out.println("ingrese el nommbre del trabajador");
        nombreTrabajador=leer.nextLine();
        System.out.println("ingrese el pago por hora del trabajador ");
        pagoxhora=leer.nextFloat();
        System.out.println("ingrese sus horas chambeadas");
        horas_trabajadas=leer.nextInt();
     

Pagototal=calcularPagoTotal();

        System.out.println("el pago final para "+ nombreTrabajador+"es de:$"+Pagototal);
          
        pago_nuevo=pago_trabajador*pagoxhora;

   
   
    }
    
    public float calcularPagoTotal(){
    return pagoxhora*horas_trabajadas;
    
    
    
    }
    
    
    
    
}
