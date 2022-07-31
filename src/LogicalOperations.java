import java.util.List;

public class LogicalOperations {
    public String verifyText(String textInput) {
        if (textInput.equals("FastTrack")) {
            String succes = "Learning text comparison";
            return succes;


        } else {
            return "Got to try some more";

        }
    }

    public int verifyNumber(int number) {
        if (number >= 2 && number <= 8) {
            return number;

        }
        return 0;

    }

    public int checkBiggerNumber(int first, int second) {

        if (first > second) {

            return first;

        } else {

            return second;

        }


    }

    public String verifyTextAndNumber(String textInput, int number) {
        if (textInput.equals("FastTrackIT") && number <= 3) {
            return (textInput + number);
        } else if (!textInput.equals("FastTrackIT") && number >= 4) {
            return (number + textInput);
        }
        return "Not applicable";

    }

    public String forecast(int snow) {
        if (snow > 8 | snow == 6) {
            return "The amount of snow this winter was(cm): " + snow;

        }
        return "The forecast snow is(cm):" + snow;
    }

    public String verifyNumbers(int number) {
        if (number > 3 && number != 4) {
            return "The number is greater than 3 and not equal to 4";
        } else if (number == 4) {
            return "The number is equal to 4";

        } else if (number < 3) {
            return "The number is lower than 3";
        }
        return "Not applicable";
    }

    public int writeNumber(int number) {
        switch (number) {
            case 1:
                System.out.println("The number is: 1");
                break;
            case 2:
                System.out.println("The number is: 2");
                break;
            case 3:
                System.out.println("The number is: 3");
                break;
            case 4:
                System.out.println("The number is: 4");
                break;
            case 5:
                System.out.println("The number is: 5");
                break;
            case 6:
                System.out.println("The number is: 6");
                break;
            case 7:
                System.out.println("The number is: 7");
                break;
            case 8:
                System.out.println("The number is: 8");
                break;
            case 9:
                System.out.println("The number is: 9");
                break;
        }
        return number;
    }

    public boolean isNumberEven(int number) {
        if (number % 2 == 0) {
            return true;
        }
        return false;
    }

    public boolean isEligibleToVote(int number) {
        if (number >= 18) {
            return true;
        } else if (number < 18) {
            return false;
        }
        return false;
    }

    public String verifyGreatNumber(int first, int second, int third) {
        if (first > second && first > third) {
            return "The greater number is :" + first;

        } else if (second > first && second > third) {
            return "The greater number is :" + second;


        } else if (third > first && third > second) {
            return "The greater number is :" + third;
        }
        return "Not aplicable";
    }

    //Tema 12 For Loops
    //Ex 1
    public void printToOneHundred(int x) {
        for (int i = x; i <= 100; i++) {
            System.out.println(i);
        }

    }

    //Ex 2
    public void printToMinusOneHundred(int x) {
        for (int i = x; i >= -100; i--) {
            System.out.println(i);
        }

    }

    //Ex 3
    public void printBetweenNumbers(int a, int b) {
        if (a < b) {
            for (int i = a; i <= b; i++) {
                System.out.println(i);
            }
        } else if (a > b) {
            for (int i = a; i >= b; i--) {
                System.out.println(i);
            }
        }
    }

    //Ex 4
    public void printFromSmallToBig(int a, int b) {
        if (a > b) {
            for (int i = b; i <= a; i++) {
                System.out.println(i);
            }
        } else {
            for (int i = a; i <= b; i++) {
                System.out.println(i);
            }
        }
    }

    //Ex 5
    public void printEvenToHundred() {
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }

