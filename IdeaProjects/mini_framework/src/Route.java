import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Route {
    private String path;
    private HttpVerb httpMethod;
    private RouterHandler routerHandler;

    public enum HttpVerb {
        GET,
        PUT,
        PATCH,
        POST
    }

    public Route(String path, HttpVerb httpMethod, RouterHandler routerHandler) {
        this.path = path;
        this.httpMethod = httpMethod;
        this.routerHandler = routerHandler;

    }
    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public HttpVerb getHttpMethod() {
        return httpMethod;
    }

    public void setHttpMethod(HttpVerb httpMethod) {
        this.httpMethod = httpMethod;
    }

    public RouterHandler getRouterHandler() {
        return routerHandler;
    }

    public void setRouterHandler(RouterHandler handle) {
        this.routerHandler = routerHandler;
    }


}
