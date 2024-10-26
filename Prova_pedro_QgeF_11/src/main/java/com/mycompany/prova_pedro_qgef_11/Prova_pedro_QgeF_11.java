/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.prova_pedro_qgef_11;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import javax.swing.JOptionPane;
/**
 *
 * @author p.rosa
 */
public class Prova_pedro_QgeF_11 {

    public static void main(String[] args) throws IOException {
        Scanner ler = new Scanner(System.in);
        int cliente;int A=0;int C=0; int D=0;
        
        System.out.println("Digite quantos clientes vao participar");
        cliente = ler.nextInt();
        System.out.println("Esses sao os generos");
        System.out.println("1-Acao");
        System.out.println("2-Comedia");
        System.out.println("3-Drama");
        int res[]= new int[cliente];
        for(int i = 0 ; i < cliente; i++){
            System.out.println("Digite o numero referente ao seu genero favorito");
            res[i]=ler.nextInt();
            if(res[i]==1){
                A=A+1;
            }
            else if(res[i]==2){
               C=C+1; 
            }
            else if(res[i]==3){
               D=D+1; 
            }
        }
        JOptionPane.showMessageDialog(null, "O genero de acao teve " + A + " votos");
        JOptionPane.showMessageDialog(null, "O genero de Comedia teve " + C + " votos");
        JOptionPane.showMessageDialog(null, "O genero de Drama teve " + D + " votos");
        
        FileWriter arquivo = new FileWriter("C:\\Users\\p.rosa\\Desktop\\Genero.txt");
       PrintWriter gravar = new PrintWriter(arquivo);
       
       gravar.println("Genero acao " + A + " votos");
      gravar.println("Genero comedia " + C + " votos");
      gravar.println("Genero drama " + D +  " Votos");
       
    }
}
