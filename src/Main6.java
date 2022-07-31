import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;

public class Main6 {
    public static void main(String[] args) {

        LogicalOperations logicalOperations = new LogicalOperations();
        List<Integer> listOfInt = new ArrayList<>();
        for (int i = 1 ; i <= 20; i++){
           listOfInt.add(i);
        }
        logicalOperations.printList(listOfInt);
        logicalOperations.addNumberToList(listOfInt,21);
        logicalOperations.printListByIndex(listOfInt,10);
        logicalOperations.printListReversed(listOfInt);
        List<String> stringList = new ArrayList<>();
        for (int i = 1; i<= 10 ; i++){
            stringList.add(i+" ");
        }
        logicalOperations.addStringToMyList(stringList,3,"test");
        logicalOperations.addNumbertoFirstIndex(listOfInt,100);
        logicalOperations.printListIndexAndElements(listOfInt);
        logicalOperations.getBiggestValueFromList(listOfInt);

    }
}
