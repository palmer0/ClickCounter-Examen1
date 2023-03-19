package es.ulpgc.eite.cleancode.clickcounter.clicks;

public class ClicksModel implements ClicksContract.Model {

  //public static String TAG = ClicksModel.class.getSimpleName();
  public static String TAG = "ClickCounter.ClicksModel";

  private String data;

  public ClicksModel(String data) {
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
