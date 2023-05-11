class Solution {
    public int removeDuplicates(int[] a) {
        int k=1,n=a.length;
        for(int i=1;i<n;i++){
            if(a[k-1]!=a[i]){
                a[k]=a[i];
                k+=1;
            }
        }
        return k;
    }
}