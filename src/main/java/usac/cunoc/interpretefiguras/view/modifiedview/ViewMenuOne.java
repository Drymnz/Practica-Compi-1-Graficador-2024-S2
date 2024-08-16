/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package usac.cunoc.interpretefiguras.view.modifiedview;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Rectangle;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.File;
import java.util.ArrayList;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SpinnerNumberModel;
import javax.swing.event.CaretEvent;
import javax.swing.event.CaretListener;
import javax.swing.text.BadLocationException;

import usac.cunoc.interpretefiguras.logic.analyzer.Analyzer;
import usac.cunoc.interpretefiguras.logic.animition.AnimateObjectGeometry;
import usac.cunoc.interpretefiguras.logic.animition.Animation;
import usac.cunoc.interpretefiguras.logic.fileManager.FileInput;
import usac.cunoc.interpretefiguras.logic.fileManager.FileOutput;
import usac.cunoc.interpretefiguras.logic.fileManager.JPanelToPDF;
import usac.cunoc.interpretefiguras.logic.fileManager.JPanelToPNG;
import usac.cunoc.interpretefiguras.logic.reports.ReprotsToView;
import usac.cunoc.interpretefiguras.view.ReportPanel;

/**
 *
 * @author drymnz
 */
public class ViewMenuOne extends javax.swing.JFrame {

    private File userFile;
    private ArrayList<Animation> listAnimation;

    private final String NAME_PANEL_GRAPHICS = "graphics";
    private final String NAME_PANEL_REPORT = "report";

    public ViewMenuOne() {
        //configuraciones de netbeans
        initComponents();
        //DESACTIVAR BOTONES
        this.enableJButonLastGraphe(false);
        //ESTILOS DE LOS BOTONES
        this.stalyJButton();
        //CAARGAR POSICON
        this.loadTextPosition();
    }

    private void positionText() {
        try {
            // Convertir la posición del caret a coordenadas (x, y)
            int pos = compiler1.getCaretPosition();
            int line = compiler1.getLineOfOffset(pos);
            int column = pos - compiler1.getLineStartOffset(line);
            // Mostrar las coordenadas en el JLabel
            positionLabel.setText("Line:" + (line + 1) + "Columna:" + (column + 1));
        } catch (BadLocationException ex) {
            ex.printStackTrace();
        }
    }

