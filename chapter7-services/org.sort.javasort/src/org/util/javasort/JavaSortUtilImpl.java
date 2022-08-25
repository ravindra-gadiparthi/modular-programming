package org.util.javasort;

import org.util.SortUtil;

import java.util.Collections;
import java.util.List;

public class JavaSortUtilImpl implements SortUtil {
  @Override
  public int getMaxProcessingCapacity() {
    return Integer.MAX_VALUE;
  }

  @Override
  public <T extends Comparable<T>> List<T> sort(List<T> list) {
    Collections.sort(list);
    return list;
  }
}
