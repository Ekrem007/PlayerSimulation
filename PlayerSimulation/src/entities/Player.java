package entities;

public class Player {
    private int id;
    private String name;
    private String surname;
    private int age;


    public Player(int id, String name, String surname, int age, double balance) {
        super();
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.age = age;
    }
    public Player(){

    }


    public int getId() {
        return id;
    }

    public void setTcNo(String tcNo) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


}
