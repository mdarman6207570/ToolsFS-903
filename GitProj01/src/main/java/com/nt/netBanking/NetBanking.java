package com.nt.netBanking;

import java.util.Random;

public class NetBanking {

	public String doNetBankingPayment(String nbId, float amount) {
		return "NetBanking Payment for the amount:: " + amount + " is done";
	}

	public double checkBalance(String upiId) {
		return new Random().nextInt(120000);
	}
}