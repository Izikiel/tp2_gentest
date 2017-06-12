/*
 * This file was automatically generated by EvoSuite
 * Mon Jun 12 01:40:57 GMT 2017
 */

package collections.comparators;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import collections.comparators.FixedOrderComparator;
import java.util.LinkedList;
import java.util.List;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true) 
public class FixedOrderComparator8_ESTest extends FixedOrderComparator8_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Object[] objectArray0 = new Object[0];
      FixedOrderComparator fixedOrderComparator0 = new FixedOrderComparator(objectArray0);
      // Undeclared exception!
      try { 
        fixedOrderComparator0.setUnknownObjectBehavior(6618);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Unrecognised value for unknown behaviour flag
         //
         verifyException("collections.comparators.FixedOrderComparator", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      FixedOrderComparator fixedOrderComparator0 = new FixedOrderComparator();
      fixedOrderComparator0.checkLocked();
      assertEquals(2, fixedOrderComparator0.getUnknownObjectBehavior());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      FixedOrderComparator fixedOrderComparator0 = new FixedOrderComparator();
      Object object0 = new Object();
      fixedOrderComparator0.add(object0);
      fixedOrderComparator0.compare(object0, object0);
      boolean boolean0 = fixedOrderComparator0.isLocked();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      LinkedList<String> linkedList0 = new LinkedList<String>();
      FixedOrderComparator fixedOrderComparator0 = new FixedOrderComparator(linkedList0);
      assertEquals(2, fixedOrderComparator0.getUnknownObjectBehavior());
      
      fixedOrderComparator0.setUnknownObjectBehavior(0);
      int int0 = fixedOrderComparator0.getUnknownObjectBehavior();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Object[] objectArray0 = new Object[7];
      FixedOrderComparator fixedOrderComparator0 = new FixedOrderComparator(objectArray0);
      fixedOrderComparator0.compare(objectArray0[0], objectArray0[1]);
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
      FixedOrderComparator fixedOrderComparator0 = new FixedOrderComparator();
      Object object0 = new Object();
      fixedOrderComparator0.add(object0);
      fixedOrderComparator0.compare(object0, object0);
      // Undeclared exception!
      try { 
        fixedOrderComparator0.addAsEqual(object0, object0);
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
      FixedOrderComparator fixedOrderComparator0 = new FixedOrderComparator();
      Object object0 = new Object();
      boolean boolean0 = fixedOrderComparator0.add(object0);
      assertTrue(boolean0);
      
      boolean boolean1 = fixedOrderComparator0.add(object0);
      assertFalse(boolean1);
      assertEquals(2, fixedOrderComparator0.getUnknownObjectBehavior());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      FixedOrderComparator fixedOrderComparator0 = new FixedOrderComparator();
      fixedOrderComparator0.isLocked();
      assertEquals(2, fixedOrderComparator0.getUnknownObjectBehavior());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Object[] objectArray0 = new Object[9];
      Object object0 = new Object();
      FixedOrderComparator fixedOrderComparator0 = new FixedOrderComparator(objectArray0);
      fixedOrderComparator0.setUnknownObjectBehavior(1);
      int int0 = fixedOrderComparator0.compare(object0, fixedOrderComparator0.UNKNOWN_AFTER);
      assertTrue(fixedOrderComparator0.isLocked());
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Object[] objectArray0 = new Object[5];
      Object object0 = new Object();
      objectArray0[0] = object0;
      Object object1 = new Object();
      FixedOrderComparator fixedOrderComparator0 = new FixedOrderComparator(objectArray0);
      fixedOrderComparator0.setUnknownObjectBehavior(0);
      int int0 = fixedOrderComparator0.compare(object1, object0);
      assertTrue(fixedOrderComparator0.isLocked());
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Object[] objectArray0 = new Object[5];
      Object object0 = new Object();
      FixedOrderComparator fixedOrderComparator0 = new FixedOrderComparator(objectArray0);
      fixedOrderComparator0.setUnknownObjectBehavior(0);
      int int0 = fixedOrderComparator0.compare((Object) null, object0);
      assertTrue(fixedOrderComparator0.isLocked());
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      FixedOrderComparator fixedOrderComparator0 = new FixedOrderComparator();
      fixedOrderComparator0.setUnknownObjectBehavior(0);
      Object object0 = new Object();
      int int0 = fixedOrderComparator0.compare(fixedOrderComparator0, object0);
      assertTrue(fixedOrderComparator0.isLocked());
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Object[] objectArray0 = new Object[4];
      Object object0 = new Object();
      FixedOrderComparator fixedOrderComparator0 = new FixedOrderComparator(objectArray0);
      // Undeclared exception!
      try { 
        fixedOrderComparator0.compare(objectArray0[1], object0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Attempting to compare unknown object java.lang.Object@24a314ce
         //
         verifyException("collections.comparators.FixedOrderComparator", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      FixedOrderComparator fixedOrderComparator0 = new FixedOrderComparator();
      Object object0 = new Object();
      // Undeclared exception!
      try { 
        fixedOrderComparator0.compare(fixedOrderComparator0, object0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Attempting to compare unknown object collections.comparators.FixedOrderComparator@1
         //
         verifyException("collections.comparators.FixedOrderComparator", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Object[] objectArray0 = new Object[9];
      Object object0 = new Object();
      objectArray0[0] = object0;
      FixedOrderComparator fixedOrderComparator0 = new FixedOrderComparator(objectArray0);
      Object object1 = new Object();
      boolean boolean0 = fixedOrderComparator0.addAsEqual(object0, object1);
      assertTrue(boolean0);
      assertEquals(2, fixedOrderComparator0.getUnknownObjectBehavior());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      LinkedList<String> linkedList0 = new LinkedList<String>();
      Object object0 = linkedList0.clone();
      FixedOrderComparator fixedOrderComparator0 = new FixedOrderComparator(linkedList0);
      Object object1 = new Object();
      // Undeclared exception!
      try { 
        fixedOrderComparator0.addAsEqual(object0, object1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // [] not known to collections.comparators.FixedOrderComparator@1
         //
         verifyException("collections.comparators.FixedOrderComparator", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Object[] objectArray0 = new Object[1];
      Object object0 = new Object();
      objectArray0[0] = object0;
      FixedOrderComparator fixedOrderComparator0 = new FixedOrderComparator(objectArray0);
      boolean boolean0 = fixedOrderComparator0.addAsEqual(object0, object0);
      assertEquals(2, fixedOrderComparator0.getUnknownObjectBehavior());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Object[] objectArray0 = new Object[9];
      FixedOrderComparator fixedOrderComparator0 = new FixedOrderComparator(objectArray0);
      fixedOrderComparator0.setUnknownObjectBehavior(1);
      int int0 = fixedOrderComparator0.compare(objectArray0[7], fixedOrderComparator0.UNKNOWN_AFTER);
      assertTrue(fixedOrderComparator0.isLocked());
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Object[] objectArray0 = new Object[1];
      Object object0 = new Object();
      objectArray0[0] = object0;
      FixedOrderComparator fixedOrderComparator0 = new FixedOrderComparator(objectArray0);
      fixedOrderComparator0.compare(objectArray0[0], object0);
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
  public void test19()  throws Throwable  {
      LinkedList<String> linkedList0 = new LinkedList<String>();
      linkedList0.add("Edg!Pg8");
      FixedOrderComparator fixedOrderComparator0 = new FixedOrderComparator(linkedList0);
      assertEquals(2, fixedOrderComparator0.getUnknownObjectBehavior());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
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
  public void test21()  throws Throwable  {
      LinkedList<String> linkedList0 = new LinkedList<String>();
      FixedOrderComparator fixedOrderComparator0 = new FixedOrderComparator(linkedList0);
      // Undeclared exception!
      try { 
        fixedOrderComparator0.setUnknownObjectBehavior((-853));
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
  public void test23()  throws Throwable  {
      FixedOrderComparator fixedOrderComparator0 = new FixedOrderComparator();
      assertFalse(fixedOrderComparator0.isLocked());
      
      fixedOrderComparator0.setUnknownObjectBehavior(2);
      assertEquals(2, fixedOrderComparator0.getUnknownObjectBehavior());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Object[] objectArray0 = new Object[1];
      FixedOrderComparator fixedOrderComparator0 = new FixedOrderComparator(objectArray0);
      int int0 = fixedOrderComparator0.getUnknownObjectBehavior();
      assertEquals(2, int0);
  }
}