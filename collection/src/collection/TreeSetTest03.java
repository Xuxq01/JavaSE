package collection;

import java.util.TreeSet;

public class TreeSetTest03 {
    public static void main(String[] args) {
        Customer c1 = new Customer(32);
        Customer c2 = new Customer(20);
        Customer c3 = new Customer(30);
        Customer c4 = new Customer(25);

        TreeSet<Customer> customers = new TreeSet<>();
        customers.add(c1);
        customers.add(c2);
        customers.add(c3);
        customers.add(c4);

        for(Customer c:customers){
            System.out.println(c);
        }
    }
}

//放在TreeSet集合中的元素要实现java.lang.Comparable接口
//并且实现compareTo方法,equals可以不写
class Customer implements Comparable<Customer> {
    int age;
    public Customer(int age){
        this.age = age;
    }

    //需要在这个方法中编写比较的逻辑,按照什么进行比较
    //k.compareTo(t.key)
    //拿着参数key和集合中的每一个key进行比较
    @Override
    public int compareTo(Customer c) {
        /*int age1 = this.age;
        int age2 = c.age;
        if(age1 == age2){
            return 0;
        }else if(age1 > age2) {
            return 1;
        }else{
            return -1;
        }*/
        return this.age - c.age;
    }

    public String toString(){
        return "Customer[age=" + age + "]";
    }
}