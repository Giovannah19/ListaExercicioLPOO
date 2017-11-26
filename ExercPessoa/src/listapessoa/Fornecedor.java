/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listapessoa;

/**
 *
 * @author User
 */
public class Fornecedor extends Pessoa {
    protected int creditoMaximo;
    protected int valorEmDivida;
    protected int credito;

    public Fornecedor(int creditoMaximo, int valorEmDivida, int credito ) {
        super ();
        this.creditoMaximo = creditoMaximo;
        this.valorEmDivida = valorEmDivida;
        this.credito = credito;
    }
    public Fornecedor (){}
    
    public int obterSaldo (){
        setCredito(getCreditoMaximo() - getValorEmDivida());
        return getCredito();
    }
    
    public int getCreditoMaximo() {
        return creditoMaximo;
    }

    public void setCreditoMaximo(int creditoMaximo) {
        this.creditoMaximo = creditoMaximo;
    }

    public int getValorEmDivida() {
        return valorEmDivida;
    }

    public void setValorEmDivida(int valorEmDivida) {
        this.valorEmDivida = valorEmDivida;
    }

    public int getCredito() {
        return credito;
    }

    public void setCredito(int credito) {
        this.credito = credito;
    }
    
    
}
