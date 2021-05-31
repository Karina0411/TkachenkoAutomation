package Phone;

public class iOS extends Telephone {
    private String chargerInterface;
    private String operationSystem;
    private String appsStore;

    public String getChargerInterface() {
        return chargerInterface;
    }

    public void setChargerInterface(String chargerInterface) {
        this.chargerInterface = chargerInterface;
    }

    public String getOperationSystem() {
        return operationSystem;
    }

    public void setOperationSystem(String operationSystem) {
        this.operationSystem = operationSystem;
    }

    public String getAppsStore() {
        return appsStore;
    }

    public void setAppsStore(String appsStore) {
        this.appsStore = appsStore;
    }

    @Override
    public void chargerInterface(){
        setChargerInterface("Some iOS Interface");
    }

    @Override
    void operationSystem(){
        setOperationSystem("iOS");
    }

    @Override
    void appsStore(){
        setAppsStore("iOS App Store");
    }
}
