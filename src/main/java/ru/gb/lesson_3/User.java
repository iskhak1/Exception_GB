package ru.gb.lesson_3;

public class User {

    private String name;
    private String lastName;
    private String patronymic;

    private long phone_number;
    private char sex;

    public User(String name, String lastName, String patronymic, long number, char sex) {
        this.name = name;
        this.lastName = lastName;
        this.patronymic = patronymic;
        this.phone_number = number;
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public long getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(long phone_number) {
        this.phone_number = phone_number;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return String.format("FIO %s Phone Number %d Sex %s ",(name+" "+lastName+" "+patronymic), phone_number,sex);
    }
}
