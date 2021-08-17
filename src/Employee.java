public class Employee {
    String name;
    String post;
    String email;
    String phone;
    int pay;
    int age;

    public Employee(String newName, String newPost, String newEmail, String newPhone, int newPay, int newAge) {
        name = newName;
        post = newPost;
        email = newEmail;
        phone = newPhone;
        pay = newPay;
        age = newAge;
    }

    public void PrintInfo(){
        System.out.println(name + " " + post + " " + email + " " + phone + " " + pay + " " + age);
    }

}
