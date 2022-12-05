class Solution {
    public void sortColors(int[] a) {
        int n=a.length;
        int temp;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(a[i]<a[j]){
                    temp=a[j];
                    a[j]=a[i];
                    a[i]=temp;
                }
            }
        }
       
        for(int i:a){
            System.out.print(i+" ");
        }
    }
}