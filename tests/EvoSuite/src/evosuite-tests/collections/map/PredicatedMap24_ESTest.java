/*
 * This file was automatically generated by EvoSuite
 * Mon Jun 12 02:23:41 GMT 2017
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
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true) 
public class PredicatedMap24_ESTest extends PredicatedMap24_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      TruePredicate truePredicate0 = (TruePredicate)TruePredicate.INSTANCE;
      Map map0 = PredicatedMap.decorate(hashMap0, truePredicate0, (Predicate) null);
      Map map1 = PredicatedMap.decorate(map0, (Predicate) null, (Predicate) null);
      assertNotSame(map0, map1);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      LinkedList<Object> linkedList0 = new LinkedList<Object>();
      Predicate predicate0 = AllPredicate.getInstance((Collection) linkedList0);
      PredicatedMap predicatedMap0 = new PredicatedMap(hashMap0, predicate0, predicate0);
      hashMap0.put("", predicatedMap0);
      Object object0 = predicatedMap0.put("", predicatedMap0);
      assertSame(predicatedMap0, object0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      LinkedList<Object> linkedList0 = new LinkedList<Object>();
      Predicate predicate0 = AllPredicate.getInstance((Collection) linkedList0);
      PredicatedMap predicatedMap0 = new PredicatedMap(hashMap0, predicate0, predicate0);
      boolean boolean0 = predicatedMap0.isSetValueChecking();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      HashMap<Integer, String> hashMap0 = new HashMap<Integer, String>();
      Map map0 = PredicatedMap.decorate(hashMap0, (Predicate) null, (Predicate) null);
      PredicatedMap predicatedMap0 = new PredicatedMap(map0, (Predicate) null, (Predicate) null);
      boolean boolean0 = predicatedMap0.isSetValueChecking();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      HashMap<Object, String> hashMap0 = new HashMap<Object, String>();
      TruePredicate truePredicate0 = (TruePredicate)TruePredicate.INSTANCE;
      Predicate predicate0 = NotNullPredicate.getInstance();
      PredicatedMap predicatedMap0 = new PredicatedMap(hashMap0, predicate0, truePredicate0);
      Object object0 = predicatedMap0.checkSetValue((Object) null);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      HashMap<Object, Object> hashMap0 = new HashMap<Object, Object>();
      Map map0 = PredicatedMap.decorate(hashMap0, (Predicate) null, (Predicate) null);
      PredicatedMap predicatedMap0 = new PredicatedMap(map0, (Predicate) null, (Predicate) null);
      Integer integer0 = new Integer(0);
      predicatedMap0.put(hashMap0, integer0);
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
  public void test06()  throws Throwable  {
      HashMap<Integer, Object> hashMap0 = new HashMap<Integer, Object>();
      UniquePredicate uniquePredicate0 = new UniquePredicate();
      PredicatedMap predicatedMap0 = new PredicatedMap(hashMap0, uniquePredicate0, uniquePredicate0);
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
  public void test07()  throws Throwable  {
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      LinkedList<Object> linkedList0 = new LinkedList<Object>();
      Predicate predicate0 = AllPredicate.getInstance((Collection) linkedList0);
      PredicatedMap predicatedMap0 = new PredicatedMap(hashMap0, predicate0, predicate0);
      hashMap0.put("", predicatedMap0);
      // Undeclared exception!
      try { 
        predicatedMap0.put(predicatedMap0, predicatedMap0);
        fail("Expecting exception: StackOverflowError");
      
      } catch(StackOverflowError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      HashMap<Object, String> hashMap0 = new HashMap<Object, String>();
      TruePredicate truePredicate0 = (TruePredicate)TruePredicate.INSTANCE;
      Map map0 = PredicatedMap.decorate(hashMap0, truePredicate0, truePredicate0);
      Predicate predicate0 = NotNullPredicate.getInstance();
      PredicatedMap predicatedMap0 = new PredicatedMap(hashMap0, predicate0, truePredicate0);
      Object object0 = new Object();
      predicatedMap0.put(object0, map0);
      Predicate[] predicateArray0 = new Predicate[3];
      predicateArray0[0] = predicate0;
      Predicate predicate1 = UniquePredicate.getInstance();
      predicateArray0[1] = predicate1;
      predicateArray0[2] = (Predicate) truePredicate0;
      Predicate predicate2 = AllPredicate.getInstance(predicateArray0);
      // Undeclared exception!
      try { 
        PredicatedMap.decorate(hashMap0, predicate2, predicate2);
        fail("Expecting exception: StackOverflowError");
      
      } catch(StackOverflowError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Class<Object> class0 = Object.class;
      InstanceofPredicate instanceofPredicate0 = new InstanceofPredicate(class0);
      TruePredicate truePredicate0 = (TruePredicate)TruePredicate.INSTANCE;
      // Undeclared exception!
      try { 
        PredicatedMap.decorate((Map) null, instanceofPredicate0, truePredicate0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Map must not be null
         //
         verifyException("collections.map.AbstractMapDecorator", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      HashMap<Integer, String> hashMap0 = new HashMap<Integer, String>();
      Map map0 = PredicatedMap.decorate(hashMap0, (Predicate) null, (Predicate) null);
      PredicatedMap predicatedMap0 = new PredicatedMap(map0, (Predicate) null, (Predicate) null);
      // Undeclared exception!
      try { 
        predicatedMap0.checkSetValue((Object) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("collections.map.PredicatedMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      HashMap<Integer, String> hashMap0 = new HashMap<Integer, String>();
      Class<Integer> class0 = Integer.class;
      InstanceofPredicate instanceofPredicate0 = new InstanceofPredicate(class0);
      Integer integer0 = new Integer(2842);
      hashMap0.put(integer0, "");
      PredicatedMap predicatedMap0 = null;
      try {
        predicatedMap0 = new PredicatedMap(hashMap0, instanceofPredicate0, instanceofPredicate0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Cannot add value - Predicate rejected it
         //
         verifyException("collections.map.PredicatedMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      HashMap<Integer, Object> hashMap0 = new HashMap<Integer, Object>();
      Predicate[] predicateArray0 = new Predicate[6];
      Predicate predicate0 = UniquePredicate.getInstance();
      predicateArray0[0] = predicate0;
      TruePredicate truePredicate0 = (TruePredicate)TruePredicate.INSTANCE;
      predicateArray0[1] = (Predicate) truePredicate0;
      Class<String> class0 = String.class;
      InstanceofPredicate instanceofPredicate0 = new InstanceofPredicate(class0);
      predicateArray0[2] = (Predicate) instanceofPredicate0;
      AllPredicate allPredicate0 = new AllPredicate(predicateArray0);
      PredicatedMap predicatedMap0 = new PredicatedMap(hashMap0, allPredicate0, predicateArray0[0]);
      // Undeclared exception!
      try { 
        predicatedMap0.validate(hashMap0, truePredicate0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Cannot add key - Predicate rejected it
         //
         verifyException("collections.map.PredicatedMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      LinkedList<Object> linkedList0 = new LinkedList<Object>();
      Predicate predicate0 = AllPredicate.getInstance((Collection) linkedList0);
      PredicatedMap predicatedMap0 = new PredicatedMap(hashMap0, predicate0, predicate0);
      predicatedMap0.putAll(predicatedMap0);
      assertEquals(0, predicatedMap0.size());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      HashMap<Object, Object> hashMap0 = new HashMap<Object, Object>();
      NotNullPredicate notNullPredicate0 = (NotNullPredicate)NotNullPredicate.INSTANCE;
      Map map0 = PredicatedMap.decorate(hashMap0, notNullPredicate0, notNullPredicate0);
      PredicatedMap predicatedMap0 = new PredicatedMap(map0, notNullPredicate0, notNullPredicate0);
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
  public void test15()  throws Throwable  {
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      LinkedList<Object> linkedList0 = new LinkedList<Object>();
      Predicate predicate0 = AllPredicate.getInstance((Collection) linkedList0);
      PredicatedMap predicatedMap0 = new PredicatedMap(hashMap0, predicate0, predicate0);
      Integer integer0 = new Integer(0);
      Object object0 = predicatedMap0.checkSetValue(integer0);
      assertEquals(0, object0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      Class<Object> class0 = Object.class;
      Predicate predicate0 = InstanceofPredicate.getInstance(class0);
      PredicatedMap predicatedMap0 = new PredicatedMap(hashMap0, predicate0, predicate0);
      // Undeclared exception!
      try { 
        predicatedMap0.put(predicate0, (Object) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Cannot add value - Predicate rejected it
         //
         verifyException("collections.map.PredicatedMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      HashMap<Integer, Integer> hashMap0 = new HashMap<Integer, Integer>();
      UniquePredicate uniquePredicate0 = new UniquePredicate();
      PredicatedMap predicatedMap0 = new PredicatedMap(hashMap0, uniquePredicate0, uniquePredicate0);
      Predicate predicate0 = UniquePredicate.getInstance();
      Integer integer0 = new Integer(730);
      hashMap0.put(integer0, integer0);
      PredicatedMap predicatedMap1 = new PredicatedMap(predicatedMap0, predicate0, uniquePredicate0);
      // Undeclared exception!
      try { 
        predicatedMap1.putAll(predicatedMap0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Cannot add key - Predicate rejected it
         //
         verifyException("collections.map.PredicatedMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      LinkedList<Object> linkedList0 = new LinkedList<Object>();
      Predicate predicate0 = AllPredicate.getInstance((Collection) linkedList0);
      PredicatedMap predicatedMap0 = new PredicatedMap(hashMap0, predicate0, predicate0);
      predicatedMap0.validate(predicate0, predicatedMap0);
      assertTrue(predicatedMap0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      HashMap<Integer, String> hashMap0 = new HashMap<Integer, String>();
      Map map0 = PredicatedMap.decorate(hashMap0, (Predicate) null, (Predicate) null);
      PredicatedMap predicatedMap0 = new PredicatedMap(map0, (Predicate) null, (Predicate) null);
      predicatedMap0.putIfAbsent((Object) null, map0);
      Map map1 = PredicatedMap.decorate(hashMap0, (Predicate) null, (Predicate) null);
      assertTrue(map1.equals((Object)map0));
  }
}