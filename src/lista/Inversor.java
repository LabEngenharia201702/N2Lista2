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
public class Inversor extends PortaLogica {
    
    public Inversor() {
        super();
    }
    
    @Override
    public SinalLogico Saida(int numero_porta) {
        boolean r=!entradas.get(0).getSinalLogico();
        saidas.add(numero_porta - 1, new SinalLogico(r));
        return saidas.get(numero_porta - 1);
    }
    public SinalLogico Saida() {
        boolean r=!entradas.get(0).getSinalLogico();
        saidas.add(0, new SinalLogico(r));
        return saidas.get(0);
    }
    
}
