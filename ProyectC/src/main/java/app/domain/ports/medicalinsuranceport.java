package app.domain.ports;

import app.domain.model.MedicalInsurance;
import app.domain.model.patient;

public interface medicalinsuranceport {
    public patient findByIdentification (patient patient) throws Exception;
    public MedicalInsurance findByPolicyNumber (MedicalInsurance medicalInsurance) throws Exception;
    public MedicalInsurance findByStatus (MedicalInsurance medicalInsurance) throws Exception;
        public void save (patient patient) throws Exception;
        public void save (MedicalInsurance medicalInsurance) throws Exception;

}
