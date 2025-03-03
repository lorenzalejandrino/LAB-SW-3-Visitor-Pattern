public class UnliCallTextPackage implements UnliCallOffer{
    @Override
    public String showUnliCallsTextOffer(String telcoName, boolean unliCallText) {
        if (unliCallText && telcoName!="Globe") {
            return telcoName + " offers unlimited calls and texts to all networks within the country.";
        } else if(unliCallText && telcoName.equals("Globe")) {
            return telcoName + " offers unlimited calls and texts to subscribers within the same network. Calls and texts to other networks are charged extra.";
        }else
            return telcoName + " does not offer free calls or texts, and you will be charged per use. ";
    }
}