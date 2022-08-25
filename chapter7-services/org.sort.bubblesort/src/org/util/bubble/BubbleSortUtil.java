package org.util.bubble;

import org.util.SortUtil;

import java.util.List;

public class BubbleSortUtil implements SortUtil {
  @Override
  public int getMaxProcessingCapacity() {
    return 4;
  }

  public <T extends Comparable<T>> List<T> sort(List<T> list) {
    for (int i = 0; i < list.size() - 1; i++) {
      for (int j = 0; j < list.size() - j - 1; j++) {
        if (list.get(j).compareTo(list.get(j + 1)) > 0) {
          swap(list, j);
        }
      }
    }
    return list;
  }

  private <T extends Comparable<T>> void swap(List<T> list, int j) {
    T temp = list.get(j);
    list.set(j, list.get(j + 1));
    list.set(j + 1, temp);
  }
}
