/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package builderautomovil;

/**
 *
 * @author erley
 */
public class CamaroBuilder extends AutoBuilder {

    @Override
    public void buildMotor() {
        Motor motor = new Motor();
        motor.setNumero(777);
        motor.setPotencia("100 HP");
        
        this.auto.setMotor(motor);
    }

    @Override
    public void buildModelo() {
        this.auto.setModelo("Camaro 2017");
    }

    @Override
    public void buildMarca() {
       this.auto.setMarcar("Chevrolet");
    }
    
    
}
