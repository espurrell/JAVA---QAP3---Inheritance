package Task1;

public class Demo {
    public static void main(String[] args) {
        Person Amy = new Person("Coach Amy", 27, "F");
        System.out.println(Amy);

        Student Mitch = new Student("Mitch Winehouse", 16, "M", "HS95129", 3.5);
        System.out.println(Mitch);

        Teacher mrsFrizzle = new Teacher("Mrs Frizzle", 34, "F", "Computer Science", 50000);
        System.out.println(mrsFrizzle);

        CollegeStudent Mark = new CollegeStudent("Mark Ronson", 18, "M", "UCB123", 4.0, 1, "English");
        System.out.println(Mark);
    }
}