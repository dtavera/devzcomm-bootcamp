import java.util.Arrays;

public class Problem3 {
    
    static int[] getRow(int rowIndex) {
        int[] pascal = new int[rowIndex + 1];
        pascal[0] = 1;
        pascal[pascal.length - 1] = 1;
        for(int i = 1; i < pascal.length - 1; i++) {
            int[] data = getRow(rowIndex - 1);
            pascal[i] = data[i - 1] + data[i];
        }
        return pascal;
    }
    public static void main(String[] args) {
        int rowIndex = 5;
        System.out.println(Arrays.toString(getRow(rowIndex)));
    }
}
