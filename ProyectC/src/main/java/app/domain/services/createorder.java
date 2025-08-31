package app.domain.services;

import app.domain.model.emuns.Role;
import app.domain.ports.orderport;
import app.domain.model.order;
import app.domain.ports.patientport;
import app.domain.ports.userport;

public class createorder {

	
    private userport userport;
    private patientport patientport;
    private orderport orderport;
    
    public void create (order order) throws Exception {
        user doctor = userport.findByDocument(order.getDoctor());
        if (doctor == null || !doctor.getRole().equals(Role.DOCTORS)){
            throw new Exception ("Acción denwgada las ordenes solo las crean los medicos");
        }
        
        patient patient = patientport.findById(order.getpatient());
        
        if (patient == null){
            throw new Exception ("La orden debe estar asociada a un paciente existente");
        }
        
        order.setDoctor(doctor);
        order.setPatient(patient);
        
        orderport.save(order);
        
    }
}
