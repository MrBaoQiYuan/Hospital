public class Medico {
    int numColegiado;
    Paciente paciente;

    public Medico(int numColegiado, Paciente paciente) {
        this.numColegiado = numColegiado;
        this.paciente = paciente;
    }

    public int getNumColegiado() {
        return numColegiado;
    }

    public void setNumColegiado(int numColegiado) {
        this.numColegiado = numColegiado;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }
}
