
package lista1;

import javax.swing.JOptionPane;

public class CoockerTeste {

    public static void main(String[] args) {
        Animals a = new Animals ();
        Cachorro c = new Cachorro ();
        Cocker co = new Cocker ();
        int tosar;
        
        a.cor = JOptionPane.showInputDialog("Qual a cor?");
        a.tipo = JOptionPane.showInputDialog ("Qual o tipo?");
        c.nome = JOptionPane.showInputDialog("Qual o nome?");
        c.raca = JOptionPane.showInputDialog("Qual a raca?");
        tosar = Integer.parseInt(JOptionPane.showInputDialog("1- Precisa de tosa 2- NÃ£o precisa de tosa"));
        if (tosar == 1){
            co.tosa = true;
        }
        if (tosar == 2){
            co.tosa = false;
        }
        
        JOptionPane.showMessageDialog(null, "Cor "+ a.cor);
        JOptionPane.showMessageDialog(null, "Tipo: "+ a.tipo);
        JOptionPane.showMessageDialog(null, "Nome: "+ c.nome);
        JOptionPane.showMessageDialog(null, "RaÃ§a: "+ c.raca);        
      
    }
    
}
