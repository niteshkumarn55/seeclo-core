public class TwoForLoop {


    public static void main(String[] args) {
        Long startTime = System.nanoTime();
        int[][] arr = new int[2][3];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = j;
                System.out.print(arr[i][j] + " ");
            }
            System.out.println(arr[0] +" "+ (System.nanoTime()-startTime));
        }

    }
}
