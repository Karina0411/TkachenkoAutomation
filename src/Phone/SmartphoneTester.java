package Phone;

public class SmartphoneTester {
    public static void main(String[] args) {

        iOS iOS = new iOS();
        iOS.operationSystem();
        iOS.getOperationSystem();
        System.out.println("Operation system is " + iOS.getOperationSystem() );

        iOS.appsStore();
        iOS.getAppsStore();
        System.out.println("App store is " + iOS.getAppsStore());

        iOS.chargerInterface();
        iOS.getChargerInterface();
        System.out.println("Interface of Charger is " + iOS.getChargerInterface());

        Android Android = new Android();
        Android.operationSystem();
        Android.getOperationSystem();
        System.out.println("Operation system is " + Android.getOperationSystem());

        Android.appsStore();
        Android.getAppsStore();
        System.out.println("App store is " + Android.getAppsStore());

        Android.chargerInterface();
        Android.getChargerInterface();
        System.out.println("Charger Interface is " + Android.getChargerInterface());
    }
}
