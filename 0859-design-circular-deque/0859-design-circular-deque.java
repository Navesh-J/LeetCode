class MyCircularDeque {
    int arr[];
    int front,rear,size,cap;
    public MyCircularDeque(int k) {
        cap=k;
        arr=new int[k];
        front=0;
        rear=k-1;
        size=0;
    }
    
    public boolean insertFront(int value) {
        if(isFull()) return false;
        front=(front-1+cap)%cap;
        arr[front]=value;
        size++;
        return true;
    }
    
    public boolean insertLast(int value) {
        if(isFull()) return false;
        rear=(rear+1)%cap;
        arr[rear]=value;
        size++;
        return true;
    }
    
    public boolean deleteFront() {
        if(isEmpty()) return false;
        front=(front+1)%cap;
        size--;
        return true;
    }
    
    public boolean deleteLast() {
        if(isEmpty()) return false;
        rear=(rear-1+cap)%cap;
        size--;
        return true;
    }
    
    public int getFront() {
        return isEmpty()?-1:arr[front];
    }
    
    public int getRear() {
        return isEmpty()?-1:arr[rear];
    }
    
    public boolean isEmpty() {
        return size == 0;
    }
    
    public boolean isFull() {
        return size == cap;
    }
}

/**
 * Your MyCircularDeque object will be instantiated and called as such:
 * MyCircularDeque obj = new MyCircularDeque(k);
 * boolean param_1 = obj.insertFront(value);
 * boolean param_2 = obj.insertLast(value);
 * boolean param_3 = obj.deleteFront();
 * boolean param_4 = obj.deleteLast();
 * int param_5 = obj.getFront();
 * int param_6 = obj.getRear();
 * boolean param_7 = obj.isEmpty();
 * boolean param_8 = obj.isFull();
 */