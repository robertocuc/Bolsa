package mx.unam.ciencias.is.modelo;
// Generated 20/02/2018 02:12:22 PM by Hibernate Tools 4.3.1



/**
 * FormacionAcademica generated by hbm2java
 */
public class FormacionAcademica  implements java.io.Serializable {


     private FormacionAcademicaId id;
     private Profesionista profesionista;

    public FormacionAcademica() {
    }

    public FormacionAcademica(FormacionAcademicaId id, Profesionista profesionista) {
       this.id = id;
       this.profesionista = profesionista;
    }
   
    public FormacionAcademicaId getId() {
        return this.id;
    }
    
    public void setId(FormacionAcademicaId id) {
        this.id = id;
    }
    public Profesionista getProfesionista() {
        return this.profesionista;
    }
    
    public void setProfesionista(Profesionista profesionista) {
        this.profesionista = profesionista;
    }




}


