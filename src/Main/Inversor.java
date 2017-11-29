/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

/**
 *
 * @author diego
 */
public class Inversor extends Componente {
    
    public Inversor() {
        super(1, 1);
    }
    
    private Inversor(int qtde_entradas, int qtde_saidas) {
        super(qtde_entradas, qtde_saidas);
    }
    
    public SinalLogico Saida(int numero_porta) {
        boolean r=!entradas.get(0).getSinalLogico();
        saidas.add(numero_porta - 1, new SinalLogico(r));
        return saidas.get(numero_porta - 1);
    }
    
}
