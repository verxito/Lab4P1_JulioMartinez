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
        System.out.println("1. Intercalado con patron");
        System.out.println("2. Escalera de letras");
        System.out.println("3. Analizador");
        System.out.println("4. Salir");
        System.out.print("Ingrese lo que desea hacer: ");
        int op = leer.nextInt();
        return op;
    }
    
    public static void Ejercicio1(){
        System.out.print("Ingrese la primera cadena: ");
        String cadena1 = leer.next();
        System.out.print("Ingrese la segunda cadena: ");
        String cadena2 = leer.next();
        cadena2 = cadena2.toUpperCase();
        int espacios = 0;
        int numcadena1;
        int numcadena2;
        String contra = "";
        
        while (cadena1.length() != cadena2.length()){
            System.out.println("Tienen que ser del mismo size");
            System.out.print("Ingrese la primera cadena: ");
            cadena1 = leer.next();
            leer.nextLine();
            System.out.print("Ingrese la segunda cadena: ");
            cadena2 = leer.next();
            cadena2 = cadena2.toUpperCase();
        }
        
        for (int x = 0; x < cadena1.length(); x++){
                contra += cadena1.charAt(x);
                contra += cadena2.charAt(x);
        }
        System.out.println(contra);
    }
    
    public static void Ejercicio2(){
        System.out.print("Ingresa una letra: ");
        String letra = leer.next();
        letra = letra.toUpperCase();
        System.out.print("Ingresa el size: ");
        int size = leer.nextInt();
        char letrica = letra.charAt(0);
        String letras = "";
        
        while (letra.length() != 1 || letrica <65 || letrica >90){
            System.out.println("No debe haber espacio o debe ingresar una letra");
            System.out.print("Ingresa una letra: ");
            letra = leer.next();
            letra = letra.toUpperCase();
            System.out.print("Ingresa el size: ");
            size = leer.nextInt();
            letrica = letra.charAt(0);
        }
        
        for(int x = 0; x < size; x++){
            if (letrica == 90){
                letras += letrica;
                System.out.println(letras);
                letrica = 65;
                
            }
            else{
               letras += letrica;
               System.out.println(letras);
               letrica ++;
            }
        }
    }
    
    public static void Ejercicio3(){
        System.out.print("Ingrese una cadena: ");
        String cadena1 = leer.next();
        String letras = "";
        String numeros = "";
        String simbolos = "";
        int letrass = 0;
        int numeross = 0;
        int simboloss = 0;
        double numletras = 0;
        double numsimbolos = 0;
        int numerossuma = 0;
        for (int x = 0; x < cadena1.length(); x++){
            char letrica = cadena1.charAt(x);
            
            if ((letrica >= 65 && letrica <= 90) || (letrica >= 97 && letrica <= 122)){
                letras += letrica;
                numletras += letrica;
                letrass ++;
                
            }
            else if(letrica >= 48 && letrica <= 57){
                numeros += letrica;
                numeross ++;
                numerossuma += Integer.parseInt(numeros);
                
            }
            else{
                simbolos += letrica;
                numsimbolos += letrica;
                simboloss ++;
            }
        }
        if (letrass > 0 && numeross >0 && simboloss >0){
            System.out.println("Letras: "+ letras);
            System.out.println("Numeros: "+ numeros);
            System.out.println("Simbolos: "+ simbolos);
            System.out.println();
            System.out.println("Total Letras: "+ letrass);
            System.out.println("Total Numeros: "+ numeross);
            System.out.println("Total Simbolos: "+ simboloss);
            System.out.println("Suma de numeros: "+ numerossuma);
            System.out.println();
            double promedioletras = numletras/letras.length();
            System.out.println("promedio ASCII de letras: "+ promedioletras);
            double promediosimbolos = numsimbolos/simbolos.length();
            System.out.println("promedio ASCII de letras: "+ promediosimbolos);
            
        }
        else if (letrass == 0 && numeross > 0 && simboloss > 0 ){
            System.out.println("No hay letras");
            System.out.println("Numeros: "+ numeros);
            System.out.println("Simbolos: "+ simbolos);
            System.out.println("Suma de numeros: "+ numerossuma);
            System.out.println();
            double promediosimbolos = numsimbolos/simbolos.length();
            System.out.println("promedio ASCII de letras: "+ promediosimbolos);
            
        }
        else if (letrass > 0 && numeross == 0 && simboloss >0){
            System.out.println("Letras: "+ letras);
            System.out.println("No hay numeros");
            System.out.println("Simbolos: "+ simbolos);
            System.out.println();
            double promedioletras = numletras/letras.length();
            System.out.println("promedio ASCII de letras: "+ promedioletras);
            double promediosimbolos = numsimbolos/simbolos.length();
            System.out.println("promedio ASCII de letras: "+ promediosimbolos);
        }
        else if(letrass > 0 && numeross > 0 && simboloss == 0){
            System.out.println("Letras: "+ letras);
            System.out.println("Numeros: "+ numeros);
            System.out.println("No hay Simbolos");
            System.out.println("Suma de numeros: "+ numerossuma);
            System.out.println();
            double promedioletras = numletras/letras.length();
            System.out.println("promedio ASCII de letras: "+ promedioletras);
        }
    }
}
