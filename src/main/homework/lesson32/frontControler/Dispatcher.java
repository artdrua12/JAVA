package main.homework.lesson32.frontControler;

import main.homework.lesson32.frontControler.views.DashboardView;
import main.homework.lesson32.frontControler.views.ErrorView;
import main.homework.lesson32.frontControler.views.HomeView;
import main.homework.lesson32.frontControler.views.StudentView;

public class Dispatcher {
    private StudentView studentView;
    private HomeView homeView;
    private DashboardView dashboardView;
    private ErrorView errorView;

    public Dispatcher() {
        this.studentView = new StudentView();
        this.homeView = new HomeView();
        this.dashboardView = new DashboardView();
        this.errorView = new ErrorView();
    }

    public void dispatch(String request) {
        if (request.equalsIgnoreCase("STUDENT")) {
            studentView.show();
        }
        if (request.equalsIgnoreCase("DASHBOARD")) {
            dashboardView.show();
        }
        if (request.equalsIgnoreCase("HOME")) {
            homeView.show();
        } else {
            errorView.show();
        }
    }

}
