// Esta línea de código en Java importa la clase LocalDateTime de la biblioteca java.time. La clase LocalDateTime se utiliza para representar fechas y horas sin zonas horarias, proporcionando métodos para manipular y formatear valores de fecha y hora. Por ejemplo, puede usarse para obtener la fecha y hora actuales, agregar o restar tiempo, y comparar fechas y horas

package registroshospital;

import java.time.LocalDateTime;

public class Visita {
    private Pacientes paciente;
    private LocalDateTime fecha;
    private LocalDateTime horaEntrada;
    private LocalDateTime horaSalida;
    private String medico;
    private String diagnostico;
    private boolean seguimiento;
    private String observaciones;


    // El constructor recibe el objeto Paciente o la instancia de la clase
    public Visita(Pacientes paciente, LocalDateTime fecha, LocalDateTime horaEntrada, LocalDateTime horaSalida, String medico,
                  String diagnostico, boolean seguimiento, String observaciones) {
        this.paciente = paciente;
        this.fecha = fecha;
        this.horaEntrada = horaEntrada;
        this.horaSalida = horaSalida;
        this.medico = medico;
        this.diagnostico = diagnostico;
        this.seguimiento = seguimiento;
        this.observaciones = observaciones;
    }

    // Métodos getters y setters
    public Pacientes getPaciente() {
        return paciente;
    }

    public LocalDateTime getFecha() {
        return fecha;
    }

    public LocalDateTime getHoraEntrada() {
        return horaEntrada;
    }

    public LocalDateTime getHoraSalida() {
        return horaSalida;
    }

    public String getMedico() {
        return medico;
    }

    public String getDiagnostico() {
        return diagnostico;
    }

    public boolean isSeguimiento() {
        return seguimiento;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }

    public void setHoraEntrada(LocalDateTime horaEntrada) {
        this.horaEntrada = horaEntrada;
    }

    public void setHoraSalida(LocalDateTime horaSalida) {
        this.horaSalida = horaSalida;
    }

    public void setMedico(String medico) {
        this.medico = medico;
    }

    public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }

    public void setSeguimiento(boolean seguimiento) {
        this.seguimiento = seguimiento;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }
}
