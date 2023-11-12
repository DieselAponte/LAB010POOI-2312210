
package pc2.lab010pooi;

public class Medico {
    int nroColegiatura;
    String nombre;
    String especialidad;

    public Medico(int nroColegiatura, String nombre, String especialidad) {
        this.nroColegiatura = nroColegiatura;
        this.nombre = nombre;
        this.especialidad = especialidad;
    }

    public int getNroColegiatura() {
        return nroColegiatura;
    }

    public void setNroColegiatura(int nroColegiatura) {
        this.nroColegiatura = nroColegiatura;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }
     
    
}