package t2propertiesReadeer;

public class PropertyNotFoundException extends Exception {
    @Override
    public String getMessage() {
        return "Property file not found";
    }
}
