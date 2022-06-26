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


}

