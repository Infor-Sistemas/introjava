/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package introjava;
import java.util.Scanner;

/**
 *
 * @author noite
 */
public class Introjava {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) throws java.io.IOException
    {  
        char choice;
        
        System.out.println("Help on");
        System.out.println(" 1.if");
        System.out.println(" 2.switch");
        System.out.print("Choose one:");
        choice = (char) System.in.read();
        
        System.out.println("\n");
        
        switch(choice) {
            case '1':
                System.out.println("The if:\n");
                System.out.println("if(condition)statement:");
                System.out.println("else statemet;");
                break;
            case '2':
                System.out.println("The switch:\n");
                System.out.println("switch(expression){");
                System.out.println(" case constant:");
                System.out.println("  statement sequence");
                System.out.println("  break;");
                System.out.println(" //..");
                System.out.println("}");
                break;
            default:
                System.out.print("Selection not found.");
                        
        }
        
    
    }
        
        
        
        
//                    AULA DE QUARTA-FEIRA        
//       ======================================================
//        aves objPassaro = new aves();
//             String resultado = objPassaro.Comer("mais");
//             
//             if(resultado == "mais"){
//                 System.out.print("Vou enviar mais comida");
//             }
//       ======================================================
             
        
        
//    Scanner teste = new Scanner(System.in);
//    System.out.println("Informe um valor");
//    int retorno = teste.nextInt();
//    
//    while(retorno != 0 && retorno <=12){
//        System.out.println("Informe um valor");
//        retorno = teste.nextInt();
//        
//        }
//    System.out.println("Valor Informado com sucesso");
//       
    
    
    
    }

    
    
}
