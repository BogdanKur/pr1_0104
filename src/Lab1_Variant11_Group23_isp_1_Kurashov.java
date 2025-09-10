public class Lab1_Variant11_Group23_isp_1_Kurashov {
    public static void main(String[] args) {
        //первое
        long secondsInDay, secondsInWeek, secondsInMonth;
        secondsInDay = 60L*60L*24L;
        secondsInWeek = secondsInDay * 7;
        secondsInMonth = secondsInWeek * 30;
        System.out.println("Первое задание: \nКоличество секунд в дне - "+ secondsInDay +"\nКоличество секунд в неделе - " +
                secondsInWeek + "\nКоличество секунд в месяце - " + secondsInMonth);
        System.out.println();

        //второе
        String phoneNumber = "+79191985844";
        System.out.println("Второе задание: \nМой номер телефона - " + phoneNumber);
        System.out.println();

        //третье
        int remainder = 100 % 3;
        System.out.println("Третье задание: \nОстаток от деления 100 на 3 - " + remainder);
        System.out.println();
    }
}
