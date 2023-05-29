import java.util.*;
public class KthMaximum
{
    static void findKthMax(int[] arr, int k)
    {
        Queue<Integer> q=new PriorityQueue<Integer>();
        int kthmax=0;
        for(int i=0; i<arr.length; i++)
        {
            q.add(arr[i]);
            if(q.size() > k)
            {
                q.poll();
            }
            kthmax=q.peek();
        }
        System.out.println("kth max :"+kthmax);
    }

    
    public static void main(String[] args) 
    {
        int[] arr={1,2,3,4,6,8,10,9,7,5};
        int k=3;
        findKthMax(arr,k);
    }
}