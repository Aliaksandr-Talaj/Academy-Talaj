package by.academy.classwork.lesson10.task1_4;

public class Main {

	public static void main(String[] args) {

		User user = new User();
		user.createQuery();
		User.Query query = user.new Query();
		User.Query query2 = new User().new Query();

		query.printToLog();
		query2.printToLog();

		user.printWithLocal("Logen", "NineFingers");

		System.out.println(User.UserAgreement.getAgreement());

		user.anonimous.print();
	}

}
