class ProductOfNumbers {

    List<Integer> list=new ArrayList<>();

    public ProductOfNumbers() {
        
    }
    
    public void add(int num) {
        list.add(num);
    }
    
    public int getProduct(int k) {
        int p=1;
        int index=list.size()-1;
        while(k-- > 0){
            p*=list.get(index);
            index--;
        }
        return p;
    }
}

/**
 * Your ProductOfNumbers object will be instantiated and called as such:
 * ProductOfNumbers obj = new ProductOfNumbers();
 * obj.add(num);
 * int param_2 = obj.getProduct(k);
 */