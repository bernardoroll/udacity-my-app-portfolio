package com.bernardo.myappportfolio.viewmodel;

import com.bernardo.myappportfolio.presenter.DashboardPresenter;

public class DashboardViewModel {

    private DashboardPresenter presenter;


    public DashboardViewModel(DashboardPresenter presenter) {
        this.presenter = presenter;
    }

    public void didClickPopularMoviesButton() {
        this.presenter.showToast(this.presenter.getPopularMoviesLaunchAppString());
    }

    public void didClickStockHawkButton() {
        this.presenter.showToast(this.presenter.getStockHawkLaunchAppString());
    }

    public void didClickBuildItBiggerButton() {
        this.presenter.showToast(this.presenter.getBuildItBiggerLaunchAppString());
    }

    public void didClickMakeYourAppMaterialButton() {
        this.presenter.showToast(this.presenter.getMakeYourAppMaterialLaunchAppString());
    }

    public void didClickGoUbiquitousButton() {
        this.presenter.showToast(this.presenter.getGoUbiquitousLaunchAppString());
    }

    public void didClickCapstoneButton() {
        this.presenter.showToast(this.presenter.getCapstoneLaunchAppString());
    }

    public String getPopularMoviesName() {
        return this.presenter.getPopularMoviesString();
    }

    public String getStockHawkName() {
        return this.presenter.getStockHawkString();
    }

    public String getBuildItBiggerName() {
        return this.presenter.getBuildItBiggerString();
    }

    public String getMakeYourAppMaterialName() {
        return this.presenter.getMakeYourAppMaterialString();
    }

    public String getGoUbiquitousName() {
        return this.presenter.getGoUbiquitousString();
    }

    public String getCapstoneName() {
        return this.presenter.getCapstoneString();
    }

}
