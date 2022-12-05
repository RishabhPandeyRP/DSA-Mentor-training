import java.util.HashSet;

class Solution {
    public int[] singleNumber(int[] a) {
        HashSet<Integer> set=new HashSet<>();
        for(int i:a){
            if(!set.contains(i)){
                set.add(i);
            }
            else{
                set.remove(i);
            }
        }
        int[] b=new int[2];
        int i=0;
        for(int n:set){
            b[i++]=n;
        }
        return b;
    }
}