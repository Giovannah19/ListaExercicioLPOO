
package exerccartao;

public class DiaDosNamorados extends CartaoWeb {
    
    public DiaDosNamorados (String destinatario){
        super();
    }
    
    public DiaDosNamorados(){}
    
    @Override
    public void retornarMensagem (String remetente){
        System.out.println("Caro "+this.destinatario+",");
        System.out.println("Feliz Dia dos Namorados!");
        System.out.println("Os seus beijos e abraços são os melhores do mundo!");
        System.out.println("Com amor, "+this.remetente);
    }
    
}
