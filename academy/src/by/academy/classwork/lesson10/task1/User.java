package by.academy.classwork.lesson10.task1;

public class User {

	private String login;
	private String password;

	public class Query {

		public void printToLog() {
			System.out.println("Пользователь с логином " + login + " и паролем " + password + " отправил запрос");
		}
	}

	public void createQuery() {
		Query query = new Query();
		query.printToLog();
	}

	void printWithLocal(String login, String password) {

		class UserLocal {
			String loginL;
			String passwordL;

		}
		UserLocal userLocal = new UserLocal();
		userLocal.loginL = login;
		userLocal.passwordL = password;
		System.out.println("Local: Пользователь с логином " + userLocal.loginL + " и паролем " + userLocal.passwordL + " отправил запрос");
	}

	static class UserAgreement {
		private static String agreement = "Static: User Agreement";

		public static String getAgreement() {
			return agreement;
		}

	}

	Printable anonimous = new Printable() {

		@Override
		public void print() {
			System.out.println("Anonimous: Пользователь с логином " + login + " и паролем " + password + " отправил запрос");

		}

	};

}
