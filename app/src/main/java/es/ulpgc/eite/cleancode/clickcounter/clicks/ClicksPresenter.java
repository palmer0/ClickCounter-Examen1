package es.ulpgc.eite.cleancode.clickcounter.clicks;

import java.lang.ref.WeakReference;

import es.ulpgc.eite.cleancode.clickcounter.app.AppMediator;
import es.ulpgc.eite.cleancode.clickcounter.app.ClicksToCounterState;
import es.ulpgc.eite.cleancode.clickcounter.app.CounterToClicksState;

public class ClicksPresenter implements ClicksContract.Presenter {

  //public static String TAG = ClicksPresenter.class.getSimpleName();
  public static String TAG = "ClickCounter.ClicksPresenter";

  private WeakReference<ClicksContract.View> view;
  private ClicksState state;
  private ClicksContract.Model model;
  private AppMediator mediator;

  public ClicksPresenter(AppMediator mediator) {
    this.mediator = mediator;
  }


  @Override
  public void onStart() {
    // Log.e(TAG, "onStart()");

    // initialize the state
    state = new ClicksState();

    // TODO: add code if is necessary

  }

  @Override
  public void onRestart() {
    // Log.e(TAG, "onRestart()");

    // TODO: add code if is necessary
  }


  @Override
  public void onResume() {
    // Log.e(TAG, "onResume()");

    // TODO: add code if is necessary

    // update the view
    view.get().refreshWithDataUpdated(state);

  }

  @Override
  public void onBackPressed() {
    // Log.e(TAG, "onBackPressed()");

    // TODO: add code if is necessary
  }

  @Override
  public void onPause() {
    // Log.e(TAG, "onPause()");

    // TODO: add code if is necessary
  }

  @Override
  public void onDestroy() {
    // Log.e(TAG, "onDestroy()");
  }

  @Override
  public void onClearPressed() {
    // Log.e(TAG, "onClearPressed()");

    // TODO: add code if is necessary
  }

  private void passStateToPreviousScreen(ClicksToCounterState state) {
    mediator.setClicksPreviousScreenState(state);
  }

  private CounterToClicksState getStateFromPreviousScreen() {
    return mediator.getClicksPreviousScreenState();
  }

  @Override
  public void injectView(WeakReference<ClicksContract.View> view) {
    this.view = view;
  }

  @Override
  public void injectModel(ClicksContract.Model model) {
    this.model = model;
  }

}
