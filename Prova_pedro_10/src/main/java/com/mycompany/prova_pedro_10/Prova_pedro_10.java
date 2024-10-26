/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.prova_pedro_10;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import javax.swing.JOptionPane;
/**
 *
 * @author p.rosa
 */
public class Prova_pedro_10 {

    public static void main(String[] args) throws IOException {
        Scanner ler = new Scanner(System.in);
         int C;
        
        System.out.println("Digite a quantidade de produtos cadastrados");
        C=ler.nextInt();
        String nome_P[]=new String[C]; double pre[]=new double[C]; 
        for(int i = 0; i < C; i++){
        System.out.println("Digite o nome do produto");
        nome_P[i]=ler.next();
        System.out.println("Digite o  preço");
        pre[i]=ler.nextDouble();
        }
        for(int i = 0; i < C; i++){
        JOptionPane.showMessageDialog(null, "O produto " + nome_P[i] + "Tempreço R$ " + pre[i] + "/n");
    }
        
        FileWriter arquivo = new FileWriter("C:\\Users\\p.rosa\\Desktop\\Comercio.txt");
       PrintWriter gravar = new PrintWriter(arquivo);
       for(int i = 0; i < C; i++){
       gravar.println("Produto "+ nome_P[i]);
       gravar.println( "Preco "+ pre[i]);
       }
       }
}
    
