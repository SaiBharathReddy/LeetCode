class Solution {
    public int romanToInt(String s) {
        int i=s.length()-1,r=0,i1,i2,k,f,se,prev=0;
        char c,c1;
        int arr1[]={1,5,10,50,100,500,1000};
        String arr="IVXLCDM";
        c=s.charAt(i);
        i1=arr.indexOf(c);
        prev=arr1[i1];
        r=prev;
        if(i==0){
            return r;
        }
        i-=1;
        while(i>=0){
            c=s.charAt(i);
            i1=arr.indexOf(c);
            f=arr1[i1];
            if(f<prev){
                r=r-f;
            }
            else{
                r=r+f;
            }
            prev=f;
            i-=1;
        }
        return r;
    }
}