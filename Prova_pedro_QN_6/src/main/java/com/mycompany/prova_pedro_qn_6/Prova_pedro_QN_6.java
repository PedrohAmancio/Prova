/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.prova_pedro_qn_6;
import java.util.Scanner;
/**
 *
 * @author p.rosa
 */
public class Prova_pedro_QN_6 {

    public static void main(String[] args) {
       Scanner ler = new Scanner(System.in);
       int N; int QTDN=0; int SN=0;double media ;
       
       System.out.println("Digite numeros inteiros a vontade(Digite 0 para parar)");
       N = ler.nextInt();
       SN = SN + N;
       
       
       while(N != 0){
           if(N == 0){
               break;
           }
       System.out.println("Digite numeros inteiros a vontade(Digite 0 para parar)");
       N = ler.nextInt();
       SN = SN + N;
       QTDN = QTDN + 1;
       }
       media=SN/QTDN ;
      
       System.out.println("A soma dos numeros digitados é " + SN);
       System.out.println("A quantidade de numeros digitados é " + QTDN);
       System.out.println("A media dos numeros é " + media);
       
    
    }
}
