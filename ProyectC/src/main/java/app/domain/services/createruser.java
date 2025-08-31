package app.domain.services;

import app.domain.model.user;
import app.domain.ports.userport;


public class createruser {

private userport userport;
    
    public void create (user user) throws Exception{
        if (userport.findByDocument(user) != null){
            throw new Exception("Esta cedula ya se encuentra registrada  Intenta de nuevo ");
        }
        
        if (userport.findByUserName(user) != null){
            throw new Exception ("Este nombreya se encuentra registrada  Intenta de nuevo  ya se encuentra registrada  Intenta de nuevo ");
        }
    }
}