package Exercise2_4SetterGetter;

public class Main {

	public static void main(String[] args) {
		Laptop l = new Laptop(); //letter l represent laptop
		
		l.setModel("Macbook Air 13");
		l.setColor("Space Gray");
		l.setBrand("Apple");
		l.setOperatingSystem("macOS");
		l.setWeight(2.8);
		l.setTyping("Hello World!");
		l.setVideoMeeting("Yes. It allows to open cam do meeting.");
		l.setGaming("Can play game through Discord,Steam and so on.");
		l.setWebSearching("Can do searching through Chrome Browser.");
		
		System.out.println("----Welcome to Gadget Shop----");
		System.out.println("Gadget : Laptop");
		System.out.println("==============================");
		System.out.println("Model\t\t : " + l.getModel());
		System.out.println("Color\t\t : " + l.getColor());
		System.out.println("Brand\t\t : " + l.getBrand());
		System.out.println("Operating System : " + l.getOperatingSystem());
		System.out.println("Weight\t\t : " + l.getWeight()+ " pounds");
		//Method of Laptop
		System.out.println("Typing           : " + l.getTyping());
		System.out.println("Video Meeting    : " + l.getVideoMeeting());
		System.out.println("Gaming           : " + l.getGaming());
		System.out.println("Web Searching    : " + l.getWebSearching());
		
		l.speed();
	}

}
