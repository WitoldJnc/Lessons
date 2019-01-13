package properties_reader_map;

public class PropertyNotFoundException extends RuntimeException {
    @Override
    public String getMessage() {
        return "Property not found";
    }
}
