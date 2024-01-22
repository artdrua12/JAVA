package main.homework.lesson32.frontControler;

public class FrontController {
    private Dispatcher dispatcher;

    public FrontController() {
        dispatcher = new Dispatcher();
    }

    private boolean isAuthenticUser() {
        System.out.println("Пользователь авторизировался успешно");
        return true;
    }

    private void trackRequest(String request) {
        System.out.println("Запрашиваемая страница: " + request);
    }

    public void dispatchRequest(String request) {
        trackRequest(request);

        // authenticate the user
        if (isAuthenticUser()) {
            dispatcher.dispatch(request);
        }
    }
}
