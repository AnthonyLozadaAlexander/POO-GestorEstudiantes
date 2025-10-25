/*
 * Created by JFormDesigner on Fri Oct 24 17:50:37 ECT 2025
 */

package GestorEstudiantes;

import java.awt.Color;
import java.awt.Font;
import javax.swing.*;
import javax.swing.GroupLayout;
import javax.swing.table.DefaultTableModel;

/**
 * @author USUARIO
 */
public class FormEstudiantes extends JFrame {
    private DefaultTableModel modeloTabla; // Modelo de tabla para gestionar los datos de los estudiantes

    public FormEstudiantes() {
        initComponents();
        String[] columnas = {"ID/Cedula", "Nombres", "Apellidos", "Edad"}; // Definición de las columnas de la tabla
        modeloTabla = new DefaultTableModel(columnas, 0); // asignar columnas al modelo de tabla
        tablaEstudiantes.setModel(modeloTabla); // asignar el modelo de tabla a la JTable del formulario
        setTitle("Form Gestor Estudiantes");
        setLocationRelativeTo(null);
        setResizable(false);
    }


    private void initComponents() {

        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        // Generated using JFormDesigner Educational license - Daniel Sanchez (Anthony Lozada)
        panel1 = new JPanel();
        label1 = new JLabel();
        label2 = new JLabel();
        label3 = new JLabel();
        label4 = new JLabel();
        scrollPane1 = new JScrollPane();
        tablaEstudiantes = new JTable();

        //======== this ========
        setName("this");
        var contentPane = getContentPane();

        //======== panel1 ========
        {
            panel1.setBackground(new Color(0xffffe3));
            panel1.setName("panel1");

            //---- label1 ----
            label1.setText("Gestion De Estudiantes");
            label1.setFont(new Font("CaskaydiaMono NF SemiBold", Font.PLAIN, 20));
            label1.setName("label1");

            GroupLayout panel1Layout = new GroupLayout(panel1);
            panel1.setLayout(panel1Layout);
            panel1Layout.setHorizontalGroup(
                panel1Layout.createParallelGroup()
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(label1, GroupLayout.PREFERRED_SIZE, 265, GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(724, Short.MAX_VALUE))
            );
            panel1Layout.setVerticalGroup(
                panel1Layout.createParallelGroup()
                    .addGroup(GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                        .addContainerGap(34, Short.MAX_VALUE)
                        .addComponent(label1, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27))
            );
        }

        //---- label2 ----
        label2.setText("Datos");
        label2.setFont(new Font("CaskaydiaMono NF SemiBold", Font.PLAIN, 17));
        label2.setName("label2");

        //---- label3 ----
        label3.setText("ID/Cedula:");
        label3.setFont(new Font("CaskaydiaMono NF SemiBold", Font.PLAIN, 17));
        label3.setName("label3");

        //---- label4 ----
        label4.setText("Nombres:");
        label4.setFont(new Font("CaskaydiaMono NF SemiBold", Font.PLAIN, 17));
        label4.setName("label4");

        //======== scrollPane1 ========
        {
            scrollPane1.setName("scrollPane1");

            //---- tablaEstudiantes ----
            tablaEstudiantes.setModel(new DefaultTableModel(2, 0));
            tablaEstudiantes.setName("tablaEstudiantes");
            scrollPane1.setViewportView(tablaEstudiantes);
        }

        GroupLayout contentPaneLayout = new GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addComponent(panel1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE))
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addGap(34, 34, 34)
                    .addGroup(contentPaneLayout.createParallelGroup()
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addComponent(label2, GroupLayout.PREFERRED_SIZE, 90, GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 377, Short.MAX_VALUE))
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addComponent(label4, GroupLayout.PREFERRED_SIZE, 112, GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 355, Short.MAX_VALUE))
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addGap(0, 0, Short.MAX_VALUE)
                            .addComponent(label3, GroupLayout.PREFERRED_SIZE, 112, GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 354, Short.MAX_VALUE)))
                    .addComponent(scrollPane1, GroupLayout.PREFERRED_SIZE, 517, GroupLayout.PREFERRED_SIZE)
                    .addGap(20, 20, 20))
        );
        contentPaneLayout.setVerticalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(GroupLayout.Alignment.TRAILING, contentPaneLayout.createSequentialGroup()
                    .addComponent(panel1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(contentPaneLayout.createParallelGroup()
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addComponent(label2, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(label3, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(label4, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE))
                        .addComponent(scrollPane1, GroupLayout.PREFERRED_SIZE, 541, GroupLayout.PREFERRED_SIZE))
                    .addContainerGap())
        );
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
    // Generated using JFormDesigner Educational license - Daniel Sanchez (Anthony Lozada)
    private JPanel panel1;
    private JLabel label1;
    private JLabel label2;
    private JLabel label3;
    private JLabel label4;
    private JScrollPane scrollPane1;
    private JTable tablaEstudiantes;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on


}
