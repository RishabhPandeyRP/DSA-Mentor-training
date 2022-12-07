class Solution {
    public int findPeakElement(int[] a) {
        int n=a.length;
        if(n==1) return 0;
        if(n==2){
            int i=0,j=1;
            if(a[j]>a[i]) return j;
            else return i;
        }
        else{
            int i=1,j=n-2,c=0;
            if(a[0]>a[1]) return 0;
            if(a[n-1]>a[n-2]) return n-1;
        while(i<=j){
            if(a[i]>a[i+1] && a[i]>a[i-1]){
                c=i;
                break;
            } else i++;
            if(a[j]>a[j+1] && a[j]>a[j-1]){
                c=j;
                break;
            } else j--;
        }
        return c;
        }
    }
}