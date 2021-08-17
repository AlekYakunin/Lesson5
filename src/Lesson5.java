public class Lesson5 {
    public static void main(String[] args) {

        Employee Person1 = new Employee("Alex", "QA Engineer", "alex@ya.ru", "+79834783446", 50000, 32);
        Person1.PrintInfo();

        Employee[] persArray = new Employee[5];
        persArray[0] = new Employee("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "892312312", 30000, 30);
        persArray[1] = new Employee("Petrov Petr", "Cleaner", "petrov@mailbox.com", "8923145612", 40000, 41);
        persArray[2] = new Employee("Kozlov Ivan", "Accountant", "kozlov@mailbox.com", "8954145612", 25000, 51);
        persArray[3] = new Employee("Sokolov Alex", "QA Engineer", "sokolov@mailbox.com", "8954145612", 25000, 22);
        persArray[4] = new Employee("Lapin Fedor", "QA Engineer", "lapin@mailbox.com", "8954545612", 20000, 35);

        System.out.println();
        System.out.println("Сотрудники старше 40 лет");

        for (int i = 0; i < persArray.length; i++){
            if (persArray[i].age > 40) {
                System.out.println(persArray[i].name + " " + persArray[i].post + " " + persArray[i].email + " " + persArray[i].phone + " " + persArray[i].pay + " " + persArray[i].age);
            }
        }
    }

}
