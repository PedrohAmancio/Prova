/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.prova_pedro_qsl_9;
import java.util.Scanner;
/**
 *
 * @author p.rosa
 */
public class Prova_pedro_Qsl_9 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        double S_hora; int H_trab; double S_mes; double N_Sal;
        double S_imp; double S_INSS;double S_sind; double S_liq;
        
        System.out.println("Quanto o funcionario ganha por hora");
        S_hora= ler.nextDouble();
        System.out.println("Quantas horas ele trabalha(informe de forma inteira)");
        H_trab= ler.nextInt();
        
        S_mes = S_hora*H_trab;
         System.out.println("Valor para imposto");
        S_imp = S_mes*0.11;
         System.out.println(S_imp);
         System.out.println("Valor para o INSS");
        S_INSS=S_mes*0.08;
         System.out.println(S_INSS);
        System.out.println("Valor para o sindicato");
         S_sind=S_mes*0.05;
         System.out.println(S_sind);
          System.out.println("Salario liquido");
          S_liq=S_mes-S_imp-S_INSS-S_sind;
           System.out.println(S_liq);
          
        
    }
}
