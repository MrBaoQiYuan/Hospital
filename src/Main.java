import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Hospital hospital1 = new Hospital("Hospital la Paz");
/*
        MedicoAtencionPrimaria medicoAtencionPrimaria1 = new MedicoAtencionPrimaria(26246, 15, EspecialidadesMedicas.ATENCIONPRIMARIA);
        Paciente paciente1 = new Paciente(252525, 37, "asma");
        MedicoEspecialista medico2 = new MedicoEspecialista(135, EspecialidadesMedicas.CARDIOLOGIA);
*/

        Scanner input = new Scanner(System.in);
        System.out.println("Bienvenido al Hospital. ");
        boolean programaApagado = false;
        while (!programaApagado) {
            opcionesMenu();
        int opciones = input.nextInt();
            switch (opciones) {
                case 1 -> hospital1.ingresarPaciente();
                case 2 -> hospital1.urgenciaMultiplesPacientes();
                case 3 -> hospital1.listadoPacientes();
                case 4 -> hospital1.listadoPacientesUrgencias();
                case 5 -> hospital1.contratarMedico();
                case 6 -> hospital1.listadoMedicos();
                case 7 -> hospital1.asignarPacienteAMedico();
                case 8 -> {
                    programaApagado = true;
                    System.out.println("Ya tiene su alta medica. Esperemos que se recupere lo antes posible");
                }
            }
        }
    }

    private static void opcionesMenu() {
        System.out.println("Elija una opcion:  " +
                    "\nOpcion 1: Atencion primaria a paciente" +
                    "\nOpcion 2: Pacientes de urgencias." +
                    "\nOpcion 3: Listado de pacientes del hospital" +
                    "\nOpcion 4: Listado de pacientes en urgencias" +
                    "\nOpcion 5: Contratar medico para hospital" +
                    "\nOpcion 6: Listado de medicos del hospital" +
                    "\nOpcion 7: Asignar medico a un paciente" +
                    "\nOpcion 8: Salir del programa.");

    }
}

