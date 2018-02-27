package mx.unam.ciencias.is.modelo;
// Generated 20/02/2018 02:12:22 PM by Hibernate Tools 4.3.1



/**
 * SkillsId generated by hbm2java
 */
public class SkillsId  implements java.io.Serializable {


     private int idProfesionista;
     private String nombre;
     private String grado;

    public SkillsId() {
    }

    public SkillsId(int idProfesionista, String nombre, String grado) {
       this.idProfesionista = idProfesionista;
       this.nombre = nombre;
       this.grado = grado;
    }
   
    public int getIdProfesionista() {
        return this.idProfesionista;
    }
    
    public void setIdProfesionista(int idProfesionista) {
        this.idProfesionista = idProfesionista;
    }
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getGrado() {
        return this.grado;
    }
    
    public void setGrado(String grado) {
        this.grado = grado;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof SkillsId) ) return false;
		 SkillsId castOther = ( SkillsId ) other; 
         
		 return (this.getIdProfesionista()==castOther.getIdProfesionista())
 && ( (this.getNombre()==castOther.getNombre()) || ( this.getNombre()!=null && castOther.getNombre()!=null && this.getNombre().equals(castOther.getNombre()) ) )
 && ( (this.getGrado()==castOther.getGrado()) || ( this.getGrado()!=null && castOther.getGrado()!=null && this.getGrado().equals(castOther.getGrado()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + this.getIdProfesionista();
         result = 37 * result + ( getNombre() == null ? 0 : this.getNombre().hashCode() );
         result = 37 * result + ( getGrado() == null ? 0 : this.getGrado().hashCode() );
         return result;
   }   


}


