public class Coworker {
    private final String fullName;
    private final String position;
    private final String email;
    private final String phone;
    private final String age;

    public Coworker(String fullName, String position, String email, String phone, String age) {
        this.fullName = fullName;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.age = age;
    }

    public void PrintData() {
        System.out.println(fullName + ", " + position + ", " + email + ", " + phone + ", " + age);

    }
}
