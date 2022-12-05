import java.util.Arrays;

class Solution
{
    boolean checkIsAP(int a[] ,int n)
    {
        int c=0;
        Arrays.sort(a);
        int d=a[1]-a[0];
        for(int i=0;i<n-1;i++){
            if((a[i+1]-a[i])!=d){
                c++;
                break;
            }
        }
        if(c!=0) return false;
        else return true;
        
    }
}