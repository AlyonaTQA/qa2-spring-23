package modal;

public class Student {
    private String firstName;
    private String lastName;
    private String email;
    private int age;
    private String phone;

    public String getFirstName() {
        return firstName;
    }

    public Student setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public String getLastName() {
        return lastName;
    }

    public Student setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public Student setEmail(String email) {
        this.email = email;
        return this;
    }

    public int getAge() {
        return age;
    }

    public Student setAge(int age) {
        this.age = age;
        return this;
    }

    //-----------------CUSTOM METHOD--------------------

   public void printFullName() {
       System.out.println(firstName + " " + lastName);
   }
}
