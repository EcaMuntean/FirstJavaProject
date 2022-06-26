public class MainTemaObiect11 {
    public static Calculator calculator = new Calculator();

    public static void main(String[] args) {
        //EX1
        System.out.println("The result is: " + calculator.adunare(2, 3));
        System.out.println("The result is: " + calculator.scadere(10, 7));
        System.out.println("The result is: " + calculator. inmultire(10, 5));
        System.out.println("The result is: " + calculator.impartire(10, 5));
        System.out.println("The result is: " + calculator. medie(10, 15, 20));
        System.out.println("The result is: " + calculator.restImpartire(30, 5));
        System.out.println("The temperature in celsius is: " + calculator.tempConversion(200));
        System.out.println("The distance in meter is: " + calculator.distConversion(100));
        //EX2.3
        LogicalOperations op = new LogicalOperations();

        int biggest = op.checkBiggerNumber(5,9);

        System.out.println("The bigger number is: " + biggest);

        //Ex2.4
        System.out.println(op.verifyText("FastTracka"));
        System.out.println(op.verifyNumber(10));

        //Ex2.5
        System.out.println(op.verifyTextAndNumber("FastTrackIT", 3));

        //Ex2.6
        System.out.println(op.forecast(9));

        //Ex2.7
        System.out.println(op.verifyNumbers(5));


        //Ex2.8
        System.out.println(op.writeNumber(5));

        //Ex2.9
        System.out.println(op.isNumberEven(5));

        //Ex2.10
        System.out.println(op.isEligibleToVote(7));

        //Ex2.11
        System.out.println(op.verifyGreatNumber(2,3,4));

    }


}
