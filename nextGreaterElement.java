import java.util.*;

public class nextGreaterElement{

    public static int[] nextGreater(int arr[])
    {
        Stack <Integer> s=new Stack<>();
        int res[]=new int[arr.length];

        res[arr.length-1]=-1;
        s.push(arr[arr.length-1]);

        for(int i=arr.length-2;i>=0;i--)
        {
            while(!s.isEmpty() && s.peek()<=arr[i] )
            {
                s.pop();
            }

            if(s.size()==0) res[i]=-1;
            else res[i]=s.peek();
            s.push(arr[i]);
        }
        return res;

    }
    public static void main(String[] args) {
        int arr[]={1,5,3,2,1,6,3,4};
        int f[]=nextGreater(arr);

        for(int i:f)
        {
            System.out.print(i+" ");
        }
    }
}