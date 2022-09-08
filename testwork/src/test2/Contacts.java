package test2;

public class Contacts {
    private String name;
    private int age;
    private String tele;
    private String address;

    public Contacts() {
    }

    public Contacts(String name, int age, String tele, String address) {
        this.name = name;
        this.age = age;
        this.tele = tele;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getTele() {
        return tele;
    }

    public void setTele(String tele) {
        this.tele = tele;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
