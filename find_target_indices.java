class Solution {
    public List<Integer> targetIndices(int[] a, int k) {
        ArrayList<Integer> l=new ArrayList<>();
        int n=a.length;
        Arrays.sort(a);
        for(int i=0;i<n;i++){
            if(k==a[i]){
                l.add(i);
            }
        }
        Collections.sort(l);
        return l;
    }
}