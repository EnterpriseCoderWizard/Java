package registroshospital;

import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
         // Crear paciente
         Pacientes paciente = new Pacientes(1, "Firulaiz ZZZ", 5551234);

         // Crear visita
         LocalDateTime fecha = LocalDateTime.of(2024, 7, 3, 10, 0);
         LocalDateTime horaEntrada = LocalDateTime.of(2024, 7, 3, 10, 0);
         LocalDateTime horaSalida = LocalDateTime.of(2024, 7, 3, 11, 0);
         String medico = "Dr. García";
         String diagnostico = "Gripe común";
         boolean seguimiento = true;
         String observaciones = "Tomar medicamento X";
 
         Visita visita = new Visita(paciente, fecha, horaEntrada, horaSalida, medico, diagnostico, seguimiento, observaciones);
 
         // Asignar visita al paciente
         paciente.agregarVisita(visita);
 
         // Mostrar información de la visita
         System.out.println("Información de la visita:");
         System.out.println("Nombre del paciente: " + visita.getPaciente().getNombre());
         System.out.println("Fecha: " + visita.getFecha());
         System.out.println("Hora de entrada: " + visita.getHoraEntrada());
         System.out.println("Hora de salida: " + visita.getHoraSalida());
         System.out.println("Médico: " + visita.getMedico());
         System.out.println("Diagnóstico: " + visita.getDiagnostico());
         System.out.println("Seguimiento: " + (visita.isSeguimiento() ? "Sí" : "No"));
         System.out.println("Observaciones: " + visita.getObservaciones());
    }
}

