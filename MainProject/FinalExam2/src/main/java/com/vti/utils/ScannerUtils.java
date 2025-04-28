package com.vti.utils;

import java.util.Scanner;

public class ScannerUtils {
	private static Scanner scanner = new Scanner(System.in);

	public static int inputFunction(int a, int b, String errorMessage) {
		while (true) {
			int number = ScannerUtils.inputInt(errorMessage);
			if (number >= a && number <= b) {
				return number;
			} else {
				  System.out.println(errorMessage);
			}
		}
	}

	public static String inputEmail(String errorMessage) {
		while (true) {
			String email = ScannerUtils.inputString(errorMessage);
			String regex = "^[A-Za-z](.*)([@]{1})(.{1,})(\\.)(.{1,})";
			if (!email.matches(regex)) {
				  System.out.println(errorMessage);
				System.out.print("Mời bạn nhập lại email: ");
			} else {
				return email;
			}
		}
	}
	
	public static String inputPassword(String errorMessage) {
		while (true) {
			String password = ScannerUtils.inputString(errorMessage);
			String regex = "^(?=.*[A-Z]).{6,12}$";
			if (!password.matches(regex)) {
				  System.out.println(errorMessage);
				System.out.print("Mời bạn nhập lại password: ");
			}else{
				return password;
			}
		}
	}

	public static String inputPhoneNumber(String errorMessage) {
		while (true) {
			String number = ScannerUtils.inputString(errorMessage);
			if (number.length() > 12 || number.length() < 9) {
				  System.out.println(errorMessage);
				continue;
			}

			if (number.charAt(0) != '0') {
				  System.out.println(errorMessage);
				continue;
			}

			boolean isNumber = true;

			for (int i = 0; i < number.length(); i++) {
				if (Character.isDigit(number.charAt(i)) == false) {
					isNumber = false;
					break;
				}
			}
			if (isNumber == true) {
				return number;
			} else {
				System.out.println(errorMessage);
				System.out.print("Mời bạn nhập lại phone number: ");
			}

		}
	}

	public static int inputPositiveInt(String errorMessage) {
		while (true) {
			int id = ScannerUtils.inputInt(errorMessage);
			if (id < 0) {
				  System.out.println(errorMessage);
			} else {
				return id;
			}
		}
	}

	public static int inputInt(String errorMessage) {
		while (true) {
			try {
				String input = scanner.nextLine();
				input = input.trim();
				int output = Integer.parseInt(input);
				return output;
			} catch (Exception e) {
				  System.out.println(errorMessage);
			}
		}
	}

	public static float inputPositiveMoney(String erroMessage2) {
		while (true) {
			float money = ScannerUtils.inputMoney(erroMessage2);
			if (money < 0) {
				  System.out.print(erroMessage2);
			} else {
				return money;
			}
		}
	}

	public static float inputMoney(String errorMessage) {
		while (true) {
			try {
				String inputMoney = scanner.nextLine();
				inputMoney = inputMoney.trim();
				float outputMoney = Float.parseFloat(inputMoney);
				return outputMoney;
			} catch (Exception e) {
				  System.out.println(errorMessage);
			}
		}
	}

	public static String inputString(String errorMessage) {
		while (true) {
			String inputString = scanner.nextLine();
			inputString = inputString.trim();
			inputString = inputString.replaceAll("\\s+", " ");

			return inputString;
		}
	}

	public static String inputFullName(String errorMessage) {
		while (true) {
			String name = ScannerUtils.inputString(errorMessage);
			String regex = "^[a-zA-Z\\s]+$";
			if(!name.matches(regex)){
				System.out.println(errorMessage);
				System.out.print("Mời bạn nhập lại FullName: ");
			} else {
				return name;
			}

		}
	}
}
