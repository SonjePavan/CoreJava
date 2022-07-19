import java.util.Scanner;
import java.util.logging.Level;


/*
* Since an array is static in nature
* i.e. you cannot change the size of an array once created,
* So, if you need an array which can resize itself then you should use the ArrayList.
* This is the fundamental difference between an array and an ArrayList*/
public class SortArray {
    private static Scanner sc= new Scanner(System.in);
    private static  java.util.logging.Logger logger = java.util.logging.Logger.getLogger("SortArray.class");

    public static void main(String[] args) {

        int [] integerArray={1957,3648,5697,5896,3458,62,87,9648,65248,62458,31458,45218};

        sortArrayDesc(integerArray); //descending
        logger.info("array after descending sort ");
        printarray(integerArray);

        //find minimum from array
        int minimum=findMinimum(integerArray);
        logger.log(Level.INFO,"\nminimum value from array is {}",minimum);


        //reverse array
        reverseArray(integerArray);
        logger.info("after reversing array");
        printarray(integerArray);
    }



    private static int findMinimum(int[] integerArray) {
        int min=integerArray[0];
        for(int i=1; i< integerArray.length;i++){
            if(min>integerArray[i])
                min=integerArray[i];
        }
        return min;
    }

    private static void sortArrayDesc(int[] integerArray) {
        for(int i=0;i<integerArray.length;i++)
        {   int temp=0;
            for(int j=i+1;j<integerArray.length;j++)
            {   temp=integerArray[i];
                if(temp>integerArray[j])
                {
                    integerArray[i]=integerArray[j];
                    integerArray[j]=temp;
                }

            }
        }
        System.out.println();
    }

    private static int[] getIntegers(int size) {
        int [] arr=new int[size];
        logger.info("enter " + size + " integer values");
            for(int i=0;i<arr.length;i++)
                arr[i]=sc.nextInt();

           return arr;

    }

    private static void  printarray(int [] arr)
    {
        for(int i=0;i<arr.length;i++){

        }

    }

    private static void reverseArray(int[] integerArray) {
        int j=integerArray.length-1;
        for(int i=0 ; i<integerArray.length/2;i++)
        {
            int temp=integerArray[i];
            integerArray[i]=integerArray[j];
            integerArray[j]=temp;
            j--;

        }

    }

}
