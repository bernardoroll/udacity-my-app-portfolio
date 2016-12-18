package com.bernardo.myappportfolio.viewmodel;

import com.bernardo.myappportfolio.presenter.DashboardPresenter;

import org.junit.Before;
import org.junit.Test;

import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class DashboardViewModelTest {

    private DashboardViewModel subject;
    private DashboardPresenter presenter;

    @Before
    public void setUp() {
        this.presenter = mock(DashboardPresenter.class);
        this.subject = new DashboardViewModel(this.presenter);
    }

    @Test
    public void didClickPopularMoviesButton() throws Exception {
        // Arrange
        // Act
        this.subject.didClickPopularMoviesButton();
        // Assert
        verify(this.presenter).showToast(anyString());
    }

    @Test
    public void didClickStockHawkButton() throws Exception {
        // Arrange
        // Act
        this.subject.didClickStockHawkButton();
        // Assert
        verify(this.presenter).showToast(anyString());
    }

    @Test
    public void didClickBuildItBiggerButton() throws Exception {
        // Arrange
        // Act
        this.subject.didClickBuildItBiggerButton();
        // Assert
        verify(this.presenter).showToast(anyString());
    }

    @Test
    public void didClickMakeYourAppMaterialButton() throws Exception {
        // Arrange
        // Act
        this.subject.didClickMakeYourAppMaterialButton();
        // Assert
        verify(this.presenter).showToast(anyString());

    }

    @Test
    public void didClickGoUbiquitousButton() throws Exception {
        // Arrange
        // Act
        this.subject.didClickGoUbiquitousButton();
        // Assert
        verify(this.presenter).showToast(anyString());
    }

    @Test
    public void didClickCapstoneButton() throws Exception {
        // Arrange
        // Act
        this.subject.didClickCapstoneButton();
        // Assert
        verify(this.presenter).showToast(anyString());
    }

}