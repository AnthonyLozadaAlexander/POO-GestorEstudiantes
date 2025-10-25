/*
 * Created by JFormDesigner on Fri Oct 24 17:50:37 ECT 2025
 */

package GestorEstudiantes;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
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

    private void btnIngresar(ActionEvent e) {
        // TODO add your code here
    }

    private void btnModificar(ActionEvent e) {
        // TODO add your code here
    }

    private void btnEliminar(ActionEvent e) {
        // TODO add your code here
    }

    private void btnBuscar(ActionEvent e) {
        // TODO add your code here
    }


    private void initComponents() {

        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        // Generated using JFormDesigner Educational license - Daniel Sanchez (Anthony Lozada)
        panelTitulo = new JPanel();
        label1 = new JLabel();
        panelDatos = new JPanel();
        label2 = new JLabel();
        txtDatos = new JTextField();
        label3 = new JLabel();
        label4 = new JLabel();
        txtCedula = new JTextField();
        txtNombres = new JTextField();
        scrollPane1 = new JScrollPane();
        tablaEstudiantes = new JTable();
        scrollPane2 = new JScrollPane();
        txtResultados = new JTextArea();
        panelBotones = new JPanel();
        btnIngresar = new JButton();
        btnModificar = new JButton();
        btnEliminar = new JButton();
        btnBuscar = new JButton();

        //======== this ========
        setName("this");
        var contentPane = getContentPane();

        //======== panelTitulo ========
        {
            panelTitulo.setBackground(new Color(0xffffe3));
            panelTitulo.setName("panelTitulo");

            //---- label1 ----
            label1.setText("Gestion De Estudiantes");
            label1.setFont(new Font("CaskaydiaMono NF SemiBold", Font.PLAIN, 20));
            label1.setName("label1");

            GroupLayout panelTituloLayout = new GroupLayout(panelTitulo);
            panelTitulo.setLayout(panelTituloLayout);
            panelTituloLayout.setHorizontalGroup(
                panelTituloLayout.createParallelGroup()
                    .addGroup(panelTituloLayout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(label1, GroupLayout.PREFERRED_SIZE, 265, GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(731, Short.MAX_VALUE))
            );
            panelTituloLayout.setVerticalGroup(
                panelTituloLayout.createParallelGroup()
                    .addGroup(GroupLayout.Alignment.TRAILING, panelTituloLayout.createSequentialGroup()
                        .addContainerGap(32, Short.MAX_VALUE)
                        .addComponent(label1, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22))
            );
        }

        //======== panelDatos ========
        {
            panelDatos.setName("panelDatos");

            //---- label2 ----
            label2.setText("Datos:");
            label2.setFont(new Font("CaskaydiaMono NF SemiBold", Font.PLAIN, 17));
            label2.setName("label2");

            //---- txtDatos ----
            txtDatos.setName("txtDatos");

            //---- label3 ----
            label3.setText("ID/Cedula:");
            label3.setFont(new Font("CaskaydiaMono NF SemiBold", Font.PLAIN, 17));
            label3.setName("label3");

            //---- label4 ----
            label4.setText("Nombres:");
            label4.setFont(new Font("CaskaydiaMono NF SemiBold", Font.PLAIN, 17));
            label4.setName("label4");

            //---- txtCedula ----
            txtCedula.setName("txtCedula");

            //---- txtNombres ----
            txtNombres.setName("txtNombres");

            GroupLayout panelDatosLayout = new GroupLayout(panelDatos);
            panelDatos.setLayout(panelDatosLayout);
            panelDatosLayout.setHorizontalGroup(
                panelDatosLayout.createParallelGroup()
                    .addGroup(panelDatosLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(panelDatosLayout.createParallelGroup()
                            .addGroup(GroupLayout.Alignment.TRAILING, panelDatosLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(label2, GroupLayout.PREFERRED_SIZE, 90, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtDatos, GroupLayout.PREFERRED_SIZE, 232, GroupLayout.PREFERRED_SIZE)
                                .addGap(2, 2, 2))
                            .addGroup(panelDatosLayout.createSequentialGroup()
                                .addComponent(label3, GroupLayout.PREFERRED_SIZE, 112, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtCedula, GroupLayout.PREFERRED_SIZE, 231, GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelDatosLayout.createSequentialGroup()
                                .addComponent(label4, GroupLayout.PREFERRED_SIZE, 112, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtNombres)))
                        .addGap(42, 42, 42))
            );
            panelDatosLayout.setVerticalGroup(
                panelDatosLayout.createParallelGroup()
                    .addGroup(GroupLayout.Alignment.TRAILING, panelDatosLayout.createSequentialGroup()
                        .addContainerGap(15, Short.MAX_VALUE)
                        .addGroup(panelDatosLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(label2, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDatos, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panelDatosLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(label3, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCedula, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelDatosLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                            .addComponent(label4, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNombres, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                        .addGap(14, 14, 14))
            );
        }

        //======== scrollPane1 ========
        {
            scrollPane1.setName("scrollPane1");

            //---- tablaEstudiantes ----
            tablaEstudiantes.setModel(new DefaultTableModel(2, 0));
            tablaEstudiantes.setName("tablaEstudiantes");
            scrollPane1.setViewportView(tablaEstudiantes);
        }

        //======== scrollPane2 ========
        {
            scrollPane2.setName("scrollPane2");

            //---- txtResultados ----
            txtResultados.setName("txtResultados");
            scrollPane2.setViewportView(txtResultados);
        }

        //======== panelBotones ========
        {
            panelBotones.setName("panelBotones");

            //---- btnIngresar ----
            btnIngresar.setText("Ingresar");
            btnIngresar.setFont(new Font("CaskaydiaMono NF SemiBold", Font.PLAIN, 14));
            btnIngresar.setName("btnIngresar");
            btnIngresar.addActionListener(e -> btnIngresar(e));

            //---- btnModificar ----
            btnModificar.setText("Modificar");
            btnModificar.setFont(new Font("CaskaydiaMono NF SemiBold", Font.PLAIN, 14));
            btnModificar.setName("btnModificar");
            btnModificar.addActionListener(e -> btnModificar(e));

            //---- btnEliminar ----
            btnEliminar.setText("Eliminar");
            btnEliminar.setFont(new Font("CaskaydiaMono NF SemiBold", Font.PLAIN, 14));
            btnEliminar.setName("btnEliminar");
            btnEliminar.addActionListener(e -> btnEliminar(e));

            //---- btnBuscar ----
            btnBuscar.setText("Buscar");
            btnBuscar.setFont(new Font("CaskaydiaMono NF SemiBold", Font.PLAIN, 14));
            btnBuscar.setName("btnBuscar");
            btnBuscar.addActionListener(e -> btnBuscar(e));

            GroupLayout panelBotonesLayout = new GroupLayout(panelBotones);
            panelBotones.setLayout(panelBotonesLayout);
            panelBotonesLayout.setHorizontalGroup(
                panelBotonesLayout.createParallelGroup()
                    .addGroup(panelBotonesLayout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addGroup(panelBotonesLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnIngresar, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnBuscar, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(panelBotonesLayout.createParallelGroup()
                            .addComponent(btnModificar, GroupLayout.Alignment.TRAILING)
                            .addComponent(btnEliminar, GroupLayout.Alignment.TRAILING))
                        .addGap(95, 95, 95))
            );
            panelBotonesLayout.setVerticalGroup(
                panelBotonesLayout.createParallelGroup()
                    .addGroup(panelBotonesLayout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(panelBotonesLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(btnIngresar)
                            .addComponent(btnModificar))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panelBotonesLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(btnEliminar)
                            .addComponent(btnBuscar))
                        .addContainerGap(43, Short.MAX_VALUE))
            );
        }

        GroupLayout contentPaneLayout = new GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addGap(12, 12, 12)
                    .addGroup(contentPaneLayout.createParallelGroup()
                        .addComponent(panelDatos, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addComponent(panelBotones, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(contentPaneLayout.createParallelGroup()
                        .addComponent(scrollPane1, GroupLayout.PREFERRED_SIZE, 594, GroupLayout.PREFERRED_SIZE)
                        .addComponent(scrollPane2))
                    .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(GroupLayout.Alignment.TRAILING, contentPaneLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(panelTitulo, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        );
        contentPaneLayout.setVerticalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(GroupLayout.Alignment.TRAILING, contentPaneLayout.createSequentialGroup()
                    .addComponent(panelTitulo, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(contentPaneLayout.createParallelGroup()
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addComponent(scrollPane1, GroupLayout.PREFERRED_SIZE, 328, GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(scrollPane2, GroupLayout.PREFERRED_SIZE, 211, GroupLayout.PREFERRED_SIZE))
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addGap(43, 43, 43)
                            .addComponent(panelDatos, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(panelBotones, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
                    .addContainerGap(26, Short.MAX_VALUE))
        );
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
    // Generated using JFormDesigner Educational license - Daniel Sanchez (Anthony Lozada)
    private JPanel panelTitulo;
    private JLabel label1;
    private JPanel panelDatos;
    private JLabel label2;
    private JTextField txtDatos;
    private JLabel label3;
    private JLabel label4;
    private JTextField txtCedula;
    private JTextField txtNombres;
    private JScrollPane scrollPane1;
    private JTable tablaEstudiantes;
    private JScrollPane scrollPane2;
    private JTextArea txtResultados;
    private JPanel panelBotones;
    private JButton btnIngresar;
    private JButton btnModificar;
    private JButton btnEliminar;
    private JButton btnBuscar;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on


}
