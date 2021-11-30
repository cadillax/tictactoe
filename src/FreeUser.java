public class FreeUser implements UserType{


    @Override
    public String getSubscribtion() {
        return "Free";
    }

    @Override
    public int getQuality() {
        return 720;
    }

    @Override
    public boolean hasWebcam() {
        return false;
    }
}
