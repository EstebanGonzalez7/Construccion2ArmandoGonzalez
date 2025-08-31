package app.domain.model;


import java.util.ArrayList;
import java.util.List;

public class Bill {

    private String billId;
    private Patient patient;
    private String treatingDoctor;
    private MedicalInsurance insurance;
    private List<Order> orders;
    private double total;
    private double copay;

    public  Bill (String bill, Patient patient, String treatingDoctor, MedicalInsurance insurance) {
        this.billId = billId;
        this.patient = patient;
        this.treatingDoctor = treatingDoctor;
        this.insurance = insurance;
        this.orders = new ArrayList<>();
        this.total = 0.0;
        this.copay = 0.0;
    }

    public void addOrder(Order order) {
        orders.add(order);
        this.total += order.getItems().stream().mapToDouble(OrderItem::getCost).sum();
    }

    

    public String getBill() {
        return bill;
    }

    public void setInvoiceId(String billId) {
        this.billId = billId;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public String getTreatingDoctor() {
        return treatingDoctor;
    }

    public void setTreatingDoctor(String treatingDoctor) {
        this.treatingDoctor = treatingDoctor;
    }

    public MedicalInsurance getInsurance() {
        return insurance;
    }

    public void setInsurance(MedicalInsurance insurance) {
        this.insurance = insurance;
    }

    public List<Order> getOrders() {
        return orders;
    }

    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public double getCopay() {
        return copay;
    }

    public void setCopay(double copay) {
        this.copay = copay;
    }
}
