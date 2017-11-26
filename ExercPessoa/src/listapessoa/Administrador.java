
package listapessoa;

public class Administrador extends Empregado {
    int ajudaDeCusto;

    public Administrador(int ajudaDeCusto) {
        super ();
        this.ajudaDeCusto = ajudaDeCusto;
    }
    public Administrador(){}
    
    @Override
    public String obterLucros (){
        return salario + ajudaDeCusto;
    }
}
