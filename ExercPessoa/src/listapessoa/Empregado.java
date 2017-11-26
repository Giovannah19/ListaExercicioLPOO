
package listapessoa;

public class Empregado extends Pessoa {
    protected String salario;

    public Empregado(String nome, int idade, String altura, String sexo, String salario) {
    super (nome, idade, altura, sexo);
    this.salario = salario;
    }
    
    public Empregado (){}

    public String obterLucros (){
    return salario;
    }
    public String getSalario() {
    return salario;
    }

    public void setSalario(String salario) {
    this.salario = salario;
    }
}
