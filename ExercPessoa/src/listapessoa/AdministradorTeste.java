
package listapessoa;

import javax.swing.JOptionPane;

public class AdministradorTeste {
    public static void main(String[] args) {
        Administrador a = new Administrador();
        
        a.nome = JOptionPane.showInputDialog ("Digite o nome:");
        a.idade = Integer.parseInt(JOptionPane.showInputDialog ("Digite a idade: "));
        a.altura = JOptionPane.showInputDialog ("Digite a altura: ");
        a.sexo = JOptionPane.showInputDialog ("Digite o sexo: ");
        a.salario = JOptionPane.showInputDialog ("Digite o salario: ");
        a.ajudaDeCusto = Integer.parseInt(JOptionPane.showInputDialog ("Digite a ajuda de custo: "));
        
        JOptionPane.showMessageDialog(null, "Nome: " +a.nome);
        JOptionPane.showMessageDialog(null, "Idade: " +a.idade );
        JOptionPane.showMessageDialog(null, "Altura: " +a.altura);
        JOptionPane.showMessageDialog(null, "Sexo: "+ a.sexo);
        JOptionPane.showMessageDialog(null, "Ajuda de Custo: "+ a.ajudaDeCusto);
        JOptionPane.showMessageDialog(null, "Lucros: "+ a.obterLucros());
        
    }
}
