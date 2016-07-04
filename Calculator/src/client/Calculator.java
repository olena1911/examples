package client;

import invoker.Keyboard;

import java.util.Scanner;

import receiver.Screen;

import command.concretecommand.InverseCommand;
import command.concretecommand.PowerCommand;
import command.concretecommand.SqrtCommand;

public class Calculator {
	public static void main(String[] args) {
		Keyboard keyboard = new Keyboard();

		Screen screen = new Screen();

		keyboard.setCommand("inverse", new InverseCommand(screen));
		keyboard.setCommand("sqrt", new SqrtCommand(screen));
		keyboard.setCommand("power", new PowerCommand(screen));

		Scanner scanner = new Scanner(System.in);
		while (true) {
			try {
				System.out.println("Enter command and number:");
				String input = scanner.nextLine();
				String[] inputParameters = input.split(" ");
				String commandName = inputParameters[0];
				double number = Double.parseDouble(inputParameters[1]);

				// executeCommand == press button
				keyboard.executeCommand(commandName, number);

				System.out.println("======================");
			} catch (Exception e) {
				System.out.println("oops... try one more time :)");
			}
		}
	}
}
