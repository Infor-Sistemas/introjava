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
    
    public static void main(String[] args) {
        // TODO code application logic here
    
    Scanner teste = new Scanner(System.in);
    System.out.println("Informe um valor");
    int retorno = teste.nextInt();
    
    while(retorno != 0 && retorno <=12){
        System.out.println("Informe um valor");
        retorno = teste.nextInt();
        
        }
    System.out.println("Valor Informado com sucesso");
       
    }
    
}
