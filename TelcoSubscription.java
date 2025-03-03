public interface TelcoSubscription {
    public String accept (UsagePromo promo, double price, int dataAllowance);
    public String accept (UnliCallOffer unli, boolean unliCallText);
    double getPromoPrice();

    boolean isUnliCallText();

    int getDataAllowance();
}