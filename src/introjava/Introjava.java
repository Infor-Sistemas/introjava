/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package introjava;
import java.util.Scanner;
import java.lang.Math;

/**
 *
 * @author noite
 */
public class Introjava {

     enum Tools {
    SCREWDRIVER, WRENCH, HAMMER, PLIERS   // Constantes e enums em Caixa Alta
    }
    
    public enum menu{
    
        SALVAR(1),IMPRIMIR(2),ABRIR(3),VISUALIZAR(4),FECHAR(5);
        
        private final int valor;
        menu(int valorOpcao){
            valor = valorOpcao;
        }
        public int getValor(){
            return valor;
        }
    }
    
    public static void main(String[] args) throws java.io.IOException
    {  
        char choice;
        
        System.out.println("Help on");
        System.out.println(" 1.if");
        System.out.println(" 2.switch");
        System.out.println(" 3.tamanho da lua");
        System.out.println(" 4.scopo das variaveis");
        System.out.println(" 5.casting / trabalhando com caracteres ASC");
        System.out.println(" 6.Trabalhando com caracteres de conversão");
        System.out.println(" 7.calculo de conversao");
        System.out.println(" 8.comparadores");
        System.out.println(" 9. mais exemplos");
        System.out.println(" 0. raiz quadrada");
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
            case '3':
                double earthweight; //weight on earth
                double moonweight; //weight on moon
                earthweight=165;
                moonweight=earthweight*0.17;
                System.out.println(earthweight + " earth-pounds is equivalent to " +
                        moonweight + " moon-pounds");
                break;
            case'4':
                int x; // known to all code within main
                x = 10;
                if(x==10){      // start new scope
                    int y=20;      // known only to this block x and y both known here.
                    System.out.println("x and y: " +x + " " + y);
                    x=y*2;
                }
                // y = 100;  //Error" y not knowh here
                // x is still known here.
                System.out.println("x is " + x);
                break;
            case '5':
                double z,y;
                byte b;
                int i;
                char ch;
                
                z=10.0;
                y=3.0;
                
                i=(int)(z/y);       // cast double to int
                System.out.println("Integer outcome of z/y:" +i);
                
                i=100;
                b=(byte) i;
                System.out.println("Value of b: " + b);
                
                i=257;
                b=(byte) i;
                System.out.println("Value of b: " + b);
                
                b=90;       // ASCC code for Z    (88 é da X)
                ch=(char)b;
                break; 

            case '6':
                ch='A';
                System.out.println("ch2 contains " + ch);
                
                ch++;                  // increment  ch
                System.out.println("ch is now " + ch);
                
                ch=90;        // give ch the value Z
                System.out.println("ch is now " + ch);
                break;
7
            case '7':
                double gallons;      // holds the number of gallons
                double liters;       // holds conversion to liters
                
                gallons = 10;         // start with 10 gallons
                liters = gallons * 3.7854;     // convert to liters
                
                System.out.println("gallons is " + liters + " liters.");
                break;
                
            case '8':
                int j;
                boolean b1, b2;
                
                i=10;
                j=11;
                if(i<j) System.out.println("i<j");
                if(i<=j) System.out.println("i<=j");
                if(i!=j) System.out.println("i!=j");
                if(i==j) System.out.println("i==j");
                if(i>=j) System.out.println("i>=j");
                if(i>j) System.out.println("i>j");
                
                b1 = true;
                b2 = false;
                if(b1 & b2) System.out.println("this won't execute");  // and    
                if(b1 & !b2) System.out.println("b1 e true e b2 nao é true");  // and    
                if(!(b1 & b2)) System.out.println("b1 & b2) ambos nao são true (somente o b1)");
                if(b1 | b2) System.out.println("b1 | b2 is true");    // |=ou
                if(b1 ^ b2) System.out.println("b1 ^ b2 is true");    //  ^=   ou exclusivo
                if(b1) System.out.println("b1 é true");
                if(b2) System.out.println("b2 e true");
                if(!b2) System.out.println("b2 e false");
                break;
                        
            case '9':
                int a, c;
                a=2;
                b=3;
                
                if(a < b) System.out.println("a is less than b");
                
                // this won't display anything
                if(a==b) System.out.println("you won't see this");
                
                System.out.println();

                System.out.println("c contains -1");
                if(c >= 0) System.out.println("c is non-negative");
                if(c < 0) System.out.println("c is negative");
                
                System.out.println();
                
                c=b-a;    // c now contains 1
                System.out.println("c contains 1");
                if(c>=0) System.out.println("c is non-negative");
                if(c<0) System.out.println("c is negative");

                break;
                
            case '0':
                double num, sroot, rerr;
                for(num=1.0; num < 100.0; num++)
                {
                    sroot = Math.sqrt(num);      // raiz quadrada
                    System.out.println("Square root of" + num + " is " + sroot);
                    
                    // compute rounding error SqrRoot
                    rerr = num - (sroot * sroot);
                    System.out.println("Rounding error is " + rerr);
                    System.out.println();
                    
                }
                
                break;
            default:
                System.out.print("Selection not found.");  
                 escolhe(menu.ABRIR);
        }
        
    
    }
    
     public static void escolhe(menu Opcao){
        if(Opcao == menu.SALVAR){
            System.out.println("salvando");
        }else if(Opcao == menu.ABRIR){
            System.out.println("abrir arquivo ");
        
        }
    
    
}
        
        
        
        
//                    AULA DE QUARTA-FEIRA (não apagar)       
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

    
    
