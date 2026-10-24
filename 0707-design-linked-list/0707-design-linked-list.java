class MyLinkedList {
    class Node{
        int val;
        Node next;
        Node(int val){
            this.val=val;
            this.next=null;
        }
    }
    Node head;
    int size;
    public MyLinkedList() {
        head=null;
        size=0;
    }
    
    public int get(int index) {
        if(index<0 || index>=size) return -1;
        Node cur=head;
        for(int i=0;i<index;i++){
            cur=cur.next;
        }
        return cur.val;
    }
    
    public void addAtHead(int val) {
        Node naya=new Node(val);
        naya.next=head;
        head=naya;
        size++;
    }
    
    public void addAtTail(int val) {
        Node naya=new Node(val);
        if(head==null){
            head=naya;
            size++;
            return;
        }
        Node cur=head;
        while(cur.next!=null){
            cur=cur.next;
        }
        cur.next=naya;
        size++;
    }
    
    public void addAtIndex(int index, int val) {
        if(index<0 || index>size) return;
        if(index==0){
            addAtHead(val);
            return;
        }
        Node cur=head;
        for(int i=0;i<index-1;i++){
            cur=cur.next;
        }
        Node naya=new Node(val);
        naya.next=cur.next;
        cur.next=naya;
        size++;
    }
    
    public void deleteAtIndex(int index) {
        if(index<0 || index>=size) return;
        if(index==0){
            head=head.next;
        }else{
            Node cur=head;
            for(int i=0;i<index-1;i++){
                cur=cur.next;
            }
            cur.next=cur.next.next;
        }
        size--;
    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */