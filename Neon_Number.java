import java.util.Scanner;
class Sample
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,rem,sum=0,p;
        n=sc.nextInt();
        p=n*n;
        while(p!=0)
        {
            rem=p%10;
            sum=sum+rem;
            p=p/10;
        }
        if(sum==n)
        {
            System.out.println("Neon Number");
        }
        else
        {
            System.out.println("Not Neon Number");
        }
    }
}