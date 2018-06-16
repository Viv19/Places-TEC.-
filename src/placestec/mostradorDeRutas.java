package placestec;
import java.awt.Color;
import java.util.ArrayList;
import javax.swing.*;
/**
 *
 * @author vivi
 */
public class mostradorDeRutas{
//CLASE CREADA PARA GENERAR LOS LABEL DE LA RUTA DE VIAJE
    ArrayList<JLabel> listaJLabel;
    JPanel jPanel;
    
    public mostradorDeRutas(JPanel jPanel){
        listaJLabel = new ArrayList<JLabel>();
        this.jPanel = jPanel;
    }
    
    public void insertarRuta(String ruta){
        JLabel rutaLabel = new JLabel(ruta);
        rutaLabel.setBackground(Color.GREEN);
        rutaLabel.setBounds(0,0,500,500);
        rutaLabel.setVisible(true);
        jPanel.add(rutaLabel);
        listaJLabel.add(rutaLabel);
    }
}