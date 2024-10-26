/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.prova_pedro_qcafe;
import java.util.Scanner;
/**
 *
 * @author p.rosa
 */
public class Prova_pedro_Qcafe {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        double Cexpre = 0.75;double Ccapp= 1.00; double Ccleite = 1.25;
        double tot; int pedido; int QTDCex = 0; int QTDCca =0; int QTDCCleite=0;
        double valorT=0.0;
        System.out.println("1-Cafe expresso = 0.75");
        System.out.println("2-Cafe capuccino = 1.00");
        System.out.println("3-Cafe com leite = 1.25");
        System.out.println("4- total da compra");
        System.out.println("Qual cafe deseja ?");
        pedido = ler.nextInt();
         if(pedido == 1){
           QTDCex=QTDCex+1; 
           valorT = valorT + 0.75;
        }
       else if(pedido == 2){
           QTDCca=QTDCca+1; 
           valorT = valorT + 1.00;
        }
      else if(pedido == 3){
           QTDCCleite=QTDCCleite+1;
           valorT = valorT + 1.25;
        }
        while(pedido != 4){
            if(pedido == 4){
                break;
                
            }
        System.out.println("Qual cafe deseja ?");
        pedido = ler.nextInt();
        if(pedido == 1){
           QTDCex=QTDCex+1; 
           valorT = valorT + 0.75;
        }
       else if(pedido == 2){
           QTDCca=QTDCca+1; 
           valorT = valorT + 1.00;
        }
      else if(pedido == 3){
           QTDCCleite=QTDCCleite+1;
           valorT = valorT + 1.25;
        }
    }
        System.out.println("O valor total a ser pago é");
        System.out.println(valorT);
        System.out.println("Foi pedido " + QTDCex + " cafes expressos" );
        System.out.println("Foi pedido " + QTDCca + " cafes capuccino" );
        System.out.println("Foi pedido " + QTDCCleite + " cafes com leite" );
}
}
