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

        logicalOperations.switchElementsOfList(listOfInt);

        List<Integer> listNew = new ArrayList<>();
        for (int i = 1 ; i <= 10; i++){
            listNew.add(i);
        }
        logicalOperations.listOfEvenElements(listNew);
        List<Integer> unsrotedList = new ArrayList<>();
        unsrotedList.add(5);
        unsrotedList.add(2);
        unsrotedList.add(7);
        unsrotedList.add(9);
        unsrotedList.add(1);
        unsrotedList.add(6);
        unsrotedList.add(4);
        unsrotedList.add(3);
        unsrotedList.add(0);
        logicalOperations.sortedList(unsrotedList);

    }
}
