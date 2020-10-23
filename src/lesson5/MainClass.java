package lesson5;

public class MainClass {

    public static void main(String[] args) {

        Person[] persArray = new Person[5];
        persArray[0] = new Person("Иванов Иван", "Зам. директора", "ivivan@mailbox.com", "892312312", 30000, 30);
        persArray[1] = new Person("Петров Иван", "Директор", "ivivan@mailbox.com", "892312312", 45000, 35);
        persArray[2] = new Person("Сидоров Иван", "Администратор", "ivivan@mailbox.com", "892312312", 40000, 38);
        persArray[3] = new Person("Просто Иван", "Программист", "ivivan@mailbox.com", "892312312", 30000, 41);
        persArray[4] = new Person("Иван Волшебник", "Маг", "ivivan@mailbox.com", "892312312", 55000, 48);

        for (Person person : persArray) {
            if (person.age >= 40){
                System.out.println(person);
            }
        }
    }
}
