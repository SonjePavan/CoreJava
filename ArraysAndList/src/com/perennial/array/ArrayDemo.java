package com.perennial.array;

import java.util.logging.Level;
import java.util.logging.Logger;
public class ArrayDemo {
    private static Logger logger=Logger.getLogger("ArrayDemo.class");
    public static void main(String[] args) {
        int [] integerArray={1957,3648,5697,5896,3458,62,87,9648,65248,62458,31458,45218};

        printArray(integerArray);
        sortArrayAsc(integerArray);
        printArray(integerArray);
        sortArrayDesc(integerArray);
        printArray(integerArray);
        int minimum=findMinimum(integerArray);
        logger.log(Level.INFO,"Minimum number from array is {0}",minimum);






    }

    private static void printArray(int[] integerArray) {
        for(int i=0 ; i<integerArray.length;i++)
            System.out.print(integerArray[i] + " ");

            System.out.println("");

    }

    private static void sortArrayDesc(int[] integerArray) {
        for(int i=0;i<integerArray.length;i++)
        {   int temp=0;
            for(int j=i+1;j<integerArray.length;j++)
            {   temp=integerArray[i];
                if(temp<integerArray[j])
                {
                    integerArray[i]=integerArray[j];
                    integerArray[j]=temp;
                }

            }
        }
    }
    private static void sortArrayAsc(int[] integerArray) {
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
    }

    private static int findMinimum(int[] integerArray) {
        int min=integerArray[0];
        for(int i=1; i< integerArray.length;i++){
            if(min>integerArray[i])
                min=integerArray[i];
        }
        return min;
    }
}
