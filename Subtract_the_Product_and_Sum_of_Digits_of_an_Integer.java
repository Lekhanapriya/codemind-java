import java.util.Scanner;
class Sample
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,rem,sum=0,product=1,difference;
        n=sc.nextInt();
        while(n>0)
        {
            rem=n%10;
            sum=sum+rem;
            product=product*rem;
            n=n/10;
        }
        difference=product-sum;
        System.out.printf("%d",difference);
        
    }
}