package app.domain.services;

import app.domain.model.user;
import app.domain.model.patient;
import app.domain.ports.patientport;
import app.domain.model.emuns.Role;

public class createpatient {
	private patientport patientPort;
    private user user;
    public void create (patient patient) throws Exception{
        
        if(patientPort.findById(patient) != null){
            throw new Exception ("Este paciente ya existe");
        }
        if (!user.getRole().equals(Role.ADMINISTRATIVES_TAFF)){
            throw new Exception ("Solo el personal administrativo puede crear pacientes");
        }
        patientPort.save(patient);
    }
}
	
