/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista;

/**
 *
 * @author diego
 */
public class Run {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Circuito circuito = new Circuito(3, 1);
        circuito = new Circuito(3,1); //3 entradas e 1 saída
        //elemento 1
        circuito.Adicionar("INV1", new Inversor());
        //elemento 2
        circuito.Adicionar("INV2", new Inversor());
        //elemento 3
        circuito.Adicionar("AND1", new And());
        //elemento 4
        circuito.Adicionar("AND2", new And());
        //elemento 5
        circuito.Adicionar("NOR1", new Nor());
        //níveis das entradas
        circuito.Entrada(1).setSinalLogico(false);
        circuito.Entrada(2).setSinalLogico(true);
        circuito.Entrada(3).setSinalLogico(false);
        //conexões
        circuito.Componente("INV1").Entrada(1).setSinalLogico(circuito.Entrada(1).getSinalLogico());
        circuito.Componente("AND1").Entrada(2).setSinalLogico(circuito.Entrada(2).getSinalLogico());
        circuito.Componente("INV2").Entrada(1).setSinalLogico(circuito.Entrada(2).getSinalLogico());
        circuito.Componente("AND2").Entrada(2).setSinalLogico(circuito.Entrada(3).getSinalLogico());
        
        circuito.Componente("AND1").Entrada(1).setSinalLogico(circuito.Componente("INV1").Saida().getSinalLogico());
        circuito.Componente("AND2").Entrada(1).setSinalLogico(circuito.Componente("INV2").Saida().getSinalLogico());
        circuito.Componente("NOR1").Entrada(1).setSinalLogico(circuito.Componente("AND1").Saida().getSinalLogico());
        circuito.Componente("NOR1").Entrada(2).setSinalLogico(circuito.Componente("AND2").Saida().getSinalLogico());
        
        //saída – a função recalcula o circuito
        boolean valor=circuito.Componente("NOR1").Saida().getSinalLogico(); //= circuito.Saida(1).getSinalLogico();
        System.out.println("Resultado do circuito pré-programado: "+ valor);
        
    }
}
