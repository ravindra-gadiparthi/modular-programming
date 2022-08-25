package org.util;

import java.util.ArrayList;
import java.util.List;
import java.util.ServiceLoader;

public interface SortUtil {
  static List<SortUtil> getAllProviders() {
    List<SortUtil> sortUtils = new ArrayList<>();
    for (SortUtil util : ServiceLoader.load(SortUtil.class)) {
      sortUtils.add(util);
    }
    return sortUtils;
  }

  static SortUtil getInstance(int capacity) {
    return getAllProviders().stream()
        .filter(sortUtil -> sortUtil.getMaxProcessingCapacity() > capacity)
        .findAny()
        .get();
  }

  int getMaxProcessingCapacity();

  <T extends Comparable<T>> List<T> sort(List<T> list);
}
