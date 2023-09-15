/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package classmain.MinutorFrame;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.concurrent.TimeUnit;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.Timer;
/**
 *
 * @author fillo
 */
public class MinutorFrame extends javax.swing.JFrame {
    // CONSTANTES
    
    //Attributs
    private Timer timer;
    private int timeSet;
    private int totalSeconds;
    private Timer scrollTimer;


    /**
     * Creates new form MinutorFrame
     */
    public MinutorFrame() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        minutorPanel = new javax.swing.JPanel();
        secondPanel = new javax.swing.JPanel();
        secondLabel = new javax.swing.JLabel();
        yearPanel = new javax.swing.JPanel();
        yearLabel = new javax.swing.JLabel();
        minutePanel = new javax.swing.JPanel();
        minuteLabel = new javax.swing.JLabel();
        hourPanel = new javax.swing.JPanel();
        hourLabel = new javax.swing.JLabel();
        monthPanel = new javax.swing.JPanel();
        monthLabel = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        stopButton = new javax.swing.JButton();
        newTimeButton = new javax.swing.JButton();
        startButton = new javax.swing.JButton();
        dayPanel = new javax.swing.JPanel();
        dayLabel = new javax.swing.JLabel();
        anLabel = new javax.swing.JLabel();
        moisLabel = new javax.swing.JLabel();
        jourLabel = new javax.swing.JLabel();
        heureLabel = new javax.swing.JLabel();
        minLabel = new javax.swing.JLabel();
        secLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        secondPanel.setBackground(new java.awt.Color(255, 255, 255));

        secondLabel.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N

