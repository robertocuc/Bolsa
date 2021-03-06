package mx.unam.ciencias.is.modelo;
// Generated 20/02/2018 02:12:22 PM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Empresa generated by hbm2java
 */
public class Empresa  implements java.io.Serializable {


     private int idEmpresa;
     private String nombre;
     private String presidente;
     private String oficinas;
     private String fundacion;
     private Integer numeroEmpleados;
     private String contacto;
     private Set vacantes = new HashSet(0);

    public Empresa() {
    }

	
    public Empresa(int idEmpresa) {
        this.idEmpresa = idEmpresa;
    }
    public Empresa(int idEmpresa, String nombre, String presidente, String oficinas, String fundacion, Integer numeroEmpleados, String contacto, Set vacantes) {
       this.idEmpresa = idEmpresa;
       this.nombre = nombre;
       this.presidente = presidente;
       this.oficinas = oficinas;
       this.fundacion = fundacion;
       this.numeroEmpleados = numeroEmpleados;
       this.contacto = contacto;
       this.vacantes = vacantes;
    }
   
    public int getIdEmpresa() {
        return this.idEmpresa;
    }
    
    public void setIdEmpresa(int idEmpresa) {
        this.idEmpresa = idEmpresa;
    }
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getPresidente() {
        return this.presidente;
    }
    
    public void setPresidente(String presidente) {
        this.presidente = presidente;
    }
    public String getOficinas() {
        return this.oficinas;
    }
    
    public void setOficinas(String oficinas) {
        this.oficinas = oficinas;
    }
    public String getFundacion() {
        return this.fundacion;
    }
    
    public void setFundacion(String fundacion) {
        this.fundacion = fundacion;
    }
    public Integer getNumeroEmpleados() {
        return this.numeroEmpleados;
    }
    
    public void setNumeroEmpleados(Integer numeroEmpleados) {
        this.numeroEmpleados = numeroEmpleados;
    }
    public String getContacto() {
        return this.contacto;
    }
    
    public void setContacto(String contacto) {
        this.contacto = contacto;
    }
    public Set getVacantes() {
        return this.vacantes;
    }
    
    public void setVacantes(Set vacantes) {
        this.vacantes = vacantes;
    }




}


