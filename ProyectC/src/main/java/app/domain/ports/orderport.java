package app.domain.ports;

import app.domain.model.order;

public interface orderport {
    public order FindbyOrderNumber (order order) throws Exception;
    public order FindbyMedicationId (order order) throws Exception;
        public void save (order order) throws Exception;
    
}
