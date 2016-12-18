package com.bernardo.myappportfolio.activity;

import android.databinding.DataBindingUtil;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.bernardo.myappportfolio.R;
import com.bernardo.myappportfolio.databinding.ActivityDashboardBinding;
import com.bernardo.myappportfolio.presenter.CommonPresenter;
import com.bernardo.myappportfolio.presenter.DashboardPresenter;
import com.bernardo.myappportfolio.viewmodel.DashboardViewModel;

import butterknife.BindView;

public class DashboardActivity extends AppCompatActivity implements CommonPresenter,
        DashboardPresenter {

    @BindView(R.id.activity_dashboard)
    LinearLayout activityDashboard;
    private DashboardViewModel viewModel;
    ActivityDashboardBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        binding = DataBindingUtil.setContentView(this, R.layout.activity_dashboard);
        this.viewModel = new DashboardViewModel(this);
        binding.setViewModel(this.viewModel);
    }

    @Override
    public void showToast(String message) {
        Toast.makeText(this, message, Toast.LENGTH_LONG)
                .show();
    }

    @Override
    public void showSnackbar(String message) {
        Snackbar.make(activityDashboard, message, Snackbar.LENGTH_LONG)
                .show();
    }

    @Override
    public String getPopularMoviesString() {
        return getString(R.string.popular_movies);
    }

    @Override
    public String getStockHawkString() {
        return getString(R.string.stock_hawk);
    }

    @Override
    public String getBuildItBiggerString() {
        return getString(R.string.build_it_bigger);
    }

    @Override
    public String getMakeYourAppMaterialString() {
        return getString(R.string.make_your_app_material);
    }

    @Override
    public String getGoUbiquitousString() {
        return getString(R.string.go_ubiquitous);
    }

    @Override
    public String getCapstoneString() {
        return getString(R.string.capstone);
    }

    @Override
    public String getPopularMoviesLaunchAppString() {
        return getString(R.string.popular_movies_lauch_app);
    }

    @Override
    public String getStockHawkLaunchAppString() {
        return getString(R.string.stock_hawk_launch_app);
    }

    @Override
    public String getBuildItBiggerLaunchAppString() {
        return getString(R.string.build_it_bigger_launch_app);
    }

    @Override
    public String getMakeYourAppMaterialLaunchAppString() {
        return getString(R.string.make_your_app_material_launch_app);
    }

    @Override
    public String getGoUbiquitousLaunchAppString() {
        return getString(R.string.go_ubiquitous_launch_app);
    }

    @Override
    public String getCapstoneLaunchAppString() {
        return getString(R.string.capstone_launch_app);
    }
}
