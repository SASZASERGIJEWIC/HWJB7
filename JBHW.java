public class JBHW {
    public enum Month {
        JAN, FEB, MAR, APR, MAY, JUN, JUL, AUG, SEP, OCT, NOV, DEC
    }
    public static void main(String[] args) {
        Month month = Month.FEB;
        int days = getDaysInMonth(month);
        System.out.println("Количество дней в " + month.name() + ": " + days);
    }
    public static int getDaysInMonth(Month month) {
        switch (month) {
            case JAN,MAR,MAY,JUL,AUG,OCT,DEC:
                return 31;
            case APR,JUN,SEP,NOV:
                return 30;
            case FEB:
            default:
                return 28;
        }
    }
}
