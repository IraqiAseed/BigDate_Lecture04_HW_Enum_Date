package enums.homework;

public class HttpServerErrorHandler implements HttpHandler{
    @Override
    public void handleHttpRequest() {
        System.out.println("ServerError ...");
    }
}
