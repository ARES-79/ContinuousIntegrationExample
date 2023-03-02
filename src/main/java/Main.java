public class Main {
    public static void main(String[] args){
        hypotenuse(3,4);
    }

    public static double hypotenuse(double a, double b){
        return Math.sqrt(  Math.pow(a,2) + Math.pow(b,2)  );
    }
}
