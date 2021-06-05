package com.amad.structural_patterns.adapter.objectcomposition;

public class CalculatorAdapter implements CalculatorInterface {

	Calculator calculator;
	Triangle t;

	public CalculatorAdapter(Triangle myTriangle) {
		this.t = myTriangle;
	}

	@Override
	public double getArea(Rectangle rectangle) {
		calculator = new Calculator();
		Rectangle r = new Rectangle(this.t.base, 0.5 * this.t.height);
		return calculator.getArea(r);
	}

}
