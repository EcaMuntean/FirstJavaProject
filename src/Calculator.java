public class Calculator {
    public int adunare(int primulNumar, int aldoileaNumar){

    return primulNumar + aldoileaNumar;

    }
    public int adunare(int primulNumar, int aldoileaNumar, int altreileaNumar){

        return  primulNumar + aldoileaNumar + altreileaNumar;

    }
    public int adunare(float primulNumar, int aldoileaNumar){

        return  (int)primulNumar + aldoileaNumar ;

    }
    public int scadere(int primulNumar, int aldoileaNumar){
        int rezultat = primulNumar - aldoileaNumar;
        return rezultat;
    }
    public int scadere(int primulNumar, int aldoileaNumar, int altreileaNumar) {
        int rezultat = primulNumar - aldoileaNumar - altreileaNumar;
        return rezultat;
    }
    public double scadere(double primulNumar, double aldoileaNumar){
        return primulNumar - aldoileaNumar;
    }
    public int inmultire(int primulNumar, int aldoileaNumar){
        int rezultat = primulNumar*aldoileaNumar;
        return rezultat;
    }
    public int inmultire(int primulNumar, int aldoileaNumar, int altreileaNumar){
        int rezultat = primulNumar * aldoileaNumar * altreileaNumar;
        return rezultat;
    }
    public int inmultire(int primulNumar, int aldoileaNumar, int altreileaNumar, int alpatruleaNumar){
        int rezultat = primulNumar * aldoileaNumar * altreileaNumar * alpatruleaNumar;
        return rezultat;
    }
    public int impartire(int primulNumar, int aldoileaNumar) {
        int rezultat = primulNumar / aldoileaNumar;
        return rezultat;
    }
    public int medie(int firstNumber, int secondNumber, int thirdNumber){
        int result = (firstNumber + secondNumber + thirdNumber)/3;
        return result;
    }
    public double restImpartire(double firstNumber,double secondNumber){
        double result = firstNumber % secondNumber;
        return result;
    }
    public double tempConversion(double fahrenheit){
        double celsius =  ((fahrenheit-32)*5)/9;
        return celsius;
    }
    public double distConversion(double inches){
        double meter = inches / 39.37;
        return meter;
    }

}
