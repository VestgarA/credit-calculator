
public class Main {
    public static void main(String[] args) {

        CreditPaymentService raschet = new CreditPaymentService();
        double paymentFor12Months = raschet.counting(1_000_000, 9.99, 12);
        double paymentFor24Months = raschet.counting(1_000_000, 9.99, 24);
        double paymentFor36Months = raschet.counting(1_000_000, 9.99, 36);

        System.out.println("При Сроке 12 месяцев ваш платеж по кредиту составит: " + (int) paymentFor12Months + " рублей в месяц");
        System.out.println("При Сроке 24 месяцев ваш платеж по кредиту составит: " + (int) paymentFor24Months + " рублей в месяц");
        System.out.println("При Сроке 36 месяцев ваш платеж по кредиту составит: " + (int) paymentFor36Months + " рублей в месяц");

    }
}