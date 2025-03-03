public class TelcoAllowance implements UsagePromo {

    @Override
    public String showAllowance(String telcoName, double money, int dataAllowance) {
        return telcoName + " offers a data allowance of " + dataAllowance + "GB of data for ₱" + money +" per month." ;
    }
}