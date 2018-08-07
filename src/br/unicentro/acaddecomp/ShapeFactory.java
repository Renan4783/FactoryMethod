package br.unicentro.acaddecomp;

public class ShapeFactory {

	public static Shape createShape(String shape){
		if (shape.equals("Circle")){
			return new Circle(shape);
		} else if (shape.equals("Quad")){
			return new Quad(shape);
		} else {
			return new Triangle(shape);
		}
	}
	
}
