public class TestMyDate {
    public static void main(String[] args) {
        MyDate date1 = new MyDate(34355555133101L);
        MyDate date2 = new MyDate();

        System.out.println("Date from elapsed time:");
        System.out.println(date1.getYear() + "-" +
                           date1.getMonth() + "-" +
                           date1.getDay());

        System.out.println("\nCurrent date:");
        System.out.println(date2.getYear() + "-" +
                           date2.getMonth() + "-" +
                           date2.getDay());
    }
}
