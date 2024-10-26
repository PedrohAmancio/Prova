/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.prova_pedro_qtxt_8;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
/**
 *
 * @author p.rosa
 */
public class Prova_pedro_Qtxt_8 {

    public static void main(String[] args) throws IOException {
       Scanner ler = new Scanner(System.in);
       int N;
       
       System.out.println("Digite um numero");
       N=ler.nextInt();
       for(int i = 0 ; i <= 10; ++i){
            System.out.println(N*i);
       }
       FileWriter arquivo = new FileWriter("C:\\Users\\p.rosa\\Desktop\\Tabuada.txt");
       PrintWriter gravar = new PrintWriter(arquivo);
       gravar.println("Tabuada de " + N);
       gravar.println("------DATA------");
       
       
       
    }
}
