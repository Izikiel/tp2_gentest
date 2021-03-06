/*
 * This file was automatically generated by EvoSuite
 * Mon Jun 12 02:01:59 GMT 2017
 */

package collections.iterators;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import collections.Predicate;
import collections.functors.AllPredicate;
import collections.functors.NotNullPredicate;
import collections.functors.TruePredicate;
import collections.iterators.FilterIterator;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true) 
public class FilterIterator18_ESTest extends FilterIterator18_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      LinkedList<Object> linkedList0 = new LinkedList<Object>();
      Iterator<Object> iterator0 = linkedList0.descendingIterator();
      FilterIterator filterIterator0 = new FilterIterator(iterator0, (Predicate) null);
      boolean boolean0 = filterIterator0.hasNext();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      FilterIterator filterIterator0 = new FilterIterator();
      Predicate predicate0 = NotNullPredicate.getInstance();
      filterIterator0.setPredicate(predicate0);
      Predicate predicate1 = filterIterator0.getPredicate();
      assertSame(predicate1, predicate0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      LinkedList<Object> linkedList0 = new LinkedList<Object>();
      ListIterator<Object> listIterator0 = linkedList0.listIterator();
      LinkedList<String> linkedList1 = new LinkedList<String>();
      Predicate predicate0 = AllPredicate.getInstance((Collection) linkedList1);
      FilterIterator filterIterator0 = new FilterIterator(listIterator0, predicate0);
      Iterator iterator0 = filterIterator0.getIterator();
      assertNotNull(iterator0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      LinkedList<Object> linkedList0 = new LinkedList<Object>();
      Iterator<Object> iterator0 = linkedList0.descendingIterator();
      TruePredicate truePredicate0 = (TruePredicate)TruePredicate.INSTANCE;
      Object object0 = new Object();
      linkedList0.add(object0);
      FilterIterator filterIterator0 = new FilterIterator(iterator0, truePredicate0);
      // Undeclared exception!
      try { 
        filterIterator0.remove();
        fail("Expecting exception: ConcurrentModificationException");
      
      } catch(ConcurrentModificationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.LinkedList$ListItr", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      FilterIterator filterIterator0 = new FilterIterator();
      // Undeclared exception!
      try { 
        filterIterator0.remove();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("collections.iterators.FilterIterator", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      LinkedList<Object> linkedList0 = new LinkedList<Object>();
      ListIterator<Object> listIterator0 = linkedList0.listIterator();
      linkedList0.offerLast(listIterator0);
      FilterIterator filterIterator0 = new FilterIterator(listIterator0, (Predicate) null);
      // Undeclared exception!
      try { 
        filterIterator0.next();
        fail("Expecting exception: ConcurrentModificationException");
      
      } catch(ConcurrentModificationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.LinkedList$ListItr", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      LinkedList<Object> linkedList0 = new LinkedList<Object>();
      ListIterator<Object> listIterator0 = linkedList0.listIterator();
      LinkedList<String> linkedList1 = new LinkedList<String>();
      Predicate predicate0 = AllPredicate.getInstance((Collection) linkedList1);
      FilterIterator filterIterator0 = new FilterIterator(listIterator0, predicate0);
      Object object0 = new Object();
      linkedList0.add(object0);
      // Undeclared exception!
      try { 
        filterIterator0.hasNext();
        fail("Expecting exception: ConcurrentModificationException");
      
      } catch(ConcurrentModificationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.LinkedList$ListItr", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      FilterIterator filterIterator0 = new FilterIterator();
      LinkedList<Object> linkedList0 = new LinkedList<Object>();
      linkedList0.add((Object) filterIterator0);
      Iterator<Object> iterator0 = linkedList0.descendingIterator();
      filterIterator0.setIterator(iterator0);
      // Undeclared exception!
      try { 
        filterIterator0.next();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("collections.iterators.FilterIterator", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      LinkedList<Object> linkedList0 = new LinkedList<Object>();
      Iterator<Object> iterator0 = linkedList0.descendingIterator();
      TruePredicate truePredicate0 = (TruePredicate)TruePredicate.INSTANCE;
      FilterIterator filterIterator0 = new FilterIterator(iterator0, truePredicate0);
      // Undeclared exception!
      try { 
        filterIterator0.remove();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.LinkedList$ListItr", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      LinkedList<Object> linkedList0 = new LinkedList<Object>();
      Iterator<Object> iterator0 = linkedList0.descendingIterator();
      FilterIterator filterIterator0 = new FilterIterator(iterator0, (Predicate) null);
      // Undeclared exception!
      try { 
        filterIterator0.next();
        fail("Expecting exception: NoSuchElementException");
      
      } catch(NoSuchElementException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("collections.iterators.FilterIterator", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      FilterIterator filterIterator0 = new FilterIterator();
      // Undeclared exception!
      try { 
        filterIterator0.hasNext();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("collections.iterators.FilterIterator", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      FilterIterator filterIterator0 = new FilterIterator();
      Iterator iterator0 = filterIterator0.getIterator();
      assertNull(iterator0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      LinkedList<Object> linkedList0 = new LinkedList<Object>();
      Iterator<Object> iterator0 = linkedList0.descendingIterator();
      TruePredicate truePredicate0 = (TruePredicate)TruePredicate.INSTANCE;
      FilterIterator filterIterator0 = new FilterIterator(iterator0, truePredicate0);
      FilterIterator filterIterator1 = new FilterIterator(filterIterator0);
      assertFalse(filterIterator1.equals((Object)filterIterator0));
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      FilterIterator filterIterator0 = new FilterIterator();
      Predicate predicate0 = filterIterator0.getPredicate();
      assertNull(predicate0);
  }
}
