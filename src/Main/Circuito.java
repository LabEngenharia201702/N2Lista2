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
public class Circuito extends Componente {
    private final ArrayList<Componente> componentes;
    private final ArrayList<String> componentes_apelido;
    
    public Circuito(int qtde_entrada, int qtde_saida) {
        super(qtde_entrada, qtde_saida);
        
        this.componentes = new ArrayList<>();
        this.componentes_apelido = new ArrayList<>();
    }
    
    public void Adicionar(String componente_apelido, Componente componente) {
        componentes.add(componente);
        componentes_apelido.add(componente_apelido);
    }
    
    public Componente Componente(String componente_apelido)
    {
        for(int i = 0; i < componentes_apelido.size(); i++)
        {
            if(componentes_apelido.get(i).equals(componente_apelido))
                return componentes.get(i);
        }
        
        return null;
    }
    
    @Override
    public SinalLogico Saida(int index)
    {
        for(int i = 0; i < entradas.size(); i++)
            entradas.get(i).getConectado().setSinalLogico(entradas.get(i).getSinalLogico());
        
        for(int i = 0; i < componentes.size(); i++)
        {
            boolean Nivel = componentes.get(i).Saida(1).getSinalLogico(); 
            
            if(componentes.get(i).Saida(1).getConectado() != null)
            {
                componentes.get(i).Saida(1).getConectado().setSinalLogico(Nivel);
            } 
        }
            
        for(int i = 0; i < saidas.size(); i++) {
            if(saidas.get(i).getConectado() != null)
            {
                saidas.get(i).setSinalLogico(saidas.get(i).getConectado().getSinalLogico());
                
            }
        }

        return saidas.get(index - 1);
    }
}
