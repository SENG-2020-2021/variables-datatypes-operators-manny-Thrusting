class Main {
  public static void main(String[] args) {
  
   int DaysDebtorDefaulted = 5;
   int AmountDebtorPayPerDay = 1000;
   int AmountPaid = 2000;
   
   
   int TotalAmountToPay;
   int DaysDebtorPaid;
   int AmountLeft;
   int DaysNotPaid;

   
   TotalAmountToPay = DaysDebtorDefaulted * AmountDebtorPayPerDay;
   System.out.println("The total amount the debtor is to pay is "+TotalAmountToPay);

  
   DaysDebtorPaid = AmountPaid / AmountDebtorPayPerDay;
   System.out.println("No of days debtor paid for: "+DaysDebtorPaid );
  
  
  int AmountNotCovered = AmountPaid % AmountDebtorPayPerDay;
  System.out.println("The Amount Not Captured is "+AmountNotCovered);
   
  AmountLeft = TotalAmountToPay - AmountPaid;
  System.out.println("Amount the debtor is left to pay is "+AmountLeft);
  
  DaysNotPaid = DaysDebtorDefaulted - DaysDebtorPaid;
  System.out.println("The days the debtor has not payed for: "+DaysNotPaid);
   
  }
}