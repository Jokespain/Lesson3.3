package homework6;
public class Main {
    public static void main(String[] args) {
        Exception();
    }

    public static void Exception() {
        try (Resource resource = new Resource()) {
            throw new Exception("Exception found in try block");
        } catch (Exception e) {
            throw new RuntimeException("Exception found in catch block");
        }
    }
}
class Resource implements AutoCloseable {
    @Override
    public void close() throws Exception {
        throw new RuntimeException("Exception found in try with resources");
    }
}