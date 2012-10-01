/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package exnumsa;

import beans.*;
import java.util.ArrayList;

/**
 *
 * @author miguelavg
 */
public class Recocido {
    private double tInicial;
    private double tFinal;
    private double alfa;
    private int beta;
    private ArrayList<Aeropuerto> aeropuertos;
    private ArrayList<Vuelo> vuelos;
    
    public Recocido(String archParametros){
        Parametro parametro = (Parametro)Serializer.deserializar(archParametros).get(0);
        this.tInicial = parametro.gettInicial();
        this.tFinal = parametro.gettFinal();
        this.alfa = parametro.getAlfa();
        this.beta = parametro.getBeta();
        this.aeropuertos = Serializer.deserializar(parametro.getXmlAeropuertos());
        this.vuelos = Serializer.deserializar(parametro.getXmlVuelos());
    }
    
    private double estadoEnergia(ArrayList<Vuelo> vuelos){
        
        return 0;
    }
    
    public void simular(){
        
    }
            
}
