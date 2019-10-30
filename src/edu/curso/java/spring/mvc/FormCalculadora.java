package edu.curso.java.spring.mvc;

import javax.validation.constraints.NotNull;

public class FormCalculadora {
	
	@NotNull
	private int num1;
	@NotNull
	private int num2;
	
	private String operacion;

	public String getOperacion() {
		return operacion;
	}

	public void setOperacion(String operacion) {
		this.operacion = operacion;
	}

	public int getNum1() {
		return num1;
	}

	public void setNum1(int num1) {
		this.num1 = num1;
	}

	public int getNum2() {
		return num2;
	}

	public void setNum2(int num2) {
		this.num2 = num2;
	}

}
