
package exerccartao;

public class Aniversario extends CartaoWeb {
    
    public Aniversario (String destinatario){
        super();
    }
    public Aniversario(){}
    
    @Override
    public void retornarMensagem(String remetente) {
        System.out.println("Querido(a) "+this.destinatario);
        System.out.println("Feliz Aniversario!");
        System.out.println("Que o seu dia seja repleto de bençãos e demonstrações de carinho!");
        System.out.println("Felicidades!!!"+this.remetente);
    }

}
