package listapessoa;

import javax.swing.JOptionPane;

public class FornecedorTeste {
    public static void main(String[] args) {
        Pessoa p = new Pessoa ();
        Fornecedor  f = new Fornecedor();
        
        p.nome = JOptionPane.showInputDialog ("Digite a nome::");
        p.idade = Integer.parseInt(JOptionPane.showInputDialog ("Digite a idade: "));
        p.altura = JOptionPane.showInputDialog ("Digite a altura: ");
        p.sexo = JOptionPane.showInputDialog ("Digite o sexo: ");
        f.creditoMaximo = Integer.parseInt(JOptionPane.showInputDialog("Credito: "));
        f.valorEmDivida = Integer.parseInt(JOptionPane.showInputDialog("Valor em Divida:"));
        
        JOptionPane.showMessageDialog(null, "Nome: " +p.nome);
        JOptionPane.showMessageDialog(null, "Idade: " +p.idade );
        JOptionPane.showMessageDialog(null, "Altura: " +p.altura);
        JOptionPane.showMessageDialog(null, "Sexo: "+ p.sexo);
        JOptionPane.showMessageDialog(null, "CrÃ©dito Maximo:" +f.creditoMaximo);
        JOptionPane.showMessageDialog(null, "Valor em DÃ­vida:" +f.valorEmDivida);
        JOptionPane.showMessageDialog(null, "CrÃ©dito DisponÃ­vel:" +f.credito);
        }
}
