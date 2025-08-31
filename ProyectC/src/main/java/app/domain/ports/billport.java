package app.domain.ports;

import app.domain.model.Bill;

public interface billport {
    public void save (Bill bill) throws Exception;
        
}