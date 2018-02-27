package mx.unam.ciencias.is.modelo;
// Generated 20/02/2018 02:12:22 PM by Hibernate Tools 4.3.1


import java.math.BigDecimal;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Vacante generated by hbm2java
 */
public class Vacante  implements java.io.Serializable {


     private int idVacante;
     private Empresa empresa;
     private String descripcion;
     private String actividades;
     private BigDecimal salario;
     private String lugar;
     private Date horario;
     private String puesto;
     private Set profesionistas = new HashSet(0);

    public Vacante() {
    }

	
    public Vacante(int idVacante) {
        this.idVacante = idVacante;
    }
    public Vacante(int idVacante, Empresa empresa, String descripcion, String actividades, BigDecimal salario, String lugar, Date horario, String puesto, Set profesionistas) {
       this.idVacante = idVacante;
       this.empresa = empresa;
       this.descripcion = descripcion;
       this.actividades = actividades;
       this.salario = salario;
       this.lugar = lugar;
       this.horario = horario;
       this.puesto = puesto;
       this.profesionistas = profesionistas;
    }
   
    public int getIdVacante() {
        return this.idVacante;
    }
    
    public void setIdVacante(int idVacante) {
        this.idVacante = idVacante;
    }
    public Empresa getEmpresa() {
        return this.empresa;
    }
    
    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }
    public String getDescripcion() {
        return this.descripcion;
    }
    
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public String getActividades() {
        return this.actividades;
    }
    
    public void setActividades(String actividades) {
        this.actividades = actividades;
    }
    public BigDecimal getSalario() {
        return this.salario;
    }
    
    public void setSalario(BigDecimal salario) {
        this.salario = salario;
    }
    public String getLugar() {
        return this.lugar;
    }
    
    public void setLugar(String lugar) {
        this.lugar = lugar;
    }
    public Date getHorario() {
        return this.horario;
    }
    
    public void setHorario(Date horario) {
        this.horario = horario;
    }
    public String getPuesto() {
        return this.puesto;
    }
    
    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }
    public Set getProfesionistas() {
        return this.profesionistas;
    }
    
    public void setProfesionistas(Set profesionistas) {
        this.profesionistas = profesionistas;
    }




}

