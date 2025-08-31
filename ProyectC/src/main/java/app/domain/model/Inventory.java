package app.domain.model;

public class Inventory {

	    private String id;
	    private String name;
	    private double cost;
	    private boolean requiresSpecialist;
	    private String specialistType;

	    public Inventory(String id, String name, double cost, boolean requiresSpecialist, String specialistType) {
	        this.id = id;
	        this.name = name;
	        this.cost = cost;
	        this.requiresSpecialist = requiresSpecialist;
	        this.specialistType = specialistType;
	    }



	    public String getId() {
	        return id;
	    }

	    public void setId(String id) {
	        this.id = id;
	    }

	    public String getName() {
	        return name;
	    }

	    public void setName(String name) {
	        this.name = name;
	    }

	    public double getCost() {
	        return cost;
	    }

	    public void setCost(double cost) {
	        this.cost = cost;
	    }

	    public boolean isRequiresSpecialist() {
	        return requiresSpecialist;
	    }

	    public void setRequiresSpecialist(boolean requiresSpecialist) {
	        this.requiresSpecialist = requiresSpecialist;
	    }

	    public String getSpecialistType() {
	        return specialistType;
	    }

	    public void setSpecialistType(String specialistType) {
	        this.specialistType = specialistType;
	    }
	}

	
	
	
	
	
	
	
	
	
	

}
