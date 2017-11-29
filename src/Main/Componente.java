/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import java.util.ArrayList;

/**
 *
 * @author diego
 */
public class Componente {
    protected final ArrayList<SinalLogico> entradas;
    protected final ArrayList<SinalLogico> saidas;
    
    public SinalLogico Entrada(int index) {
        return entradas.get(index - 1);
    }
    
    public SinalLogico Saida(int index) {
        return saidas.get(index - 1);
    }
    public Componente(int qtde_entradas, int qtde_saidas) {
        this.entradas = new ArrayList<>(qtde_entradas);
        this.saidas = new ArrayList<>(qtde_saidas);
        
        for(int i = 0; i < qtde_entradas; i++)
            this.entradas.add(new SinalLogico(false));
        
        //for(int i = 0; i < qtde_saidas; i++)
          //  this.saidas.add(new SinalLogico(false));
    }
    

}
