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
public class FocusBuilder extends AutoBuilder {

    @Override
    public void buildMotor() {
    Motor motor = new Motor();
    motor.setNumero(648);
    motor.setPotencia("48 hp");
    }

    @Override
    public void buildModelo() {
      auto.setModelo("Focus");
    }

    @Override
    public void buildMarca() {
     auto.setMarcar("Ford");
    }
    
}
