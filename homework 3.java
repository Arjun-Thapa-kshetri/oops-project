package twentytwo.fall.oop.l3.c3;

public class M22W0385 {


    public static void main(String[] args) {

        //input numbers of random byte array numbers of 1,2 and random data type number between -5 and +5. -4, -5,6.
        byte[] arr = {1, 2, -4, -5, 3, 6};
        //initialize variable for countNegativeNumbers with zero
        int NegativeNumbers = 0;
        //initialize variable for multiplicationNumber with 1.
        int multiplicationNumber = 1;
        for(int i =0; i<arr.length; i++) {

            //This show that it ignore zero values
            if(arr[i]== 0) {
                continue;
            }
            //break loop if value is 4
            if(arr[i]==4) {
                break;
            }

            //count negative numbers
            if(arr[i]<0) {
                NegativeNumbers++;
            }
            //multiply even index values
            if(i%2==0) {
                multiplicationNumber*=arr[i];
            }
        }
        System.out.println("The number of negative numbers is: " + NegativeNumbers);
        System.out.println("The multiplication numbers is: " + multiplicationNumber);

    }

}