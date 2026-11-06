package lab4p1_juliomartinez;
import java.util.Scanner;
public class Lab4P1_JulioMartinez {
    static Scanner leer = new Scanner(System.in);
    public static void main(String[] args) {
        int opcion = menu();
        
        while (opcion != 4){
            switch (opcion){
                case 1:{
                    Ejercicio1();
                    break;
                }
                
                case 2:{
                    Ejercicio2();
                    break;
                }
                
                case 3:{
                    Ejercicio3();
                    break;
                }
                
                case 4:{
                    System.out.println("GRACIAS POR VISITAR EL CUARTO LAB :)");
                    break;
                }
                
                default:{
                    System.out.println("Ingresa otro, este caso no existe");
                    break;
                } 
            }
            opcion = menu();
        }
    }
    
    public static int menu(){
        System.out.println("--Menu--");
        System.out.println("1. ");
        System.out.println("2. ");
        System.out.println("3. ");
        System.out.println("4. Salir");
        System.out.print("Ingrese lo que desea hacer: ");
        int op = leer.nextInt();
        return op;
    }
    
    public static void Ejercicio1(){
        
    }
    
    public static void Ejercicio2(){
        
    }
    
    public static void Ejercicio3(){
        
    }
}