        javax.swing.GroupLayout secondPanelLayout = new javax.swing.GroupLayout(secondPanel);
        secondPanel.setLayout(secondPanelLayout);
        secondPanelLayout.setHorizontalGroup(
            secondPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, secondPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(secondLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                .addContainerGap())
        );
        secondPanelLayout.setVerticalGroup(
            secondPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(secondPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(secondLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        yearPanel.setBackground(new java.awt.Color(255, 255, 255));

        yearLabel.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N

        javax.swing.GroupLayout yearPanelLayout = new javax.swing.GroupLayout(yearPanel);
        yearPanel.setLayout(yearPanelLayout);
        yearPanelLayout.setHorizontalGroup(
            yearPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(yearPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(yearLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                .addContainerGap())
        );
        yearPanelLayout.setVerticalGroup(
            yearPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, yearPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(yearLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        minutePanel.setBackground(new java.awt.Color(255, 255, 255));

        minuteLabel.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N

        javax.swing.GroupLayout minutePanelLayout = new javax.swing.GroupLayout(minutePanel);
        minutePanel.setLayout(minutePanelLayout);
        minutePanelLayout.setHorizontalGroup(
            minutePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, minutePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(minuteLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                .addContainerGap())
        );
        minutePanelLayout.setVerticalGroup(
            minutePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(minutePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(minuteLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        hourPanel.setBackground(new java.awt.Color(255, 255, 255));

        hourLabel.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N

        javax.swing.GroupLayout hourPanelLayout = new javax.swing.GroupLayout(hourPanel);
        hourPanel.setLayout(hourPanelLayout);
        hourPanelLayout.setHorizontalGroup(
            hourPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, hourPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(hourLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                .addContainerGap())
        );
        hourPanelLayout.setVerticalGroup(
            hourPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(hourPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(hourLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        monthPanel.setBackground(new java.awt.Color(255, 255, 255));

        monthLabel.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N

        javax.swing.GroupLayout monthPanelLayout = new javax.swing.GroupLayout(monthPanel);
        monthPanel.setLayout(monthPanelLayout);
        monthPanelLayout.setHorizontalGroup(
            monthPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, monthPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(monthLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                .addContainerGap())
        );
        monthPanelLayout.setVerticalGroup(
            monthPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, monthPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(monthLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jSeparator1.setBackground(new java.awt.Color(153, 153, 153));

        stopButton.setText("STOP");
        stopButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stopButtonActionPerformed(evt);
            }
        });

        newTimeButton.setText("New time");
        newTimeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newTimeButtonActionPerformed(evt);
            }
        });

        startButton.setText("START");
        startButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startButtonActionPerformed(evt);
            }
        });

        dayPanel.setBackground(new java.awt.Color(255, 255, 255));
        dayPanel.setPreferredSize(new java.awt.Dimension(92, 0));

        dayLabel.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N

        javax.swing.GroupLayout dayPanelLayout = new javax.swing.GroupLayout(dayPanel);
        dayPanel.setLayout(dayPanelLayout);
        dayPanelLayout.setHorizontalGroup(
            dayPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dayPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(dayLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                .addContainerGap())
        );
        dayPanelLayout.setVerticalGroup(
            dayPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dayPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(dayLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE)
                .addContainerGap())
        );

        anLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        anLabel.setText("année(s)");

        moisLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        moisLabel.setText("mois");

        jourLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jourLabel.setText("jour(s)");

        heureLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        heureLabel.setText("heure(s)");

        minLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        minLabel.setText("minute(s)");

        secLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        secLabel.setText("seconde(s)");

        javax.swing.GroupLayout minutorPanelLayout = new javax.swing.GroupLayout(minutorPanel);
        minutorPanel.setLayout(minutorPanelLayout);
        minutorPanelLayout.setHorizontalGroup(
            minutorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, minutorPanelLayout.createSequentialGroup()
                .addContainerGap(210, Short.MAX_VALUE)
                .addComponent(startButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(newTimeButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(stopButton)
                .addGap(250, 250, 250))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, minutorPanelLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(minutorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSeparator1)
                    .addGroup(minutorPanelLayout.createSequentialGroup()
                        .addGroup(minutorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(yearPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(anLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(minutorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(moisLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(monthPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(minutorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(dayPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jourLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(minutorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(hourPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(heureLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(minutorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(minLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(minutePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(minutorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(secondPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(secLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(27, 27, 27))
        );
        minutorPanelLayout.setVerticalGroup(
            minutorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(minutorPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(minutorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(minLabel)
                    .addComponent(secLabel)
                    .addComponent(heureLabel)
                    .addComponent(jourLabel)
                    .addComponent(moisLabel)
                    .addComponent(anLabel))
                .addGap(4, 4, 4)
                .addGroup(minutorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(minutePanel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(hourPanel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(dayPanel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 103, Short.MAX_VALUE)
                    .addComponent(monthPanel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(yearPanel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(secondPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(minutorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(startButton, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(newTimeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(stopButton, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        getContentPane().add(minutorPanel, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void startButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startButtonActionPerformed
        
        totalSeconds = timeSet; // Temps total en secondes

        if (totalSeconds == 0) {
            // Si le temps n'a pas été renseigné, on affiche un message d'erreur
            JOptionPane.showMessageDialog(this, "Veuillez renseigner un temps", "Erreur", JOptionPane.ERROR_MESSAGE);
            yearLabel.setText("X");
            monthLabel.setText("X");
            dayLabel.setText("X");
            hourLabel.setText("X");
            minuteLabel.setText("X");
            secondLabel.setText("X");
            return;
        }

        // Désactivez le bouton de démarrage pour éviter les problèmes de cliquabilité
        startButton.setEnabled(false);

        // Créez un ActionListener pour la mise à jour périodique de l'affichage
        ActionListener updateDisplay = new ActionListener() {
            int timeForYear;
            int timeForMonth;
            int timeForDay;
            int timeForHour;
            int timeForMinute;
            int timeForSecond;

            @Override
            public void actionPerformed(ActionEvent e) {
                if (totalSeconds >= 0) {
                    timeForYear = totalSeconds / (365 * 24 * 60 * 60);
                    timeForMonth = (totalSeconds % (365 * 24 * 60 * 60)) / (30 * 24 * 60 * 60);
                    timeForDay = (totalSeconds % (30 * 24 * 60 * 60)) / (24 * 60 * 60);
                    timeForHour = (totalSeconds % (24 * 60 * 60)) / (60 * 60);
                    timeForMinute = (totalSeconds % (60 * 60)) / 60;
                    timeForSecond = totalSeconds % 60;
                    
                    System.out.println("Année : " + timeForYear + "\n" + " Mois : " + timeForMonth + "\n" + "Jour : "+ timeForDay
                    + "\n" + " Heure : " + timeForHour + "\n" + " Minute : " + timeForMinute + "\n" + " Seconde : " + timeForSecond);
                    
                    SwingUtilities.invokeLater(() -> {
                        yearLabel.setText(String.valueOf(timeForYear));
                        monthLabel.setText(String.valueOf(timeForMonth));
                        dayLabel.setText(String.valueOf(timeForDay));
                        hourLabel.setText(String.valueOf(timeForHour));
                        minuteLabel.setText(String.valueOf(timeForMinute));
                        secondLabel.setText(String.valueOf(timeForSecond));
                    });
                    totalSeconds--;

                } else {
                    //On stoppe le timer pour eviter les problemes 
                   ((Timer) e.getSource()).stop();

                    // Créez un tableau pour stocker les étapes du défilement
                    String[][] scrollSteps = {
                        {"F", "I", "N", "I", "T", "0"},
                        {"0", "F", "I", "N", "I", "T"},
                        {"T", "O", "F", "I", "N", "I"},
                        {"I", "T", "O", "F", "I", "N"},
                        {"N", "I", "T", "O", "F", "I"},
                        {"I", "N", "I", "T", "O", "F"},
                        {"F", "I", "N", "I", "T", "0"},
                    };

                    // Créez un ActionListener pour mettre à jour les labels avec les étapes du défilement
                    ActionListener scrollAnimation = new ActionListener() {
                        int stepIndex = 0;

                        @Override
                        public void actionPerformed(ActionEvent e) {
                            // Vérifiez si toutes les étapes du défilement ont été parcourues
                            if (stepIndex >= scrollSteps.length) {
                                ((Timer) e.getSource()).stop(); // Arrêtez le Timer
                                startButton.setEnabled(true); // Réactivez le bouton de démarrage
                                return;
                            }

                            // Obtenez les valeurs de l'étape actuelle du défilement
                            String[] stepValues = scrollSteps[stepIndex];

                            // Mettez à jour les labels avec les valeurs de l'étape actuelle
                            yearLabel.setText(stepValues[0]);
                            monthLabel.setText(stepValues[1]);
                            dayLabel.setText(stepValues[2]);
                            hourLabel.setText(stepValues[3]);
                            minuteLabel.setText(stepValues[4]);
                            secondLabel.setText(stepValues[5]);

                            stepIndex++; // Passez à l'étape suivante du défilement
                        }
                    };

                    // Créez un Timer pour déclencher périodiquement l'animation de défilement
                    scrollTimer = new Timer(1000, scrollAnimation);
                    scrollTimer.start();
                }
            }
        };

        // Créez un Timer pour déclencher périodiquement l'affichage de mise à jour
        timer = new Timer(1000, updateDisplay);
        timer.start();
    }//GEN-LAST:event_startButtonActionPerformed

    private void newTimeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newTimeButtonActionPerformed
       if (startButton.isSelected()) {
            timer.stop();
            scrollTimer.stop();
            startButton.setEnabled(false);
        } else {
            // cree la Jdialog nommé dialognewtime et prend le temps rentré par l'utilisateur
            TimeDialog dialognewtime = new TimeDialog(this, true);
            dialognewtime.setVisible(true);

            //recupere la valeur de l'attribut duree de la classe TimeDialog
            timeSet = dialognewtime.getDuree();
            System.out.println(timeSet);
       }
        
        
    }//GEN-LAST:event_newTimeButtonActionPerformed

    private void stopButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stopButtonActionPerformed
        timer.stop();
        scrollTimer.stop();
        startButton.setEnabled(true );

        //System.exit(0);
    }//GEN-LAST:event_stopButtonActionPerformed

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
            java.util.logging.Logger.getLogger(MinutorFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MinutorFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MinutorFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MinutorFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MinutorFrame().setVisible(true);
            }
        });   
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel anLabel;
    private javax.swing.JLabel dayLabel;
    private javax.swing.JPanel dayPanel;
    private javax.swing.JLabel heureLabel;
    private javax.swing.JLabel hourLabel;
    private javax.swing.JPanel hourPanel;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel jourLabel;
    private javax.swing.JLabel minLabel;
    private javax.swing.JLabel minuteLabel;
    private javax.swing.JPanel minutePanel;
    private javax.swing.JPanel minutorPanel;
    private javax.swing.JLabel moisLabel;
    private javax.swing.JLabel monthLabel;
    private javax.swing.JPanel monthPanel;
    private javax.swing.JButton newTimeButton;
    private javax.swing.JLabel secLabel;
    private javax.swing.JLabel secondLabel;
    private javax.swing.JPanel secondPanel;
    private javax.swing.JButton startButton;
    private javax.swing.JButton stopButton;
    private javax.swing.JLabel yearLabel;
    private javax.swing.JPanel yearPanel;
    // End of variables declaration//GEN-END:variables
}