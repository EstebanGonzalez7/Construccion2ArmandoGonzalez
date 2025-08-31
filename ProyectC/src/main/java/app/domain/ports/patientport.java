package app.domain.ports;

import app.domain.model.patient;

public interface patientport {
    public void save(patient patient) throws Exception;
	public patient findById(patient patient) throws Exception;
   
}