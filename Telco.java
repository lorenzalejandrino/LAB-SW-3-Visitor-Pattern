public class Telco implements TelcoSubscription {

    public String telcoName;
    public double promoPrice;
    public int dataAllowance;
    public boolean unliCallText;
    public Telco(int dataAllowance, double promoPrice, String telcoName, boolean unliCallText) {
        this.dataAllowance = dataAllowance;
        this.promoPrice = promoPrice;
        this.telcoName = telcoName;
        this.unliCallText = unliCallText;
    }

    @Override
    public String accept(UsagePromo promo, double price, int dataAllowance) {
        return promo.showAllowance(telcoName,price,dataAllowance);
    }

    @Override
    public String accept(UnliCallOffer unli, boolean unliCallText) {
        return unli.showUnliCallsTextOffer(telcoName,unliCallText);
    }

    public double getPromoPrice() {
        return promoPrice;
    }

    public int getDataAllowance() {
        return dataAllowance;
    }
    public boolean isUnliCallText() {
        return unliCallText;
    }


}