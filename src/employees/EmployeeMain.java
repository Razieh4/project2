package employees;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.jar.Attributes.Name;

public class EmployeeMain {

	public static void main(String[] args) {

		ArrayList<Employee> employee1 = new ArrayList<>();

		Scanner scanner = new Scanner(System.in);

		while (true) {
			System.out.println("Welcome to employee handling system!\nWhat would you like to do?"
					+ "Press 1 for employee management, 2 for employee statistics system, 3 for exit!");
			int selectedNumber = scanner.nextInt();
			if (selectedNumber == 1) {
				System.out.println("Welcome to employee management system!\nWhat would you like to do?"
						+ " Press 1 for register, 2 for update or 3 for delete, please!");
				int choiceNumber = scanner.nextInt();
				if (choiceNumber == 1) {
					System.out.println("Alright. May I have your first name, please?");
					scanner.nextLine();
					String firstName = scanner.nextLine();
					System.out.println("Your surname?");
					String surName = scanner.nextLine();
					System.out.println("Your gender? Choose (male, female or unknown");
					String gender = scanner.nextLine();
					System.out.println("Your birth date?");
					int birthDate = scanner.nextInt();
					System.out.println("Your salary?");
					double salary = scanner.nextInt();
					System.out.println("Your id number?");
					int idNumber = scanner.nextInt();
					scanner.nextLine();
					System.out.println("Your occupation? Choose: programmer, technition or receptionist");
					String occupation = scanner.nextLine();

					if (occupation.equalsIgnoreCase("programmer")) {
						Programmer programmer = new Programmer(firstName, surName, salary, gender, birthDate, idNumber);
						employee1.add(programmer);
					} else if (occupation.equalsIgnoreCase("technition")) {
						Technition technition = new Technition(firstName, surName, salary, gender, birthDate, idNumber);
						employee1.add(technition);
					} else if (occupation.equalsIgnoreCase("receptionist")) {
						Receptionist receptionist = new Receptionist(firstName, surName, salary, gender, birthDate,
								idNumber);
						employee1.add(receptionist);
					} System.out.println(employee1.size());
				} else if (choiceNumber == 2) {
					System.out.println("Okay, what information would you like to update?"
							+ " Press 1 for updating your name, 2 for your birth date, 3 for salary,"
							+ " 4 for the department, please!");
					int caseNumber = scanner.nextInt();
					switch (caseNumber) {
					case 1:
					}
				} else if (choiceNumber == 3) {

				}
			} else if (selectedNumber == 2) {
				System.out.println("Welcome to employee statistics system!\nWhat would you like to do?");
			} else if (selectedNumber == 3) {
				System.out.println("Thank you");
				break;
			}

		}
	}
}

// if (employeeManagement) {
// switch () {
// case registerEmployee:
// Name, salary, birthDate;
// break;
//
// case deleteEmployee:
// idNumber;
// break;
//
// case update:
// if (updateName) {
//
// }
// else if (updateBirthDate) {
//
// }else if (updateSalary) {
//
// }
// case search:
// if (employeeByName) {
//
// }else if (employeeNumber) {
//
// }
// case displayAllEmployees:
// display;
// break;
//
// case backToMainMenu:
// backToMenu;
// break;
//
// default:
// invalid input;
// break;
//
// }
//
// }
// else if (employeeStatistics) {
// switch () {
// case averageWage:
// calculateAverageWage;
// break;
// case maximumSalary:
// Math.max(a, b);
// break;
// case minimumSalary:
// Math.min(a, b);
// break;
// case totalBonus:
// calculateTotalBonus;
// break;
// case WomenPercentage:
// calculateWomenPercentage;
// break;
// case backToMainMenu:
// mainMenu;
// break;
// default:
// invalid input;
//
// }
//
// }
// else if (Exit) {
// System.out.println("Thank you");
//
// }

// String name = scanner.next();
// Programmer programmer1 = new Programmer("Terry", "Salivan", 70000,
// String, 1986, 1202);
// Receptionist receptionist1 = new Receptionist("Alex", "Berman", 60000,
// String,1985, 1204);
// Technition technition1 = new Technition("Ben", "Glass", 65000 , String,
// 1987, 1203);
//
// employee1.add(programmer1);
// employee1.add(receptionist1);
// employee1.add(technition1);
