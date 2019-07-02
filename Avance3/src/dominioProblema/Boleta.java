/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dominioProblema;

import gestionArchivos.GestorArchivos;

/**
 *
 * @author gilio
 */
public class Boleta {

    private String consumo;
    private double propina;
    private double total;

    /**
     *
     * @param consumo
     * @param propina
     * @param total
     */
    public Boleta(String consumo, double propina, double total) {
        this.consumo = consumo;
        this.propina = propina;
        this.total = total;

    }
    public Boleta(String consumo){
        this.consumo=consumo;
    }
    public String getConsumo() {
        return consumo;
    }

    public void setConsumo(String consumo) {
        this.consumo = consumo;
    }

    public double getPropina() {
        return propina;
    }

    public void setPropina(double propina) {
        this.propina = propina;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
    
}
