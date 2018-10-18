import java.util.HashMap;

public class ApplicationContr {
    private static HashMap<String,HandleIt> hashMapOfCommands = new HashMap<String,HandleIt>();

    public void ApplicationCont(){

    }

    public static void handleCommand(String command, Integer number1, Integer number2){

        hashMapOfCommands.put("+", new Add());
        hashMapOfCommands.put("*", new Multiply());
        hashMapOfCommands.put("-", new Subtract());
        hashMapOfCommands.put("/", new Divide());

        HandleIt handler = hashMapOfCommands.get(command);

        handler.execute(number1, number2);
    }
}