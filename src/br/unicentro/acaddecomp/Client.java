package br.unicentro.acaddecomp;

public class Client {
	public static void main(String[] args) {
		Shape object = ShapeFactory.createShape("Triangle");
		System.out.println(object.getNome());
	}
}
