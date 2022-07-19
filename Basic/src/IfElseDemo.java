public class IfElseDemo {

    public static void main(String[] args) {

        int num=1;

        boolean prime=isPrime(num);

        //if else
        if(prime)
            System.out.println(num+" is prime number");
        else
            System.out.println(num + " isn't prime number");

        //if elseif else

        if(prime)
            System.out.println(num+" is prime number");
        else if(num==0 || num==1)
            System.out.println(num + " isn't prime number from else if block");
        else
            System.out.println(num + " isn't prime number");

        //ternary operator
        String s = prime ? num + " is prime number" : num + " isn't prime number";
        System.out.println(s);


    }

    private static boolean isPrime(int num) {
        if(num==0 || num==1)
            return false;

        int count=0;
        for(int i=1 ; i<=num;i++)
        {
            if(num%i==0)
                count++;
            if(count>2)
                break;
        }
        if(count==2)
            return true;
        else
            return false;

    }
}
