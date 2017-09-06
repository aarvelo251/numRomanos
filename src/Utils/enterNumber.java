/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utils;
import java.util.Scanner;
/**
 *
 * @author alumno
 */
public class enterNumber {
     public int integerNumber() {
 
         int number=0;
         boolean pedirNuevamente= true;
        try {
            Scanner read = new Scanner(System.in);
            number = read.nextInt();
            pedirNuevamente= false;
            
            if (number > 3999) {                
               System.out.println("ingreso un numero mayor a 3999, vuelva a ingresar un numero.!!!");
               pedirNuevamente= true;
            } else if (number == 0 ) {
                System.out.println("ingreso el numero 0, vuelva a ingresar un numero distinto de 0.!!!");
                pedirNuevamente= true;
            } else if (number < 1 ){
                System.out.println("ingreso un numero negativo, vuelva a ingresar un numero que no sea negativo.!!!");
                pedirNuevamente= true;
            }
            
        } catch (Exception e) {
            System.out.println("Ocurrio un problema.!!!");
            pedirNuevamente= true;
            
        }
        return number;
        
    }
   
}
