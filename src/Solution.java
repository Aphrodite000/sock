import java.util.Scanner;

public class Solution {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t!=0){
            int n=sc.nextInt();
            int[] a=new int[n];
            int sum=0;
            for(int i=0;i<n;i++){
                a[i]=sc.nextInt();
                sum=sum+a[i];
            }
            if(sum>n){
                System.out.println(n+1);
            }
            int count=0;
            if(sum<=n){
                for(int i=0;i<n;i++){
                    if(a[i]>=2){
                        count++;
                        System.out.println(sum);
                    }
                }
                if(count==0){
                    System.out.println(-1);
                }
            }
            t--;
        }
    }
}
