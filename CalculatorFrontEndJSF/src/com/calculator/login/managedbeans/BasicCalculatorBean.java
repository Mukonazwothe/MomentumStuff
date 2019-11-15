package com.calculator.login.managedbeans;

import java.math.BigDecimal;

import javax.faces.bean.ManagedBean;

@ManagedBean(name="BasicCalculator")
public class BasicCalculatorBean {
	private BigDecimal number1;
	private String operand;
	private BigDecimal number2;
	private BigDecimal results;
	
	public BigDecimal getNumber1() {
		return number1;
	}
	public void setNumber1(BigDecimal number1) {
		this.number1 = number1;
	}
	public String getOperand() {
		return operand;
	}
	public void setOperand(String operand) {
		this.operand = operand;
	}
	public BigDecimal getNumber2() {
		return number2;
	}
	public void setNumber2(BigDecimal number2) {
		this.number2 = number2;
	}
	public BigDecimal getResults() {
		return results;
	}
	public void setResults(BigDecimal results) {
		this.results = results;
	}
}
