package com.ws03.exception;

public class BalanceLackException {
	AccountDto getUserAccount(int userSeq, int accountSeq) throws UserAccountNotFoundException;

	int withdraw(int userSeq, int accountSeq, int amount) throws BalanceLackException, UserAccountNotFoundException;
}