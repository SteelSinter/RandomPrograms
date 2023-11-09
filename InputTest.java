package things;
import java.util.Scanner;

public class InputTest {

	public static void main(String[] args) {
		String str1;
		Command cmd;
		
		try (Scanner input = new Scanner(System.in);) {
			str1 = input.nextLine();
		}

		cmd = new Command(str1);
		
		System.out.println(cmd.toString());

	}

}

class Command {
	private java.util.StringTokenizer content;
	private String[] args, argTypes;
	private String command;
	
	public Command() {
	}
	
	public Command(String input) {
		content = new java.util.StringTokenizer(input);
		command = content.nextToken();
		args = new String[content.countTokens()];
		
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
			catch (NumberFormatException e) {
				argTypes[i] = "String";
			}
			
			if (arg == null)
				argTypes[i] = null;
			
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
	
	@Override
	public String toString() {
		String args = "";
		String argTypes = "";
		
		for (String str: getArgs()) {
			args.concat(str + " ");
		}
		
		for (String str: getArgTypes()) {
			argTypes.concat(str + " ");
		}
		
		return String.format("commmand: %s\r\nargs: %s\r\narg types: %s", command, args, argTypes);
	}
}

class InvalidCommandFormatException extends Exception {
	public InvalidCommandFormatException(String message) {
		super(message);
	}
}