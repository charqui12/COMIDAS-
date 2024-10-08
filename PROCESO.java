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

public class PROCESO {
    public int op;
    public String NombreRES;
    public String Horarios;
    public String lemaR;
    public double gananciaTotal;//variable para almacenar la ganacia despues de hacer diferentes acciones 
    
    public float totalG;//aki vamos a guardar la suma de todas la compras 
    public venta_comida vt = new venta_comida();
     public Scanner leer = new Scanner (System.in);
//     PROCESO pr= new PROCESO();
     
      public PROCESO() {
        NombreRES="Antojitos los reales ";
       Horarios="toda la semana de 7 am "
               + "a 8pm";
       lemaR="SIEMPRE LIMPIOS";
   }
    
    //menu principal 
    public void menu(){
         for (;;) {
        System.out.println("BIEN VENIDO AL RESTUARANTE ");
        System.out.println(NombreRES);
        System.out.println(Horarios);
        System.out.println(lemaR);
        System.out.println("QUE DESEA REALIZAR");
        System.out.println("1::solo comprar");
        System.out.println("2::PEDIDOS PERSONALIZADOS ");
        System.out.println("3::SERVICIOS A DOMICILIO");
        System.out.println("4::SE PAGA AL PERSONAL");
        System.out.println("5::VER LA GANACIA TOTAL DEL DIA");
        System.out.println("6:: ELIGA LA OPCION");
        System.out.println("7::SALIR");
        op= leer.nextInt();
        
       switch(op){
     
           case 1:
               
              venta_comida vt= new venta_comida();
              vt.realizaVenta();
              totalG+=vt.total;
              gananciaTotal+=vt.getTotal()/2;
           
               
               
               break;
           case 2:
               PEDIDOS_PERSONALIZADOS pr = new PEDIDOS_PERSONALIZADOS(); 
               pr.RealizarPersonalizacion();
               gananciaTotal+=pr.getMonto();
           
               
               
               
               break;
           case 3: 
               PEDIDOS_A_DOMICILIO pad = new PEDIDOS_A_DOMICILIO();
               pad.realiza_pedido_domicilio();
               gananciaTotal+=pad.getprecioConDescuento();
               
               
               break;
           case 4: 
               PAGAR_PERSONAL pp= new PAGAR_PERSONAL();
               pp.Pagando_personal();
//               pp.calcularPagoTotal();
              gananciaTotal=pp.getPagoTotal(); 
               
               
               
               break;
           case 5: 
               VER_LA_GANANCIA vg = new VER_LA_GANANCIA();
               System.out.println("La ganancia total es: "+gananciaTotal);
               
               
               
               
               
               break;
           
   
       }
    
     System.out.println("¿Desea realizar otra operación? (1: Sí / 0: No)");
        int continuar = leer.nextInt();
        if (continuar == 0) {
            break; // Sale del bucle si el usuario decide no continuar
    
    
    }

    }
       
      
    }
}
