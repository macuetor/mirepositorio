package com.ieseljust.edd.calc;

public class Calculadora {


private float lastResult;
private String lastOp;

public float getLastResult(){
	return this.lastResult;
}


public String getLastOp(){
	return this.lastOp;
}
	
public float suma(float op1, float op2){
	float result=op1+op2;
	this.lastResult=result;
	this.lastOp="Suma";
	return result;
}

public float resta(float op1, float op2){
	float result=op1-op2;
	this.lastResult=result;
	this.lastOp="Resta";
	return result;
}

public float multiplica(float op1, float op2){
	float result=op1*op2;
	this.lastResult=result;
	this.lastOp="Multiplica";
	return result;
}

public float divideix(float op1, float op2){
    float result=op1/op2;
    this.lastResult=result;
    this.lastOp="Divideix";
    return result;
}

}