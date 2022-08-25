package org.lib.internal;

import org.lib.external.LibApi;

public class LibApiImpl implements LibApi {
  @Override
  public void test() {
    System.out.println("Test");
  }
}
