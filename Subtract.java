public class Subtract implements HandleIt {

    public void execute(Integer number1, Integer number2) {
        Integer subtract = number1 - number2;
        System.out.println(subtract);
    }

}
