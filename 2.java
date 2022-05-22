public class Main 
{
    public static void main(String[] args)
    {
        int fn = 0, sn = 1, nn = fn+sn,sum=0;
        while (nn <= 4000000)
        {
            fn = sn;
            sn = nn;
            nn = fn + sn;
            if(nn%2==0)
            {
                sum+=nn;
            }
        }
        System.out.println(sum);
    }
}
