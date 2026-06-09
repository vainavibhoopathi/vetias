public class Day1 {
    void main() {
        int[] marks = {48, 38, 69, 70, 98};

        for (int i = 0; i < marks.length; i++) {
            int mark = marks[i];
            if(marks[i]>40){
                System.out.println("Pass marks"+mark);
            }
            else{
                System.out.println("Fail Marks"+mark);
            }
        }
}}



















