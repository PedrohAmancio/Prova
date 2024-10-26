/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.prova_pedro_ofilm_7;
import java.util.Scanner;
/**
 *
 * @author p.rosa
 */
public class Prova_pedro_Ofilm_7 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        String nome_F; String Dica_F[]=new String [5];
        String nome_F2;
        
        System.out.println("Jogador 1 digite o nome do filme");
        nome_F=ler.next();
        
        for(int i = 0 ; i < 5; i++){
        System.out.println("Jogador 1 digite as dicas do filme");
        Dica_F[i]=ler.next();
    }
    for(int i = 0 ; i < 5; i++){
       System.out.println("Jogador 2 digite o nome do filme");
       System.out.println("Pista-" + Dica_F[i]);
        nome_F2=ler.next();
       if(nome_F.equals(nome_F2)){
           System.out.println("Parabens, vc acertou o filme");
           break;
       }
       else{
          System.out.println("Vc errou tente outra vez"); 
    }
}
}
}
