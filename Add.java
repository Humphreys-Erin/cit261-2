public class Add implements HandleIt {

    /**
     *
     * @param number1
     * @param number2
     */
    @Override
    public void execute(Integer number1, Integer number2) {
        Integer add = number1 + number2;
        System.out.println(add);
    }
}