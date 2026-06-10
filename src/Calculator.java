public class Calculator {
    void main() {
        System.out.println(add(5,4));
        System.out.println(subtract(9,4));
        System.out.println(multiplication(8,5));
        System.out.println(division(8,0));
        System.out.println(modulus(8,5) );
    }
    public float add(float a, float b) {
        return a+b;
    }
    public int subtract(int a, int b) {
        return a-b;
    }
    public int multiplication(int a, int b){
        return a*b;
    }
    public int division(int a, int b){
        return a/b;
    }
    public int modulus(int a ,int b){
        return a%b;
    }
}


