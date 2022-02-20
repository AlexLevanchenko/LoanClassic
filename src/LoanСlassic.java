import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.Scanner;

class LoanClassic {

    public static void main(String[] args) {
        System.out.print("Кредитный калькулятор.\nУсловия. Процентная ставка: 22% годовых с периодом 12 месяцев. \nВведите сумму для расчета платежа: ");
        double ammount; // Сумма кредита
        final double commissionInYear = 0.22; // годовая ставка
        final int monthInYear = 12; // Выбрано месяцев для кредита
        Scanner input = new Scanner(System.in);
        ammount = input.nextDouble();
        System.out.println(ammount);
        // 1 месяц
        double bodyOfCredit = ammount / monthInYear;   //Расчет доли тела кредита в дифференцированных платежах
        double loanBalance; //остаток задолженности по кредиту
        loanBalance = ammount - bodyOfCredit;
        double percentInPayment = (ammount * commissionInYear) / monthInYear;  //Расчет доли процентов в дифференцированных платежах
        // 2 месяц
        double loanBalance2 = loanBalance - bodyOfCredit; //остаток задолженности по кредиту
        double percentInPayment2 = (loanBalance * commissionInYear) / monthInYear;  //Расчет доли процентов в дифференцированных платежах
        // 3 месяц
        double loanBalance3; //остаток задолженности по кредиту
        loanBalance3 = loanBalance2 - bodyOfCredit;
        double percentInPayment3 = (loanBalance2 * commissionInYear) / monthInYear;  //Расчет доли процентов в дифференцированных платежах
        // 4 месяц
        double loanBalance4 = loanBalance3 - bodyOfCredit; //остаток задолженности по кредиту
        double percentInPayment4 = (loanBalance3 * commissionInYear) / monthInYear;  //Расчет доли процентов в дифференцированных платежах
        // 5 месяц
        double loanBalance5 = loanBalance4 - bodyOfCredit; //остаток задолженности по кредиту
        double percentInPayment5 = (loanBalance4 * commissionInYear) / monthInYear;  //Расчет доли процентов в дифференцированных платежах
        // 6 месяц
        double loanBalance6 = loanBalance5 - bodyOfCredit; //остаток задолженности по кредиту
        double percentInPayment6 = (loanBalance5 * commissionInYear) / monthInYear;  //Расчет доли процентов в дифференцированных платежах
        // 7 месяц
        double loanBalance7 = loanBalance6 - bodyOfCredit; //остаток задолженности по кредиту
        double percentInPayment7 = (loanBalance6 * commissionInYear) / monthInYear;  //Расчет доли процентов в дифференцированных платежах
        // 8 месяц
        double loanBalance8 = loanBalance7 - bodyOfCredit; //остаток задолженности по кредиту
        double percentInPayment8 = (loanBalance7 * commissionInYear) / monthInYear;  //Расчет доли процентов в дифференцированных платежах
        // 9 месяц
        double loanBalance9 = loanBalance8 - bodyOfCredit; //остаток задолженности по кредиту
        double percentInPayment9 = (loanBalance8 * commissionInYear) / monthInYear;  //Расчет доли процентов в дифференцированных платежах
        // 10 месяц
        double loanBalance10 = loanBalance9 - bodyOfCredit; //остаток задолженности по кредиту
        double percentInPayment10 = (loanBalance9 * commissionInYear) / monthInYear;  //Расчет доли процентов в дифференцированных платежах
        // 11 месяц
        double loanBalance11 = loanBalance10 - bodyOfCredit; //остаток задолженности по кредиту
        double percentInPayment11 = (loanBalance10 * commissionInYear) / monthInYear;  //Расчет доли процентов в дифференцированных платежах
        // 12 месяц
        double percentInPayment12 = (loanBalance11 * commissionInYear) / monthInYear;  //Расчет доли процентов в дифференцированных платежах
        System.out.println("Cумма, которая идёт на погашение тела кредита = " + bodyOfCredit);
        double totalSumOfPercent = percentInPayment + percentInPayment2 + percentInPayment3 + percentInPayment4 + percentInPayment5 + percentInPayment6 + percentInPayment7 + percentInPayment8 + percentInPayment9 + percentInPayment10 + percentInPayment11 + percentInPayment12;
        BigDecimal totalSumOfPercent1 = new BigDecimal(totalSumOfPercent);
        System.out.println("1 расчётный период. Сумма, которая идёт на погашение процентов по кредиту = " + percentInPayment + "\n" +
                "1 расчётный период. Сумма, которая идёт на погашение процентов по кредиту = " + percentInPayment2 + "\n" +
                "1 расчётный период. Сумма, которая идёт на погашение процентов по кредиту = " + percentInPayment3 + "\n" +
                "1 расчётный период. Сумма, которая идёт на погашение процентов по кредиту = " + percentInPayment4 + "\n" +
                "1 расчётный период. Сумма, которая идёт на погашение процентов по кредиту = " + percentInPayment5 + "\n" +
                "1 расчётный период. Сумма, которая идёт на погашение процентов по кредиту = " + percentInPayment6 + "\n" +
                "1 расчётный период. Сумма, которая идёт на погашение процентов по кредиту = " + percentInPayment7 + "\n" +
                "1 расчётный период. Сумма, которая идёт на погашение процентов по кредиту = " + percentInPayment8 + "\n" +
                "1 расчётный период. Сумма, которая идёт на погашение процентов по кредиту = " + percentInPayment9 + "\n" +
                "1 расчётный период. Сумма, которая идёт на погашение процентов по кредиту = " + percentInPayment10 + "\n" +
                "1 расчётный период. Сумма, которая идёт на погашение процентов по кредиту = " + percentInPayment11 + "\n" +
                "1 расчётный период. Сумма, которая идёт на погашение процентов по кредиту = " + percentInPayment12 + "\n" +
                "Сумма переплаты за 12 месяцев = " + new DecimalFormat("#.##").format(totalSumOfPercent1));

    }
}
