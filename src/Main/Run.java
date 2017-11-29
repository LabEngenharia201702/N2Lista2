/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

/**
 *
 * @author Sandra
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
        //conexões
        circuito.Entrada(1).Conectar(circuito.Componente("INV1").Entrada(1));
        circuito.Entrada(2).Conectar(circuito.Componente("AND1").Entrada(2));
        circuito.Entrada(2).Conectar(circuito.Componente("INV2").Entrada(1));
        circuito.Entrada(3).Conectar(circuito.Componente("AND2").Entrada(2));
        circuito.Saida(1).Conectar(circuito.Componente("NOR1").Saida(1));
        circuito.Componente("INV1").Saida(1).Conectar(circuito.Componente("AND1").Entrada(1));
        circuito.Componente("INV2").Saida(1).Conectar(circuito.Componente("AND2").Entrada(1));
        circuito.Componente("AND1").Saida(1).Conectar(circuito.Componente("NOR1").Entrada(1));
        circuito.Componente("AND2").Saida(1).Conectar(circuito.Componente("NOR1").Entrada(2));
        //níveis das entradas
        circuito.Entrada(1).setSinalLogico(true);
        circuito.Entrada(2).setSinalLogico(false);
        circuito.Entrada(3).setSinalLogico(true);
        //saída – a função recalcula o circuito
        boolean valor = circuito.Saida(1).getSinalLogico();
        
        System.out.println(valor);
        
        System.out.println("-----------------------------");
        Nor port = new Nor();
        port.Entrada(1).setSinalLogico(true);
        port.Entrada(2).setSinalLogico(true); 
        valor = port.Saida(1).getSinalLogico();
        System.out.println(valor);
        
    }
}
