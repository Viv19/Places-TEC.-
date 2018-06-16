/*

 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;
//LIBRERÍAS IMPORTADAS
import Estructuras.probandoGrafo;
import java.util.ArrayList;
import javax.swing.BoxLayout;
import javax.swing.JOptionPane;
import placestec.Label;
import placestec.destino;           

public class interfaz extends javax.swing.JFrame {
    //CÓDIGO CREADO
    //OBJETO DESTINO QUE CONTENDRÁ LOS DATOS INGRESADOS POR EL USUARIO
    destino destino1;
    ArrayList<String> destinos;
    String[] string; //CONTIENE DIRECCIÓN Y FECHA DE VISITA PARA MOSTRAR EN RUTA
    
    probandoGrafo grafo = new probandoGrafo();
    
    public destino formandoDestinos(){ //MÉTODO QUE FORMA EL OBJETO DESTINO
        destino1 = new destino(Integer.parseInt(jTextField2.getText()), Integer.parseInt(jTextField1.getText()), 
        jTextField5.getText(),jTextField3.getText(), jTextField7.getText(), jTextField4.getText());  
        return destino1;
    }    
    
    public interfaz() {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        setTitle("PLACES TEC");
        destinos = new ArrayList<String>();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField1 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        jButton5 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jRadioButton4 = new javax.swing.JRadioButton();
        jLabel13 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jButton9 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jTextField8 = new javax.swing.JTextField();
        jButton10 = new javax.swing.JButton();
        jTextField7 = new javax.swing.JTextField();
        jRadioButton3 = new javax.swing.JRadioButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jList2 = new javax.swing.JList<>();
        jButton2 = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jRadioButton2 = new javax.swing.JRadioButton();
        jTextField2 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jButton12 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jComboBox2 = new javax.swing.JComboBox<>();
        jLabel19 = new javax.swing.JLabel();
        jButton11 = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(600, 900));
        setPreferredSize(new java.awt.Dimension(900, 600));
        getContentPane().setLayout(null);

        jLabel9.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("De visita");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(20, 200, 90, 40);

        jLabel11.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Fecha tentativa");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(20, 190, 150, 40);

        jLabel6.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Exacta");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(20, 120, 80, 40);

        jLabel10.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Desplazamiento");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(20, 167, 160, 30);

        jTextField3.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 12)); // NOI18N
        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField3);
        jTextField3.setBounds(180, 160, 130, 30);

        jTextField5.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 12)); // NOI18N
        jTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField5);
        jTextField5.setBounds(180, 120, 130, 30);

        jTextField1.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 12)); // NOI18N
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField1KeyTyped(evt);
            }
        });
        getContentPane().add(jTextField1);
        jTextField1.setBounds(180, 82, 130, 30);

        jTextField4.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 12)); // NOI18N
        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField4);
        jTextField4.setBounds(180, 240, 130, 30);

        jComboBox1.setFont(new java.awt.Font("Dialog", 0, 8)); // NOI18N
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox1);
        jComboBox1.setBounds(5, 310, 330, 110);

        jButton5.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 10)); // NOI18N
        jButton5.setText("MODIFICAR");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5);
        jButton5.setBounds(150, 530, 160, 20);

        jButton1.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 10)); // NOI18N
        jButton1.setText("MOSTRAR COINCIDENCIAS");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(20, 280, 290, 20);

        jLabel7.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Medio de");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(20, 150, 80, 40);

        jRadioButton1.setBackground(new java.awt.Color(0, 0, 0));
        jRadioButton1.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 10)); // NOI18N
        jRadioButton1.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton1.setText("CINES");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButton1);
        jRadioButton1.setBounds(350, 150, 140, 20);

        jLabel8.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Dirección");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(20, 110, 100, 40);

        jLabel5.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Longitud");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(20, 80, 80, 40);

        jButton4.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 10)); // NOI18N
        jButton4.setText("ELIMINAR");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4);
        jButton4.setBounds(20, 530, 130, 20);

        jLabel12.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("RADIO");
        jLabel12.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jLabel12KeyTyped(evt);
            }
        });
        getContentPane().add(jLabel12);
        jLabel12.setBounds(350, 70, 70, 40);

        jRadioButton4.setBackground(new java.awt.Color(0, 0, 0));
        jRadioButton4.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 10)); // NOI18N
        jRadioButton4.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton4.setText("BARES");
        jRadioButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButton4);
        jRadioButton4.setBounds(350, 210, 140, 20);

        jLabel13.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 142, 161));
        jLabel13.setText("INTERÉS");
        getContentPane().add(jLabel13);
        jLabel13.setBounds(350, 20, 150, 60);

        jTextField6.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 12)); // NOI18N
        jTextField6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField6ActionPerformed(evt);
            }
        });
        jTextField6.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField6KeyTyped(evt);
            }
        });
        getContentPane().add(jTextField6);
        jTextField6.setBounds(410, 80, 130, 30);

        jButton6.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 10)); // NOI18N
        jButton6.setText("GUARDAR");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6);
        jButton6.setBounds(110, 430, 100, 20);

        jButton7.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 10)); // NOI18N
        jButton7.setText("BUSCAR");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton7);
        jButton7.setBounds(350, 240, 100, 20);

        jButton8.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 12)); // NOI18N
        jButton8.setText("ver más");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton8);
        jButton8.setBounds(350, 400, 110, 20);

        jLabel15.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 142, 161));
        jLabel15.setText("SITIOS DE ");
        getContentPane().add(jLabel15);
        jLabel15.setBounds(350, 0, 150, 60);

        jLabel17.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("LLEGADA");
        jLabel17.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jLabel17KeyTyped(evt);
            }
        });
        getContentPane().add(jLabel17);
        jLabel17.setBounds(20, 240, 90, 40);

        jButton9.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 12)); // NOI18N
        jButton9.setText("consultar Favoritos");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton9);
        jButton9.setBounds(350, 440, 200, 20);

        jButton3.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 12)); // NOI18N
        jButton3.setText("agregar a Favoritos");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(350, 420, 200, 20);

        jTextField8.setText("Buscar destinos guardados");
        getContentPane().add(jTextField8);
        jTextField8.setBounds(20, 470, 290, 30);

        jButton10.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 10)); // NOI18N
        jButton10.setText("SELECCIONAR DESTINOS A VISITAR");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton10);
        jButton10.setBounds(20, 450, 290, 20);

        jTextField7.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 12)); // NOI18N
        jTextField7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField7ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField7);
        jTextField7.setBounds(180, 202, 130, 30);

        jRadioButton3.setBackground(new java.awt.Color(0, 0, 0));
        jRadioButton3.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 10)); // NOI18N
        jRadioButton3.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton3.setText("DOCTORES");
        jRadioButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButton3);
        jRadioButton3.setBounds(350, 180, 140, 20);

        jList2.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 12)); // NOI18N
        jScrollPane2.setViewportView(jList2);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(350, 270, 220, 131);

        jButton2.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 10)); // NOI18N
        jButton2.setText("MOSTRAR DESTINOS GUARDADOS");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(20, 510, 290, 20);

        jLabel18.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("FECHA DE");
        jLabel18.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jLabel18KeyTyped(evt);
            }
        });
        getContentPane().add(jLabel18);
        jLabel18.setBounds(20, 230, 130, 40);

        jLabel4.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Latitud");
        jLabel4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jLabel4KeyTyped(evt);
            }
        });
        getContentPane().add(jLabel4);
        jLabel4.setBounds(20, 40, 80, 40);

        jRadioButton2.setBackground(new java.awt.Color(0, 0, 0));
        jRadioButton2.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 10)); // NOI18N
        jRadioButton2.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton2.setText("RESTAURANTES");
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButton2);
        jRadioButton2.setBounds(350, 120, 140, 20);

        jTextField2.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 12)); // NOI18N
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        jTextField2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField2KeyTyped(evt);
            }
        });
        getContentPane().add(jTextField2);
        jTextField2.setBounds(180, 42, 130, 30);

        jLabel3.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 142, 161));
        jLabel3.setText("Lugares de interés");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(0, 0, 270, 60);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interfaz/Como-viajar-barato-600x900.jpg"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(-70, -20, 570, 620);

        jPanel1.setPreferredSize(new java.awt.Dimension(600, 750));
        jPanel1.setLayout(null);

        jLabel14.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 142, 161));
        jLabel14.setText("Crear ruta de viaje");
        jPanel1.add(jLabel14);
        jLabel14.setBounds(100, 120, 270, 40);

        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interfaz/informativa-l-acero-inoxidable-adhesivo-de-0-8mm-50-x-50-mm.jpg"))); // NOI18N
        jPanel1.add(jLabel20);
        jLabel20.setBounds(110, 390, 10, 250);

        jLabel21.setForeground(new java.awt.Color(0, 102, 102));
        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interfaz/icono-ubicacion.png"))); // NOI18N
        jLabel21.setText("jLabel21");
        jPanel1.add(jLabel21);
        jLabel21.setBounds(100, 360, 30, 40);

        jButton12.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 10)); // NOI18N
        jButton12.setText("RUTA MÁS CORTA");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton12);
        jButton12.setBounds(240, 310, 160, 20);

        jButton13.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 10)); // NOI18N
        jButton13.setText("VER DESTINO EN MAPA");
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton13);
        jButton13.setBounds(100, 330, 190, 20);

        jButton14.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 10)); // NOI18N
        jButton14.setText("VER GRAFO");
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton14);
        jButton14.setBounds(290, 330, 110, 20);

        jComboBox2.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });
        jPanel1.add(jComboBox2);
        jComboBox2.setBounds(90, 180, 330, 120);

        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interfaz/informativa-l-acero-inoxidable-adhesivo-de-0-8mm-50-x-50-mm.jpg"))); // NOI18N
        jPanel1.add(jLabel19);
        jLabel19.setBounds(110, 500, 10, 250);

        jButton11.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 10)); // NOI18N
        jButton11.setText("MOSTRAR RUTA");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton11);
        jButton11.setBounds(100, 310, 140, 20);

        jLabel16.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 12)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("DESTINOS SELECCIONADOS");
        jPanel1.add(jLabel16);
        jLabel16.setBounds(100, 160, 230, 14);

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));
        jPanel2.setAutoscrolls(true);
        jPanel2.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        jPanel1.add(jPanel2);
        jPanel2.setBounds(130, 400, 310, 270);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interfaz/Como-viajar-barato-600x900.jpg"))); // NOI18N
        jPanel1.add(jLabel2);
        jLabel2.setBounds(6, 27, 438, 693);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(480, -110, 450, 750);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel4KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jLabel4KeyTyped
       //TODO ESTO ES PARA QUE SOLO ACEPTE NÚMEROS
        char validar = evt.getKeyChar();
        if(Character.isLetter(validar)){
            getToolkit().beep();
            evt.consume();
            JOptionPane.showConfirmDialog(rootPane, "Ingresar sólo números.");
        }
    }//GEN-LAST:event_jLabel4KeyTyped

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField5ActionPerformed

    private void jTextField2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField2KeyTyped
        //TODO ESTO ES PARA QUE ACEPTE SOLO NÚMEROS
        char validar = evt.getKeyChar();
        if(Character.isLetter(validar)){
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(rootPane, "Ingrese sólo números.");
        }
    }//GEN-LAST:event_jTextField2KeyTyped

    private void jTextField1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyTyped
        //TODO ESTO ES PARA QUE ACEPTE SOLO NÚMEROS
        char validar = evt.getKeyChar();
        if(Character.isLetter(validar)){
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(rootPane, "Ingrese sólo números.");
        }
    }//GEN-LAST:event_jTextField1KeyTyped

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        //g.imprimeGrafo();
        /* for(int i = 0; i < g.vertices.size(); i++){
           jComboBox1.addItem(g.vertices.element().toString());
 
    }      */
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        grafo.creandoGrafo().buscarVertice(1);
        if(!grafo.creandoGrafo().buscarVertice(1).equals(null)){
            jComboBox1.addItem("");
           // jComboBox1.addItem(g.buscarVertice(1));
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        grafo.creandoGrafo().eliminarVertice(jComboBox1.getSelectedIndex());
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jLabel12KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jLabel12KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel12KeyTyped

    private void jTextField6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField6ActionPerformed

    private void jTextField6KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField6KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField6KeyTyped

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    private void jRadioButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton3ActionPerformed

    private void jRadioButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        //MÉTODO DE UN BOTÓN QUE MUESTRA UNA VENTANA CON LA INFORMACIÓN 
        //QUE CONTIENE EL DESTINO SELECIONADO
        infoSitio infoS = new infoSitio();
        infoS.setVisible(true);
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        //MÉTODO QUE MUESTRA UNA VENTANA NUEVA DONDE SE PUEDEN CONSULTAR
        //LOS DESTINOS FAVORITOS, ADEMÁS, ES POSIBLE ELIMINARLOS.
        Favoritos fav = new Favoritos();
        fav.setVisible(true);
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
            //MÉTODO DONDE SE GUARDAN LOS DESTINOS
        jComboBox2.addItem((String) jComboBox1.getSelectedItem());
        string =jComboBox1.getSelectedItem().toString().split(","); //SEPARA LOS DATOS DEL DESTINO MOSTRADO EN LA INTERFAZ
        System.out.println(string[2]);
        System.out.println(string[5]);
        destinos.add((String) jComboBox1.getSelectedItem()); //AGRERO A UN ARREGLO LOS DESTINOS       
        System.out.println(jComboBox1.getSelectedItem());
       // System.out.println(jComboBox1.getSelectedIndex()); // ME DA EL ÍNDICE DEL ITEM SELECCIONADO
       
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jLabel17KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jLabel17KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel17KeyTyped

    private void jLabel18KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jLabel18KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel18KeyTyped

    private void jTextField7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField7ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        jPanel2.setLayout(new BoxLayout (jPanel2, BoxLayout.PAGE_AXIS));
            jPanel2.removeAll(); //VACEA EL PANEL CADA VEZ QUE SE TOCA EL BOTÓN
        for(int i= 0; destinos.size()!= i; i++){
            jPanel2.add(new Label("DESTINO "));
            jPanel2.add(new Label(string[2]));
            jPanel2.add(new Label(string[5]));
            jPanel2.add(new Label("----------------------------------"));
            jPanel2.add(new Label("                                   "));
        }
        jPanel2.updateUI();
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton13ActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton14ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        formandoDestinos(); //MÉTODO EN CLASE INTERFAZ QUE CREA EL DESTINO CON LOS DATOS INGRESADOS
        probandoGrafo prueba = new probandoGrafo();
        prueba.creandoGrafo(); //LLAMA AL MÉTODO QUE INSERTA ARISTAS Y VERTICES
        jComboBox1.addItem(formandoDestinos().datosDestino());
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox2ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new interfaz().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JList<String> jList2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    // End of variables declaration//GEN-END:variables
}
