public class CreditPaymentService {
    public double counting(double loanAmount, double percent, double loanTerm) {
//loanTerm - срок кредита; loanAmount - сумма кредита; percent - процент по кредиту;
        double persent = percent / loanTerm / 100;
        double monthlyPayment = loanAmount * ((persent * (Math.pow((1 + persent), loanTerm))) / (Math.pow((1 + persent), loanTerm) - 1));
        //double plata1 = (Math.pow((1 + persent), loanTerm) - 1);
        //double finish = loanAmount * (plata / plata1);


        return monthlyPayment;
    }
}
