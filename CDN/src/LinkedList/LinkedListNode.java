/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LinkedList;

/**
 *
 * @author Trang Phan
 */
public class LinkedListNode implements Cloneable{
    private HangTu hangTu;
    private LinkedListNode next;
    public LinkedListNode(){
        
    }
    public LinkedListNode clone(){
        try{
            return (LinkedListNode) super.clone();
        }catch(CloneNotSupportedException e){
            return null;
        }
    }
    
    public LinkedListNode(HangTu hangTu){
        this.hangTu = hangTu;
        this.next = null;
    }

    public HangTu getHangTu() {
        return hangTu;
    }

    public LinkedListNode getNext() {
        return next;
    }
    
     public void setHangTu(int heSo, int soMu, String bien) {
        this.hangTu = new HangTu(heSo,soMu,bien);
    }

    public void setNext(LinkedListNode next) {
        this.next = next;
    }
    
    
}
