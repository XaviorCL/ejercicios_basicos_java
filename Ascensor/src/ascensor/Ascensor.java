package ascensor;

import java.util.Scanner;

/**
 *
 * @author Xavior
 * Este simpatico programita intenta imitar el comportamiento que deberia tener un ascensor
 * no incliuye muchas validaciones solo lo justo y necesario para que funcione
 */

public class Ascensor {
    
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // declaramos el piso minimo y máximo que el ascensor puede recorrer
        // declaramos ademàs las variables de entrada de usuario y piso inicial
        final int pisoMim = -2;
        final int pisoMax = 12;
        int pisoActual = 1;
        int usuRespuesta = 0;
        
        System.out.println("A que piso necesita ir, estamos en el piso "+pisoActual);
        usuRespuesta = sc.nextInt();
        
        while(usuRespuesta != 20){
                
            if(usuRespuesta >= pisoMim && usuRespuesta <= pisoMax ){
                if( usuRespuesta > pisoActual){
                     System.out.println("ascensor subiendo ..... ");
                     pisoActual = usuRespuesta; 
                    }else{
                        System.out.println("ascensor bajando ..... ");
                        pisoActual = usuRespuesta;
                    }
              
                System.out.println("A que piso necesita ir, estamos en el piso "+pisoActual);
                usuRespuesta = sc.nextInt();       
            
            }else{
                System.out.println("El edificio no tiene tantos pisos .. mire bien por favor!");
                System.out.println("estamos en el piso "+pisoActual);
                //System.exit(0);
                usuRespuesta = 1;
            }
            
        }
            
        
    }
    
}

/*
leer datos de teclado para saber a que piso deseaba ir el usuario
hay que toma variables finales para el piso maximo y piso minimo
agregar validaciones que no se pasen los pisos minimo y maximo


*/
