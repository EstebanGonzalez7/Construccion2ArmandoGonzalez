package app.domain.ports;
import app.domain.model.MedicalHistory;
import app.domain.model.patient;

public interface medicalhistoryport {
    public patient findByIdentification (patient patient) throws Exception;
    public MedicalHistory findByMedicalId (MedicalHistory medicalHistory) throws Exception;
    public MedicalHistory findByDate (MedicalHistory medicalHistory) throws Exception;
    public MedicalHistory findByDiagnosis (MedicalHistory medicalHistory) throws Exception;
        public void save (patient patient) throws Exception;
        public void save (MedicalHistory medicalHistory) throws Exception;
}
