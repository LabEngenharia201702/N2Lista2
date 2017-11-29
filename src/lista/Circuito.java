/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista;

import java.util.ArrayList;

/**
 *
 * @author diego
 */
public class Circuito extends Componente {
    private final ArrayList<PortaLogica> portas;
    private final ArrayList<String> portas_apelido;
    
    public Circuito(int qtde_entrada, int qtde_saida) {
        super(qtde_entrada, qtde_saida);
        
        this.portas = new ArrayList<>();
        this.portas_apelido = new ArrayList<>();
    }
    
    public void Adicionar(String nome, PortaLogica porta) {
        portas.add(porta);
        portas_apelido.add(nome);
    }
    
    public Componente Componente(String nome)
    {
        for(int i = 0; i < portas_apelido.size(); i++)
        {
            if(portas_apelido.get(i).equals(nome))
                return portas.get(i);
        }
        
        return null;
    }
    /*
    @Override
    public SinalLogico Saida(int index)
    {
        for(int i = 0; i < entradas.size(); i++)
            entradas.get(i).getConectado().setSinalLogico(entradas.get(i).getSinalLogico());
        
        for(int i = 0; i < portas.size(); i++)
        {
            boolean Nivel = portas.get(i).Saida(1).getSinalLogico(); 
            
            if(portas.get(i).Saida(1).getConectado() != null)
            {
                portas.get(i).Saida(1).getConectado().setSinalLogico(Nivel);
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
    */

    @Override
    public SinalLogico Saida() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
