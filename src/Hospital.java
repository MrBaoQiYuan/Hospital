
import java.util.ArrayList;
import java.util.Scanner;

public class Hospital {
    Scanner input = new Scanner(System.in).useDelimiter("\n");
    String nombre;
    ArrayList<Paciente> listaPacientes;
    ArrayList<Paciente>listaPacientesUrgencias;
    ArrayList<MedicoAtencionPrimaria> listaMedicoAtencionPrimarias;
    ArrayList<MedicoEspecialista> listaMedicoEspecialista;

    public Hospital(String nombre) {
        this.nombre = nombre;
        this.listaPacientes = new ArrayList<>();
        this.listaPacientesUrgencias = new ArrayList<>();
        this.listaMedicoAtencionPrimarias = new ArrayList<>();
        this.listaMedicoEspecialista = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void ingresarPaciente() {
        System.out.println("Cual es el numero de paciente?");
        int numPaciente = input.nextInt();
        System.out.println("¿Cual es la edad del paciente?");
        int edad = input.nextInt();
        System.out.println("Cuales son los sintomas?");
        String sintomas = input.next();
        listaPacientes.add(new Paciente(numPaciente, edad, sintomas));
    }

    public void urgenciaMultiplesPacientes() {
        System.out.println("¿Cuantos pacientes son?");
        int cantidadPacientes = input.nextInt();
        for (int i = 0; i < cantidadPacientes; i++){
            System.out.println("Cual es el numero de paciente?");
            int numPaciente = input.nextInt();
            System.out.println("¿Cual es la edad del paciente?");
            int edad = input.nextInt();
            System.out.println("Cuales son los sintomas?");
            String sintomas = input.next();
            listaPacientes.add(new Paciente(numPaciente, edad, sintomas));
            listaPacientesUrgencias.add(new Paciente(numPaciente, edad, sintomas));
        }
    }
    public void listadoPacientes() {
        System.out.println("Pacientes del hospital");
        for(Paciente e: listaPacientes){
            System.out.println(e.toString());
        }
    }
    public void listadoPacientesUrgencias() {
        System.out.println("Pacientes en Urgencias");
        for(Paciente e: listaPacientesUrgencias) {
            System.out.println(e.toString());
        }
    }

    public void contratarMedico() {
        System.out.println("¿A que tipo de medico deseas acudir?" +
                "\nOpcion 20: Medico de cabecera." +
                "\nOpcion 21: Medico especialista.");
        int contratarMedico = input.nextInt();
        switch (contratarMedico) {
            case 20 -> {
                System.out.println("¿Cual es el numero de colegiado del medico?");
                int numColegiado = input.nextInt();
                System.out.println("¿Cuantos años de experiencia tiene?");
                int aniosExperiencia = input.nextInt();
                listaMedicoAtencionPrimarias.add(new MedicoAtencionPrimaria(numColegiado, aniosExperiencia, EspecialidadesMedicas.ATENCIONPRIMARIA));
            }
            case 21 -> {
                System.out.println("¿Cual es el numero de colegiado del medico?");
                int numColegiado2 = input.nextInt();
                System.out.println("¿Cual es la especialidad medica?");
                EspecialidadesMedicas especialidad = EspecialidadesMedicas.valueOf(input.next());
                listaMedicoEspecialista.add(new MedicoEspecialista(2, especialidad));
            }
        }
    }

    public void listadoMedicos() {
        for(MedicoAtencionPrimaria e: listaMedicoAtencionPrimarias){
            System.out.println(e.toString());
        }
    }
    public void asignarPacienteAMedico() {
        System.out.println("Que paciente quieres elegir?. Introduzca su numero de paciente");
        int numPaciente = input.nextInt();
        System.out.println("¿Que medico deseas visitar?");
        int numColegiadoMedico = input.nextInt();
        for (Paciente e : listaPacientes) {
            if (numPaciente == e.getNumPaciente()) {
                for (MedicoAtencionPrimaria f : listaMedicoAtencionPrimarias) {
                    if (numColegiadoMedico == f.getNumColegiado()) {
                        f.setPaciente(e);
                        System.out.println("El paciente numero " + e.getNumPaciente() + "esta tratado por el medico " + f.getNumColegiado());
                    }
                }
            }
        }

    }
}
