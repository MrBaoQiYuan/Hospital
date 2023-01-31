public class Paciente {

    private int numPaciente;
    private int edad;
    private String sintomas;

    public Paciente(int numPaciente, int edad, String sintomas) {
        this.numPaciente = numPaciente;
        this.edad = edad;
        this.sintomas = sintomas;
    }

    public int getNumPaciente() {
        return numPaciente;
    }

    public void setNumPaciente(int numPaciente) {
        this.numPaciente = numPaciente;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getSintomas() {
        return sintomas;
    }

    public void setSintomas(String sintomas) {
        this.sintomas = sintomas;
    }

    @Override
    public String toString() {
        return "El Paciente " + numPaciente + ", de "
               + edad + " años, tiene: " + sintomas;
    }
}
