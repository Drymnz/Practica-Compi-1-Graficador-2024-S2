/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package usac.cunoc.interpretefiguras.view.modifiedview;

import java.awt.CardLayout;

/**
 *
 * @author drymnz
 */
public class ViewMenuOne extends javax.swing.JFrame {
    
    private final String NAME_PANEL_GRAPHICS = "graphics";
    private final String NAME_PANEL_REPORT = "report";

    public ViewMenuOne() {
        //configuraciones de netbeans
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Fondo = new javax.swing.JPanel();
        jPanelCopilador = new javax.swing.JPanel();
        jButtonCopile = new javax.swing.JButton();
        jButtonSave = new javax.swing.JButton();
        jButtonLoad = new javax.swing.JButton();
        jButtonNewFile = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        compiler1 = new javax.swing.JTextArea();
        jPanelCardLayout = new javax.swing.JPanel();
        jScrollPanelGraphics = new javax.swing.JScrollPane();
        jPanelGraphics = new javax.swing.JPanel();
        jButtonAnimation = new javax.swing.JButton();
        jButtonExportPDF = new javax.swing.JButton();
        jButtonExportPNG = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        scale = new javax.swing.JSpinner();
        jScrollPane2 = new javax.swing.JScrollPane();
        grapherPanel1 = new usac.cunoc.interpretefiguras.view.GrapherPanel();
        jScrollPanelReport = new javax.swing.JScrollPane();
        reportPanel1 = new usac.cunoc.interpretefiguras.view.ReportPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(180, 0, 17));
        setLocation(new java.awt.Point(0, 0));
        setMaximumSize(new java.awt.Dimension(1280, 720));
        setMinimumSize(new java.awt.Dimension(1280, 720));
        setSize(new java.awt.Dimension(0, 0));

        Fondo.setBackground(new java.awt.Color(248, 248, 248));

        jPanelCopilador.setBackground(new java.awt.Color(198, 29, 45));
        jPanelCopilador.setMaximumSize(new java.awt.Dimension(600, 808));

        jButtonCopile.setText("Copilar");

        jButtonSave.setText("Guardar");

