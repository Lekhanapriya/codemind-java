import java.util.Scanner;
class Sample
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        {
            int n,rem,sum=0,product=1;
            n=sc.nextInt();
            while(n>0)
            {
                rem=n%10;
                sum=sum+rem;
                product=product*rem;
                n=n/10;
            }
            if(sum==product)
            {
                System.out.println("Spy Number");
            }
            else
            {
                System.out.printf("Not Spy Number ");
            }
        }
    }
}