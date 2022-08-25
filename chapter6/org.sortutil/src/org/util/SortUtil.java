package org.util;

import org.util.impl.BubbleSortUtilImpl;

import java.util.List;

public class SortUtil {
  private BubbleSortUtilImpl bubbleSortUtil = new BubbleSortUtilImpl();
  public <T extends Comparable<T>> List<T> sort(List<T> list) {
    return bubbleSortUtil.sort(list);
  }
}
