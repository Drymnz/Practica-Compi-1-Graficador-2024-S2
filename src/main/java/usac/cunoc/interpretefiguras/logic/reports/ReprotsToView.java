/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package usac.cunoc.interpretefiguras.logic.reports;

import java.awt.Color;
import java.awt.GridLayout;
import java.util.Arrays;
import java.util.List;
import usac.cunoc.interpretefiguras.logic.analyzer.Analyzer;
import usac.cunoc.interpretefiguras.view.ReportPanel;
import java.util.Vector;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import usac.cunoc.interpretefiguras.logic.animition.ListAnimation;
import usac.cunoc.interpretefiguras.logic.geometry.ListColor;
import usac.cunoc.interpretefiguras.logic.geometry.ListObjectGeometric;

/**
 *
 * @author drymnz
 */
public class ReprotsToView {

    private Analyzer analyzer;
    private ReportPanel view;
    private JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);

    private final String REPORT_USER_ANIMATION = "Reporte de animacion";
    private final String REPORT_USER_COLOR = "Reporte de uso de colores";
    private final String REPORT_USER_OBJECT = "Reporte de uso de objetos";
    private final String REPORT_USER_OPERATION_MATH = "Reporte de operaciones";

    public ReprotsToView(Analyzer analyzer, ReportPanel view) {
        this.analyzer = analyzer;
        this.view = view;
        tabbedPane.setSize(this.view.getWidth(), this.view.getHeight() - 100);
    }

    public void loadReportMathOperation() {
        Vector<String> columnNames = new Vector<>();
        Vector<Vector<String>> data = new Vector<>();
        // definiendo la columnas 
        columnNames.add("Operador");
        columnNames.add("Linea");
        columnNames.add("Columna");
        columnNames.add("Ocurrencia");

        if (this.analyzer.getParse().getListMathOperation() != null) {
            for (MathOperation mathOperation : this.analyzer.getParse().getListMathOperation()) {
                data.add(new Vector<>(Arrays.asList(
                        mathOperation.getType().toString(),
                        String.valueOf(mathOperation.getToken().getLine()),
                        String.valueOf(mathOperation.getToken().getColumna() - 5),
                        mathOperation.getToken().getLexeme()
                )));
            }
            //Agregar pestañas al JTabbedPane
            tabbedPane.addTab(this.REPORT_USER_OPERATION_MATH, null, instructionsTableModelToPanel(columnNames, data), "Operation");
            this.view.add(tabbedPane);
        }
    }

    public void loadReportUserColor() {
        Vector<String> columnNames = new Vector<>();
        Vector<Vector<String>> data = new Vector<>();
        // definiendo la columnas 
        columnNames.add("Color");
        columnNames.add("Cantida de uso");
        List<ListColor> list = Arrays.asList(ListColor.values());
        for (ListColor colorType : list) {
            if (this.analyzer.getParse().getReportUserObjectGeometry().countColor(colorType) != 0) {
                data.add(new Vector<>(Arrays.asList(
                        colorType.getNameColor(),
                        String.valueOf(this.analyzer.getParse().getReportUserObjectGeometry().countColor(colorType))
                )));
            }
        }
        //Agregar pestañas al JTabbedPane
        tabbedPane.addTab(this.REPORT_USER_COLOR, null, instructionsTableModelToPanel(columnNames, data), "UserColor");
        this.view.add(tabbedPane);
    }

    public void loadReportUserObject() {
        Vector<String> columnNames = new Vector<>();
        Vector<Vector<String>> data = new Vector<>();
        // definiendo la columnas 
        columnNames.add("Object");
        columnNames.add("Cantida de uso");
        List<ListObjectGeometric> list = Arrays.asList(ListObjectGeometric.values());
        for (ListObjectGeometric typeObject : list) {
            if (this.analyzer.getParse().getReportUserObjectGeometry().countUserObject(typeObject) != 0) {
                data.add(new Vector<>(Arrays.asList(
                        typeObject.toString(),
                        String.valueOf(this.analyzer.getParse().getReportUserObjectGeometry().countUserObject(typeObject))
                )));
            }
        }
        //Agregar pestañas al JTabbedPane
        tabbedPane.addTab(this.REPORT_USER_OBJECT, null, instructionsTableModelToPanel(columnNames, data), "UserObject");
        this.view.add(tabbedPane);
    }

    public void loadReportUserAnimation() {
        Vector<String> columnNames = new Vector<>();
        Vector<Vector<String>> data = new Vector<>();
        // definiendo la columnas 
        columnNames.add("Object");
        columnNames.add("Cantida de uso");
        List<ListAnimation> list = Arrays.asList(ListAnimation.values());
        for (ListAnimation typeAnimation : list) {
            if (this.analyzer.getParse().getReportUserObjectGeometry().countAnimation(typeAnimation) != 0) {
                data.add(new Vector<>(Arrays.asList(
                        typeAnimation.toString(),
                        String.valueOf(this.analyzer.getParse().getReportUserObjectGeometry().countAnimation(typeAnimation))
                )));
            }
        }
        //Agregar pestañas al JTabbedPane
        tabbedPane.addTab(this.REPORT_USER_ANIMATION, null, instructionsTableModelToPanel(columnNames, data), "UserObject");
        this.view.add(tabbedPane);
    }

    private JComponent instructionsTableModelToPanel(Vector<String> columnNames, Vector<Vector<String>> data) {
        DefaultTableModel model = new DefaultTableModel(data, columnNames);

        JTable table = new JTable(model);

        // Agregar la tabla a un JScrollPane
        JScrollPane scrollPane = new JScrollPane(table);

        // Crear paneles para las pestañas
        JComponent panel1 = new JPanel();
        panel1.setSize(1522, 1512);

        panel1.setLayout(new GridLayout(0, 1));
        panel1.add(scrollPane);
        return panel1;
    }

}