    //Ex 6
    public void printOddToHundred() {
        for (int i = 1; i <= 100; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
    }

    //Ex 7
    public void printSumToHundred(int c) {
        int sum = 0;
        for (int i = c; i <= 100; i++) {
            sum = sum + i;
        }
        System.out.println(sum);
    }

    //Ex 8
    public void sumAndAverage(int d) {
        double sum = 0;
        double count = 0;
        for (int i = d; i <= 100; i++) {
            sum = sum + i;
            count = count + 1;
        }
        System.out.println(sum / count);
    }

    //Ex 9
    public void printModel() {

        for (int i = 6; i >= 0; i--) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }

    //Tema 12 While Loops
    //Ex 1
    public void wCountToHundred(int x) {
        while (x <= 100) {
            System.out.println(x);
            x++;
        }
    }

    //Ex 2
    public void wCountToMinusHundred(int x) {
        while (x >= -100) {
            System.out.println(x);
            x--;
        }
    }

    //Ex 3
    public void wCountBetweenNumbers(int a, int b) {
        if (a < b) {
            while (a <= b) {
                System.out.println(a);
                a++;
            }
        } else {
            while (a >= b) {
                System.out.println(a);
                a--;
            }
        }
    }

    //Ex 4
    public void wCountFromSmallToBig(int a, int b) {
        if (a < b) {
            while (a <= b) {
                System.out.println(a);
                a++;
            }
        } else {
            while (b <= a) {
                System.out.println(b);
                b++;
            }
        }

    }

    //Ex 5
    public void wPrintEvenToHundred() {
        int start = 1;
        int finish = 100;
        while (start <= finish) {
            if (start % 2 == 0) {
                System.out.println(start);
            }
            start++;
        }
    }

    //Ex 6
    public void wPrintOddToHundred() {
        int start = 1;
        int finish = 100;
        while (start <= finish) {
            if (start % 2 != 0) {
                System.out.println(start);
            }
            start++;
        }

    }

    //Ex 7
    public double getAverageInInterval(int start, int finish) {

        int sum = 0;
        double count = 0;
        while (start <= finish) {
            sum = sum + start;
            start++;
            count++;
        }
        System.out.println(sum);
        System.out.println(sum / count);
        return sum / count;
    }

    //Ex 8
    public void wGetAverage(int a, int b) {
        double count = 0;
        int sum = 0;
        while (a <= b) {
            if (a % 7 == 0) {
                sum = sum + a;
                count++;

            }
            a++;

        }
        System.out.println(sum / count);

    }

    //Ex 9
    public void fibonacci() {
        int n1 = 0, n2 = 1, n3, count = 20, start = 2;
        System.out.print(n1 + " " + n2);
        while (start <= count) {
            n3 = n1 + n2;
            System.out.print(" " + n3);
            n1 = n2;
            n2 = n3;
            start++;
        }
    }

    //Ex 10
    public void cozaLozaWoza() {
        System.out.println("");
        int start = 1;
        while (start <= 110) {
            if (start % 3 == 0) {
                if (start % 5 == 0) {
                    if (start % 7 == 0)
                        System.out.print("CozaLozaWoza ");
                    else
                        System.out.print("CozaLoza ");
                } else if (start % 7 == 0)
                    System.out.print("CozaWoza ");
                else
                    System.out.print("Coza ");
                if (start % 11 == 0)
                    System.out.println();
            } else if (start % 5 == 0) {
                if (start % 7 == 0)
                    System.out.print("LozaWoza ");
                else
                    System.out.print("Loza ");
                if (start % 11 == 0)
                    System.out.println();
            } else if (start % 7 == 0) {
                System.out.print("Woza ");
                if (start % 11 == 0)
                    System.out.println();
            } else if (start % 11 == 0)
                System.out.println(start);
            else
                System.out.print(start + " ");
            start++;
        }
    }


    //Tema 13 Array
    //Ex.2


    public int[] getArrayToHundred() {

        int[] myArray = new int[100];


        for (int i = 1; i <= 100; i++) {

            myArray[i - 1] = i;

            System.out.println(myArray[i - 1]);

        }

        return myArray;


    }
    //Ex.3


    public int[] getEvenArrayToHundred(int[] evenArray) {

        int j = 0;


        for (int i = 1; i <= 100; i++) {

            if (i % 2 == 0) {

                evenArray[j] = i;
                System.out.println(evenArray[j]);

                j++;

            }

        }

        return evenArray;

    }

    //Ex.4
    public float getAverageArray(int[] myArray) {

        float sum = 0;
        for (int i = 0; i <= myArray.length - 1; i++) {
            myArray[i] = i + 1;
        }

        for (int i = 0; i < myArray.length; i++) {

            sum += myArray[i];

        }
        System.out.println(sum / myArray.length);
        return (sum / myArray.length);

    }

    //Ex.5

    public boolean checkInArray(String[] arrString, String input) {

        for (int i = 0; i < arrString.length; i++) {

            if (arrString[i].equals(input)) {

                return true;

            }

        }

        return false;

    }

    //Ex.6
    public int getPositionInArray(int[] Numbers, int nr) {
        for (int i = 0; i <= Numbers.length - 1; i++) {
            Numbers[i] = i + 1;
        }

        for (int i = 0; i < Numbers.length; i++) {

            if (Numbers[i] == nr) {
                System.out.println("Numarul se afla pe pozitia: " + i);
                return i;

            }

        }

        return 0;

    }

    //Ex.7
    public void drawLines() {

        char[] line = {'-', '-', '-', '-', '-', '-', '-', '-', '-', '-',};


        for (int i = 0; i <= 10; i++) {

            System.out.println(line);

        }

    }

    //Ex.8
    public int[] removeNrFromArray(int[] myyArray, int nr) {

        for (int i = 0; i <= myyArray.length - 1; i++) {
            myyArray[i] = i + 1;
        }

        int[] secondArray = new int[myyArray.length];

        int j = 0;

        for (int i = 0; i < myyArray.length; i++) {

            if (myyArray[i] == nr)

                continue;

            secondArray[j++] = myyArray[i];

        }

        int[] finArray = new int[j];


        for (int i = 0; i < j; i++) {

            finArray[i] = secondArray[i];
            System.out.println(finArray[i]);
        }
        return finArray;

    }

    //Ex.9

    public int getSecondSmallestNrInArray(int[] mxArray) {


        int temporary = 0;
        for (int i = 0; i < mxArray.length; i++) {
            for (int j = i + 1; j < mxArray.length; j++) {
                if (mxArray[i] > mxArray[j]) {
                    temporary = mxArray[j];
                    mxArray[j] = mxArray[i];
                    mxArray[i] = temporary;
                }
            }
        }
        System.out.println("The second smallest number in the array is: " + mxArray[1]);
        return mxArray[1];
    }

    //Ex.10

    public int[] copyArray(int[] firstArray, int[] emptyArray) {


        for (int i = 0, j = 0; i < firstArray.length; i++) {

            emptyArray[j] = firstArray[i];
            System.out.println(emptyArray[j]);

            j++;

        }

        return emptyArray;

    }

    //Optional array Tema13
    //Ex1
    public int[] addOnPosition(int[] testArray, int position, int element) {
        for (int i = 0; i <= testArray.length - 1; i++) {
            if (i == position) {
                testArray[i] = element;
            }
            System.out.println(testArray[i]);
        }
        return testArray;
    }

    //Ex2
    public int getSmallestAndBiggestNrInArray(int[] numbersArray) {


        int length = numbersArray.length - 1;
        int temporarymin = 0;
        for (int i = 0; i < numbersArray.length; i++) {
            for (int j = i + 1; j < numbersArray.length; j++) {
                if (numbersArray[i] > numbersArray[j]) {
                    temporarymin = numbersArray[j];
                    numbersArray[j] = numbersArray[i];
                    numbersArray[i] = temporarymin;
                }
            }
        }
        System.out.println(numbersArray[0]);
        System.out.println(numbersArray[length]);
        return numbersArray[0];


    }
    //Ex3
    public int[] reverse(int a[], int n)
    {
        int[] b = new int[n];
        int j = n;
        for (int i = 0; i < n; i++) {
            b[j - 1] = a[i];
            j = j - 1;
        }

        System.out.println("Reversed array is: \n");
        for (int k = 0; k < n; k++) {
            System.out.println(b[k]);
        }
        return b;
    }
    //Ex4
    public int[] findDuplicates(int[] duplicate) {
        for (int i = 0; i < duplicate.length; i++) {
            for (int j = i + 1; j < duplicate.length; j++) {
                if (duplicate[i] == duplicate[j]) {
                    System.out.println("Duplicate found: "+ duplicate[i]);
                }
            }
        }
        return duplicate;
    }
    //Ex5
    public String[] findComunElements(String[] a, String[] b) {
        for (int i = 0; i < a.length ; i++){
            for (int j = 0; j < b.length ; j++){
                if (a[i].equals(b[j])){
                    System.out.println(a[i]);
                }
            }
        }
        return a;
    }
    //Ex6
    public int[] orderArray(int[] valuesArray){
        int length = valuesArray.length - 1;
        int temporarymin = 0;
        for (int i = 0; i < valuesArray.length; i++) {
            for (int j = i + 1; j < valuesArray.length; j++) {
                if (valuesArray[i] > valuesArray[j]) {
                    temporarymin = valuesArray[j];
                    valuesArray[j] = valuesArray[i];
                    valuesArray[i] = temporarymin;
                }
            }
        }
        System.out.println("Ordered array is: \n");
        for (int k = 0; k <= length; k++) {
            System.out.println(valuesArray[k]);
        }
        return valuesArray;
    }
    //Tema 14
    //Ex.1

    public void printList(List<Integer> myList){

        for (int i = 0; i<myList.size(); i++){

            System.out.println(myList.get(i));

        }

    }
    //Ex.2
    public void addNumberToList(List<Integer> myList, int number){
        myList.add(number);
        System.out.println(myList);

    }
    //Ex.3
    public void printListByIndex(List<Integer> myList, int position){

        for (int i = position;i < myList.size(); i++){

            System.out.println(myList.get(i));

        }

    }
    //Ex.4
    public void printListReversed(List<Integer> myList){

        for (int i= myList.size()-1; i >= 0;i--){

            System.out.println(myList.get(i));

        }

    }
    //Ex.5
    public void addStringToMyList(List<String> myList, int index, String text){

        myList.add(index,text);
        System.out.println(myList);

    }
    //Ex.6
    public void addNumbertoFirstIndex(List<Integer> myList, int number){

        myList.add(0,number);
        System.out.println(myList);

    }
    //Ex.7
    public void printListIndexAndElements(List<Integer> myList){

        for (int i = 0; i<myList.size(); i++)

            System.out.println("Index "+i+" are elementul "+myList.get(i));

    }
    //Ex.8
    public int getBiggestValueFromList (List<Integer> myList){

        int biggest = myList.get(0);

        for (int i=0 ; i<myList.size(); i++){

            if (myList.get(i)>biggest){

                biggest = myList.get(i);

            }

        }
        System.out.println(biggest);

        return biggest;

    }




}

