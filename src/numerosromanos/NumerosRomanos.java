/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numerosromanos;

    import Utils.enterNumber;
    import Utils.convertNumber;

    public class NumerosRomanos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
            int number;
        enterNumber object = new enterNumber();
        System.out.println("Ingrese un numero:");
        number=object.integerNumber();
        
        /* Realizamos la transformacion a numero romano */
        String numberRoman;
        convertNumber obj = new convertNumber();
        numberRoman=obj.number(number);
        System.out.println("\n");
        System.out.println(numberRoman);
        
        
    }
    
    }
    
    
    
    
    
    
   
    

