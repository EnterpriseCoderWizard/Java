package registroshospital;

import java.util.ArrayList;
import java.util.List;

public class Pacientes {
    private int idPaciente;
    private String nombre;
    private int telefono;
    private List<Visita> visitas;

    // Constructor por defecto
    public Pacientes() {
        this.visitas = new ArrayList<>();
    }

    // Constructor con parámetros
    public Pacientes(int idPaciente, String nombre, int telefono) {
        this.idPaciente = idPaciente;
        this.nombre = nombre;
        this.telefono = telefono;
        this.visitas = new ArrayList<>();
    }

    // Métodos getters y setters
    public int getIdPaciente() {
        return idPaciente;
    }

    public void setIdPaciente(int idPaciente) {
        this.idPaciente = idPaciente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public List<Visita> getVisitas() {
        return visitas;
    }

    // Método para agregar una visita
    // Las Visitas deben ser agregadas a cada paciente
    // En la clase hija se puede observar que al construcutor se le envia un objeto
    public void agregarVisita(Visita visita) {
        visitas.add(visita);
    }
}