        jButtonLoad.setText("Cargar");
        jButtonLoad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLoadActionPerformed(evt);
            }
        });

        jButtonNewFile.setText("Nuevo");
        jButtonNewFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNewFileActionPerformed(evt);
            }
        });

        compiler1.setColumns(20);
        compiler1.setRows(5);
        jScrollPane1.setViewportView(compiler1);

        javax.swing.GroupLayout jPanelCopiladorLayout = new javax.swing.GroupLayout(jPanelCopilador);
        jPanelCopilador.setLayout(jPanelCopiladorLayout);
        jPanelCopiladorLayout.setHorizontalGroup(
            jPanelCopiladorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCopiladorLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelCopiladorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelCopiladorLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButtonCopile, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelCopiladorLayout.createSequentialGroup()
                        .addComponent(jButtonLoad, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(jButtonNewFile, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                        .addComponent(jButtonSave, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanelCopiladorLayout.setVerticalGroup(
            jPanelCopiladorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelCopiladorLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelCopiladorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonSave)
                    .addComponent(jButtonLoad)
                    .addComponent(jButtonNewFile))
                .addGap(26, 26, 26)
                .addComponent(jScrollPane1)
                .addGap(18, 18, 18)
                .addComponent(jButtonCopile)
                .addContainerGap())
        );

        jPanelCardLayout.setLayout(new java.awt.CardLayout());

        jScrollPanelGraphics.setBackground(new java.awt.Color(255, 51, 51));
        jScrollPanelGraphics.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPanelGraphics.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        jPanelGraphics.setBackground(new java.awt.Color(198, 29, 45));

        jButtonAnimation.setText("Animar");

        jButtonExportPDF.setText("Exportar PDF");

        jButtonExportPNG.setText("Exportar PNG");

        jLabel1.setText("ESCALA DE PX");

        scale.setModel(new javax.swing.SpinnerNumberModel(1, 1, 50, 1));

        jScrollPane2.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        jScrollPane2.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        javax.swing.GroupLayout grapherPanel1Layout = new javax.swing.GroupLayout(grapherPanel1);
        grapherPanel1.setLayout(grapherPanel1Layout);
        grapherPanel1Layout.setHorizontalGroup(
            grapherPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 607, Short.MAX_VALUE)
        );
        grapherPanel1Layout.setVerticalGroup(
            grapherPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 607, Short.MAX_VALUE)
        );

        jScrollPane2.setViewportView(grapherPanel1);

        javax.swing.GroupLayout jPanelGraphicsLayout = new javax.swing.GroupLayout(jPanelGraphics);
        jPanelGraphics.setLayout(jPanelGraphicsLayout);
        jPanelGraphicsLayout.setHorizontalGroup(
            jPanelGraphicsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelGraphicsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelGraphicsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addGroup(jPanelGraphicsLayout.createSequentialGroup()
                        .addComponent(jButtonAnimation, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonExportPDF, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonExportPNG, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(scale, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanelGraphicsLayout.setVerticalGroup(
            jPanelGraphicsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelGraphicsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelGraphicsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonAnimation, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonExportPDF, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonExportPNG, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(scale, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 614, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        jScrollPanelGraphics.setViewportView(jPanelGraphics);

        jPanelCardLayout.add(jScrollPanelGraphics, "graphics");

        jScrollPanelReport.setBackground(new java.awt.Color(255, 51, 102));

        reportPanel1.setBackground(new java.awt.Color(248, 248, 248));

        javax.swing.GroupLayout reportPanel1Layout = new javax.swing.GroupLayout(reportPanel1);
        reportPanel1.setLayout(reportPanel1Layout);
        reportPanel1Layout.setHorizontalGroup(
            reportPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 635, Short.MAX_VALUE)
        );
        reportPanel1Layout.setVerticalGroup(
            reportPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 693, Short.MAX_VALUE)
        );

        jScrollPanelReport.setViewportView(reportPanel1);

        jPanelCardLayout.add(jScrollPanelReport, "report");

        javax.swing.GroupLayout FondoLayout = new javax.swing.GroupLayout(Fondo);
        Fondo.setLayout(FondoLayout);
        FondoLayout.setHorizontalGroup(
            FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FondoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelCopilador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanelCardLayout, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        FondoLayout.setVerticalGroup(
            FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FondoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelCopilador, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelCardLayout, javax.swing.GroupLayout.DEFAULT_SIZE, 696, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Fondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Fondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonLoadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLoadActionPerformed
        // Carga
        this.showJPanel(this.NAME_PANEL_GRAPHICS);
    }//GEN-LAST:event_jButtonLoadActionPerformed

    private void jButtonNewFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNewFileActionPerformed
        //Nuevo
        this.showJPanel(this.NAME_PANEL_REPORT);
    }//GEN-LAST:event_jButtonNewFileActionPerformed

    private void showJPanel(String name){
        CardLayout cardone = (CardLayout) this.jPanelCardLayout.getLayout();
        cardone.show(this.jPanelCardLayout, name);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Fondo;
    private javax.swing.JTextArea compiler1;
    private usac.cunoc.interpretefiguras.view.GrapherPanel grapherPanel1;
    private javax.swing.JButton jButtonAnimation;
    private javax.swing.JButton jButtonCopile;
    private javax.swing.JButton jButtonExportPDF;
    private javax.swing.JButton jButtonExportPNG;
    private javax.swing.JButton jButtonLoad;
    private javax.swing.JButton jButtonNewFile;
    private javax.swing.JButton jButtonSave;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanelCardLayout;
    private javax.swing.JPanel jPanelCopilador;
    private javax.swing.JPanel jPanelGraphics;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPanelGraphics;
    private javax.swing.JScrollPane jScrollPanelReport;
    private usac.cunoc.interpretefiguras.view.ReportPanel reportPanel1;
    private javax.swing.JSpinner scale;
    // End of variables declaration//GEN-END:variables
}
