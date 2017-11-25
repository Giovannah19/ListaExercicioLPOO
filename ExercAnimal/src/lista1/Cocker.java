/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista1;

/**
 *
 * @author User
 */
public class Cocker extends Cachorro {
    protected boolean tosa;

    public Cocker(boolean tosa) {
        this.tosa = tosa;
    }
    public Cocker (){}
    
    public boolean precisaTosa (){
    return tosa;
    }

    public void setTosa(boolean tosa) {
    this.tosa = tosa;
    }
}
