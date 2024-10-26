/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.prova_pedro_qidade;
import java.util.Scanner;
/**
 *
 * @author p.rosa
 */
public class Prova_Pedro_QIdade {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int ano; int mes; int dia; int Rano; int Mmes;
        int Ri;
        
        System.out.println("Digite a sua idade em anos");
         ano = ler.nextInt();
        System.out.println("Digite a sua idade em meses");
         mes = ler.nextInt();
        System.out.println("Digite a sua idade em dias");
        dia = ler.nextInt();
        
        Rano = ano*365;
        Mmes = mes * 30;
        
        Ri= Rano + Mmes + dia;
        
        System.out.println("Essa é sua idade em dias " + Ri);
        
        
        
        
    }
}
