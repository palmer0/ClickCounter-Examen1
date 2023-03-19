package es.ulpgc.eite.cleancode.clickcounter.counter;

import java.lang.ref.WeakReference;

import es.ulpgc.eite.cleancode.clickcounter.app.AppMediator;
import es.ulpgc.eite.cleancode.clickcounter.app.ClicksToCounterState;
import es.ulpgc.eite.cleancode.clickcounter.app.CounterToClicksState;

public class CounterPresenter implements CounterContract.Presenter {

  //public static String TAG = CounterPresenter.class.getSimpleName();
  public static String TAG = "ClickCounter.CounterPresenter";

  private WeakReference<CounterContract.View> view;
  private CounterState state;
  private CounterContract.Model model;

  private AppMediator mediator;

  public CounterPresenter(AppMediator mediator) {
    this.mediator = mediator;
  }


  @Override
  public void onStart() {
    // Log.e(TAG, "onStart()");

    // initialize the state
    state = new CounterState();

    // TODO: add code if is necessary

  }

  @Override
  public void onRestart() {
    // Log.e(TAG, "onRestart()");

    // update the model if is necessary
    model.updateOnRestartScreen(state.data);
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
  public void onClicksPressed() {
    // Log.e(TAG, "onClicksPressed()");

    // TODO: add code if is necessary
  }

  @Override
  public void onResetPressed() {
    // Log.e(TAG, "onResetPressed()");

    // TODO: add code if is necessary
  }

  @Override
  public void onIncrementPressed() {
    // Log.e(TAG, "onIncrementPressed()");

    // TODO: add code if is necessary
  }

  private void passStateToNextScreen(CounterToClicksState state) {
    mediator.setCounterNextScreenState(state);
  }

  private ClicksToCounterState getStateFromNextScreen() {
    return mediator.getCounterNextScreenState();
  }

  @Override
  public void injectView(WeakReference<CounterContract.View> view) {
    this.view = view;
  }

  @Override
  public void injectModel(CounterContract.Model model) {
    this.model = model;
  }

}
