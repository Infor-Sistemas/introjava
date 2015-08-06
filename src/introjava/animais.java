/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package introjava;

/**
 *
 * @author noite
 */
public class animais {
    String nome;
    int idade;
    int peso;
    String corDosOlhos;
    
    public String Comer( String mensagem){
        System.out.println("quero comer");
        String resultado = "mais";
        if(mensagem != "mais"){
            System.out.print("satisfeito");
            resultado = "Obrigado";
        }else{
            System.out.println("Ainda estou com fome quero comer");
        }
        return mensagem;
    
    }
//    public String Comer(){
//        int valorComida = 10;
//        String mensagem = "MAIS";
//        System.out.println("Ola, estou com fome e quero comer");
//        return mensagem;
//    
//    }

    
    public int Dormir(){
        System.out.println("bucho cheio e agora vou Giboiar");
        return 1;
    
    }
}
