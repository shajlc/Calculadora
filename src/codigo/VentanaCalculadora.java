/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codigo;

/**
 *
 * @author xp
 */
public class VentanaCalculadora extends javax.swing.JFrame {

    double operando1 = 0; //primer operando 
    
    String operacion = ""; //guarda que operación se ha pulsado
    
    /**
     * Creates new form VentanaCalculadora
     */
    public VentanaCalculadora() {
        initComponents();
    }

    
      private void numeroPulsado(String numero){
          if (pantalla.getText() == "0"){
                pantalla.setText(numero) ;
          }
          else{
                pantalla.setText(pantalla.getText() + numero);
          }
      }
      
      private void operacionPulsada(String _operacion){
          operacion = _operacion;
          operando1 = Double.valueOf( pantalla.getText()); //convierto lo que ha escrito en la pantalla(que es un numero cero
                                                           //que ahora mismo es un string, a su equivalente Double)
                                                           
          pantalla.setText("0"); //borro pantalla
          
          
          
      }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton2 = new javax.swing.JButton();
        pantalla = new javax.swing.JLabel();
        boton7 = new javax.swing.JButton();
        boton4 = new javax.swing.JButton();
        boton1 = new javax.swing.JButton();
        boton8 = new javax.swing.JButton();
        boton5 = new javax.swing.JButton();
        boton2 = new javax.swing.JButton();
        boton9 = new javax.swing.JButton();
        boton6 = new javax.swing.JButton();
        boton3 = new javax.swing.JButton();
        botonIgual = new javax.swing.JButton();
        botonMas = new javax.swing.JButton();
        botonMenos = new javax.swing.JButton();
        botonPor = new javax.swing.JButton();
        botonDivision = new javax.swing.JButton();
        boton0 = new javax.swing.JButton();

