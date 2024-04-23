public class Main {
    public static void main(String[] args) {

        String wholeNameEmployee = "Ф.И.О. сотрудника";

        //task-1
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = firstName + " " + middleName + " " + lastName;
        System.out.println(wholeNameEmployee + " - " + fullName);

        //task-2
        String upperCaseFullName = fullName.toUpperCase();
        System.out.println(wholeNameEmployee + " для заполнения отчета - " + upperCaseFullName);

        //task-3
        fullName = "Иванов Семён Семёнович";
        String expectedFullName = fullName.replace('ё', 'е');
        System.out.println(wholeNameEmployee + " - " + expectedFullName);
    }
}