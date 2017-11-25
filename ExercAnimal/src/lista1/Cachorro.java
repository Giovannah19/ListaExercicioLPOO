/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista1;


public class Cachorro extends Animals {
    protected String nome;
    protected String raca;

    public Cachorro(String nome, String raca) {
    this.nome = nome;
    this.raca = raca;
    }
    public Cachorro (){}
    
    public String getNome() {
    return nome;
    }
    
    public void setNome(String nome) {
    this.nome = nome;
    }

    public String getRaca() {
    return raca;
    }

    public void setRaca(String raca) {
    this.raca = raca;
    }
    
    @Override
        public String toString(){
            return "\n Nome: " +getNome()+
                    "\n Raça: " +getRaca();
        }
}

