module org.sort.javasort {
  requires org.sortutil;

  provides org.util.SortUtil with
      org.util.javasort.JavaSortUtilImpl;
}
