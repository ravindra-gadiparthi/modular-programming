package org.lib.external;

import org.lib.internal.LibApiImpl;

public interface LibApi {
  static LibApi getInstance() {
    return new LibApiImpl();
  }

  void test();
}
