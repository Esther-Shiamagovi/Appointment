import java.time.LocalDateTime

data class Appointment(
    val dateTime: LocalDateTime,
    val doctor: String,
    val patient: String
)

fun scheduleAppointment(dateTime: LocalDateTime, doctor: String, patient: String): Appointment {
    return Appointment(dateTime, doctor, patient)
}

fun sendReminder(appointment: Appointment) {
    println("Reminder: Your appointment with ${appointment.doctor} is on ${appointment.dateTime}.")
}

fun main() {
    val appointmentDateTime = LocalDateTime.of(2024, 5, 15, 10, 0) // Example appointment date and time
    val doctor = "Dr. Smith"
    val patient = "John Doe"

    val newAppointment = scheduleAppointment(appointmentDateTime, doctor, patient)
    println("Appointment scheduled: Date/Time - ${newAppointment.dateTime}, Doctor - ${newAppointment.doctor}, Patient - ${newAppointment.patient}")
    sendReminder(newAppointment)
}
