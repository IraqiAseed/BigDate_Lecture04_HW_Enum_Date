package enums.homework;

import lombok.Getter;

public enum HttpCodeHandler {
    INFORMATIONAL(100, 199,new HttpInfoHandler()),
    SUCCESS(200, 299, new HttpSuccessHandler()),
    REDIRECTION(300, 399, new HttpRedirectionHandler()),
    CLIENT_ERROR(400, 499, new HttpClientErrorHandler()),
    SERVER_ERROR(500, 599, new HttpServerErrorHandler());


    private int min;
    private int max;
    private HttpHandler handler;


    HttpCodeHandler(int min, int max, HttpHandler handler) {
        this.min = min;
        this.max = max;
        this.handler = handler;
    }

    public HttpHandler getHandler()
    {
        return handler;
    }

    public static HttpCodeHandler handleHttpCode(int code) throws IllegalStateException {
        HttpCodeHandler[] statuses = values();
        for (HttpCodeHandler status : statuses) {
            if (status.min <= code && status.max >= code ) {
                return status;
            }
        }
        throw new IllegalStateException(code + " not supported");
    }


    public static void main(String[] args) {
        HttpCodeHandler.handleHttpCode(320).getHandler().handleHttpRequest();
        HttpCodeHandler.handleHttpCode(205).getHandler().handleHttpRequest();
        HttpCodeHandler.handleHttpCode(20).getHandler().handleHttpRequest();
    }
}


