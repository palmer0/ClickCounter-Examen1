package es.ulpgc.eite.cleancode.clickcounter.clicks;

import java.lang.ref.WeakReference;


public interface ClicksContract {

  interface View {
    void injectPresenter(Presenter presenter);
    void refreshWithDataUpdated(ClicksViewModel viewModel);
  }

  interface Presenter {
    void injectView(WeakReference<View> view);
    void injectModel(Model model);

    void onResume();
    void onStart();
    void onRestart();
    void onBackPressed();
    void onPause();
    void onDestroy();
    void onClearPressed();
  }

  interface Model {
    String getStoredData();
    void updateWithDataFromNextScreen(String data);
    void updateOnRestartScreen(String data);
    void updateWithDataFromPreviousScreen(String data);
  }
}
