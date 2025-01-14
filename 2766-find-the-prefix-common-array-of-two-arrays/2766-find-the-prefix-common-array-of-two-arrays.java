class Solution {
    public int[] findThePrefixCommonArray(int[] a, int[] b) {
        int n=a.length;
        int c[]=new int[n];
        int cc=0;
        int count[]=new int[51];
        for(int i=0;i<n;i++){
            count[a[i]]++;
            count[b[i]]++;
            if(count[a[i]] == 2 && b[i]!=a[i]) cc++;
            if(count[b[i]] == 2 && a[i]!=b[i]) cc++;
            if(a[i]==b[i]) cc++;
            c[i]=cc;
        }
        return c;
    }
}