package by.academy.classwork.UML;

import java.util.Date;

public class CreditCard implements Card{

	private String issuer;
	private Long cardNo;
	private Date expiryDate;
	@Override
	public boolean autorise(double amount) {
		// TODO Auto-generated method stub
		return false;
	}
		
}
