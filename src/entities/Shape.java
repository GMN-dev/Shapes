package entities;

import entities.enums.Color;

public abstract class Shape {
	
	
	private Color color;
	
	
	public Shape(String color) {
		this.setColor(color);
	}
	
	
	public Color getColor() {
		return this.color;	}

	public void setColor(String color) {
		try{
			this.color = Color.valueOf(color);
		}catch(Error err) {
			System.out.print(err); ;
		}
	}
	
	
	public abstract Double area();
	
	
}
