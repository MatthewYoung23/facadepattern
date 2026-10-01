public class HomeApp {
    public static void main(String[] args) {
        HomeInterface homeInterface = new HomeInterface();

        System.out.println("Turning everything ON:");
        homeInterface.turnOnAll();

        System.out.println("\nTurning everything OFF:");
        homeInterface.turnOffAll();
    }
}