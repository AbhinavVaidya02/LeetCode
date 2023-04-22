/**
 * LeetCode231_PowerOfTwo
 * Addition to test git status of this file
 * File addition2
 */
public class LeetCode231_PowerOfTwo 
{

    public static void main(String[] args) {
        boolean a= isPowerOfTwo(17); //change numaccordingly
        if(a)
            System.out.println("Power of two");
        else
        System.out.println("not a Power of two");
    }
    public static boolean isPowerOfTwo(int n) 
    {
        
        for(int i=0;i<=30;i++)
        {
            double ans = Math.pow(2,(double)i);
            if(ans == (double)n)
                return true;
        }
        return false;
    }
    //Another appreach 
    // of No. of set bits are equal to 1 then it is num is power of 2
    // num=8
    // bit representation = 1000  -> no of 1's = 1 so num=8 is power if two

    /*
        int noOfSetBit=0;
     * while(n != 0)
		{
		    int bit =n & 1;
		    if(bit==1)
		    {
		        noOfSetBit++;
		    }
		    ans = (bit * Math.pow(10,i))+ans;
		    
		    n=n>>1;
		    i++;
		}
		System.out.print(ans);
		if(noOfSetBit==1)
		{
		    System.out.println("\n"+x+" is power of 2");
		}
		else
		{
		    System.out.println("\n"+x+" is not power of 2");
		}
     */
}