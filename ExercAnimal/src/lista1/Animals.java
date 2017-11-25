
package lista1;

public class Animals {
     protected String tipo;
     protected String cor;

    public Animals(String tipo, String cor) {
        this.tipo = tipo;
        this.cor = cor;
    }
    public Animals (){}

    public String getTipo() {
    return tipo;
    }
        
    public String getCor() {
    return cor;
    } 
        
    public void setTipo(String tipo) {
    this.tipo = tipo;
    }
        
    public void setCor(String cor) {
    this.cor = cor;
    }
        
    @Override
       public String toString(){
         return "\n Tipo: " +getTipo()+
                 "\n Cor: " +getCor();
        }
}
