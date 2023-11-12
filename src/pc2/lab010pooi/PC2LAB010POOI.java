package pc2.lab010pooi;
import pc2.lab010pooi.Medico;
import pc2.lab010pooi.Paciente;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import static pc2.lab010pooi.Paciente.mostrarListaPacientes;

public class PC2LAB010POOI {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        ArrayList<Paciente> ListaPacientes = new ArrayList<>();

        Paciente paciente1 = new Paciente(70500123, "Samuel", "Av. Canada", 70.0, 26.4);
        Paciente paciente2 = new Paciente(60500123, "Diesel", "Av. 28 de Julio", 93.2, 30.4);
        Paciente paciente3 = new Paciente(70330123, "Javier", "Av. Canevaro", 70.0, 27.4);
        Paciente paciente4 = new Paciente(70506723, "Zepol", "Av. Arequipa", 87.2, 40.4);
        Paciente paciente5 = new Paciente(82500123, "Alfredo", "Av. Brasil", 80.2, 28.4);

        ListaPacientes.add(paciente1);
        ListaPacientes.add(paciente2);
        ListaPacientes.add(paciente3);
        ListaPacientes.add(paciente4);
        ListaPacientes.add(paciente5);

        ArrayList<Medico> ListaMedicos = new ArrayList<>();

        Medico medico1 = new Medico(241928, "Perez", "Cardiologia");
        Medico medico2 = new Medico(035672, "Gomez", "Psicologia");
        Medico medico3 = new Medico(241928, "Martinez", "Oftalmologia");
        Medico medico4 = new Medico(035672, "Lopez", "Dermatologia");
        Medico medico5 = new Medico(241928, "Meneses", "Podologia");

        ListaMedicos.add(medico1);
        ListaMedicos.add(medico2);
        ListaMedicos.add(medico3);
        ListaMedicos.add(medico4);
        ListaMedicos.add(medico5);

        int opcion;

        System.out.println("** BIENVENIDOS AL SISTEMA DE GESTION DE PACIENTES **");

