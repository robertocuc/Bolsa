package mx.unam.ciencias.is.modelo;
// Generated 20/02/2018 02:12:22 PM by Hibernate Tools 4.3.1



/**
 * Skills generated by hbm2java
 */
public class Skills  implements java.io.Serializable {


     private SkillsId id;
     private Profesionista profesionista;

    public Skills() {
    }

    public Skills(SkillsId id, Profesionista profesionista) {
       this.id = id;
       this.profesionista = profesionista;
    }
   
    public SkillsId getId() {
        return this.id;
    }
    
    public void setId(SkillsId id) {
        this.id = id;
    }
    public Profesionista getProfesionista() {
        return this.profesionista;
    }
    
    public void setProfesionista(Profesionista profesionista) {
        this.profesionista = profesionista;
    }




}


