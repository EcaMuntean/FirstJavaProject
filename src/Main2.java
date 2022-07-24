public class Main2 {



    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        printMyName();

        System.out.println("The result is: " + sum(10, 15));
        System.out.println("The result is: " + divide(15,7));
        System.out.println("The result is: " + operation1(-5,8,6));
        System.out.println("The result is: " + operation2(55,9,9));
        System.out.println("The result is: " + operation3(20,-3,5,8));
        System.out.println("The result is: " + operation4(5,15,3,8,2));
        System.out.println("The result is: " + adunare(2, 3));
        System.out.println("The result is: " + calculator.adunare(3,5,9));
        System.out.println("The resul is : " + calculator.adunare(2.5f,4));
        System.out.println("The result is: " + scadere(10, 7));
        System.out.println("The result is: " + calculator.scadere(100,50,25));
        System.out.println("The result is: " + calculator.scadere(5.6,2.9));
        System.out.println("The result is: " + inmultire(10, 5));
        System.out.println("The result is: " + calculator.inmultire(4,7,9));
        System.out.println("The result is: " + calculator.inmultire(4,7,9,3));
        System.out.println("The result is: " + impartire(10, 5));
        printJava();
        System.out.println("The result is: " + medie(10,15,20));
        printModel();
        System.out.println("The result is: " + restImpartire(30,5));
        System.out.println("The temperature in celsius is: " + tempConversion(200));
        System.out.println("The distance in meter is: " + distConversion(100));
     //   System.out.println("The result is: " + speedConversion(3000, 3,10,7));
    }

    //Methods
    public static void printMyName() {

        System.out.println("Hello \nEcaterina");

    }

    public static int sum(int firstNumber, int secondNumber) {

        int result = firstNumber + secondNumber;

        return result;
    }
    public static double divide(int firstNumber, double secondNumber){
        double result = firstNumber / secondNumber;
        return result;

    }
    public static int operation1(int firstNumber, int secondNumber, int thirdNumber){
        int result = firstNumber + secondNumber * thirdNumber;
        return result;
    }
    public static int operation2(int firstNumber, int secondNumber, int thirdNumber){
        int result = (firstNumber + secondNumber) % thirdNumber;
        return result;
    }
    public static double operation3(double firstNumber, double secondNumber, double thirdNumber, double fourthNumber){
        double result = firstNumber + secondNumber * thirdNumber / fourthNumber;
        return result;
    }
    public static double operation4(double firstNumber, double secondNumber, double thirdNumber, double fourthNumber, double fifthNumber){
        double result = firstNumber + secondNumber / thirdNumber * fourthNumber - fifthNumber % thirdNumber;
        return result;
    }
    public static int adunare(int primulNumar, int aldoileaNumar){
        int rezultat = primulNumar + aldoileaNumar;
        return rezultat;
    }
    public static int scadere(int primulNumar, int aldoileaNumar){
        int rezultat = primulNumar - aldoileaNumar;
        return rezultat;
    }
    public static int inmultire(int primulNumar, int aldoileaNumar){
        int rezultat = primulNumar*aldoileaNumar;
        return rezultat;
    }
    public static int impartire(int primulNumar, int aldoileaNumar){
        int rezultat = primulNumar/aldoileaNumar;
        return rezultat;
    }
    public static void printJava(){
        System.out.println(
                "   J    a  v     v  a\n"+
                "   J   a a  v   v  a a\n"+
             "J  J  aaaaa  v v  aaaaa\n "+
             "JJ  a     a  v  a     a \n"

        );
    }
    public static int medie(int firstNumber, int secondNumber, int thirdNumber){
        int result = (firstNumber + secondNumber + thirdNumber)/3;
        return result;
    }
    public static void printModel(){
        System.out.println(
                "  + \"\"\"\"\" +\n"+
                "[ |  O O  | ]\n"+
                "  |   ^   |\n" +
                "  |  '_'  |\n" +
                "  + ----- +"
        );
    }
    public static double restImpartire(double firstNumber,double secondNumber){
        double result = firstNumber % secondNumber;
        return result;
    }
    public static double tempConversion(double fahrenheit){
        double celsius =  ((fahrenheit-32)*5)/9;
        return celsius;
    }
    public static double distConversion(double inches){
        double meter = inches / 39.37;
        return meter;
    }



}

