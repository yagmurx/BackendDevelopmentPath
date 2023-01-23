package Arrays;

public class _02_multidimensionalArrays {
    public static void main(String[] args) {
        int[][] matrix = new int[6][6];

        matrix[0][3] = 5;
        matrix[2][5] = 20;
        System.out.println(matrix[0][3] + " " + matrix[2][5]);

        int[][] distance = {
                {0, 453, 939, 243, 783, 891},
                {453, 0, 490, 384, 620, 439},
                {939, 490, 0, 839, 863, 423},
                {243, 384, 839, 0, 544, 823},
                {783, 620, 863, 544, 0, 1045},
                {891, 439, 423, 823, 1045, 0}
        };

        System.out.println(distance[4][5]);

        int[][] random = new int[3][4];
        int count = 1;
        for(int i=0; i < random.length; i++) {
            for(int j=0; j < random[0].length; j++){
                random[i][j] = count;
                System.out.print(random[i][j] + " ");
                count++;
            }
            System.out.println();
        }
    }
}
