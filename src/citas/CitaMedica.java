/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citas;

import java.util.Date;

/**
 *
 * @author Liliana
 */
public class CitaMedica {
   //Atributos
    private int nroCita;
    private Date fechaCita;
    private String nomPaciente;
    private String nomMedico;
    private String diagnostico;
    
  //Métodos Constructores

    public CitaMedica() {
    }

    public CitaMedica(int nroCita, Date fechaCita, String nomPaciente, String nomMedico, String diagnostico) {
        this.nroCita = nroCita;
        this.fechaCita = fechaCita;
        this.nomPaciente = nomPaciente;
        this.nomMedico = nomMedico;
        this.diagnostico = diagnostico;
    }
    
    //Métodos getter/setter

    public int getNroCita() {
        return nroCita;
    }

    public void setNroCita(int nroCita) {
        this.nroCita = nroCita;
    }

    public Date getFechaCita() {
        return fechaCita;
    }

    public void setFechaCita(Date fechaCita) {
        this.fechaCita = fechaCita;
    }

    public String getNomPaciente() {
        return nomPaciente;
    }

    public void setNomPaciente(String nomPaciente) {
        this.nomPaciente = nomPaciente;
    }

    public String getNomMedico() {
        return nomMedico;
    }

    public void setNomMedico(String nomMedico) {
        this.nomMedico = nomMedico;
    }

    public String getDiagnostico() {
        return diagnostico;
    }

    public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }
    
    public String consultarCitaMedica(){
        return "Nro Cita: " + nroCita + " Fecha Cita: " + fechaCita + " Nombre Médico " + nomMedico;
    }
            
    
    
}