        do {
            System.out.println("1-Eliminar los datos de un paciente dado su posicion una lista");
            System.out.println("2-Modificar los datos de un paciente de la lista");
            System.out.println("3-Mostrar el peso que mas se repite en la lista.");
            System.out.println("4-Mostrar los pacientes que tienen el peso que más se repite");
            System.out.println("5-Mostrar el peso mayor y menor.");
            System.out.println("6-Rango de pesos");
            System.out.println("7-Mostrar la lista de pacientes");
            System.out.println("8-Ver de un paciente el doctor asignado");
            System.out.println("9-Registrar los datos de los pacientes uno a uno");
            System.out.println("10-Encontrar doctores por especialidad");
            System.out.println("11-Salir del programa");
            System.out.print("¿QUE ACTIVIDAD DESEA EJECUTAR? ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Ingrese la posicion que quiere eliminar: ");
                    int posicionEliminar = scanner.nextInt();

                    if (posicionEliminar >= 0 && posicionEliminar < ListaPacientes.size()) {

                        ListaPacientes.remove(posicionEliminar);
                        System.out.println("Lista actual: ");
                        mostrarListaPacientes(ListaPacientes);
                    } else {
                        System.out.println("Paciente no encontrado");
                    }

                    break;
                case 2:

                    System.out.print("Ingrese la posicion del paciente que desea modificar: ");
                    int posicionModificar = scanner.nextInt();

                    if (posicionModificar >= 0 && posicionModificar < ListaPacientes.size()) {
                        Paciente pacienteModificar = ListaPacientes.get(posicionModificar);

                        System.out.println("Datos actuales del paciente:");
                        System.out.println("Nombre: " + pacienteModificar.getNombre());
                        System.out.println("Direccion: " + pacienteModificar.getDireccion());
                        System.out.println("Peso: " + pacienteModificar.getPeso());
                        System.out.println("Temperatura: " + pacienteModificar.getTemperatura());

                        System.out.println("Ingrese los datos del paciente:");

                        System.out.print("Nombre: ");
                        String nuevoNombre = scanner.next();
                        pacienteModificar.setNombre(nuevoNombre);

                        System.out.print("Direccion: ");
                        String nuevaDireccion = scanner.next();
                        pacienteModificar.setDireccion(nuevaDireccion);

                        System.out.print("Peso: ");
                        double nuevoPeso = scanner.nextDouble();
                        pacienteModificar.setPeso(nuevoPeso);

                        System.out.print("Temperatura: ");
                        double nuevaTemperatura = scanner.nextDouble();
                        pacienteModificar.setTemperatura(nuevaTemperatura);

                        System.out.println("Datos ingresados:");
                        System.out.println("Nombre: " + pacienteModificar.getNombre());
                        System.out.println("Direccion: " + pacienteModificar.getDireccion());
                        System.out.println("Peso: " + pacienteModificar.getPeso());
                        System.out.println("Temperatura: " + pacienteModificar.getTemperatura());

                    } else {
                        System.out.println("Indice no valido. No se puede modificar el paciente.");
                    }

                    break;

                case 3:
                    Map<Double, Integer> frecuenciaPesos3 = new HashMap<>();

                    for (Paciente paciente : ListaPacientes) {
                        double pesoActual = paciente.getPeso();
                        frecuenciaPesos3.put(pesoActual, frecuenciaPesos3.getOrDefault(pesoActual, 0) + 1);
                    }

                    double pesoMasRepetido3 = 0;
                    int frecuenciaMaxima3 = 0;

                    for (Map.Entry<Double, Integer> entry : frecuenciaPesos3.entrySet()) {
                        if (entry.getValue() > frecuenciaMaxima3) {
                            pesoMasRepetido3 = entry.getKey();
                            frecuenciaMaxima3 = entry.getValue();
                        }
                    }

                    System.out.println("El peso que más se repite entre los pacientes es: " + pesoMasRepetido3);
                    System.out.println("Frecuencia: " + frecuenciaMaxima3);

                    break;

                case 4:
                    Map<Double, Integer> frecuenciaPesos = new HashMap<>();

                    for (Paciente paciente : ListaPacientes) {
                        double pesoActual = paciente.getPeso();
                        frecuenciaPesos.put(pesoActual, frecuenciaPesos.getOrDefault(pesoActual, 0) + 1);
                    }

                    double pesoMasRepetido = 0;
                    int frecuenciaMaxima = 0;

                    for (Map.Entry<Double, Integer> entry : frecuenciaPesos.entrySet()) {
                        if (entry.getValue() > frecuenciaMaxima) {
                            pesoMasRepetido = entry.getKey();
                            frecuenciaMaxima = entry.getValue();
                        }
                    }

                    System.out.println("El peso que mas se repite en la lista es: " + pesoMasRepetido);
                    System.out.println("Frecuencia: " + frecuenciaMaxima);

                    int cantidadPacientesPesoRepetido = 0;

                    for (Paciente paciente : ListaPacientes) {
                        if (paciente.getPeso() == pesoMasRepetido) {
                            cantidadPacientesPesoRepetido++;
                        }
                    }

                    System.out.println("Cantidad de pacientes con el peso que mas se repite: " + cantidadPacientesPesoRepetido);

                    break;

                case 5:
                    double pesoMayor = Double.MIN_VALUE;
                    double pesoMenor = Double.MAX_VALUE;
                    String nombrePesoMayor = "";
                    String nombrePesoMenor = "";

                    for (Paciente paciente : ListaPacientes) {
                        double pesoActual = paciente.getPeso();

                        if (pesoActual > pesoMayor) {
                            pesoMayor = pesoActual;
                            nombrePesoMayor = paciente.getNombre();
                        }

                        if (pesoActual < pesoMenor) {
                            pesoMenor = pesoActual;
                            nombrePesoMenor = paciente.getNombre();
                        }
                    }

                    System.out.println("Paciente con el mayor peso:");
                    System.out.println("Nombre: " + nombrePesoMayor);
                    System.out.println("Peso: " + pesoMayor);

                    System.out.println("Paciente con el menor peso:");
                    System.out.println("Nombre: " + nombrePesoMenor);
                    System.out.println("Peso: " + pesoMenor);

                    break;
                case 6:

                    double pesoMinimo = Double.MAX_VALUE;
                    double pesoMaximo = Double.MIN_VALUE;

                    
                    for (Paciente paciente : ListaPacientes) {
                        double pesoActual = paciente.getPeso();
                        if (pesoActual < pesoMinimo) {
                            pesoMinimo = pesoActual;
                        }
                        if (pesoActual > pesoMaximo) {
                            pesoMaximo = pesoActual;
                        }
                    }

                    
                    double rango1 = pesoMinimo + ((pesoMaximo - pesoMinimo) / 4);
                    double rango2 = rango1 + ((pesoMaximo - pesoMinimo) / 4);
                    double rango3 = rango2 + ((pesoMaximo - pesoMinimo) / 4);

                    
                    int cantidadRango1 = 0;
                    int cantidadRango2 = 0;
                    int cantidadRango3 = 0;
                    int cantidadRango4 = 0;

                    for (Paciente paciente : ListaPacientes) {
                        double pesoActual = paciente.getPeso();

                        if (pesoActual <= rango1) {
                            cantidadRango1++;
                        } else if (pesoActual <= rango2) {
                            cantidadRango2++;
                        } else if (pesoActual <= rango3) {
                            cantidadRango3++;
                        } else {
                            cantidadRango4++;
                        }
                    }

                    
                    System.out.println("Rango 1 (" + pesoMinimo + " - " + rango1 + "): " + cantidadRango1 + " personas");
                    System.out.println("Rango 2 (" + rango1 + " - " + rango2 + "): " + cantidadRango2 + " personas");
                    System.out.println("Rango 3 (" + rango2 + " - " + rango3 + "): " + cantidadRango3 + " personas");
                    System.out.println("Rango 4 (" + rango3 + " - " + pesoMaximo + "): " + cantidadRango4 + " personas");

                    break;

                case 7:

                    Collections.sort(ListaPacientes, (p1, p2) -> p1.getNombre().compareToIgnoreCase(p2.getNombre()));
                    mostrarListaPacientes(ListaPacientes);
                    break;

                case 8:
                    if (ListaPacientes.size() > 0) {
                        for (int i = 0; i < ListaPacientes.size(); i++) {
                            Paciente pacienteActual = ListaPacientes.get(i);
                            Medico medicoAsignado = ListaMedicos.get(i % ListaMedicos.size());  
                            pacienteActual.asignarMedico(medicoAsignado);
                            System.out.println("Medico asignado al paciente " + pacienteActual.getNombre() + ": " + medicoAsignado.getNombre());
                        }
                    }

                    System.out.println("Medico asignado a cada paciente:");
                    for (Paciente paciente : ListaPacientes) {
                        System.out.println("Nombre del Paciente: " + paciente.getNombre());
                        System.out.println("Nombre del Medico Asignado: " + (paciente.getMedicoAsignado() != null
                                ? paciente.getMedicoAsignado().getNombre()
                                : "No asignado"));
                        System.out.println("------------");
                    }
                    break;

                case 9:
                    System.out.println("Ingrese los datos del nuevo paciente:");

                    System.out.print("DNI: ");
                    int nuevoDNI = scanner.nextInt();

                    System.out.print("Nombre: ");
                    String nuevoNombre = scanner.next();

                    System.out.print("Direccion: ");
                    String nuevaDireccion = scanner.next();

                    System.out.print("Peso: ");
                    double nuevoPeso = scanner.nextDouble();

                    System.out.print("Temperatura: ");
                    double nuevaTemperatura = scanner.nextDouble();

                    Paciente nuevoPaciente = new Paciente(nuevoDNI, nuevoNombre, nuevaDireccion, nuevoPeso, nuevaTemperatura);
                    ListaPacientes.add(nuevoPaciente);

                    System.out.println("Nuevo paciente registrado con exito:");
                    System.out.println("Nombre: " + nuevoPaciente.getNombre());
                    System.out.println("Direccion: " + nuevoPaciente.getDireccion());
                    System.out.println("Peso: " + nuevoPaciente.getPeso());
                    System.out.println("Temperatura: " + nuevoPaciente.getTemperatura());

                    break;

                case 10:
                    System.out.println("Ingrese la especialidad a buscar:");
                    String especialidadBuscada = scanner.next().toLowerCase();

                    System.out.println("Medicos con la especialidad '" + especialidadBuscada + "':");
                    boolean encontrado = false;

                    for (Medico medico : ListaMedicos) {
                        if (medico.getEspecialidad().toLowerCase().equals(especialidadBuscada)) {
                            
                            System.out.println("Nombre: " + medico.getNombre());
                            System.out.println("Especialidad: " + medico.getEspecialidad());
                            System.out.println("------------");
                            encontrado = true;
                        }
                    }

                    if (!encontrado) {
                        System.out.println("No se encontraron médicos con la especialidad '" + especialidadBuscada + "'.");
                    }
                    break;

                case 11:
                    System.out.println("Saliendo del programa.");
                    break;

                default:
                    System.out.println("Opción no valida. Intente de nuevo.");
                    break;
            }

            if (opcion != 11) {
                System.out.print("¿DESEA INGRESAR OTRA OPCION? (1-SI, 0-NO): ");
                int continuar = scanner.nextInt();
                if (continuar != 1) {
                    opcion = 11;
                }
            }
        } while (opcion != 11);
    }
}
