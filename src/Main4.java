public class Main4 {
    public static void main(String[] args) {
        LogicalOperations op = new LogicalOperations();
        //Ex 1
        int x = 40;
        op.printToOneHundred(x);
        //Ex 2
        op.printToMinusOneHundred(x);
        //Ex 3
        int a = 15;
        int b = 10;
        op.printBetweenNumbers(a,b);
        //Ex 4
        op.printFromSmallToBig(a,b);
        //Ex 5
        op.printEvenToHundred();
        //Ex 6
        op.printOddToHundred();
        //Ex 7
        int c = 20;
        op.printSumToHundred(c);
        //Ex 8
        int d = 50;
        op.sumAndAverage(d);
        //Ex 9
        op.printModel();
    }


}
