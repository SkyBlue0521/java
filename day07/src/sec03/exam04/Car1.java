package sec03.exam04;

public class Car1 {
	
	String company="현대자동차";
	String model;
	String color;
	int maxSpeed;
	
	Car1() {
		
	}
	
	Car1(String model){
		this(model, null,10);
	}
	
	Car1(String model, String color){
		this(model,color,20);
	}
	
	Car1(String model, String color, int maxSpeed){
		this.model=model;
		this.color=color;
		this.maxSpeed=maxSpeed;
	}

}
