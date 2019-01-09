package properties_reader_map;

public class PropertyNotFoundException extends Exception {
    @Override
    public String getMessage() {
        return "Property not found";
    }
}
