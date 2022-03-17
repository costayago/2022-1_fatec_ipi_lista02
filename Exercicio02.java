/* 2. Ler coeficientes reais a, b e c de uma equação de segundo 
grau e exibir a(s) raiz(es), caso exista(m). Lembretes: Calcule
o valor de delta. Se ele for negativo, não há raízes.. Se for
igual a zero, há uma única raiz. Se delta for maior do que zero, 
então há duas raízes. */

import javax.swing.JOptionPane;
public class Exercicio02 {
    public static void main(String[] args) {
        double a, b, c, delta, x1, x2, x0;

        a = Double.parseDouble(JOptionPane.showInputDialog(
            "Digite o valor numerico do coeficiente a"
        ));

        b = Double.parseDouble(JOptionPane.showInputDialog(
            "Digite o valor numerico do coeficiente b"
        ));

        c = Double.parseDouble(JOptionPane.showInputDialog(
            "Digite o valor numerico do coeficiente c"
        ));

        //Δ = b2 – 4ac,
        delta = Math.pow(b,b) -4 * (a*c);

        if (delta > 0){
           // x = – b ± √Δ / 2·a
           x1 = ((-b) + Math.sqrt(delta)) / (2*a);
           x2 = ((-b) - Math.sqrt(delta)) / (2*a); 

           JOptionPane.showMessageDialog(null,
            String.format(
                "\ndelta = %.0f\n  \nx1 = %.0f\n  \nx2 = %.2f\n",
                delta, x1, x2
            ));
        }
        else if (delta == 0){
            // x = – b ± √Δ / 2·a
            x0 = -b + (Math.sqrt(delta)) / (2*a);

            JOptionPane.showMessageDialog(null,
            String.format(
                "Delta = \nx1 = %.2f", 
                delta, x0
            ));
        }
        else{
            JOptionPane.showMessageDialog(null,
            String.format(
                "Delta: %.2f não existe raiz pois e negativo!!",
                delta
            ));
        }

    }
}
