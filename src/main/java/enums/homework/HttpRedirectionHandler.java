package enums.homework;

public class HttpRedirectionHandler implements HttpHandler{
    @Override
    public void handleHttpRequest() {
        System.out.println("Redirection ...");
    }
}
