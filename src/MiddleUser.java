public class MiddleUser implements UserType{

    @Override
    public String getSubscribtion() {
        return "Middle";
    }

    @Override
    public int getQuality() {
        return 2000;
    }

    @Override
    public boolean hasWebcam() {
        return false;
    }
}
