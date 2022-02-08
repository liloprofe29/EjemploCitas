/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citas;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Liliana
 */
public class Citas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CitaMedica citam = new CitaMedica();
        
        citam.setNroCita(Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de la cita: ")));
        citam.setNomPaciente(JOptionPane.showInputDialog("Ingrese el nombre del paciente: "));
        citam.setNomMedico(JOptionPane.showInputDialog("Ingrese el nombre del médico: "));
        citam.setDiagnostico(JOptionPane.showInputDialog("Ingrese el diagnostico del médico: "));

        String fecha = JOptionPane.showInputDialog("Ingrese nueva fecha de cita: (yyyy-mm-dd)");
        Date fechaN=null;
        SimpleDateFormat format = new SimpleDateFormat("yyyyMMdd");
        try {
            fechaN = format.parse(fecha);
        } catch (ParseException ex) {
            Logger.getLogger(Citas.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        citam.setFechaCita(fechaN);
        
        JOptionPane.showMessageDialog(null,citam.consultarCitaMedica());
    }
    
}
