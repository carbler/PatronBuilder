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
public class BuilderAutomovil {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Concesionario director = new Concesionario();
        
        director.setAutoBuilder(new CamaroBuilder());
        
        director.construirAuto();
        
        Auto auto = director.getAuto();
        
        System.out.println(auto.getMarcar());
        System.out.println(auto.getModelo());
    }
    
}
