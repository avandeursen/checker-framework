package java.lang;

import org.checkerframework.checker.nullness.qual.NonNull;
import org.checkerframework.dataflow.qual.Pure;
import org.checkerframework.checker.lock.qual.*;

public interface Comparable<T extends Object> {
  // argument may NOT be null
   int compareTo(@GuardSatisfied Comparable<T> this,T a1);
}
