package com.bernardo.myappportfolio.viewmodel;

import com.bernardo.myappportfolio.R;
import com.bernardo.myappportfolio.presenter.DashboardPresenter;

public class DashboardViewModel {

    private DashboardPresenter presenter;


    public DashboardViewModel(DashboardPresenter presenter) {
        this.presenter = presenter;
    }

    public void didClickPopularMoviesButton() {
        this.presenter.showToast(this.presenter.getTextResource(R.string.popular_movies_lauch_app));
    }

    public void didClickStockHawkButton() {
        this.presenter.showToast(this.presenter.getTextResource(R.string.stock_hawk_launch_app));
    }

    public void didClickBuildItBiggerButton() {
        this.presenter.showToast(this.presenter.getTextResource(R.string.build_it_bigger_launch_app));
    }

    public void didClickMakeYourAppMaterialButton() {
        this.presenter.showToast(this.presenter
                .getTextResource(R.string.make_your_app_material_launch_app));
    }

    public void didClickGoUbiquitousButton() {
        this.presenter.showToast(this.presenter.getTextResource(R.string.go_ubiquitous_launch_app));
    }

    public void didClickCapstoneButton() {
        this.presenter.showToast(this.presenter.getTextResource(R.string.capstone_launch_app));
    }

    public String getPopularMoviesName() {
        return this.presenter.getTextResource(R.string.popular_movies);
    }

    public String getStockHawkName() {
        return this.presenter.getTextResource(R.string.stock_hawk);
    }

    public String getBuildItBiggerName() {
        return this.presenter.getTextResource(R.string.build_it_bigger);
    }

    public String getMakeYourAppMaterialName() {
        return this.presenter.getTextResource(R.string.make_your_app_material);
    }

    public String getGoUbiquitousName() {
        return this.presenter.getTextResource(R.string.go_ubiquitous);
    }

    public String getCapstoneName() {
        return this.presenter.getTextResource(R.string.capstone);
    }

}
