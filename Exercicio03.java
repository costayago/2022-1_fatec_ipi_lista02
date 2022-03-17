//3. Ler três valores reais e exibir o maior valor 
// entre eles. Suponha que eles sejam diferentes.


import javax.swing.JOptionPane;
public class Exercicio03 {
    public static void main(String[] args) {
        double a, b, c;

        a = Double.parseDouble(JOptionPane.showInputDialog(
            "Digite um valor real: "      
        ));
        
        b = Double.parseDouble(JOptionPane.showInputDialog(
            "Digite o segundo valor real: "
        ));

        c = Double.parseDouble(JOptionPane.showInputDialog(
            "Digite o terceiro valor real: "
        ));

        if(a > b && a > c){
            JOptionPane.showMessageDialog(null,
            String.format(
                "%.2f e o maior valor!!",
                a
            ));
        }
        else if(b > a && b > c){
            JOptionPane.showMessageDialog(null,
            String.format(
                "%.2f e o maior valor!!",
                b
            ));
        }
        else{
            JOptionPane.showMessageDialog(null,
            String.format(
                "%.2f e o maior valor",
                c
            ));
        }
    }
}

