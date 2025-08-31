package app.domain.model;

import java.time.LocalDateTime;

public class MedicalHistory {
	
	private String doctorId;
    private LocalDateTime appointmentDate;
    private String consultationReason;
    private String symptoms;
    private String diagnosis;

    public MedicalHistory (String doctorId, LocalDateTime appointmentDate, String consultationReason, String symptoms, String diagnosis) {
        this.doctorId = doctorId;
        this.appointmentDate = appointmentDate;
        this.consultationReason = consultationReason;
        this.symptoms = symptoms;
        this.diagnosis = diagnosis;
    }



    public String getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(String doctorId) {
        this.doctorId = doctorId;
    }

    public LocalDateTime getAppointmentDate() {
        return appointmentDate;
    }

    public void setAppointmentDate(LocalDateTime appointmentDate) {
        this.appointmentDate = appointmentDate;
    }

    public String getConsultationReason() {
        return consultationReason;
    }

    public void setConsultationReason(String consultationReason) {
        this.consultationReason = consultationReason;
    }

    public String getSymptoms() {
        return symptoms;
    }

    public void setSymptoms(String symptoms) {
        this.symptoms = symptoms;
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }

}
