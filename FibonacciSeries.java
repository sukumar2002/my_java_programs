//FibonacciSeries Program
public class FibonacciSeries
{
    public static void main(String[] args)
    {
        int fn=0,sn=1;
       System.out.print(fn+" "+sn+" ");
        for(int i=3;i<=10;i++)
        {
            int nn=fn+sn;
            System.out.print(nn+" ");
            sn=nn;
            fn=sn;
        }
    }
}
