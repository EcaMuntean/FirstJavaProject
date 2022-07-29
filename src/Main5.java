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
        //tema optionala
        int[] testArray = {9,10,30,55,12};
        logicalOperations.addOnPosition(testArray,2,70);
        int[] numbersArray = {20,204,5,400,12,3};
        logicalOperations.getSmallestAndBiggestNrInArray(numbersArray);
        int[] a = {20,56,98,78,100};
        logicalOperations.reverse(a,a.length);
        int[] duplicate = {10,6,2,7,9,8,7,10,5,3,9,20,16,15,16};
        logicalOperations.findDuplicates(duplicate);
        String[] str1={"ian","feb","mar","apr","mai"};
        String[] str2={"sept","feb","oct","mai"};
        logicalOperations.findComunElements(str1,str2);
        int[] valuesArray={10,50,45,90,61,32,100,3};
        logicalOperations.orderArray(valuesArray);

    }

}










