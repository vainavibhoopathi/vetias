/*public class Day4 {
    void main() {
        int[][] marks = new int[3][3];
        int[][] studentmarks = {
                {90, 80, 70},
                {70, 60, 50},
                {67, 84, 73}
        };
        for (int row = 0; row < studentmarks.length; row++){
        for (int col= 0; col< studentmarks[row].length; col++) {
            System.out.print(studentmarks[row][col] + " ");
        }
            System.out.println();
        }
}
}
*/

public class Day4 {
    void main() {
        //size of array
        int[][] marks = new int[5][3];
        //getting array elements
        int[][] studentattendance = {
                {0, 1, 0},
                {1, 0, 0},
                {1, 1, 1},
                {1, 0, 1},
                {0, 0, 0}
        };
        //calculating row and col
        for (int row = 0; row < studentattendance.length; row++){
            // count of students
            System.out.println("\nStudent "+(1+row)+":");
            for (int col= 0; col< studentattendance[row].length; col++) {
                //printing 1 as present & 0 as absent
            if(studentattendance[row][col] == 1){
                System.out.print("Class"+(1+col)+": Present");
            } else {
                System.out.print("Class"+(1+col)+": Absent");
            }
                System.out.println();
        }
        }
}
}
