package entities;


public class Circle extends Shape{

	private Double radius;
	
	public Circle(Double radius, String color) {
		super(color);
		this.radius = radius;
	}
	
	public Double getRadius() {
		return radius;
	}
	public void setRadius(Double radius) {
		this.radius = radius;
	}

	@Override
	public Double area() {
		return Math.pow(this.radius , 2) * Math.PI;
	}

}
