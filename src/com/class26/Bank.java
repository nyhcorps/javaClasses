package com.class26;

public class Bank {
	double money;

	public double chargeFee() {
		double fee = 0;
		if (money < 1000) {
			fee = money * .01;
		} else {
			fee = 0;

		}
		return fee;
	}
}

class PNC extends Bank {
	public double chargeFee() {
		double fee = 0;
		if (money < 1000) {
			fee = money * .05;
		} else {
			fee = 0;

		}
		return fee;
	}
}
