public class Main5 {



    public static void main(String[] args) {

        LogicalOperations logicalOperations = new LogicalOperations();

        logicalOperations.getArrayToHundred();
        int[] evenArray =new int[100];
        logicalOperations.getEvenArrayToHundred(evenArray);
        int[] myArray =new int[50];
        logicalOperations.getAverageArray(myArray);
        String[] myArrayOfStrings = {"luni","marti","miercuri","joi","vineri"};
        System.out.println();
        if (logicalOperations.checkInArray(myArrayOfStrings, "joi"))
            System.out.println("Valoarea se gaseste in array");
        else
            System.out.println("valoarea nu se gaseste in array");

        int[] Numbers = new int[25];
        logicalOperations.getPositionInArray(Numbers, 10);
        logicalOperations.drawLines();
        int[] myyArray = new int[20];
        logicalOperations.removeNrFromArray(myyArray,10);
        int[] mxArray = {10,15,5,8,4,0,29,200};
        logicalOperations.getSecondSmallestNrInArray(mxArray);
        int[] firstArray = {10,20,30,40,50 };
        int[] emptyArray = new int[firstArray.length];
        logicalOperations.copyArray(firstArray, emptyArray);

    }

}










