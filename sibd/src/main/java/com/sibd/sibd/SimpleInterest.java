package com.sibd.sibd;

public class SimpleInterest {
	int pri_amount;
	int time;
	float rate;
	SimpleInterest(int pri_amount,int time,float rate){
		this.pri_amount=pri_amount;
		this.time=time;
		this.rate=rate;
	}
	public float getSimpleInterest() {
		return (float) ((pri_amount*time*rate)/100.0);
	}
	public float getCompoundInterest() {
		return (float) (pri_amount*(Math.pow((1+rate/100),time)));
	}
}
