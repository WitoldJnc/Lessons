package properties_readeer;

public class PropertyNotFoundException extends Exception {
    @Override
    public String getMessage() {
        return "Property not found";
    }
}
