
package listapessoa;

import javax.swing.JOptionPane;

public class EmpregadoTeste {

    public static void main(String[] args) {
        Pessoa p = new Pessoa ();
        Empregado e = new Empregado ();
        
        p.nome = JOptionPane.showInputDialog ("Digite o nome:");
        p.idade = Integer.parseInt(JOptionPane.showInputDialog ("Digite a idade: "));
        p.altura = JOptionPane.showInputDialog ("Digite a altura: ");
        p.sexo = JOptionPane.showInputDialog ("Digite o sexo: ");
        e.salario = JOptionPane.showInputDialog ("Digite o salario: ");
        
        JOptionPane.showMessageDialog(null, "Nome: " +p.nome);
        JOptionPane.showMessageDialog(null, "Idade: " +p.idade );
        JOptionPane.showMessageDialog(null, "Altura: " +p.altura);
        JOptionPane.showMessageDialog(null, "Sexo: "+ p.sexo);
        JOptionPane.showMessageDialog(null, "Salario: "+ e.salario);

    }
    
}
