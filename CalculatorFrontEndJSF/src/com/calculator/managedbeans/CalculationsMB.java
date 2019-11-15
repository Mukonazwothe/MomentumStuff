package com.calculator.managedbeans;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.view.ViewScoped;

import com.calculator.interfaces.CalculationsLocal;

@ViewScoped
@ManagedBean
public class CalculationsMB {
	@EJB
	private CalculationsLocal calculationsLocal;
	
	public CalculationsMB() {
		
	}
	
	public String CalculationsAdvanced(String equation){
		return calculationsLocal.advancedCalculator(equation);
	}
	
	public static void main(String[] args) {
		System.out.println(new CalculationsMB().CalculationsAdvanced("5+5")); 
	}
}
