public class Day {
    void main() {
        int[] marks = {87, 32, 44, 89, 23};
        System.out.print("Pass marks: ");
        for (int mark : marks) {
            if (mark >= 40) {
                System.out.print(mark +", ");
            }
        }

        System.out.print("\nFail marks:");
        for (int mark : marks) {
            if (mark < 40) {
                System.out.print(mark +", ");
            }
        }
    }
}


/*void main() {
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
*/
 