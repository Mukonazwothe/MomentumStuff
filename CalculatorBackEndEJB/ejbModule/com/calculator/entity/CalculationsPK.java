package com.calculator.entity;

import java.io.Serializable;

/**
 * ID class for entity: Calculations
 *
 */ 
public class CalculationsPK  implements Serializable {   
   
	         
	private int id;
	private static final long serialVersionUID = 1L;

	public CalculationsPK() {}

	

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
   
	/*
	 * @see java.lang.Object#equals(Object)
	 */	
	public boolean equals(Object o) {
		if (o == this) {
			return true;
		}
		if (!(o instanceof CalculationsPK)) {
			return false;
		}
		CalculationsPK other = (CalculationsPK) o;
		return true
			&& getId() == other.getId();
	}
	
	/*	 
	 * @see java.lang.Object#hashCode()
	 */	
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + getId();
		return result;
	}
   
   
}
