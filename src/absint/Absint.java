/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package absint;

/**
 *
 * @author camilo
 */
import java.awt.*;
import java.applet.*;
import java.awt.event.*;
import java.lang.Math;


public class Absint extends Applet implements ActionListener {
Label l1, l2;
TextField t1, t2;
Button b;
public Absint() {
l1 = new Label("Numero"); // se crea una etiqueta
t1 = new TextField(); // se crea un texto
l2 = new Label("Cuadrado"); // se crea una etiqueta
t2 = new TextField(); // se crea un texto
b = new Button("Calcula"); // se crea un boton
add(l1); // se añade la etiqueta a la ventana
add(t1); // se añade un texto a la ventana
add(l2); // se añade la segunda etiqueta a la ventana
add(t2); // se añade el segundo texto a la ventana
add(b); // se añade el boton a la ventana
b. addActionListener(this); // el botton ahora tiene la facilidad de
// ser escuchado
}
public void actionPerformed(ActionEvent ae) {
// se toma el numero del texto y se pasa a la variable num
double num = Double.parseDouble(t1.getText());
// al texto 2 se le pone el valor del valor absoluto del numero
t2.setText(""+Math.abs(num));
}
}
