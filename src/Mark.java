public class Mark {
    void main() {
        int[][] marks = new int[5][3];
        int[][] mark = {
                {78, 90, 34},
                {89, 65, 89},
                {12, 34, 56},
                {66, 12, 89},
                {33, 77, 88},
        };
        for (int row = 0; row < marks.length; row++) {
            int total = 0;
            for (int col = 0; col < marks.length; col++) {
                total += marks[row][col];
            }
            double avg = total / 3.0;
            System.out.println("student" + (row + 1));
            System.out.println("Total" + total);
            System.out.println("average" + avg);
        }
    }
}
public class day44{
    public static void main(string[]args) {
        int[][] marks = new int[5][3];
        int[][] mark = {
                {78, 90, 34},
                {89, 65, 89},
                {12, 34, 56},
                {66, 12, 89},
                {33, 77, 88},
        };
        for (int row=0;row<marks.length;row++){
            int total=0;
            for (int col=0;col<marks.length;col++){
                total+=marks[row][col];
            }
            double avg=total/3.0;
            System.out.println("Student" + (row + 1));
            System.out.println("Total" + total);
            System.out.println("Average" + avg);
        }
    }
}