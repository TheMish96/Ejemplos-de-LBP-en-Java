
package paquete1;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;


public class Form extends javax.swing.JFrame {
 escala Escala = new escala();
 int arreglo1[] = new int[28];
 int arreglo2[] = new int[28];
 int arreglo3[] = new int[28];
 
 JFreeChart Grafica;
    DefaultCategoryDataset datos = new DefaultCategoryDataset();
   
    public Form() {
        initComponents();
   Grafica = ChartFactory.createBarChart("grafica para colores en gris",
"Grises", "Numero de veces repetido", datos,
PlotOrientation.HORIZONTAL, true, true, false);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        lb1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        lb3 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        lb2 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        lb4 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("ingrese una imagen ");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        lb1.setText("jLabel1");
        jScrollPane1.setViewportView(lb1);

        lb3.setText("jLabel1");
        jScrollPane2.setViewportView(lb3);

        lb2.setText("jLabel1");
        jScrollPane3.setViewportView(lb2);

        lb4.setText("jLabel1");
        jScrollPane4.setViewportView(lb4);

        jLabel11.setText("jLabel1");
        jScrollPane5.setViewportView(jLabel11);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(73, 73, 73)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 90, Short.MAX_VALUE)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(109, 109, 109))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(207, 207, 207)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(97, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        JFileChooser file = new JFileChooser();
        file.showOpenDialog(this);
        File archivo = file.getSelectedFile();
        
        // verificamos que seleccione la imagen deseada
         if(archivo!=null){
             String origen = archivo.getPath();
            try {
                BufferedImage gris=Escala.imagenGris(archivo);
                lb2.setIcon(new ImageIcon(gris));
                BufferedImage pro= Escala.imagenPromedio(archivo);
                lb3.setIcon(new ImageIcon(pro));
                BufferedImage lum=Escala.imagenLuminosidad(archivo);
                lb4.setIcon(new ImageIcon(lum));
                  arreglo1=Escala.getGrises1();
                  arreglo2=Escala.getGrises2();
                  arreglo3=Escala.getGrises3();
                  BufferedImage otsu=Escala.imagen(gris);
              jLabel11.setIcon(new ImageIcon(otsu));
        datos.addValue(arreglo1[0],"imagen 1","Gris platino");
        datos.addValue(arreglo1[1],"imagen 1","Gris Ceniza");
        datos.addValue(arreglo1[2],"imagen 1","Gris Lino");
        datos.addValue(arreglo1[3],"imagen 1","Gris medio");
        datos.addValue(arreglo1[4],"imagen 1","Gris blanco humo");
        datos.addValue(arreglo1[5],"imagen 1","Gris aluminio");
        datos.addValue(arreglo1[6],"imagen 1","Gris Alice blue");
        datos.addValue(arreglo1[7],"imagen 1","Gris humo ");
        datos.addValue(arreglo1[8],"imagen 1","Gris estandar");
        datos.addValue(arreglo1[9],"imagen 1","Gris automotriz");
        datos.addValue(arreglo1[10],"imagen 1","Gris Elefante");
        datos.addValue(arreglo1[11],"imagen 1","Gris Zinc");
        datos.addValue(arreglo1[12],"imagen 1","Gris Acero");
        datos.addValue(arreglo1[13],"imagen 1","Gris cadete");
        datos.addValue(arreglo1[14],"imagen 1","Gris acorazado");
        datos.addValue(arreglo1[15],"imagen 1","Gris Niquel");
        datos.addValue(arreglo1[16],"imagen 1","Gris Xanahu");
        datos.addValue(arreglo1[17],"imagen 1","Gris(HTLM)");
        datos.addValue(arreglo1[18],"imagen 1","Gris bistre");
        datos.addValue(arreglo1[19],"imagen 1","Gris Torcaza");
        datos.addValue(arreglo1[20],"imagen 1","Gris de payne");
        datos.addValue(arreglo1[21],"imagen 1","Gris Pizarra");
        datos.addValue(arreglo1[22],"imagen 1","Gris plomo");
        datos.addValue(arreglo1[23],"imagen 1","gris de campaña");
        datos.addValue(arreglo1[24],"imagen 1","Gris frio ");
        datos.addValue(arreglo1[25],"imagen 1","Gris de aslfato");
        datos.addValue(arreglo1[26], "imagen 1","Gris  Azafache");
        
        datos.addValue(arreglo2[0],"imagen 2","Gris platino");
        datos.addValue(arreglo2[1],"imagen 2","Gris Ceniza");
        datos.addValue(arreglo2[2],"imagen 2","Gris Lino");
        datos.addValue(arreglo2[3],"imagen 2","Gris medio");
        datos.addValue(arreglo2[4],"imagen 2","Gris blanco humo");
        datos.addValue(arreglo2[5],"imagen 2","Gris aluminio");
        datos.addValue(arreglo2[6],"imagen 2","Gris Alice blue");
        datos.addValue(arreglo2[7],"imagen 2","Gris humo ");
        datos.addValue(arreglo2[8],"imagen 2","Gris estandar");
        datos.addValue(arreglo2[9],"imagen 2","Gris automotriz");
        datos.addValue(arreglo2[10],"imagen 2","Gris Elefante");
        datos.addValue(arreglo2[11],"imagen 2","Gris Zinc");
        datos.addValue(arreglo2[12],"imagen 2","Gris Acero");
        datos.addValue(arreglo2[13],"imagen 2","Gris cadete");
        datos.addValue(arreglo2[14],"imagen 2","Gris acorazado");
        datos.addValue(arreglo2[15],"imagen 2","Gris Niquel");
        datos.addValue(arreglo2[16],"imagen 2","Gris Xanahu");
        datos.addValue(arreglo2[17],"imagen 2","Gris(HTLM)");
        datos.addValue(arreglo2[18],"imagen 2","Gris bistre");
        datos.addValue(arreglo2[19],"imagen 2","Gris Torcaza");
        datos.addValue(arreglo2[20],"imagen 2","Gris de payne");
        datos.addValue(arreglo2[21],"imagen 2","Gris Pizarra");
        datos.addValue(arreglo2[22],"imagen 2","Gris plomo");
        datos.addValue(arreglo2[23],"imagen 2","gris de campaña");
        datos.addValue(arreglo2[24],"imagen 2","Gris frio ");
        datos.addValue(arreglo2[25],"imagen 2","Gris de aslfato");
        datos.addValue(arreglo2[26], "imagen 2","Gris  Azafache");
        
        datos.addValue(arreglo3[0],"imagen 3","Gris platino");
        datos.addValue(arreglo3[1],"imagen 3","Gris Ceniza");
        datos.addValue(arreglo3[2],"imagen 3","Gris Lino");
        datos.addValue(arreglo3[3],"imagen 3","Gris medio");
        datos.addValue(arreglo3[4],"imagen 3","Gris blanco humo");
        datos.addValue(arreglo3[5],"imagen 3","Gris aluminio");
        datos.addValue(arreglo3[6],"imagen 3","Gris Alice blue");
        datos.addValue(arreglo3[7],"imagen 3","Gris humo ");
        datos.addValue(arreglo3[8],"imagen 3","Gris estandar");
        datos.addValue(arreglo3[9],"imagen 3","Gris automotriz");
        datos.addValue(arreglo3[10],"imagen 3","Gris Elefante");
        datos.addValue(arreglo3[11],"imagen 3","Gris Zinc");
        datos.addValue(arreglo3[12],"imagen 3","Gris Acero");
        datos.addValue(arreglo3[13],"imagen 3","Gris cadete");
        datos.addValue(arreglo3[14],"imagen 3","Gris acorazado");
        datos.addValue(arreglo3[15],"imagen 3","Gris Niquel");
        datos.addValue(arreglo3[16],"imagen 3","Gris Xanahu");
        datos.addValue(arreglo3[17],"imagen 3","Gris(HTLM)");
        datos.addValue(arreglo3[18],"imagen 3","Gris bistre");
        datos.addValue(arreglo3[19],"imagen 3","Gris Torcaza");
        datos.addValue(arreglo3[20],"imagen 3","Gris de payne");
        datos.addValue(arreglo3[21],"imagen 3","Gris Pizarra");
        datos.addValue(arreglo3[22],"imagen 3","Gris plomo");
        datos.addValue(arreglo3[23],"imagen 3","gris de campaña");
        datos.addValue(arreglo3[24],"imagen 3","Gris frio ");
        datos.addValue(arreglo3[25],"imagen 3","Gris de aslfato");
        datos.addValue(arreglo3[26], "imagen 3","Gris  Azafache");
            
        
        
        
       ChartPanel Panel = new ChartPanel(Grafica);
       JFrame Ventana = new JFrame("JFreeChart");
       Ventana.getContentPane().add(Panel);
       Ventana.pack();
       Ventana.setVisible(true);
      
            
            
            } catch (IOException ex) {
                Logger.getLogger(Form.class.getName()).log(Level.SEVERE, null, ex);
            }
             ImageIcon icon = new ImageIcon(origen);
             
             this.lb1.setIcon(icon);
             
         }else{
             JOptionPane.showMessageDialog(null,"por favor seleccione una imagen");
         }
         int numero=Escala.formula(arreglo1);
         System.out.println("el t es "+numero);
        
       
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    
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
            java.util.logging.Logger.getLogger(Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Form().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JLabel lb1;
    private javax.swing.JLabel lb2;
    private javax.swing.JLabel lb3;
    private javax.swing.JLabel lb4;
    // End of variables declaration//GEN-END:variables
}
