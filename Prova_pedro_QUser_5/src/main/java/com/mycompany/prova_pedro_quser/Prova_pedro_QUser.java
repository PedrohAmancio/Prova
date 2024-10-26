/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.prova_pedro_quser;
import java.util.Scanner;
/**
 *
 * @author p.rosa
 */
public class Prova_pedro_QUser {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int Cod_user; int Senha_user;
        
        System.out.println("Digite o codigo de usuario");
        Cod_user = ler.nextInt();
        if(Cod_user == 1234){
            System.out.println("Digite a senha do usuario digitado");
            Senha_user = ler.nextInt();
            if(Senha_user == 9999 ){
            System.out.println("Acesso permitido");
            }
            else{
                System.out.println("Acesso negado");
            }
        }
        else{
          System.out.println("Usuario invalido");  
        }
        
    }
}