    //MOSTRAR LA POSICION
    private void loadTextPosition() {
        this.compiler1.setLineWrap(true);  // Habilitar ajuste de línea
        this.compiler1.setWrapStyleWord(true);  // Ajuste de palabra
        this.compiler1.addCaretListener(new CaretListener() {
            @Override
            public void caretUpdate(CaretEvent e) {
                positionText();
            }
        });
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
        jButtonCopiReport = new javax.swing.JButton();
        positionLabel = new javax.swing.JLabel();
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
        setBackground(new java.awt.Color(0, 0, 0));
        setLocation(new java.awt.Point(0, 0));
        setMaximumSize(new java.awt.Dimension(1280, 720));
        setMinimumSize(new java.awt.Dimension(1280, 720));
        setSize(new java.awt.Dimension(0, 0));

        Fondo.setBackground(new java.awt.Color(0, 0, 0));

        jPanelCopilador.setBackground(new java.awt.Color(198, 29, 45));
        jPanelCopilador.setMaximumSize(new java.awt.Dimension(600, 808));

        jButtonCopile.setText("Copilar");
        jButtonCopile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCopileActionPerformed(evt);
            }
        });

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

        jButtonCopiReport.setText("Ver REPORTES");
        jButtonCopiReport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCopiReportActionPerformed(evt);
            }
        });

        positionLabel.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        positionLabel.setForeground(new java.awt.Color(0, 0, 0));
        positionLabel.setText("Line: 0  Columna: 0");

        javax.swing.GroupLayout jPanelCopiladorLayout = new javax.swing.GroupLayout(jPanelCopilador);
        jPanelCopilador.setLayout(jPanelCopiladorLayout);
        jPanelCopiladorLayout.setHorizontalGroup(
            jPanelCopiladorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCopiladorLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelCopiladorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelCopiladorLayout.createSequentialGroup()
                        .addComponent(jButtonCopiReport, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(positionLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
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
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 587, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(jPanelCopiladorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonCopile)
                    .addComponent(jButtonCopiReport)
                    .addComponent(positionLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanelCardLayout.setLayout(new java.awt.CardLayout());

        jScrollPanelGraphics.setBackground(new java.awt.Color(255, 51, 51));
        jScrollPanelGraphics.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPanelGraphics.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        jPanelGraphics.setBackground(new java.awt.Color(198, 29, 45));

        jButtonAnimation.setText("Animar");
        jButtonAnimation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAnimationActionPerformed(evt);
            }
        });

        jButtonExportPDF.setText("Exportar PDF");
        jButtonExportPDF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExportPDFActionPerformed(evt);
            }
        });

        jButtonExportPNG.setText("Exportar PNG");
        jButtonExportPNG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExportPNGActionPerformed(evt);
            }
        });

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
                    .addComponent(jPanelCardLayout, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
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

    private void stalyJButton() {
        ArrayList<JButton> list = new ArrayList<>();
        list.add(this.jButtonCopile);
        list.add(this.jButtonSave);
        list.add(this.jButtonLoad);
        list.add(this.jButtonNewFile);
        list.add(this.jButtonCopiReport);
        list.add(this.jButtonAnimation);
        list.add(this.jButtonExportPDF);
        list.add(this.jButtonExportPNG);
        for (JButton jButton : list) {
            jButton.setBackground(Color.WHITE);
            jButton.setBorder(BorderFactory.createLineBorder(Color.black, 2));
        }
    }

    private void jButtonLoadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLoadActionPerformed
        // Carga
        this.verify();
        this.userFile = selectFile("Abrier");
        if (this.userFile != null) {
            this.compiler1.setText(new FileInput().cargarArchivoTexto(userFile));
            this.enableJButonLastGraphe(false);
        }
    }//GEN-LAST:event_jButtonLoadActionPerformed

    private void jButtonNewFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNewFileActionPerformed
        //Nuevo
        this.verify();
        this.userFile = null;
        this.enableJButonLastGraphe(false);
    }//GEN-LAST:event_jButtonNewFileActionPerformed

    //verifica si hay un archivo cargado
    private void verify() {
        boolean fileLoad = (this.userFile != null);
        //true tienes un archivo cargado
        boolean areaTextIsBlank = this.compiler1.getText().isEmpty();
        //true el texto esta vacio
        String text = fileLoad ? "Tienes un archivo cargado" : areaTextIsBlank ? "" : "Tienes un texto que puedes perder";
        if (fileLoad || !areaTextIsBlank) {
            int respuesta = JOptionPane.showConfirmDialog(null, text + "¿Desea Guardar el texto que tiene?", "Confirmación", JOptionPane.YES_NO_OPTION);
            if (respuesta == JOptionPane.YES_OPTION) {
                //Guardar
                this.saven();
            }
        }
        this.compiler1.setText("");
    }

    // Guardar el texto en archivo
    private void saven() {
        try {
            if (this.userFile == null) {
                this.userFile = selectFile("Guardar");
            }
            if (new FileOutput().aguardarTexto(userFile, this.compiler1.getText())) {
                JOptionPane.showMessageDialog(null, "Se guardo con exito");
            } else {
                JOptionPane.showMessageDialog(null, "Error al guardar");
            }
        } catch (Exception e) {
            System.out.println("Error en la funcion saven - view menu ->" + e.getMessage());
        }
    }

    //Selecion de un archivo
    private File selectFile(String botonText) {
        JFileChooser fileChooser = new JFileChooser();
        int result = fileChooser.showDialog(null, botonText); // Muestra el diálogo
        if (result == JFileChooser.APPROVE_OPTION) {
            // El usuario seleccionó un archivo
            return fileChooser.getSelectedFile();
        }
        return null;
    }

    //EJECUCION DEL BOTON COPILAR
    private void jButtonCopileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCopileActionPerformed
        //BOTON DE COMPILAR
        if (this.compiler1.getText() != null && !(this.compiler1.getText().isBlank())) {
            //OBTEN LA ESCALA
            int valorEntero = ((SpinnerNumberModel) this.scale.getModel()).getNumber().intValue();
            Analyzer analyzer = new Analyzer(this.compiler1.getText(), valorEntero);
            //ANALISA EL TEXTO
            analyzer.Anilisar();
            if (analyzer.isErrorsAnalyzing()) {
                //ERROR 
                this.loadReportsError(analyzer, reportPanel1);
            } else {
                //GRAFICAR 
                this.loadGraphAndReports(analyzer, this.reportPanel1);
            }
        }
    }//GEN-LAST:event_jButtonCopileActionPerformed

    private void jButtonAnimationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAnimationActionPerformed
        //boton de animar
        AnimateObjectGeometry a = new AnimateObjectGeometry(this.grapherPanel1, this.listAnimation, this.jButtonAnimation, this.jButtonCopile);
        Thread thread = new Thread(a);
        thread.start();
    }//GEN-LAST:event_jButtonAnimationActionPerformed

    private void jButtonExportPDFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExportPDFActionPerformed
        // Exportar en PDF
        File filePDF = this.selectFile("Guardar");
        JPanelToPDF converter = new JPanelToPDF();
        JPanel uno = this.grapherPanel1;
        if (converter.jPanelToPDF(uno, filePDF, "IMGEN")) {
            JOptionPane.showMessageDialog(null, "Se guardo con exito");
        } else {
            JOptionPane.showMessageDialog(null, "no guardo con exito");
        }
    }//GEN-LAST:event_jButtonExportPDFActionPerformed

    private void jButtonExportPNGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExportPNGActionPerformed
        // Exportar en PNG
        File filePNG = this.selectFile("Guardar");
        JPanelToPNG converter = new JPanelToPNG();
        JPanel uno = this.grapherPanel1;
        if (converter.savePNG(filePNG, uno)) {
            JOptionPane.showMessageDialog(null, "Se guardo con exito");
        } else {
            JOptionPane.showMessageDialog(null, "no guardo con exito");
        }
    }//GEN-LAST:event_jButtonExportPNGActionPerformed

    private void jButtonCopiReportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCopiReportActionPerformed
        // Ver los reportes
        //MUESTRA EL PANEL
        this.showJPanel(this.NAME_PANEL_REPORT);
    }//GEN-LAST:event_jButtonCopiReportActionPerformed

    //CARGAR LOS REPORTES ERROR
    private void loadReportsError(Analyzer analyzer, ReportPanel view) {
        //MUESTRA EL PANEL
        this.showJPanel(this.NAME_PANEL_REPORT);
        //REMUEVE LAS TABLAS DE REPORT
        this.reportPanel1.removeAll();
        //QUITA SI HAY GRAFICAS
        this.grapherPanel1.Graficar(null);
        //CONTRUYE LOS REPORTES
        ReprotsToView loadReport = new ReprotsToView(analyzer, view);
        loadReport.loadReporError();
        this.reportPanel1.repaint();
    }

    //CARGAR LOS GRAFICOS
    private void loadGraphAndReports(Analyzer analyzer, ReportPanel view) {
        //MUESTRA EL PANEL
        this.showJPanel(this.NAME_PANEL_GRAPHICS);
        //ENVIA EL LISTADO DE OBJETOS A GRAFICAR
        this.grapherPanel1.Graficar(analyzer.getParse().getLisGeometricObject());
        //ENVIA EL LISTADO DE ANIMACIONES
        this.listAnimation = analyzer.getListAnimation();
        //ACTIVA LOS BOTONES
        this.enableJButonLastGraphe(true);
        this.grapherPanel1.repaint();

        this.reportPanel1.removeAll();
        //CONTRUYE LOS REPORTES
        ReprotsToView loadReport = new ReprotsToView(analyzer, view);
        loadReport.loadReportMathOperation();
        loadReport.loadReportUserColor();
        loadReport.loadReportUserObject();
        loadReport.loadReportUserAnimation();
        this.reportPanel1.repaint();
    }

    //desactivar y activar los bonotes que se pueden hacer con la grafica
    private void enableJButonLastGraphe(boolean station) {
        this.jButtonAnimation.setEnabled(station);
        this.jButtonExportPDF.setEnabled(station);
        this.jButtonExportPNG.setEnabled(station);
        this.scale.setEnabled(station);
        this.jButtonCopiReport.setEnabled(station);
    }

    //MUESTRA EL PANEL SEGUN SU ID
    private void showJPanel(String name) {
        CardLayout cardone = (CardLayout) this.jPanelCardLayout.getLayout();
        cardone.show(this.jPanelCardLayout, name);
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Fondo;
    private javax.swing.JTextArea compiler1;
    private usac.cunoc.interpretefiguras.view.GrapherPanel grapherPanel1;
    private javax.swing.JButton jButtonAnimation;
    private javax.swing.JButton jButtonCopiReport;
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
    private javax.swing.JLabel positionLabel;
    private usac.cunoc.interpretefiguras.view.ReportPanel reportPanel1;
    private javax.swing.JSpinner scale;
    // End of variables declaration//GEN-END:variables
}
