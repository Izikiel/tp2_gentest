/*
 * This file was automatically generated by EvoSuite
 * Mon Jun 12 02:15:56 GMT 2017
 */

package collections.map;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import collections.Predicate;
import collections.functors.AllPredicate;
import collections.functors.InstanceofPredicate;
import collections.functors.NotNullPredicate;
import collections.functors.TruePredicate;
import collections.functors.UniquePredicate;
import collections.map.PredicatedMap;
import java.util.HashMap;
import java.util.Map;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true) 
public class PredicatedMap14_ESTest extends PredicatedMap14_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      Predicate predicate0 = NotNullPredicate.getInstance();
      PredicatedMap predicatedMap0 = new PredicatedMap(hashMap0, predicate0, predicate0);
      predicatedMap0.putAll(predicatedMap0);
      assertEquals(0, predicatedMap0.size());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      HashMap<Object, Integer> hashMap0 = new HashMap<Object, Integer>();
      Predicate predicate0 = UniquePredicate.getInstance();
      PredicatedMap predicatedMap0 = new PredicatedMap(hashMap0, predicate0, predicate0);
      Integer integer0 = new Integer(318);
      hashMap0.put(predicate0, integer0);
      Object object0 = new Object();
      predicatedMap0.put(predicate0, object0);
      assertEquals(1, predicatedMap0.size());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      Predicate predicate0 = NotNullPredicate.getInstance();
      PredicatedMap predicatedMap0 = new PredicatedMap(hashMap0, predicate0, predicate0);
      boolean boolean0 = predicatedMap0.isSetValueChecking();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      HashMap<Integer, String> hashMap0 = new HashMap<Integer, String>();
      Predicate predicate0 = TruePredicate.getInstance();
      PredicatedMap predicatedMap0 = new PredicatedMap(hashMap0, predicate0, (Predicate) null);
      boolean boolean0 = predicatedMap0.isSetValueChecking();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      Predicate predicate0 = NotNullPredicate.getInstance();
      PredicatedMap predicatedMap0 = new PredicatedMap(hashMap0, predicate0, predicate0);
      // Undeclared exception!
      try { 
        predicatedMap0.putAll((Map) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("collections.map.PredicatedMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      Predicate predicate0 = NotNullPredicate.getInstance();
      PredicatedMap predicatedMap0 = new PredicatedMap(hashMap0, predicate0, predicate0);
      hashMap0.put("k[=qjZ@O-1i,KOE", predicatedMap0);
      Object object0 = new Object();
      // Undeclared exception!
      try { 
        predicatedMap0.put(hashMap0, object0);
        fail("Expecting exception: StackOverflowError");
      
      } catch(StackOverflowError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      AllPredicate allPredicate0 = new AllPredicate((Predicate[]) null);
      PredicatedMap predicatedMap0 = new PredicatedMap(hashMap0, allPredicate0, allPredicate0);
      Object object0 = new Object();
      // Undeclared exception!
      try { 
        predicatedMap0.put("~B4", object0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      AllPredicate allPredicate0 = new AllPredicate((Predicate[]) null);
      PredicatedMap predicatedMap0 = new PredicatedMap(hashMap0, allPredicate0, allPredicate0);
      hashMap0.put((String) null, (Object) null);
      Predicate predicate0 = NotNullPredicate.getInstance();
      // Undeclared exception!
      try { 
        PredicatedMap.decorate(predicatedMap0, allPredicate0, predicate0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Class<String> class0 = String.class;
      Predicate predicate0 = InstanceofPredicate.getInstance(class0);
      // Undeclared exception!
      try { 
        PredicatedMap.decorate((Map) null, predicate0, (Predicate) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Map must not be null
         //
         verifyException("collections.map.AbstractMapDecorator", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      PredicatedMap predicatedMap0 = new PredicatedMap(hashMap0, (Predicate) null, (Predicate) null);
      // Undeclared exception!
      try { 
        predicatedMap0.checkSetValue("");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("collections.map.PredicatedMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      UniquePredicate uniquePredicate0 = new UniquePredicate();
      PredicatedMap predicatedMap0 = null;
      try {
        predicatedMap0 = new PredicatedMap((Map) null, uniquePredicate0, uniquePredicate0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Map must not be null
         //
         verifyException("collections.map.AbstractMapDecorator", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      HashMap<Integer, Object> hashMap0 = new HashMap<Integer, Object>();
      Predicate predicate0 = UniquePredicate.getInstance();
      PredicatedMap predicatedMap0 = new PredicatedMap(hashMap0, predicate0, predicate0);
      Object object0 = new Object();
      predicatedMap0.validate(hashMap0, object0);
      // Undeclared exception!
      try { 
        predicatedMap0.put(object0, ".E`+BIUB&Fe");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Cannot add key - Predicate rejected it
         //
         verifyException("collections.map.PredicatedMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      Object object0 = new Object();
      hashMap0.put("g+V2_{0v6", object0);
      PredicatedMap predicatedMap0 = new PredicatedMap(hashMap0, (Predicate) null, (Predicate) null);
      assertEquals(1, predicatedMap0.size());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      HashMap<String, Integer> hashMap0 = new HashMap<String, Integer>();
      Predicate predicate0 = NotNullPredicate.getInstance();
      PredicatedMap predicatedMap0 = new PredicatedMap(hashMap0, (Predicate) null, predicate0);
      // Undeclared exception!
      try { 
        predicatedMap0.checkSetValue((Object) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Cannot set value - Predicate rejected it
         //
         verifyException("collections.map.PredicatedMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      Predicate predicate0 = NotNullPredicate.getInstance();
      PredicatedMap predicatedMap0 = new PredicatedMap(hashMap0, predicate0, predicate0);
      Object object0 = new Object();
      Object object1 = predicatedMap0.checkSetValue(object0);
      assertSame(object0, object1);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      Predicate predicate0 = UniquePredicate.getInstance();
      PredicatedMap predicatedMap0 = new PredicatedMap(hashMap0, predicate0, predicate0);
      // Undeclared exception!
      try { 
        predicatedMap0.validate(hashMap0, hashMap0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Cannot add value - Predicate rejected it
         //
         verifyException("collections.map.PredicatedMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      HashMap<Object, Integer> hashMap0 = new HashMap<Object, Integer>();
      Predicate predicate0 = UniquePredicate.getInstance();
      PredicatedMap predicatedMap0 = new PredicatedMap(hashMap0, predicate0, predicate0);
      Object object0 = new Object();
      predicatedMap0.put(predicate0, object0);
      // Undeclared exception!
      try { 
        predicatedMap0.putAll(hashMap0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Cannot add key - Predicate rejected it
         //
         verifyException("collections.map.PredicatedMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      HashMap<Object, Object> hashMap0 = new HashMap<Object, Object>();
      Map map0 = PredicatedMap.decorate(hashMap0, (Predicate) null, (Predicate) null);
      PredicatedMap predicatedMap0 = new PredicatedMap(hashMap0, (Predicate) null, (Predicate) null);
      hashMap0.put(map0, map0);
      // Undeclared exception!
      try { 
        predicatedMap0.putAll(map0);
        fail("Expecting exception: StackOverflowError");
      
      } catch(StackOverflowError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      Predicate predicate0 = NotNullPredicate.getInstance();
      PredicatedMap predicatedMap0 = new PredicatedMap(hashMap0, predicate0, predicate0);
      Object object0 = new Object();
      predicatedMap0.put(object0, "collections.functors.InstanceofPredicate");
      Map map0 = PredicatedMap.decorate(predicatedMap0, predicate0, predicate0);
      assertNotSame(predicatedMap0, map0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      HashMap<Integer, String> hashMap0 = new HashMap<Integer, String>();
      TruePredicate truePredicate0 = (TruePredicate)TruePredicate.INSTANCE;
      Map map0 = PredicatedMap.decorate(hashMap0, truePredicate0, truePredicate0);
      PredicatedMap predicatedMap0 = new PredicatedMap(map0, truePredicate0, truePredicate0);
      Object object0 = predicatedMap0.checkSetValue((Object) null);
      assertNull(object0);
  }
}
