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
    public class SinalLogico {
    private boolean sinalLogico;
    private SinalLogico conectado;

    public SinalLogico(boolean sinalLogico) {
        this.sinalLogico = sinalLogico;
    }

    public boolean getSinalLogico() {
        return sinalLogico;
    }

    public void setSinalLogico(boolean SinalLogico) {
        this.sinalLogico = SinalLogico;
    }
    
    public void Conectar(SinalLogico nivel) {
        this.conectado = nivel;
    }
    
    public SinalLogico getConectado() {
        return conectado;
    }
}
