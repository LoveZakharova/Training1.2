public class Employee {

    String fio;
    String position;
    String email;
    String telefon;
    int salary;
    int age;

    public Employee(String fio, String position, String email, String telefon, int salary, int age) {
        this.fio = fio;
        this.position = position;
        this.email = email;
        this.telefon = telefon;
        this.salary = salary;
        this.age = age;
    }

    public void info() {
        System.out.println("ФИО сотрудника: " + fio + "; Должность: " + position + "; Эл.почта: " + email + "; Номер телефона: " + telefon + "; З/п: " + salary + "; Возраст " + age);
    }

}
