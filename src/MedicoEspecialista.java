import java.util.ArrayList;

public class MedicoEspecialista extends Medico{

    EspecialidadesMedicas especialidad;
    ArrayList<Paciente> listadoPacientesEspecialista;

    public MedicoEspecialista(int numColegiado, EspecialidadesMedicas especialidad) {
        super(numColegiado, null);
        this.especialidad = especialidad;
        listadoPacientesEspecialista = new ArrayList<Paciente>();
    }
}

