package Task1;

public class Person {
    protected String myName;
    protected int myAge;
    protected String myGender;

    public Person(String name, int age, String gender) {
        myName = name;
        myAge = age;
        myGender = gender;
    }

    // Getter methods
    public String getName() {
        return myName;
    }

    public int getAge() {
        return myAge;
    }

    public String getGender() {
        return myGender;
    }

    // Setter methods
    public void setName(String name) {
        myName = name;
    }

    public void setAge(int age) {
        myAge = age;
    }

    public void setGender(String gender) {
        myGender = gender;
    }

    @Override
    public String toString() {
        return myName + ", age: " + myAge + ", gender: " + myGender;
    }
}