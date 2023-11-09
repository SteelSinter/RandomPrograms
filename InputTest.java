package things;
import java.util.Scanner;

public class InputTest {

	public static void main(String[] args) {
		String str1;
		Command cmd;
		
		try (Scanner input = new Scanner(System.in);) {
			str1 = input.nextLine();
			cmd = new Command(str1);
		}
		catch (InvalidCommandFormatException e) {
			System.out.println("Invalid command");
		}
		
		System.out.println("command: " + cmd.getCommand());
		System.out.print("args: ");
		
		for (String str: cmd.getArgs()) {
			System.out.print(str + " ");
		}
		
		System.out.println();
		System.out.print("arg types: ");
		
		for (String str: cmd.getArgTypes()) {
			System.out.print(str + " ");
		}

	}

}

class Command {
	private java.util.StringTokenizer content;
	private String[] args, argTypes;
	private String command;
	
	public Command() {
	}
	
	public Command(String input) throws InvalidCommandFormatException {
		content = new java.util.StringTokenizer(input);
		args = new String[content.countTokens()];
		command = content.nextToken();
		
		for (int i = 0; i < args.length; i++) {
			args[i] = content.nextToken();
		}
		
		argTypes = new String[args.length];
		
		for (int i = 0; i < argTypes.length; i++) {
			String arg = args[i];
			try {
				Integer.parseInt(arg);
				Double.parseDouble(arg);
			}
			catch (Exception e) {
				System.out.println(e);
				argTypes[i] = "String";
			}
			
		}
	}
	
	public String getCommand() {
		return command;
	}
	
	public String[] getArgs() {
		return args;
	}
	
	public String[] getArgTypes() {
		return argTypes;
	}
}

class InvalidCommandFormatException extends Exception {
	public InvalidCommandFormatException(String message) {
		super(message);
	}
}