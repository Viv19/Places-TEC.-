package placestec;

import java.awt.Dimension;
import javax.swing.JButton;
import javax.swing.JLabel;


public class Label extends JLabel{
    /*constructor del cada celda, inicializando los valores y dandoles forma, con un color un tamaño...etc*/
    public Label(String dato) {
        this.setMinimumSize(new Dimension(5,5));//33,9
        this.setBackground(new java.awt.Color(255, 255, 255));///---------------COLOR--------------------
        this.setFont(new java.awt.Font("Arial", 1,15));
        this.setText(dato);
    }
}