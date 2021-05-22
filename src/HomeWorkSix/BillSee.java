package HomeWorkSix;

public class BillSee {

    public static void main(String[] args) {
        MobileBill mobileBill = new MobileBill();
        double internet = mobileBill.calculateInternet();
        System.out.println("Internet bill this month is " + internet);

        double ukrCall = mobileBill.calculateUkrCall();
        System.out.println("Calls bill this month is " + ukrCall);

        double sms = mobileBill.calculateSms();
        System.out.println("Sms bill this month is " + sms);

        double callsInZoneOne = mobileBill.calculeteFirstZone();
        System.out.println("Bill for calls to 1st zone is " + callsInZoneOne);

        double callsInZoneTwo = mobileBill.calculateSecondZone();
        System.out.println("Bill for calls to 1st zone is " + callsInZoneTwo);

        double totalBillAmountWithTax = (internet + ukrCall + sms + callsInZoneOne + callsInZoneTwo) * 1.07;
        System.out.println("Total Mobile bill with Tax i  amount of 7 % is " + totalBillAmountWithTax);
    }
}

