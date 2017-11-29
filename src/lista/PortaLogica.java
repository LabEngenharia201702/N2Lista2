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
public abstract class PortaLogica extends Componente{
    
    public PortaLogica() {
        super(2, 1);
    }
    
    @Override
    public abstract SinalLogico Saida(int numero_porta);
    
    
    
}
