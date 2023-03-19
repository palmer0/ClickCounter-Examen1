package es.ulpgc.eite.cleancode.clickcounter.counter;

public class CounterModel implements CounterContract.Model {

  //public static String TAG = CounterModel.class.getSimpleName();
  public static String TAG = "ClickCounter.CounterModel";

  private String data;

  public CounterModel(String data) {
    this.data = data;
  }

  @Override
  public String getStoredData() {
    // Log.e(TAG, "getStoredData()");
    return data;
  }

  @Override
  public void updateOnRestartScreen(String data) {
    // Log.e(TAG, "updateOnRestartScreen()");

    // TODO: add code if is necessary
  }

  @Override
  public void updateWithDataFromNextScreen(String data) {
    // Log.e(TAG, "updateWithDataFromNextScreen()");

    // TODO: add code if is necessary
  }

  @Override
  public void updateWithDataFromPreviousScreen(String data) {
    // Log.e(TAG, "updateWithDataFromPreviousScreen()");

    // TODO: add code if is necessary
  }
}
