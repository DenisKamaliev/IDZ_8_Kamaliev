import java.util.Objects;

public class Human
{
    private String firstName;
    private String secondName;
    private String fathersName;
    private int age;
    public Human()
    {
        firstName = "";
        secondName = "";
        fathersName = "";
        age = 0;
    }
    public Human(String firstName, String secondName, String fathersName, int age)
    {
        if(firstName == null)
            throw new IllegalArgumentException("firstName is null");
        this.firstName = firstName;
        if(secondName == null)
            throw new IllegalArgumentException("secondName is null");
        this.secondName = secondName;
        if(fathersName == null)
            throw new IllegalArgumentException("fathersName is null");
        this.fathersName = fathersName;
        if(age<0)
        {
            throw new IllegalArgumentException("Wrong age");
        }
        this.age = age;
    }
    public Human(String firstName, String secondName, int age)
    {
        if(firstName == null)
            throw new IllegalArgumentException("firstName is null");
        this.firstName = firstName;
        if(secondName == null)
            throw new IllegalArgumentException("secondName is null");
        this.secondName = secondName;
        if(age<0)
        {
            throw new IllegalArgumentException("Wrong age");
        }
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public String getFathersName()
    {
        if(fathersName == null)
            throw new IllegalArgumentException("His person doesn't have a father");
        return fathersName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Human human = (Human) o;
        return age == human.age && Objects.equals(firstName, human.firstName) && Objects.equals(secondName, human.secondName) && Objects.equals(fathersName, human.fathersName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, fathersName, age);
    }
}