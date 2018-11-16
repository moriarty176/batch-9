package day_4_inheritence;

public class Toyota {
	
	String model;
	private int mileage;
	private boolean sportEdition;
	
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getMileage() {
		return mileage;
	}
	public void setMileage(int mileage) {
		if(mileage > 0) {
			this.mileage = mileage;
		}
		else {
			System.out.println("Invalid milage: " + mileage);
		}
		
	}
	public boolean isSportEdition() {
		return sportEdition;
	}
	public void setSportEdition(boolean sportEdition) {
		this.sportEdition = sportEdition;
	}
	
	
}
