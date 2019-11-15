package com.calculator.dao;

import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;

import com.calculator.entity.Calculations;
import com.calculator.interfaces.CalculationsLocal;
import com.calculator.interfaces.CalculationsRemote;
import com.calculator.service.calculations.AdvancedCalculations;
import com.calculator.service.calculations.BasicCalculations;

/**
 * Session Bean implementation class Calculations
 */
@Stateless
@LocalBean
public class CalculationsDAO implements CalculationsRemote, CalculationsLocal {

    /**
     * Default constructor. 
     */
    public CalculationsDAO() {
        // TODO Auto-generated constructor stub
    }

	/*@Override
	public double basicCalculator(double number1, String operator, double number2) {
		BasicCalculations basicCalculations = new BasicCalculations();
		return basicCalculations.basicCalculator(number1, operator, number2);
	}*/

	@Override
	public String advancedCalculator(String equation) {
		AdvancedCalculations advancedCalculations = new AdvancedCalculations();
		return advancedCalculations.advancedCalculator(equation);
	}

	@Override
	public Calculations create(Calculations calculations) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Calculations> filterCalculations() {
		// TODO Auto-generated method stub
		return null;
	}

}
