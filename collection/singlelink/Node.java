package singlelink;
/*
单链表中的结点
结点是单向链表中的基本单元
每一个Node有两个属性
    一个是存储的数据,另一个是下一个结点的内存地址
 */
public class Node {
    //存储的数据
    Object element;

    //下一个结点的内存地址
    Node next;

    public Node() {
    }

    public Node(Object element,Node next){
        this.element = element;
        this.next = next;
    }
}
