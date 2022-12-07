class Solution {
    public int search(int[] a, int k) {
        int n=a.length;
        int i,j;
        if(n%2!=0){
            i=j=(n/2);
        }
        else{
            j=n/2;
            i=(n/2)-1;
        }
        while(i>=0 && j<=(n-1)){
            if(a[i]==k){
                return i;
            } else i--;

            if(a[j]==k){
                return j;
            } else j++;
        }
        return -1;
    }
}