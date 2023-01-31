import java.util.ArrayList;

public class MedicoAtencionPrimaria extends Medico{
    int aniosExperiencia;
    String especialidad;
    ArrayList <Paciente> listadoPacientes;

    public MedicoAtencionPrimaria(int numColegiado, int aniosExperiencia, EspecialidadesMedicas especialidad) {
        super(numColegiado, null);
        this.aniosExperiencia = aniosExperiencia;
        this.especialidad = String.valueOf(EspecialidadesMedicas.ATENCIONPRIMARIA);
        this.listadoPacientes = new ArrayList<>();
    }

    public int getNumColegiado() {
        return numColegiado;
    }

    public void setNumColegiado(int numColegiado) {
        this.numColegiado = numColegiado;
    }

    public int getAniosExperiencia() {
        return aniosExperiencia;
    }

    public void setAniosExperiencia(int aniosExperiencia) {
        this.aniosExperiencia = aniosExperiencia;
    }

    public ArrayList<Paciente> getListaPacientes() {
        return listadoPacientes;
    }

    public void setListaPacientes(ArrayList<Paciente> listaPacientes) {
        this.listadoPacientes = listaPacientes;
    }


    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public void setListadoPacientes(ArrayList<Paciente> listadoPacientes) {
        this.listadoPacientes = listadoPacientes;
    }

    @Override
    public void setPaciente (Paciente paciente){
        this.paciente = paciente;
    }

    @Override
    public String toString() {
        return "MedicoAtencionPrimaria{" +
                "aniosExperiencia=" + aniosExperiencia +
                ", especialidad='" + especialidad + '\'' +
                ", listadoPacientes=" + listadoPacientes +
                ", numColegiado=" + numColegiado +
                ", paciente=" + paciente +
                '}';
    }
}
