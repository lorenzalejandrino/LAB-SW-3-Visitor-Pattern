public class TelcoPromo {
    public static void main(String[] args) {
        TelcoSubscription smart = new Telco(15, 500, "Smart",false);
        TelcoSubscription globe = new Telco(10, 450, "Globe",true);
        TelcoSubscription ditto = new Telco(8, 400, "Ditto",true);

        UsagePromo promo = new TelcoAllowance();
        UnliCallOffer unli = new UnliCallTextPackage();

        System.out.println(smart.accept(promo, smart.getPromoPrice(),smart.getDataAllowance()));
        System.out.println(globe.accept(promo, globe.getPromoPrice(),globe.getDataAllowance()));
        System.out.println(ditto.accept(promo, ditto.getPromoPrice(),ditto.getDataAllowance()));

        System.out.println();

        System.out.println(smart.accept(unli, smart.isUnliCallText()));
        System.out.println(globe.accept(unli, globe.isUnliCallText()));
        System.out.println(ditto.accept(unli, ditto.isUnliCallText()));

    }
}