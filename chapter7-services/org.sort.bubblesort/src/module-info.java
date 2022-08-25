module org.sort.bubblesort {
  requires org.sortutil;

  provides org.util.SortUtil with
      org.util.bubble.BubbleSortUtil;
}
