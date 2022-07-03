public class LogicalOperations {
    public String verifyText (String textInput){
        if (textInput.equals("FastTrack")) {
           String succes = "Learning text comparison";
           return succes;


        }else {
            return "Got to try some more";

        }
    }
    public int verifyNumber (int number)
    {
        if ( number >= 2 && number <= 8){
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
        if (snow > 8 | snow == 6){
          return "The amount of snow this winter was(cm): " + snow;

        }
        return "The forecast snow is(cm):" + snow;
    }
    public String verifyNumbers(int  number){
        if(number > 3 && number !=4) {
            return "The number is greater than 3 and not equal to 4";
        }
        else if (number == 4){
            return  "The number is equal to 4";

        }else if (number <3){
            return "The number is lower than 3";
        }return "Not applicable";
    }
    public int writeNumber(int number){
        switch (number){
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
    public boolean isNumberEven(int number){
        if (number % 2 == 0){
            return true;
        }
        return false;
    }
    public boolean isEligibleToVote(int number){
        if (number >= 18){
            return true;
        }else if(number < 18){
        return false;
        }
        return false;
    }
    public String verifyGreatNumber(int first, int second, int third){
        if (first > second && first > third){
            return "The greater number is :" + first;

        }else if (second > first && second > third){
            return "The greater number is :" + second;


        }else if(third >first && third > second){
            return "The greater number is :" + third;
        }
        return"Not aplicable";
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
    public void printBetweenNumbers(int a, int b){
        if (a < b){
            for (int i = a; i <= b; i++) {
                System.out.println(i);
        }
        }else if (a > b){
            for (int i = a; i >= b; i--) {
                System.out.println(i);
            }
        }
    }
    //Ex 4
    public void printFromSmallToBig(int a, int b){
        if (a > b){
            for (int i = b; i <= a; i++){
                System.out.println(i);
            }
        }else {
            for (int i = a; i <= b; i++){
                System.out.println(i);
            }
        }
    }
    //Ex 5
    public void printEvenToHundred(){
        for (int i = 1; i <= 100; i++){
            if (i % 2 == 0){
                System.out.println(i);
            }
        }
    }
    //Ex 6
    public void printOddToHundred(){
        for (int i = 1; i <= 100; i++){
            if (i % 2 != 0){
                System.out.println(i);
            }
        }
    }
    //Ex 7
    public void printSumToHundred(int c){
        int sum = 0;
        for (int i = c; i <= 100; i++){
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
        System.out.println(sum/count);
    }
    //Ex 9
    public void printModel(){

        for (int i = 6; i >= 0; i--)
        {
            for(int j=0; j <= i; j++)
            {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }

    //Tema 12 While Loops
    //Ex 1
    public void wCountToHundred(int x){
        while (x <=100){
            System.out.println(x);
            x++;
        }
    }
    //Ex 2
    public void wCountToMinusHundred(int x){
        while (x >= -100){
            System.out.println(x);
            x--;
        }
    }
    //Ex 3
    public void wCountBetweenNumbers(int a, int b){
        if (a < b){
            while (a <= b){
                System.out.println(a);
                a++;
            }
        }else {
            while (a >= b){
                System.out.println(a);
                a--;
            }
        }
    }
    //Ex 4
    public void wCountFromSmallToBig(int a, int b){
        if (a < b){
            while (a <= b){
                System.out.println(a);
                a++;
            }
        }else {
            while (b <= a){
                System.out.println(b);
                b++;
            }
        }

    }
    //Ex 5
    public void wPrintEvenToHundred(){
        int start = 1;
        int finish = 100;
        while (start <= finish){
            if (start % 2 == 0){
                System.out.println(start);
                }
            start++;
        }
    }
    //Ex 6
    public void wPrintOddToHundred(){
        int start = 1;
        int finish = 100;
        while (start <= finish){
            if (start % 2 != 0){
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
        System.out.println(sum/count);
        return sum/count ;
    }
    //Ex 8
    public void wGetAverage(int a , int b){
        double count = 0 ;
        int sum = 0;
        while (a <= b){
            if (a % 7 ==0 ){
             sum = sum +a ;
             count ++;

            }
            a++;

        }
        System.out.println( sum/count);

    }
    //Ex 9
    public void fibonacci(){
        int n1 = 0 , n2 = 1 , n3 , count = 20 , start = 2 ;
        System.out.print(n1+" "+n2);
        while (start <= count ){
            n3=n1+n2;
            System.out.print(" "+n3);
            n1=n2;
            n2=n3;
            start++ ;
        }
    }
    //Ex 10
    public void cozaLozaWoza(){
        System.out.println("");
        int start = 1;
        while (start <= 110){
            if(start % 3 == 0) {
                if(start % 5 == 0) {
                    if(start % 7 == 0)
                        System.out.print("CozaLozaWoza ");
                    else
                        System.out.print("CozaLoza ");
                }
                else if(start % 7 == 0)
                    System.out.print("CozaWoza ");
                else
                    System.out.print("Coza ");
                if(start % 11 == 0)
                    System.out.println();
            }
            else if(start % 5 == 0) {
                if(start % 7 == 0)
                    System.out.print("LozaWoza ");
                else
                    System.out.print("Loza ");
                if(start % 11 == 0)
                    System.out.println();
            }
            else if(start % 7 == 0) {
                System.out.print("Woza ");
                if(start % 11 == 0)
                    System.out.println();
            }
            else if(start % 11 == 0)
                System.out.println(start);
            else
                System.out.print(start + " ");
            start++;
        }
    }







}

