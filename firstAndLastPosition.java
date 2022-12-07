class Solution {
    public int[] searchRange(int[] a, int k) {
        ArrayList<Integer> l=new ArrayList<>();
        ArrayList<Integer> l2=new ArrayList<>();
        int n=a.length;
        int i,j;
        if(n%2!=0){
            i=j=(n/2);
        }
        else{
            j=n/2;
            i=(n/2)-1;
        }
        
        while(i>=0 && j<=n-1){
            if(a[i]==k){
                l.add(i);
            }
            if(a[j]==k){
                l.add(j);
            }
            i--;
            j++;
        }
        if(l.isEmpty()){
            l2.add(-1);
            l2.add(-1);
        }
        else{
            l2.add(Collections.min(l));
            l2.add(Collections.max(l));
        }
        int [] b=new int[2];
        b[0]=l2.get(0);
        b[1]=l2.get(1);
        return b;
    }
}