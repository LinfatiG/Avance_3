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

public class Cuenta {
     
     Boleta recuperarDatos;

    public Cuenta(Boleta recuperarDatos,int i) {
        this.recuperarDatos = recuperarDatos;
         GestorArchivos  ga = new GestorArchivos();
         if(i==1){
         ga.guardaBoleta1(recuperarDatos);}
         if(i==2){
         ga.guardaBoleta2(recuperarDatos);}
         if(i==3){
         ga.guardaBoleta3(recuperarDatos);}
         if(i==4){
         ga.guardaBoleta4(recuperarDatos);}
         if(i==5){
         ga.guardaBoleta5(recuperarDatos);}
    }
     
    public void cargarCuenta(){
        GestorArchivos  ga = new GestorArchivos();
     //    ga. guardaArchivosCliente(this.recuperarDatos);
    }

    public Boleta getRecuperarDatos() {
        return recuperarDatos;
    }

    public void setRecuperarDatos(Boleta recuperarDatos) {
        this.recuperarDatos = recuperarDatos;
    }
}
