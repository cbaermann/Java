package com.calculator;

public class Calc {
	private Double operandOne;
	private Double operandTwo;
	private Double total;
	private String operation;
	
	
	
	
	public Calc() {
		
	}
	
	
	
	public Calc(Double operandOne, String operation, Double operandTwo) {
		this.operandOne = operandOne;
		this.operation = operation;
		this.operandTwo = operandTwo;

	}



	public Double getOperandOne() {
		return operandOne;
	}
	public void setOperandOne(Double operandOne) {
		this.operandOne = operandOne;
	}
	public Double getOperandTwo() {
		return operandTwo;
	}
	public void setOperandTwo(Double operandTwo) {
		this.operandTwo = operandTwo;
	}
	public Double getTotal() {
		return total;
	}
	public void setTotal(Double total) {
		this.total = total;
	}
	public String getOperation() {
		return operation;
	}
	public void setOperation(String operation) {
		this.operation = operation;
	}
	
	public void performOperation() {
		if(getOperation().equals("+")) {
			Double total = getOperandOne() + getOperandTwo();
			setTotal(total);
		}
		else if(getOperation().equals("-")) {
			Double total = getOperandOne() + getOperandTwo();
			setTotal(total);
		}
	}
	
	public void retrieveResults() {
		System.out.println(this.total);
		
	}
	
	
	

}
