import java.util.ArrayList;
import java.util.List;

public class Router {
    private List<Route> routes;

    public Router() {
        this.routes = new ArrayList<Route>();
    }
    public void addRoute(Route route){
        this.routes.add(route);
    }
    public void handleRequest(String url, Route.HttpVerb httpVerb) {
        for (Route route: routes) {
            if(route.getPath().equals(url) && route.getHttpMethod().equals(httpVerb)){
                 route.getRouterHandler().handle(route);
            }
        }
    }


}
