package Phone;

public class Android extends Telephone {
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
        setChargerInterface("Some Android Interface");
    }

    @Override
    void operationSystem(){
        setOperationSystem("Android");
    }

    @Override
    void appsStore(){
        setAppsStore("Android App Store");
    }
}
