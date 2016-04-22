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
public class Concesionario {
    
    private AutoBuilder autoBuilder;
    
    public void construirAuto(){
        this.autoBuilder.creaAuto();
        this.autoBuilder.buildMarca();
        this.autoBuilder.buildModelo();
        this.autoBuilder.buildMotor();
    }
    
    public void setAutoBuilder(AutoBuilder a){
        autoBuilder = a;
    }
    
    public Auto getAuto(){
        return autoBuilder.getAuto();
    }
}
