package app.domain.model;

import app.domain.model.emuns.Role;
public class user {
	private String identification;
    private String name;
    private String email;
    private String phone;
    private String dateBirth;
    private String address;
    private Role role;
    private String username;
    private String password;

    public user(String identification, String name, String email, String phone, String dateBirth, String address, Role role, String username, String password) {
        this.identification = identification;
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.dateBirth = dateBirth;
        this.address = address
        this.role = role;
        this.username = username;
        this.password = password;
    }
    
    public String getidentification() {
        return identification;
    }

    public void setidentification(String identification) {
        this.identification = identification;
    }

    public String getname() {
        return name;
    }

    public void setname(String name) {
        this.name = name;
    }

    public String getemail() {
        return email;
    }

    public void setemail(String email) {
        this.email = email;
    }

    public String getaddress() {
        return address;
    }

    public void setaddress(String address) {
        this.address = address;
    }

    public String getuserName() {
        return username;
    }

    public void setuserName(String username) {
        this.username = username;
    }

    public String getpassword() {
        return password;
    }

    public void setpassword(String password) {
        this.password = password;
    }

   

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getdateBirth() {
        return dateBirth;
    }

    public void setdateBirth(String BirthDay) {
        this.dateBirth = dateBirth;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }
    
}
