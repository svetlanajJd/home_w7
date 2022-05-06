public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1");
        String firstName = "Ivan" + ' ';
        String middleName = "Ivanovich";
        String lastName = "Ivanov" + ' ';
        String fullName = lastName + firstName + middleName;
        System.out.println("ФИО сотрудника- " + fullName);

        System.out.println("Задание 2");
        String s1 = fullName.toUpperCase();
        System.out.println("Данные ФИО сотрудника для заполнения отчета- " + s1);
    task3();}
    public static void task3() {
        System.out.println("Задание 3");
        String fullName = "Иванов Семён Семёнович";
        fullName = fullName.replace("ё", "е");
        System.out.println("Данные ФИО сотрудника-" + fullName);

    }
}