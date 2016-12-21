package com.bernardo.myappportfolio.activity;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
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
    ActivityDashboardBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_dashboard);
        DashboardViewModel viewModel = new DashboardViewModel(this);
        binding.setViewModel(viewModel);
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
    public String getTextResource(int resourceId) {
        return getString(resourceId);
    }

}
