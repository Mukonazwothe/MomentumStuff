package com.calculator.interfaces;

import java.util.List;

import javax.ejb.Local;

import com.calculator.entity.Calculations;

@Local
public interface CalculationsLocal {
	/*public Calculations create(Calculations calculations);
	public List<Calculations> filterCalculations();
	public double basicCalculator(double number1, String operator, double number2);*/
	public String advancedCalculator(String equation);
}
