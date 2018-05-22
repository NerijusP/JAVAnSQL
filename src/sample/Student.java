package sample;

public class Student {
    private int ID;
    private String name;
    private String surname;
    private String mail;

    public Student(int ID, String name, String surname, String mail) {
        this.ID = ID;
        this.name = name;
        this.surname = surname;
        this.mail = mail;
    }

    public int getID() {
        return ID;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getMail() {
        return mail;
    }
}
