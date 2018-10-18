import java.util.Scanner;

public class Application {
    public static void main(String[] args){
        ApplicationContr deligate = new ApplicationContr();
        String add      = "add";
        String subtract = "subtract";
        String multiply = "multiply";
        String divide   = "divide";
        Integer number1;
        Integer number2;
        String command;

        Scanner in = new Scanner(System.in);

        System.out.println("Enter number: ");
        number1 = Integer.parseInt(in.nextLine());
        System.out.println("Enter mathematical function(+,-,*,/): ");
        command = in.nextLine();
        System.out.println("Enter second number: ");
        number2 = Integer.parseInt(in.nextLine());

        System.out.print(number1+ " " + command + " "+ number2 + " = ");
        ApplicationContr.handleCommand(command,number1,number2);
    }
}
