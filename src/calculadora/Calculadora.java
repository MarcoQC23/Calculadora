package calculadora;
/**
 *
 * @author mco_a
 */
public class Calculadora extends javax.swing.JFrame {
   
    public Calculadora() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("Calculadora");
    }
    public float num1;
    public float num2;
    public String signo;
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jBtn_Punto = new javax.swing.JButton();
        jBtn_Num0 = new javax.swing.JButton();
        jBtn_Igualdad = new javax.swing.JButton();
        jBtn_Porcentaje = new javax.swing.JButton();
        jBtn_Num1 = new javax.swing.JButton();
        jBtn_Num2 = new javax.swing.JButton();
        jBtn_Num3 = new javax.swing.JButton();
        jBtn_Num4 = new javax.swing.JButton();
        jBtn_Num5 = new javax.swing.JButton();
        jBtn_Num6 = new javax.swing.JButton();
        jBtn_Adición = new javax.swing.JButton();
        jBtn_Num7 = new javax.swing.JButton();
        jBtn_Num8 = new javax.swing.JButton();
        jBtn_Num9 = new javax.swing.JButton();
        jBtn_Sustracción = new javax.swing.JButton();
        jBtn_Limpiar = new javax.swing.JButton();
        jBtn_División = new javax.swing.JButton();
        jBtn_Multiplicación = new javax.swing.JButton();
        jBtn_Borrar = new javax.swing.JButton();
        jLbl_Resultado = new javax.swing.JLabel();
        jLbl_Operación = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jBtn_Punto.setText(".");
        jBtn_Punto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn_PuntoActionPerformed(evt);
            }
        });

        jBtn_Num0.setText("0");
        jBtn_Num0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn_Num0ActionPerformed(evt);
            }
        });

        jBtn_Igualdad.setText("=");
        jBtn_Igualdad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn_IgualdadActionPerformed(evt);
            }
        });

        jBtn_Porcentaje.setText("%");
        jBtn_Porcentaje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn_PorcentajeActionPerformed(evt);
            }
        });

        jBtn_Num1.setText("1");
        jBtn_Num1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn_Num1ActionPerformed(evt);
            }
        });

        jBtn_Num2.setText("2");
        jBtn_Num2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn_Num2ActionPerformed(evt);
            }
        });

        jBtn_Num3.setText("3");
        jBtn_Num3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn_Num3ActionPerformed(evt);
            }
        });

        jBtn_Num4.setText("4");
        jBtn_Num4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn_Num4ActionPerformed(evt);
            }
        });

        jBtn_Num5.setText("5");
        jBtn_Num5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn_Num5ActionPerformed(evt);
            }
        });

        jBtn_Num6.setText("6");
        jBtn_Num6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn_Num6ActionPerformed(evt);
            }
        });

        jBtn_Adición.setText("+");
        jBtn_Adición.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn_AdiciónActionPerformed(evt);
            }
        });

        jBtn_Num7.setText("7");
        jBtn_Num7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn_Num7ActionPerformed(evt);
            }
        });

        jBtn_Num8.setText("8");
        jBtn_Num8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn_Num8ActionPerformed(evt);
            }
        });

        jBtn_Num9.setText("9");
        jBtn_Num9.setPreferredSize(new java.awt.Dimension(57, 24));
        jBtn_Num9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn_Num9ActionPerformed(evt);
            }
        });

        jBtn_Sustracción.setText("-");
        jBtn_Sustracción.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn_SustracciónActionPerformed(evt);
            }
        });

        jBtn_Limpiar.setText("AC");
        jBtn_Limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn_LimpiarActionPerformed(evt);
            }
        });

        jBtn_División.setText("÷");
        jBtn_División.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn_DivisiónActionPerformed(evt);
            }
        });

        jBtn_Multiplicación.setText("x");
        jBtn_Multiplicación.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn_MultiplicaciónActionPerformed(evt);
            }
        });

        jBtn_Borrar.setText("Delete");
        jBtn_Borrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn_BorrarActionPerformed(evt);
            }
        });

        jLbl_Resultado.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N
        jLbl_Resultado.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        jLbl_Operación.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLbl_Operación.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jBtn_Num1, javax.swing.GroupLayout.DEFAULT_SIZE, 68, Short.MAX_VALUE)
                            .addComponent(jBtn_Punto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jBtn_Num0, javax.swing.GroupLayout.DEFAULT_SIZE, 68, Short.MAX_VALUE)
                            .addComponent(jBtn_Num2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jBtn_Porcentaje, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jBtn_Num3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBtn_Igualdad, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(17, 17, 17))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jBtn_Num4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jBtn_Num7, javax.swing.GroupLayout.DEFAULT_SIZE, 68, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jBtn_Num8, javax.swing.GroupLayout.DEFAULT_SIZE, 68, Short.MAX_VALUE)
                                    .addComponent(jBtn_Num5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jBtn_Num6, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jBtn_Adición, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jBtn_Num9, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jBtn_Sustracción, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jBtn_Limpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jBtn_División, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jBtn_Multiplicación, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jBtn_Borrar, javax.swing.GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE)))
                        .addContainerGap(17, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLbl_Resultado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLbl_Operación, javax.swing.GroupLayout.DEFAULT_SIZE, 288, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jLbl_Operación, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLbl_Resultado, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBtn_Limpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtn_División, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtn_Multiplicación, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtn_Borrar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jBtn_Num7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                    .addComponent(jBtn_Num8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jBtn_Sustracción, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jBtn_Num9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jBtn_Num6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                    .addComponent(jBtn_Num5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jBtn_Num4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jBtn_Adición, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jBtn_Num1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jBtn_Num2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jBtn_Num3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jBtn_Num0, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jBtn_Porcentaje, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jBtn_Punto, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jBtn_Igualdad, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBtn_Num8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn_Num8ActionPerformed
      jLbl_Operación.setText(jLbl_Operación.getText()+"8");
    }//GEN-LAST:event_jBtn_Num8ActionPerformed

    private void jBtn_Num0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn_Num0ActionPerformed
      jLbl_Operación.setText(jLbl_Operación.getText()+"0");
    }//GEN-LAST:event_jBtn_Num0ActionPerformed

    private void jBtn_Num1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn_Num1ActionPerformed
      jLbl_Operación.setText(jLbl_Operación.getText()+"1");
    }//GEN-LAST:event_jBtn_Num1ActionPerformed

    private void jBtn_Num2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn_Num2ActionPerformed
      jLbl_Operación.setText(jLbl_Operación.getText()+"2");
    }//GEN-LAST:event_jBtn_Num2ActionPerformed

    private void jBtn_Num3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn_Num3ActionPerformed
      jLbl_Operación.setText(jLbl_Operación.getText()+"3");
    }//GEN-LAST:event_jBtn_Num3ActionPerformed

    private void jBtn_Num4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn_Num4ActionPerformed
      jLbl_Operación.setText(jLbl_Operación.getText()+"4");
    }//GEN-LAST:event_jBtn_Num4ActionPerformed

    private void jBtn_Num5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn_Num5ActionPerformed
      jLbl_Operación.setText(jLbl_Operación.getText()+"5");
    }//GEN-LAST:event_jBtn_Num5ActionPerformed

    private void jBtn_Num6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn_Num6ActionPerformed
      jLbl_Operación.setText(jLbl_Operación.getText()+"6");
    }//GEN-LAST:event_jBtn_Num6ActionPerformed

    private void jBtn_Num7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn_Num7ActionPerformed
      jLbl_Operación.setText(jLbl_Operación.getText()+"7");
    }//GEN-LAST:event_jBtn_Num7ActionPerformed

    private void jBtn_Num9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn_Num9ActionPerformed
      jLbl_Operación.setText(jLbl_Operación.getText()+"9");
    }//GEN-LAST:event_jBtn_Num9ActionPerformed

    private void jBtn_LimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn_LimpiarActionPerformed
      jLbl_Operación.setText("");
      jLbl_Resultado.setText("");
    }//GEN-LAST:event_jBtn_LimpiarActionPerformed

    private void jBtn_AdiciónActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn_AdiciónActionPerformed
       num1=Float.parseFloat(jLbl_Operación.getText());
       signo="+";
       jLbl_Operación.setText("");
    }//GEN-LAST:event_jBtn_AdiciónActionPerformed

    private void jBtn_SustracciónActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn_SustracciónActionPerformed
       num1=Float.parseFloat(jLbl_Operación.getText());
       signo="-";
       jLbl_Operación.setText("");
    }//GEN-LAST:event_jBtn_SustracciónActionPerformed

    private void jBtn_MultiplicaciónActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn_MultiplicaciónActionPerformed
       num1=Float.parseFloat(jLbl_Operación.getText());
       signo="x";
       jLbl_Operación.setText("");
    }//GEN-LAST:event_jBtn_MultiplicaciónActionPerformed

    private void jBtn_DivisiónActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn_DivisiónActionPerformed
       num1=Float.parseFloat(jLbl_Operación.getText());
       signo="÷";
       jLbl_Operación.setText("");
    }//GEN-LAST:event_jBtn_DivisiónActionPerformed

    private void jBtn_IgualdadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn_IgualdadActionPerformed
       num2=Float.parseFloat(jLbl_Operación.getText());
       try{
           switch(signo){
               case "+":
                    jLbl_Resultado.setText(ExtraerCero(num1+num2));
                    break;
               case "-":
                   jLbl_Resultado.setText(ExtraerCero(num1-num2));
                   break;
               case "x":
                   jLbl_Resultado.setText(ExtraerCero(num1*num2));
                   break;
               case "÷":
                  if(num2==0){
                   jLbl_Resultado.setText("Error");
                  }
                  else{
                   jLbl_Resultado.setText(ExtraerCero(num1/num2));
                  }
                  break;
               case "%":
                  jLbl_Resultado.setText(ExtraerCero((num1/100)*num2));
                  break;
            }
       }catch(Exception e){
           System.out.print("Error: "+e);
       }
    }//GEN-LAST:event_jBtn_IgualdadActionPerformed

    private void jBtn_BorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn_BorrarActionPerformed
       try{
           String resultado=jLbl_Operación.getText();
           if(resultado.length()>0){
               resultado=resultado.substring(0, resultado.length()-1);
           }
           jLbl_Operación.setText(resultado);
       }catch(Exception e){
           System.out.println("Error: "+e);
       }
    }//GEN-LAST:event_jBtn_BorrarActionPerformed

    private void jBtn_PorcentajeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn_PorcentajeActionPerformed
       num1=Float.parseFloat(jLbl_Operación.getText());
       signo="%";
       jLbl_Resultado.setText("");
    }//GEN-LAST:event_jBtn_PorcentajeActionPerformed

    private void jBtn_PuntoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn_PuntoActionPerformed
       if(!jLbl_Operación.getText().contains(".")){
          jLbl_Operación.setText(jLbl_Operación.getText()+".");
       }
    }//GEN-LAST:event_jBtn_PuntoActionPerformed

    public String ExtraerCero(float valor){
    
        String resultado="";
        resultado=Float.toString(valor);
        
        if(valor % 1==0){
            resultado=resultado.substring(0, resultado.length()-2);
        }
        return resultado;
    }
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
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calculadora().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtn_Adición;
    private javax.swing.JButton jBtn_Borrar;
    private javax.swing.JButton jBtn_División;
    private javax.swing.JButton jBtn_Igualdad;
    private javax.swing.JButton jBtn_Limpiar;
    private javax.swing.JButton jBtn_Multiplicación;
    private javax.swing.JButton jBtn_Num0;
    private javax.swing.JButton jBtn_Num1;
    private javax.swing.JButton jBtn_Num2;
    private javax.swing.JButton jBtn_Num3;
    private javax.swing.JButton jBtn_Num4;
    private javax.swing.JButton jBtn_Num5;
    private javax.swing.JButton jBtn_Num6;
    private javax.swing.JButton jBtn_Num7;
    private javax.swing.JButton jBtn_Num8;
    private javax.swing.JButton jBtn_Num9;
    private javax.swing.JButton jBtn_Porcentaje;
    private javax.swing.JButton jBtn_Punto;
    private javax.swing.JButton jBtn_Sustracción;
    private javax.swing.JLabel jLbl_Operación;
    private javax.swing.JLabel jLbl_Resultado;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
