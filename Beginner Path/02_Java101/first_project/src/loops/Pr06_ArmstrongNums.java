/**
 * Armstrong numbers 10 to 999
 */
package loops;
public class Pr06_ArmstrongNums {
    public static void main(String[] args) {

        System.out.println("Armstrong Numbers 10 to 999");
        for(int k=10; k<1000; k++) {
            int digitNum=0, val=0, Armstrong=0;

            int buff = k;
            while(buff != 0) {
                buff /= 10;
                digitNum++;
            }

            buff = k;
            while(buff != 0) {
                val = buff % 10;
                buff /= 10;

                int total = 1;
                for(int i=0; i<digitNum; i++)
                    total *= val;

                Armstrong += total;
            }

            if(k == Armstrong)
                System.out.print(k + " ");
        }
    }
}
