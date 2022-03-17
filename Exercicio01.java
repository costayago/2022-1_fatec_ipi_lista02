// 1. Ler um número inteiro e exibir se 
// ele é positivo, negativo ou neutro (0).

import java.util.*;
public class Exercicio01{
    public static void main(String[] args) {
        Scanner leitor = new Scanner (System.in);
        System.out.printf ("Digite um numero inteiro\n");
        int numero = leitor.nextInt();
        if (numero > 0){
            System.out.printf("%d e um numero positivo", numero);
        }
        else if(numero < 0){
            System.out.printf("%d e um numero negativo", numero);
        }
        else{
            System.out.printf("%d e um numero neutro", numero);
        }
        leitor.close();
    }
}