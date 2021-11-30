public class PornHub {
    public static void main(String[] args) {

        UserType user = new FreeUser();
        UserType middle = new MiddleUser();
        UserType premium = new PremiumUser();

        UserType userTypes[] = {user, middle, premium};
        for (int i = 0; i < userTypes.length; i++) {
            System.out.println(userTypes[i].getQuality());

            System.out.println(userTypes[i].getSubscribtion());

            System.out.println(userTypes[i].hasWebcam());

            System.out.println();
        }
    }

}
