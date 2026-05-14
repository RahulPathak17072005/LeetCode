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
Node tail;
int size;
    public MyLinkedList() {
        head=null;
        tail=null;
        size=0;
    }
    
    public int get(int index) {
         if (index < 0 || index >= size) return -1;

        Node temp = head;
        for (int i = 0; i < index; i++){

            temp = temp.next;
        }

        return temp.val;
    }
    
    public void addAtHead(int val) {
         Node newNode = new Node(val);
        if (head == null) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
        size++;
    }
    
    public void addAtTail(int val) {
        Node newNode = new Node(val);
        if(head==null){
            head=tail=newNode;
        }else{
            tail.next=newNode;
            tail=newNode;
        }
        size++;
    }
    
    public void addAtIndex(int index, int val) {
        if (index < 0 || index > size) return;
        if (index == 0) {
            addAtHead(val);
            return;
        }
        if (index == size) {
            addAtTail(val);
            return;
        }
        Node newNode = new Node(val);
        Node temp = head;
        for (int i = 1; i < index; i++)
            temp = temp.next;
        newNode.next = temp.next;
        temp.next = newNode;
        size++;
    }
    
    public void deleteAtIndex(int index) {
        if(index<0 || index>=size)return;
        if (index == 0) {
            head = head.next;
            size--;
            if (size == 0) tail = null;
            return;
        }
        Node temp = head;
        for (int i = 1; i < index ; i++)
            temp = temp.next;
        temp.next = temp.next.next;
        if (temp.next == null)
            tail = temp;

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
