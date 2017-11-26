
package exerccartao;

public class Natal extends CartaoWeb {
   
    public Natal (String destinatario){
        super();
    }
    
    public Natal(){}
    
    @Override
    public void retornarMensagem (String remetente){
        System.out.println("Querido(a) "+this.destinatario+",");
        System.out.println("Feliz Natal!");
        System.out.println("Desejo que o seu Natal seja repleto de bençãos e paz.");
        System.out.println("São os votos de "+this.remetente + "para você e sua família");
    }
}
