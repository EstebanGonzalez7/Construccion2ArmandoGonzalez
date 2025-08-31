package app.domain.model;

public class patient {
	
    private long id_patient;
    private String name;
    private String dateBirth;
    private String gender;
    private String address;
    private String phone;
    private String email;
    private ContactEmergency contactEmergency;
    private MedicalInsurance medicalInsurance;

    public patient (long id_patient, String name, String dateBirth,
                    String gender, String address, String phone,
                    String email, ContactEmergency contactEmergency,
                    MedicalInsurance medicalInsurance) {
        this.id_patient; = id_patient;;
        this.name = name;
        this.dateBirth = dateBirth;
        this.gender = gender;
        this.address = address;
        this.phone = phone;
        this.email = email;
        this.contactEmergency = contactEmergency;
        this.medicalInsurance = medicalInsurance;
      
    }

    
    /**
     * @return the id_patient
     */
    public long getId_patient() {
        return id_patient;
    }

    /**
     * @param id_patient the id_patient to set
     */
    public void setId_patient(long id_patient) {
        this.id_patient = id_patient;
    }

    /**
     * @return the name
     */
    public String getname() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setname(String name) {
        this.name = name;
    }

    /**
     * @return the dateBirth
     */
    public String getdateBirth() {
        return dateBirth;
    }

    /**
     * @param dateBirth the dateBirth to set
     */
    public void setdateBirth(date Birth) {
        this.dateBirth = dateBirth;
    }

    /**
     * @return the address
     */
    public String getaddress() {
        return address;
    }

    /**
     * @param address the address to set
     */
    public void setDirection(String address) {
        this.address = address;
    }

    /**
     * @return the phone
     */
    public long getphone() {
        return phone;
    }

    /**
     * @param phone the phone to set
     */
    public void setphone(string phone) {
        this.phone= phone;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the gender
     */
    public String getGender() {
        return gender;
    }

    /**
     * @param gender the gender to set
     */
    public void setGender(String gender) {
        this.gender = gender;
    }

    /**
     * @return the medicalInsurance
     */
    public MedicalInsurance getmedicalInsurance() {
        return medicalInsurance;
    }

    /**
     * @param medicalInsurance the medicalInsurance to set
     */
    public void setmedicalInsurance(MedicalInsurance medicalInsurance) {
        this.medicalInsurance = medicalInsurance;
    }

    /**
     * @return the emergencyContact
     */
    public ContactEmergency getcontactEmergencyt() {
        return contactEmergency;
    }

    /**
     * @param emergencyContact the emergencyContact to set
     */
    public void setEmergencyContact(ContactEmergency contactEmergency) {
        this.contactEmergency = contactEmergency;
    }
    
    
    
    

}
