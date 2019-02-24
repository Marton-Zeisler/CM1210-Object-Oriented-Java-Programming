public class BankTest{
    public static void main(String[] args) {

        String name = "";
        int number = 0;
        double balance = 0;

        if (args.length >= 2){
            name = args[0];
            number = Integer.parseInt(args[1]);
            if (args.length == 3){
                balance = Double.parseDouble(args[2]);
            }else{
                balance = 99;
            }
        }else{
            name = "M J W Morgan";
            number = 0012067;
            balance = 99;
        }

        BankAccount myAccount = new BankAccount(name, number);
        myAccount.setBalance(balance);
        System.err.println(myAccount.getBalance());
        System.out.println(myAccount.getHolderName());
        System.err.println(myAccount.getNumber());

    }
}