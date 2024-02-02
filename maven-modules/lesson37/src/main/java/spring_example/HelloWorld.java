package spring_example;

public class HelloWorld {
    private String message;

    // GetterSetter for variable
    public void setMessage(String message) {
        this.message = message;
    }

    public void getMessage() {
        System.out.println("Message : " + message);
    }
}
