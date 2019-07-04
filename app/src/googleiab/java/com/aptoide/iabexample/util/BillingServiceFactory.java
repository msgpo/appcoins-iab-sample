package com.aptoide.iabexample.utilssdk;

import android.os.IBinder;

/**
 * Created by marcelobenites on 02/11/16.
 */

public class BillingServiceFactory {

  public static BillingService create(final IBinder service) {
    return new GoogleBillingService(service);
  }
}
