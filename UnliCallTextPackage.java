public class UnliCallTextPackage implements UnliCallsTextOffer {
    @Override
    public String showUnliCallsTextOffer(String telcoName, boolean unliCallText) {
        if (!unliCallText) {
            return "No unlimited calls and texts. Charged per use.";
        } else if (telcoName.equals("Globe")) {
            return "Unlimited calls and texts to Globe subscribers. Other networks charged extra.";
        } else if (telcoName.equals("Ditto")) {
            return "Unlimited calls and texts to all networks within the country.";
        }
        return "No unlimited package offered.";
    }
}