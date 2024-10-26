/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.prova_pedro_qad_12;
import java.util.Scanner;
/**
 *
 * @author p.rosa
 */
public class Prova_pedro_Qad_12 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int num[] = new int[10];
        for(int i = 0; i < 10; i++){
            System.out.println("Digite os numeros");
            num[i]=ler.nextInt();
            if(num[0]<num[1]){
                num[1]=num[0];
            }
        }
          for(int i = 0; i < 10; i++){
        System.out.println(num[i]);
          }
        
    }
}
