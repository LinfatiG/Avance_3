/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

/**
 *
 * @author gilio
 */
import dominioProblema.Bebestible;
import dominioProblema.Boleta;
import dominioProblema.Comestible;
import dominioProblema.Cuenta;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import javax.swing.*;
import java.awt.Checkbox;

public class Mesa3 extends JFrame {

    Cuenta cuenta;
    ButtonGroup grupoDeBotones = new ButtonGroup();
    JRadioButton a = new JRadioButton("Comestibles");
    JRadioButton b = new JRadioButton("Bebestibles");

    Checkbox a1 = new Checkbox(Comestible.HAMBURGUESAS.getNombre() + ": $" + Comestible.HAMBURGUESAS.getPrecio());
    Checkbox a2 = new Checkbox(Comestible.POLLOCONPAPAS.getNombre() + ": $" + Comestible.POLLOCONPAPAS.getPrecio());
    Checkbox a3 = new Checkbox(Comestible.CARNEALAOLLA.getNombre() + ": $" + Comestible.CARNEALAOLLA.getPrecio());
    Checkbox a4 = new Checkbox(Comestible.PIZZANAPOLITANA.getNombre() + ": $" + Comestible.PIZZANAPOLITANA.getPrecio());
    Checkbox a5 = new Checkbox(Comestible.PIZZAVEGETARIANA.getNombre() + ": $" + Comestible.PIZZAVEGETARIANA.getPrecio());

    Checkbox b1 = new Checkbox(Bebestible.BEBIDA.getNombre() + ": $" + Bebestible.BEBIDA.getPrecio());
    Checkbox b2 = new Checkbox(Bebestible.AGUAMINERAL.getNombre() + ": $" + Bebestible.AGUAMINERAL.getPrecio());
    Checkbox b3 = new Checkbox(Bebestible.NECTAR.getNombre() + ": $" + Bebestible.NECTAR.getPrecio());
    Checkbox b4 = new Checkbox(Bebestible.JUGONATURAL.getNombre() + ": $" + Bebestible.JUGONATURAL.getPrecio());

    JTextField totalConPropina = new JTextField();
    JButton li = new JButton("limpiar");
    JButton t = new JButton("Total con propina");

    public JPanel p = new JPanel();

    public Mesa3() {
        setTitle("Mesa 3");
        setSize(500, 500);
        //    p.setBackground(Color.orange);
        p.setLayout(null);

        Container zona = getContentPane();

        a.setBounds(30, 10, 80, 20);
        b.setBounds(150, 10, 100, 20);

        zona.add(p);

        p.add(a);
        p.add(b);
        grupoDeBotones.add(a);
        grupoDeBotones.add(b);
        a.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent v) {

                p.add(a1);
                p.add(a2);
                p.add(a3);
                p.add(a4);
                p.add(a5);

                a1.setBounds(20, 80, 180, 20);
                a2.setBounds(20, 100, 180, 20);
                a3.setBounds(20, 120, 180, 20);
                a4.setBounds(20, 140, 180, 20);
                a5.setBounds(20, 160, 180, 20);

            }

        });
        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent v) {

                p.add(b1);
                p.add(b2);
                p.add(b3);
                p.add(b4);

                b1.setBounds(20, 200, 180, 20);
                b2.setBounds(20, 220, 180, 20);
                b3.setBounds(20, 240, 180, 20);
                b4.setBounds(20, 260, 180, 20);

            }
        });

        t.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent v) {

                double res = 0;

                String linea = "";
                
                if (a1.getState() == true) {
                    
                    res = res + Comestible.HAMBURGUESAS.getPrecio();
                    linea = linea + "     " + Comestible.HAMBURGUESAS.getNombre()+";"+Comestible.HAMBURGUESAS.getPrecio()+'\n';
                }

                if (a2.getState() == true) {
                    res = res + Comestible.POLLOCONPAPAS.getPrecio();
                     linea = linea + "     " + Comestible.POLLOCONPAPAS.getNombre()+";"+Comestible.POLLOCONPAPAS.getPrecio()+'\n';
                }
                if (a3.getState() == true) {
                    res = res +Comestible.CARNEALAOLLA.getPrecio();
                     linea = linea + "     " + Comestible.CARNEALAOLLA.getNombre()+";"+Comestible.CARNEALAOLLA.getPrecio()+'\n';
                }
                if (a4.getState() == true) {
                    res = res + Comestible.PIZZANAPOLITANA.getPrecio();
                     linea = linea + "     " + Comestible.PIZZANAPOLITANA.getNombre()+";"+Comestible.PIZZANAPOLITANA.getPrecio()+'\n';
                }
                if (a5.getState() == true) {
                    res = res + Comestible.PIZZAVEGETARIANA.getPrecio();
                     linea = linea + "     " + Comestible.PIZZAVEGETARIANA.getNombre()+";"+Comestible.PIZZAVEGETARIANA.getPrecio()+ '\n';
                }

//----------------------------------------------------------------------------------------------- 
                if (b1.getState() == true) {		
                    res = res + Bebestible.BEBIDA.getPrecio();
                     linea = linea + "     " + Bebestible.BEBIDA.getNombre()+";"+Bebestible.BEBIDA.getPrecio()+ '\n';
                }

                if (b2.getState() == true) {
                    res = res + Bebestible.AGUAMINERAL.getPrecio();
                    linea = linea + "     " + Bebestible.AGUAMINERAL.getNombre()+";"+Bebestible.AGUAMINERAL.getPrecio()+ '\n';
                }
                if (b3.getState() == true) {
                    res = res + Bebestible.NECTAR.getPrecio();
                    linea = linea + "     " + Bebestible.NECTAR.getNombre()+";"+Bebestible.NECTAR.getPrecio()+ '\n';
                }
                if (b4.getState() == true) {
                    res = res + Bebestible.JUGONATURAL.getPrecio();
                    linea = linea + "     " + Bebestible.JUGONATURAL.getNombre()+";"+Bebestible.JUGONATURAL.getPrecio()+ '\n';
                }
//----------------------------------------------------------------------------------------------- 
                linea=linea+"---------------------------------------------------"+'\n';
                linea=linea+"Subtotal: $"+res+'\n';
                double propina = res * 0.15;
                linea=linea+"Propina del 15%: $"+propina+'\n';
                double totalPropina = res + propina;
                linea=linea+"Total a pagar: $"+totalPropina+'\n';
                linea=linea+"---------------------------------------------------";
                Cuenta cuenta = new Cuenta(new Boleta(linea,propina,totalPropina),3);
                totalConPropina.setText("$" + totalPropina);
            }
        });
        li.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent v) {
                String linea="";
                totalConPropina.setText(null);

                a1.setState(false);
                a2.setState(false);
                a3.setState(false);
                a4.setState(false);
                a5.setState(false);

                b1.setState(false);
                b2.setState(false);
                b3.setState(false);
                b4.setState(false);
            }
        });

        p.add(t);
        p.add(li);
        p.add(totalConPropina);
        li.setBounds(240, 220, 130, 20);
//li .setText(""; 
        t.setBounds(240, 100, 130, 20);
        totalConPropina.setBounds(240, 130, 130, 20);

    }
    
     public static void main(String[] arg) {
        Mesa3 obj = new Mesa3();
        obj.show();
    }

}
