/* 6. Ler um número inteiro e responder se ele é bissexto ou não.
Um ano bissexto tem as
seguintes características:
- é múltiplo de quatro e não é múltiplo de 100 ou
- é múltiplo de 400 */

import javax.swing.JOptionPane;
public class Exercicio06 {
    public static void main(String[] args) {
        int ano;
        ano = Integer.parseInt(JOptionPane.showInputDialog(
            "Digite o ano para saber se ele e bissexto ou nao "));

        if ((ano % 400 == 0) && (ano % 100 != 0) || ano % 4 == 0 ){
            JOptionPane.showMessageDialog(null, 
            String.format(
                "%d e um ano bissexto",
                ano
            ));
        }
        else{
            JOptionPane.showMessageDialog(null, 
            String.format(
                "%d nao e um ano bissexto",
                ano
            ));
        }
      
    }
    
}
