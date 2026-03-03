public class TelcoAllowance implements UsagePromo {
    @Override
    public String showAllowance(String telcoName, double money) {
        String dataOffer = "";
        if (telcoName.equals("Smart")) {
            dataOffer = "15 GB";
        } else if (telcoName.equals("Globe")) {
            dataOffer = "10 GB";
        } else if (telcoName.equals("Ditto")) {
            dataOffer = "8 GB";
        }
        return " " + dataOffer + " for ₱" + (int) money;
    }
}


