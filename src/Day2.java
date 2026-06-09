public class Day2 {
    void main(){
        int a=5;
        //row loop
        for(int row = 1;row<= a;row++){
            //column loop
            for(int column = 1;column <= row;column++){
                System.out.print(column);
            }
            System.out.println();
        }
    }
}
