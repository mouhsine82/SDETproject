package JavaProjects;

public class JPTask_9 {
    public static void main(String[] args) {

       /*
       9)Maximum and minimum number in the array.
        */

        int[] arr={113,23,43,167,1590};

        int min=arr[0];
        int max=arr[0];

        for (int i = 0; i < arr.length ; i++) {
            if(arr[i]>max)
                max=arr[i];
            if(arr[i]<min)
                min=arr[i];


        }
        System.out.println("Minimum value is: "+min);
        System.out.println("Maximum value is: "+max);

    }
}
