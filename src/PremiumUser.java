public class PremiumUser implements UserType{

    @Override
    public String getSubscribtion() {
        return "Premium";
    }

    @Override
    public int getQuality() {
        return 4000;
    }

    @Override
    public boolean hasWebcam() {
        return true;
    }





}
