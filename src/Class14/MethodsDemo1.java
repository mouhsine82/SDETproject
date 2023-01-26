package Class14;

public class MethodsDemo1 {
    public static void main(String[] args) {
// bad approach
       int sum=0;
        int[] arr={10,20,30,45,50};
       for (int number:arr){
           sum+=number;
       }
        System.out.println(sum);


        int sum2=0;
        int[] arr1={10,10,10,20,30};
        for (int number:arr1){
            sum2+=number;
        }
        System.out.println(sum2);

        int sum3=0;
        int[] arr2={10,10,10,20,30};
        for (int number:arr2){
            sum3+=number;
        }
        System.out.println(sum3);






    }
}
