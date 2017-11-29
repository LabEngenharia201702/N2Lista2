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
public class Xor extends PortaLogica{
    
    public Xor() {
        super();
    }
    
    @Override
    public SinalLogico Saida() {
        boolean r=(entradas.get(0).getSinalLogico() == entradas.get(1).getSinalLogico());
        saidas.add(0, new SinalLogico(r));
        return saidas.get(0);
    }

    @Override
    public SinalLogico Saida(int numero_porta) {
        throw new UnsupportedOperationException("Descontinuado"); //To change body of generated methods, choose Tools | Templates.
    }
}
    

