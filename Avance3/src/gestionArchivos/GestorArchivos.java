/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionArchivos;

import dominioProblema.Boleta;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import vista.Mesa1;

/**
 *
 * @author gilio
 */
public class GestorArchivos {

    String guardarLinea;
    

    public String getGuardarLinea() {
        return guardarLinea;
    }

    public void setGuardarLinea(String guardarLinea) {
        this.guardarLinea = guardarLinea;
    }

    /**
     *
     * @param boleta
     */
    public void guardaBoleta1(Boleta  boleta) {
        try {
            File f = new File("Datos_Boleta1.txt");
            FileWriter fw;
            BufferedWriter bw;

            if (f.exists()) {
                fw = new FileWriter(f, true);
                bw = new BufferedWriter(fw);
                bw.newLine();
               bw.write( boleta.getConsumo());
            } else {
                fw = new FileWriter(f);
                bw = new BufferedWriter(fw);
                bw.write( boleta.getConsumo());

            }

            bw.close();
            fw.close();
        } catch (IOException e) {
            System.out.println("ERROR");
        }
    }
    public void guardaBoleta2(Boleta  boleta) {
        try {
            File f = new File("Datos_Boleta2.txt");
            FileWriter fw;
            BufferedWriter bw;

            if (f.exists()) {
                fw = new FileWriter(f, true);
                bw = new BufferedWriter(fw);
                bw.newLine();
               bw.write( boleta.getConsumo());
            } else {
                fw = new FileWriter(f);
                bw = new BufferedWriter(fw);
                bw.write( boleta.getConsumo());

            }

            bw.close();
            fw.close();
        } catch (IOException e) {
            System.out.println("ERROR");
        }
    }
    public void guardaBoleta3(Boleta  boleta) {
        try {
            File f = new File("Datos_Boleta3.txt");
            FileWriter fw;
            BufferedWriter bw;

            if (f.exists()) {
                fw = new FileWriter(f, true);
                bw = new BufferedWriter(fw);
                bw.newLine();
               bw.write( boleta.getConsumo());
            } else {
                fw = new FileWriter(f);
                bw = new BufferedWriter(fw);
                bw.write( boleta.getConsumo());

            }

            bw.close();
            fw.close();
        } catch (IOException e) {
            System.out.println("ERROR");
        }
    }
    public void guardaBoleta4(Boleta  boleta) {
        try {
            File f = new File("Datos_Boleta4.txt");
            FileWriter fw;
            BufferedWriter bw;

            if (f.exists()) {
                fw = new FileWriter(f, true);
                bw = new BufferedWriter(fw);
                bw.newLine();
               bw.write( boleta.getConsumo());
            } else {
                fw = new FileWriter(f);
                bw = new BufferedWriter(fw);
                bw.write( boleta.getConsumo());

            }

            bw.close();
            fw.close();
        } catch (IOException e) {
            System.out.println("ERROR");
        }
    }
    public void guardaBoleta5(Boleta  boleta) {
        try {
            File f = new File("Datos_Boleta5.txt");
            FileWriter fw;
            BufferedWriter bw;

            if (f.exists()) {
                fw = new FileWriter(f, true);
                bw = new BufferedWriter(fw);
                bw.newLine();
               bw.write( boleta.getConsumo());
            } else {
                fw = new FileWriter(f);
                bw = new BufferedWriter(fw);
                bw.write( boleta.getConsumo());

            }

            bw.close();
            fw.close();
        } catch (IOException e) {
            System.out.println("ERROR");
        }
    }

 }


