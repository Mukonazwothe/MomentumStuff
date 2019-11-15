package com.calculator.interfaces;

import java.util.List;

import javax.ejb.Remote;

import com.calculator.entity.Calculations;

@Remote
public interface CalculationsRemote {
	public Calculations create(Calculations calculations);
	public List<Calculations> filterCalculations();
}
