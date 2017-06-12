/*
 * This file was automatically generated by EvoSuite
 * Mon Jun 12 01:47:54 GMT 2017
 */

package collections.comparators;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import collections.comparators.FixedOrderComparator;
import java.util.ConcurrentModificationException;
import java.util.LinkedList;
import java.util.List;
import java.util.function.UnaryOperator;
import java.util.stream.Stream;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true) 
public class FixedOrderComparator20_ESTest extends FixedOrderComparator20_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      FixedOrderComparator fixedOrderComparator0 = new FixedOrderComparator();
      Object object0 = new Object();
      Object object1 = new Object();
      // Undeclared exception!
      try { 
        fixedOrderComparator0.compare(object0, object1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Attempting to compare unknown object java.lang.Object@366b0530
         //
         verifyException("collections.comparators.FixedOrderComparator", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      FixedOrderComparator fixedOrderComparator0 = new FixedOrderComparator();
      // Undeclared exception!
      try { 
        fixedOrderComparator0.setUnknownObjectBehavior((-2215));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Unrecognised value for unknown behaviour flag
         //
         verifyException("collections.comparators.FixedOrderComparator", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      LinkedList<Integer> linkedList0 = new LinkedList<Integer>();
      FixedOrderComparator fixedOrderComparator0 = new FixedOrderComparator(linkedList0);
      fixedOrderComparator0.checkLocked();
      assertEquals(2, fixedOrderComparator0.getUnknownObjectBehavior());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      LinkedList<Object> linkedList0 = new LinkedList<Object>();
      FixedOrderComparator fixedOrderComparator0 = new FixedOrderComparator(linkedList0);
      assertEquals(2, fixedOrderComparator0.getUnknownObjectBehavior());
      
      fixedOrderComparator0.setUnknownObjectBehavior(0);
      int int0 = fixedOrderComparator0.getUnknownObjectBehavior();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Object[] objectArray0 = new Object[2];
      Object object0 = new Object();
      FixedOrderComparator fixedOrderComparator0 = new FixedOrderComparator(objectArray0);
      fixedOrderComparator0.setUnknownObjectBehavior(0);
      fixedOrderComparator0.compare(object0, object0);
      // Undeclared exception!
      try { 
        fixedOrderComparator0.checkLocked();
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // Cannot modify a FixedOrderComparator after a comparison
         //
         verifyException("collections.comparators.FixedOrderComparator", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Object[] objectArray0 = new Object[2];
      Object object0 = new Object();
      objectArray0[0] = object0;
      FixedOrderComparator fixedOrderComparator0 = new FixedOrderComparator(objectArray0);
      fixedOrderComparator0.compare(object0, objectArray0[0]);
      // Undeclared exception!
      try { 
        fixedOrderComparator0.add(object0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // Cannot modify a FixedOrderComparator after a comparison
         //
         verifyException("collections.comparators.FixedOrderComparator", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      LinkedList<Object> linkedList0 = new LinkedList<Object>();
      List<Object> list0 = linkedList0.subList(0, 0);
      linkedList0.add((Object) list0);
      FixedOrderComparator fixedOrderComparator0 = null;
      try {
        fixedOrderComparator0 = new FixedOrderComparator(list0);
        fail("Expecting exception: ConcurrentModificationException");
      
      } catch(ConcurrentModificationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.SubList", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Object[] objectArray0 = new Object[1];
      Object object0 = new Object();
      objectArray0[0] = object0;
      FixedOrderComparator fixedOrderComparator0 = new FixedOrderComparator(objectArray0);
      boolean boolean0 = fixedOrderComparator0.add(object0);
      assertFalse(boolean0);
      assertEquals(2, fixedOrderComparator0.getUnknownObjectBehavior());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      LinkedList<Integer> linkedList0 = new LinkedList<Integer>();
      FixedOrderComparator fixedOrderComparator0 = new FixedOrderComparator(linkedList0);
      fixedOrderComparator0.isLocked();
      assertEquals(2, fixedOrderComparator0.getUnknownObjectBehavior());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      LinkedList<Integer> linkedList0 = new LinkedList<Integer>();
      Integer integer0 = new Integer(0);
      linkedList0.add(integer0);
      FixedOrderComparator fixedOrderComparator0 = new FixedOrderComparator(linkedList0);
      fixedOrderComparator0.setUnknownObjectBehavior(1);
      Object object0 = new Object();
      int int0 = fixedOrderComparator0.compare(object0, integer0);
      assertTrue(fixedOrderComparator0.isLocked());
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Object[] objectArray0 = new Object[2];
      FixedOrderComparator fixedOrderComparator0 = new FixedOrderComparator(objectArray0);
      fixedOrderComparator0.setUnknownObjectBehavior(0);
      UnaryOperator<Object> unaryOperator0 = UnaryOperator.identity();
      int int0 = fixedOrderComparator0.compare(unaryOperator0, objectArray0[0]);
      assertTrue(fixedOrderComparator0.isLocked());
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Object[] objectArray0 = new Object[2];
      Object object0 = new Object();
      Object object1 = new Object();
      objectArray0[1] = object1;
      FixedOrderComparator fixedOrderComparator0 = new FixedOrderComparator(objectArray0);
      fixedOrderComparator0.setUnknownObjectBehavior(0);
      int int0 = fixedOrderComparator0.compare(object1, object0);
      assertTrue(fixedOrderComparator0.isLocked());
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      LinkedList<Object> linkedList0 = new LinkedList<Object>();
      FixedOrderComparator fixedOrderComparator0 = new FixedOrderComparator(linkedList0);
      fixedOrderComparator0.add(linkedList0);
      fixedOrderComparator0.compare(linkedList0, linkedList0);
      boolean boolean0 = fixedOrderComparator0.isLocked();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      FixedOrderComparator fixedOrderComparator0 = new FixedOrderComparator();
      assertFalse(fixedOrderComparator0.isLocked());
      
      Integer integer0 = new Integer(2);
      boolean boolean0 = fixedOrderComparator0.add(integer0);
      Object object0 = new Object();
      fixedOrderComparator0.add(object0);
      boolean boolean1 = fixedOrderComparator0.addAsEqual(integer0, "Cannot modify a FixedOrderComparator after a comparison");
      assertTrue(boolean1 == boolean0);
      
      boolean boolean2 = fixedOrderComparator0.addAsEqual("Cannot modify a FixedOrderComparator after a comparison", object0);
      assertEquals(2, fixedOrderComparator0.getUnknownObjectBehavior());
      assertFalse(boolean2);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      LinkedList<String> linkedList0 = new LinkedList<String>();
      FixedOrderComparator fixedOrderComparator0 = new FixedOrderComparator(linkedList0);
      Object object0 = new Object();
      // Undeclared exception!
      try { 
        fixedOrderComparator0.addAsEqual(linkedList0, object0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // [] not known to collections.comparators.FixedOrderComparator@1
         //
         verifyException("collections.comparators.FixedOrderComparator", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      LinkedList<Integer> linkedList0 = new LinkedList<Integer>();
      FixedOrderComparator fixedOrderComparator0 = new FixedOrderComparator(linkedList0);
      assertFalse(fixedOrderComparator0.isLocked());
      
      fixedOrderComparator0.setUnknownObjectBehavior(2);
      assertEquals(2, fixedOrderComparator0.getUnknownObjectBehavior());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      LinkedList<Object> linkedList0 = new LinkedList<Object>();
      FixedOrderComparator fixedOrderComparator0 = new FixedOrderComparator(linkedList0);
      fixedOrderComparator0.setUnknownObjectBehavior(0);
      fixedOrderComparator0.compare(linkedList0, linkedList0);
      // Undeclared exception!
      try { 
        fixedOrderComparator0.setUnknownObjectBehavior(1118);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // Cannot modify a FixedOrderComparator after a comparison
         //
         verifyException("collections.comparators.FixedOrderComparator", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      LinkedList<Integer> linkedList0 = new LinkedList<Integer>();
      Integer integer0 = new Integer(0);
      FixedOrderComparator fixedOrderComparator0 = new FixedOrderComparator(linkedList0);
      fixedOrderComparator0.setUnknownObjectBehavior(1);
      Object object0 = new Object();
      fixedOrderComparator0.compare(object0, integer0);
      // Undeclared exception!
      try { 
        fixedOrderComparator0.addAsEqual(integer0, fixedOrderComparator0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // Cannot modify a FixedOrderComparator after a comparison
         //
         verifyException("collections.comparators.FixedOrderComparator", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      FixedOrderComparator fixedOrderComparator0 = null;
      try {
        fixedOrderComparator0 = new FixedOrderComparator((List) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The list of items must not be null
         //
         verifyException("collections.comparators.FixedOrderComparator", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      FixedOrderComparator fixedOrderComparator0 = null;
      try {
        fixedOrderComparator0 = new FixedOrderComparator((Object[]) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The list of items must not be null
         //
         verifyException("collections.comparators.FixedOrderComparator", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      LinkedList<Integer> linkedList0 = new LinkedList<Integer>();
      Integer integer0 = new Integer(0);
      linkedList0.add(integer0);
      FixedOrderComparator fixedOrderComparator0 = new FixedOrderComparator(linkedList0);
      Stream<Integer> stream0 = linkedList0.parallelStream();
      // Undeclared exception!
      try { 
        fixedOrderComparator0.compare(integer0, stream0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Attempting to compare unknown object java.util.stream.ReferencePipeline$Head@1a89ed9d
         //
         verifyException("collections.comparators.FixedOrderComparator", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      FixedOrderComparator fixedOrderComparator0 = new FixedOrderComparator();
      // Undeclared exception!
      try { 
        fixedOrderComparator0.setUnknownObjectBehavior(557);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Unrecognised value for unknown behaviour flag
         //
         verifyException("collections.comparators.FixedOrderComparator", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      LinkedList<Object> linkedList0 = new LinkedList<Object>();
      FixedOrderComparator fixedOrderComparator0 = new FixedOrderComparator(linkedList0);
      int int0 = fixedOrderComparator0.getUnknownObjectBehavior();
      assertFalse(fixedOrderComparator0.isLocked());
      assertEquals(2, int0);
  }
}
