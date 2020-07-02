package com.generic.model.vo;

public class MyGenericObj<T> {
	private T testValue;

public MyGenericObj() {
	// TODO Auto-generated constructor stub
}
	
	public MyGenericObj(T testValue) {
		super();
		this.testValue=testValue;
	}

	public T getTestValue() {
		return testValue;
	}

	public void setTestValue(T testValue) {
		this.testValue = testValue;
	}
	

}
