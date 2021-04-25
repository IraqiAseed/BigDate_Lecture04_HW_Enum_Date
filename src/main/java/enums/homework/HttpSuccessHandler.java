package enums.homework;

public class HttpSuccessHandler implements HttpHandler{
    @Override
    public void handleHttpRequest() {
        System.out.println("SUCCESS ...");
    }
}
