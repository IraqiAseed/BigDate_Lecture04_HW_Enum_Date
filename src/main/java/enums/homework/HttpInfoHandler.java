package enums.homework;

public class HttpInfoHandler implements HttpHandler{
    @Override
    public void handleHttpRequest() {
        System.out.println("INFO ...");
    }
}
