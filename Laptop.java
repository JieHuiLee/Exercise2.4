package Exercise2_4SetterGetter;

public class Laptop {
	String model;
	String color;
	String brand;
	String operatingSystem;
	double weight; //declare as double
	String typing;
	String videoMeeting;
	String gaming;
	String webSearching;
	
	 // Create Setter Method
	  public void setModel(String model) {
	    this.model = model;
	  }
	  
	  public void setColor(String color) {
		    this.color = color;
	  }
	  
	  public void setBrand(String brand) {
	    this.brand = brand;
	  }
	  
	  public void setOperatingSystem(String operatingSystem) {
		    this.operatingSystem = operatingSystem;
		  }
	  
	  public void setWeight(double weight) {
		    this.weight = weight;
		  }
	  
	  public void setTyping(String typing) {
		    this.typing = typing;
		  }
	  
	  public void setVideoMeeting(String videoMeeting) {
		    this.videoMeeting = videoMeeting;
		  }
	  
	  public void setGaming(String gaming) {
		    this.gaming = gaming;
		  }
	  
	  public void setWebSearching(String webSearching) {
		    this.webSearching = webSearching;
		  }
	  // Create Getter Method
	  public String getModel() {
		  return this.model;
	  }
	  
	  public String getColor() {
	 	  return this.color;
 	  }
	  
	  public String getBrand() {
		  return this.brand;
	  }
	  
	  public String getOperatingSystem() {
		  return this.operatingSystem;
	  }
	  
	  public double getWeight() {
		  return this.weight;
	  }
	  
	  public String getTyping() {
		  return this.typing;
	  }
	  
	  public String getVideoMeeting() {
	 	  return this.videoMeeting;
 	  }
	  
	  public String getGaming() {
		  return this.gaming;
	  }
	  
	  public String getWebSearching() {
		  return this.webSearching;
	  }
	  
	
	// Create a speed() method
	public void speed() {
		System.out.println("\nThe speed of the laptop is running as fast as it \npossible than other laptop!");
}
}
