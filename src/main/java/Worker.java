import java.util.Arrays;

public class Worker {

    public static void main(String[] args) {
        //Employee employee1 = new Employee();
        Employee[] employeesArr = new Employee[5];
        employeesArr[0] = new Employee("Иванов Петр Дмитриевич", "тестировщик-стажер", "ipd@mail.ru", "245", 40000, 30);
        employeesArr[1] = new Employee("Старкова Людмила Ивановна", "младший аналитик", "sli@mail.ru", "134", 50000, 33);
        employeesArr[2] = new Employee("Лебедева Мария Викторовна", "ведущий тестировщик", "lmv@mail.ru", "265", 65000, 35);
        employeesArr[3] = new Employee("Соболев Олег Романович", "инженер", "sor@mail.ru", "430", 80000, 49);
        employeesArr[4] = new Employee("Сидоров Василий Сергеевич", "помощник менеджера проекта", "svs@mail.ru", "549", 85000, 55);

        for (int i = 0; i < employeesArr.length; i++)
            if (employeesArr[i].age >= 45)
                employeesArr[i].info();



    }



}