        jButton2.setText("jButton2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pantalla.setBackground(new java.awt.Color(0, 0, 0));
        pantalla.setFont(new java.awt.Font("Courier New", 3, 48)); // NOI18N
        pantalla.setForeground(new java.awt.Color(0, 153, 153));
        pantalla.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        pantalla.setText("0");
        pantalla.setOpaque(true);
        pantalla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                pantallaMousePressed(evt);
            }
        });

        boton7.setBackground(new java.awt.Color(0, 0, 0));
        boton7.setFont(new java.awt.Font("Courier New", 0, 24)); // NOI18N
        boton7.setForeground(new java.awt.Color(255, 255, 255));
        boton7.setText("7");
        boton7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                boton7MousePressed(evt);
            }
        });
        boton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton7ActionPerformed(evt);
            }
        });

        boton4.setBackground(new java.awt.Color(0, 0, 0));
        boton4.setFont(new java.awt.Font("Courier New", 0, 24)); // NOI18N
        boton4.setForeground(new java.awt.Color(255, 255, 255));
        boton4.setText("4");
        boton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                boton4MousePressed(evt);
            }
        });
        boton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton4ActionPerformed(evt);
            }
        });

        boton1.setBackground(new java.awt.Color(0, 0, 0));
        boton1.setFont(new java.awt.Font("Courier New", 0, 24)); // NOI18N
        boton1.setForeground(new java.awt.Color(255, 255, 255));
        boton1.setText("1");
        boton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                boton1MousePressed(evt);
            }
        });
        boton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton1ActionPerformed(evt);
            }
        });

        boton8.setBackground(new java.awt.Color(0, 0, 0));
        boton8.setFont(new java.awt.Font("Courier New", 0, 24)); // NOI18N
        boton8.setForeground(new java.awt.Color(255, 255, 255));
        boton8.setText("8");
        boton8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                boton8MousePressed(evt);
            }
        });

        boton5.setBackground(new java.awt.Color(0, 0, 0));
        boton5.setFont(new java.awt.Font("Courier New", 0, 24)); // NOI18N
        boton5.setForeground(new java.awt.Color(255, 255, 255));
        boton5.setText("5");
        boton5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                boton5MousePressed(evt);
            }
        });
        boton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton5ActionPerformed(evt);
            }
        });

        boton2.setBackground(new java.awt.Color(0, 0, 0));
        boton2.setFont(new java.awt.Font("Courier New", 0, 24)); // NOI18N
        boton2.setForeground(new java.awt.Color(255, 255, 255));
        boton2.setText("2");
        boton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                boton2MousePressed(evt);
            }
        });
        boton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton2ActionPerformed(evt);
            }
        });

        boton9.setBackground(new java.awt.Color(0, 0, 0));
        boton9.setFont(new java.awt.Font("Courier New", 0, 24)); // NOI18N
        boton9.setForeground(new java.awt.Color(255, 255, 255));
        boton9.setText("9");
        boton9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                boton9MousePressed(evt);
            }
        });

        boton6.setBackground(new java.awt.Color(0, 0, 0));
        boton6.setFont(new java.awt.Font("Courier New", 0, 24)); // NOI18N
        boton6.setForeground(new java.awt.Color(255, 255, 255));
        boton6.setText("6");
        boton6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                boton6MousePressed(evt);
            }
        });
        boton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton6ActionPerformed(evt);
            }
        });

        boton3.setBackground(new java.awt.Color(0, 0, 0));
        boton3.setFont(new java.awt.Font("Courier New", 0, 24)); // NOI18N
        boton3.setForeground(new java.awt.Color(255, 255, 255));
        boton3.setText("3");
        boton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                boton3MousePressed(evt);
            }
        });
        boton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton3ActionPerformed(evt);
            }
        });

        botonIgual.setBackground(new java.awt.Color(0, 0, 0));
        botonIgual.setFont(new java.awt.Font("Courier New", 0, 24)); // NOI18N
        botonIgual.setForeground(new java.awt.Color(255, 255, 255));
        botonIgual.setText("=");
        botonIgual.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                botonIgualMousePressed(evt);
            }
        });
        botonIgual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonIgualActionPerformed(evt);
            }
        });

        botonMas.setBackground(new java.awt.Color(0, 0, 0));
        botonMas.setFont(new java.awt.Font("Courier New", 0, 24)); // NOI18N
        botonMas.setForeground(new java.awt.Color(255, 255, 255));
        botonMas.setText("+");
        botonMas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                botonMasMousePressed(evt);
            }
        });
        botonMas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonMasActionPerformed(evt);
            }
        });

        botonMenos.setBackground(new java.awt.Color(0, 0, 0));
        botonMenos.setFont(new java.awt.Font("Courier New", 0, 24)); // NOI18N
        botonMenos.setForeground(new java.awt.Color(255, 255, 255));
        botonMenos.setText("-");
        botonMenos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                botonMenosMousePressed(evt);
            }
        });
        botonMenos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonMenosActionPerformed(evt);
            }
        });

        botonPor.setBackground(new java.awt.Color(0, 0, 0));
        botonPor.setFont(new java.awt.Font("Courier New", 0, 24)); // NOI18N
        botonPor.setForeground(new java.awt.Color(255, 255, 255));
        botonPor.setText("*");
        botonPor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                botonPorMousePressed(evt);
            }
        });
        botonPor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonPorActionPerformed(evt);
            }
        });

        botonDivision.setBackground(new java.awt.Color(0, 0, 0));
        botonDivision.setFont(new java.awt.Font("Courier New", 0, 24)); // NOI18N
        botonDivision.setForeground(new java.awt.Color(255, 255, 255));
        botonDivision.setText("/");
        botonDivision.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                botonDivisionMousePressed(evt);
            }
        });
        botonDivision.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonDivisionActionPerformed(evt);
            }
        });

        boton0.setBackground(new java.awt.Color(0, 0, 0));
        boton0.setFont(new java.awt.Font("Courier New", 0, 24)); // NOI18N
        boton0.setForeground(new java.awt.Color(255, 255, 255));
        boton0.setText("0");
        boton0.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                boton0MousePressed(evt);
            }
        });
        boton0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton0ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pantalla, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(boton7)
                                    .addComponent(boton4)
                                    .addComponent(boton1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(boton5)
                                    .addComponent(boton2)
                                    .addComponent(boton8)))
                            .addComponent(boton0, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(boton6)
                            .addComponent(boton9)
                            .addComponent(botonIgual)
                            .addComponent(boton3, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(botonMenos)
                            .addComponent(botonMas)
                            .addComponent(botonPor)
                            .addComponent(botonDivision))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pantalla, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(boton7, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(boton8, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(boton9, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonMas, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(boton5, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(boton6, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(boton4, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonMenos, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(boton1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(boton2, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(boton3, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonPor, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(boton0, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonIgual, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonDivision, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void boton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton7ActionPerformed
        numeroPulsado("7");
    }//GEN-LAST:event_boton7ActionPerformed

    private void boton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton4ActionPerformed
        numeroPulsado("4");
    }//GEN-LAST:event_boton4ActionPerformed

    private void boton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton1ActionPerformed
        numeroPulsado("1");
    }//GEN-LAST:event_boton1ActionPerformed

    private void boton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton5ActionPerformed
        numeroPulsado("5");
    }//GEN-LAST:event_boton5ActionPerformed

    private void boton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton2ActionPerformed
        numeroPulsado("2");
    }//GEN-LAST:event_boton2ActionPerformed

    private void boton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton6ActionPerformed
        numeroPulsado("6");
    }//GEN-LAST:event_boton6ActionPerformed

    private void boton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton3ActionPerformed
        numeroPulsado("3");
    }//GEN-LAST:event_boton3ActionPerformed

    private void botonIgualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonIgualActionPerformed
        numeroPulsado("");
    }//GEN-LAST:event_botonIgualActionPerformed

    private void botonMasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonMasActionPerformed
        numeroPulsado("+");
    }//GEN-LAST:event_botonMasActionPerformed

    private void botonMenosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonMenosActionPerformed
        numeroPulsado("-");
    }//GEN-LAST:event_botonMenosActionPerformed

    private void botonPorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonPorActionPerformed
        numeroPulsado("*");
    }//GEN-LAST:event_botonPorActionPerformed

    private void botonDivisionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonDivisionActionPerformed
        numeroPulsado("/");
    }//GEN-LAST:event_botonDivisionActionPerformed

    private void boton0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton0ActionPerformed
        numeroPulsado("0");
    }//GEN-LAST:event_boton0ActionPerformed

    private void boton7MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton7MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_boton7MousePressed

    private void pantallaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pantallaMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_pantallaMousePressed

    private void boton8MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton8MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_boton8MousePressed

    private void boton9MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton9MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_boton9MousePressed

    private void botonMasMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonMasMousePressed
        operacionPulsada("+");
    }//GEN-LAST:event_botonMasMousePressed

    private void boton4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton4MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_boton4MousePressed

    private void boton5MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton5MousePressed
        numeroPulsado("5");
    }//GEN-LAST:event_boton5MousePressed

    private void boton6MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton6MousePressed
        numeroPulsado("6");
    }//GEN-LAST:event_boton6MousePressed

    private void botonMenosMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonMenosMousePressed
        operacionPulsada("-");
    }//GEN-LAST:event_botonMenosMousePressed

    private void boton1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton1MousePressed
        numeroPulsado("1");
    }//GEN-LAST:event_boton1MousePressed

    private void boton2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton2MousePressed
        numeroPulsado("2");
    }//GEN-LAST:event_boton2MousePressed

    private void boton3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton3MousePressed
        numeroPulsado("3");
    }//GEN-LAST:event_boton3MousePressed

    private void botonPorMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonPorMousePressed
        operacionPulsada("*");
    }//GEN-LAST:event_botonPorMousePressed

    private void boton0MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton0MousePressed
        numeroPulsado("0");
    }//GEN-LAST:event_boton0MousePressed

    private void botonIgualMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonIgualMousePressed
        double operando2 = Double.valueOf(pantalla.getText());
        if (operacion.equals("+")){
            operando1 = operando1 + operando2;}
        pantalla.setText(String.valueOf(operando1)); //Dibujo en la pantalla el resultado convertido a string
    }//GEN-LAST:event_botonIgualMousePressed

    private void botonDivisionMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonDivisionMousePressed
        operacionPulsada("/");
    }//GEN-LAST:event_botonDivisionMousePressed

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
            java.util.logging.Logger.getLogger(VentanaCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaCalculadora().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton boton0;
    private javax.swing.JButton boton1;
    private javax.swing.JButton boton2;
    private javax.swing.JButton boton3;
    private javax.swing.JButton boton4;
    private javax.swing.JButton boton5;
    private javax.swing.JButton boton6;
    private javax.swing.JButton boton7;
    private javax.swing.JButton boton8;
    private javax.swing.JButton boton9;
    private javax.swing.JButton botonDivision;
    private javax.swing.JButton botonIgual;
    private javax.swing.JButton botonMas;
    private javax.swing.JButton botonMenos;
    private javax.swing.JButton botonPor;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel pantalla;
    // End of variables declaration//GEN-END:variables
}
