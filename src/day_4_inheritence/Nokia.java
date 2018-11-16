package day_4_inheritence;

public class Nokia {
	
	public Nokia(String color, boolean isNew) {
		this.color = color;
		this.isNew = isNew;
	}

	private String color;
	private boolean isNew;
	
	public void takePicture() {
		System.out.println(color + " color Nokia is taking picture");
	}
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public boolean isNew() {
		return isNew;
	}
	public void setNew(boolean isNew) {
		this.isNew = isNew;
	}
	
	
}
