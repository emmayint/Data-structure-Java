public class SinglyLinkedList {
      …
 
      public void addLast(SinglyLinkedListNode newNode) {
            if (newNode == null)
                  return;
            else {
                  newNode.next = null;
                  if (head == null) {
                        head = newNode;
                        tail = newNode;
                  } else {
                        tail.next = newNode;
                        //Update the next link of the current tail node, to point to the new node.
                        tail = newNode;
                        //Update tail link to point to the new node.
                  }
            }
      }
 
      public void addFirst(SinglyLinkedListNode newNode) {
            if (newNode == null)
                  return;
            else {
                  if (head == null) {
                        newNode.next = null;
                        head = newNode;
                        tail = newNode;
                  } else {
                        newNode.next = head;
                        //Update the next link of a new node, to point to the current head node.
                        head = newNode;
                        //Update head link to point to the new node.
                  }
            }
      }
 
      public void insertAfter(SinglyLinkedListNode previous,
                  SinglyLinkedListNode newNode) {
            if (newNode == null)
                  return;
            else {
                  if (previous == null)
                        addFirst(newNode);
                  else if (previous == tail)
                        addLast(newNode);
                  else {
                        SinglyLinkedListNode next = previous.next;
                        //this "next" is a container for the node after "previous".一个空碗
                        previous.next = newNode;
                        //Update link of the "previous" node, to point to the new node.
                        newNode.next = next;
                        //Update link of the new node, to point to the "next" node.
                        
                        //Head and tail links are not updated in this case.

                  }
            }
      }
}
