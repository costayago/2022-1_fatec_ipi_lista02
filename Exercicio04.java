/* 4. Ler um inteiro no intervalo [1, 7] e exibir o dia
 da semana associado a ele, como a seguir: 1: Domingo,
  2: Segunda, 3: Terça. E assim por diante. */


import javax.swing.JOptionPane;
public class Exercicio04 {
    public static void main(String[] args) {
        int dia;
        dia = Integer.parseInt(JOptionPane.showInputDialog(
            "Digite um inteiro entre 1 a 7: "));

        switch(dia){
            case 1:
                JOptionPane.showMessageDialog(null, "Domingo :)");
                break;
            case 2:
                JOptionPane.showMessageDialog(null, "Segunda :)");
                break;
            case 3: 
                JOptionPane.showMessageDialog(null, "Terca :)");
                break;
            case 4: 
                JOptionPane.showMessageDialog(null,"Quarta :)");
                break;
            case 5: 
                JOptionPane.showMessageDialog(null,"Quinta :)");
                break;
            case 6: 
                JOptionPane.showMessageDialog(null,"Sexta :)");
                break;
            case 7: 
                JOptionPane.showMessageDialog(null,"Sabado :)");
            default:
                JOptionPane.showMessageDialog(null, "Opcao invalida, digite um numero entre 1 a 7");
                break;  
        }
    }
}
