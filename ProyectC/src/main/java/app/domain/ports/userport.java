package app.domain.ports;

import app.domain.model.user;

public interface userport {
    public user findByDocument(user user) throws Exception;
    public user findByUserName(user user) throws Exception;
	public void save(user user) throws Exception;
}