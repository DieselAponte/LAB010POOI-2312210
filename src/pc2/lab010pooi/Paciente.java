
package pc2.lab010pooi;

import java.util.ArrayList;


public class Paciente {
    int DNI;
    String nombre;
    String direccion;
    double peso;
    double temperatura;
    private Medico medicoAsignado;

    public Paciente(int DNI, String nombre, String direccion, double peso, double temperatura) {
        this.DNI = DNI;
        this.nombre = nombre;
        this.direccion = direccion;
        this.peso = peso;
        this.temperatura = temperatura;
        this.medicoAsignado = null;
    }

    public int getDNI() {
        return DNI;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public double getPeso() {
        return peso;
    }

    public double getTemperatura() {
        return temperatura;
    }

    public void setDNI(int DNI) {
        this.DNI = DNI;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setTemperatura(double temperatura) {
        this.temperatura = temperatura;
    }
    
    public static void mostrarListaPacientes(ArrayList<Paciente> lista) {
        for (Paciente paciente : lista) {
            System.out.println(paciente.getNombre());
        }
    }
    
    public Medico getMedicoAsignado() {
        return medicoAsignado;
    }
    
    public void asignarMedico(Medico medico) {
        this.medicoAsignado = medico;
    }
}