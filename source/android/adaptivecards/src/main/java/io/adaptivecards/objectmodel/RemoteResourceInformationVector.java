/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package io.adaptivecards.objectmodel;

public class RemoteResourceInformationVector extends java.util.AbstractList<RemoteResourceInformation> implements java.util.RandomAccess {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected RemoteResourceInformationVector(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(RemoteResourceInformationVector obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  @SuppressWarnings("deprecation")
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        AdaptiveCardObjectModelJNI.delete_RemoteResourceInformationVector(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public RemoteResourceInformationVector(RemoteResourceInformation[] initialElements) {
    this();
    reserve(initialElements.length);

    for (RemoteResourceInformation element : initialElements) {
      add(element);
    }
  }

  public RemoteResourceInformationVector(Iterable<RemoteResourceInformation> initialElements) {
    this();
    for (RemoteResourceInformation element : initialElements) {
      add(element);
    }
  }

  public RemoteResourceInformation get(int index) {
    return doGet(index);
  }

  public RemoteResourceInformation set(int index, RemoteResourceInformation e) {
    return doSet(index, e);
  }

  public boolean add(RemoteResourceInformation e) {
    modCount++;
    doAdd(e);
    return true;
  }

  public void add(int index, RemoteResourceInformation e) {
    modCount++;
    doAdd(index, e);
  }

  public RemoteResourceInformation remove(int index) {
    modCount++;
    return doRemove(index);
  }

  protected void removeRange(int fromIndex, int toIndex) {
    modCount++;
    doRemoveRange(fromIndex, toIndex);
  }

  public int size() {
    return doSize();
  }

  public RemoteResourceInformationVector() {
    this(AdaptiveCardObjectModelJNI.new_RemoteResourceInformationVector__SWIG_0(), true);
  }

  public RemoteResourceInformationVector(RemoteResourceInformationVector other) {
    this(AdaptiveCardObjectModelJNI.new_RemoteResourceInformationVector__SWIG_1(RemoteResourceInformationVector.getCPtr(other), other), true);
  }

  public long capacity() {
    return AdaptiveCardObjectModelJNI.RemoteResourceInformationVector_capacity(swigCPtr, this);
  }

  public void reserve(long n) {
    AdaptiveCardObjectModelJNI.RemoteResourceInformationVector_reserve(swigCPtr, this, n);
  }

  public boolean isEmpty() {
    return AdaptiveCardObjectModelJNI.RemoteResourceInformationVector_isEmpty(swigCPtr, this);
  }

  public void clear() {
    AdaptiveCardObjectModelJNI.RemoteResourceInformationVector_clear(swigCPtr, this);
  }

  public RemoteResourceInformationVector(int count, RemoteResourceInformation value) {
    this(AdaptiveCardObjectModelJNI.new_RemoteResourceInformationVector__SWIG_2(count, RemoteResourceInformation.getCPtr(value), value), true);
  }

  private int doSize() {
    return AdaptiveCardObjectModelJNI.RemoteResourceInformationVector_doSize(swigCPtr, this);
  }

  private void doAdd(RemoteResourceInformation x) {
    AdaptiveCardObjectModelJNI.RemoteResourceInformationVector_doAdd__SWIG_0(swigCPtr, this, RemoteResourceInformation.getCPtr(x), x);
  }

  private void doAdd(int index, RemoteResourceInformation x) {
    AdaptiveCardObjectModelJNI.RemoteResourceInformationVector_doAdd__SWIG_1(swigCPtr, this, index, RemoteResourceInformation.getCPtr(x), x);
  }

  private RemoteResourceInformation doRemove(int index) {
    return new RemoteResourceInformation(AdaptiveCardObjectModelJNI.RemoteResourceInformationVector_doRemove(swigCPtr, this, index), true);
  }

  private RemoteResourceInformation doGet(int index) {
    return new RemoteResourceInformation(AdaptiveCardObjectModelJNI.RemoteResourceInformationVector_doGet(swigCPtr, this, index), true);
  }

  private RemoteResourceInformation doSet(int index, RemoteResourceInformation val) {
    return new RemoteResourceInformation(AdaptiveCardObjectModelJNI.RemoteResourceInformationVector_doSet(swigCPtr, this, index, RemoteResourceInformation.getCPtr(val), val), true);
  }

  private void doRemoveRange(int fromIndex, int toIndex) {
    AdaptiveCardObjectModelJNI.RemoteResourceInformationVector_doRemoveRange(swigCPtr, this, fromIndex, toIndex);
  }

}
