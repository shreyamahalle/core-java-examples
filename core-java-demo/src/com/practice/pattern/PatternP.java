package src.com.practice.pattern;

public class PatternP {
    public static void main(String[] args) {
        int col = 0;
        while(col < 5) {
            //System.out.println(col);

            int row = 0;
            while(row <=  col) {
                System.out.print(row + "\t");
                row++;
            }
            System.out.println();
            col++;
        }
    }
}
