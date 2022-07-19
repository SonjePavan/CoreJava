public class LoopsDemo {


    public static void main(String[] args) {
        //for loop
        int [] arr= {10,20,30,40,60,58,24,25,96};

        for(int i=0 ; i<arr.length;i++)
            System.out.println("element at index "+i+ "is" + arr[i]);

        //while loop

        int count=0;

        while(count!=5){
            System.out.println(Math.random()*100);
            count++;
        }

        //do while loop
        //executes atleast once and continues till while condition

        do{
            System.out.println("Current Count is "+count);
            count++;
        }while(count!=7);

    }
}
