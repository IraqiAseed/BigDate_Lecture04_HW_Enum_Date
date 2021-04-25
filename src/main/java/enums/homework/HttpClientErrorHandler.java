package enums.homework;

public class HttpClientErrorHandler implements HttpHandler{
    @Override
    public void handleHttpRequest() {
        System.out.println("ClientErrorHan ...");
    }
}
