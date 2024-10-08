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
public class PEDIDOS_PERSONALIZADOS {
    public String platillo;//la vaplatillo que desea personalizar
    public VER_LA_GANANCIA vg = new VER_LA_GANANCIA();
    
    public String prsn;// que personalizacion va a hacer 
    public String cancelarPrn;// para cancelar
    public String listo;
    public int op;
    public String respuesta;
    public int costoPersonalizacion;
   public  int  monto;
   public float preciob;
   public int cambio;
    public int total;
     public Scanner leer = new Scanner (System.in);
    //metodo que se va a encargar de hacer esa personalizacion 
    
    
    public void RealizarPersonalizacion(){
        System.out.println("BIEN VENIDOS A PERSONALIZACIONES EXPRES");
        System.out.println("//////////////////////////////////////");
        System.out.println("");
        System.out.println("platillo que quiera personalizar:");
        platillo=leer.nextLine();
        System.out.println("que personalizaion va a hacer:");
        prsn=leer.nextLine();
        System.out.println("desea agregra la personalizacion (s/n");
        respuesta=leer.nextLine();
        
        
        
        //calcular el monto a pagar 
        
       float preciob;
       switch(platillo) {
            case "taco":
                preciob = 25;
                break;
            case "torta":
                preciob= 35;
                break;
            case "enchilada":
                preciob = 45;
                break;
            default:
                System.out.println("Platillo no reconocido.");
                return;
        }
     total=(int) (preciob+(respuesta.equals("s")?25:0));
     
         //mostrar el monto total a pagar 
         
         System.out.println("el total a pagar sera de: "+total);
         
         System.out.println("ingrese el monto a pagar");
         monto=leer.nextInt();
         cambio=monto-total;
         System.out.println("su cambio sera de:"+cambio);
         
       
    
    }
        public double getMonto(){
        
        
        return total;
        
        }
    
}
