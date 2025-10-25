package main;

import GestorEstudiantes.FormEstudiantes;

import javax.swing.*;

public class run {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            // Configurar el tema FlatLaf antes de crear el formulario
            try {
                // Opciones de themes disponibles:
                // FlatLightLaf - Tema claro
                // FlatDarkLaf - Tema oscuro
                // FlatIntelliJLaf - Tema estilo IntelliJ claro
                // FlatDarculaLaf - Tema estilo Darcula oscuro
                UIManager.setLookAndFeel(new com.formdev.flatlaf.FlatIntelliJLaf());
            } catch (Exception ex) {
                System.err.println("Error al configurar el tema: " + ex.getMessage());
            }

            FormEstudiantes form = new FormEstudiantes();
            form.setVisible(true);
        });
    }
}
