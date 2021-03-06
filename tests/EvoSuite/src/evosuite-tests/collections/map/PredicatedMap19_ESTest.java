/*
 * This file was automatically generated by EvoSuite
 * Mon Jun 12 02:18:49 GMT 2017
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
public class PredicatedMap19_ESTest extends PredicatedMap19_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      TruePredicate truePredicate0 = (TruePredicate)TruePredicate.INSTANCE;
      Class<Object> class0 = Object.class;
      Predicate predicate0 = InstanceofPredicate.getInstance(class0);
      Map map0 = PredicatedMap.decorate(hashMap0, truePredicate0, predicate0);
      PredicatedMap predicatedMap0 = new PredicatedMap(map0, truePredicate0, truePredicate0);
      boolean boolean0 = predicatedMap0.isSetValueChecking();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      HashMap<Object, String> hashMap0 = new HashMap<Object, String>();
      PredicatedMap predicatedMap0 = new PredicatedMap(hashMap0, (Predicate) null, (Predicate) null);
      boolean boolean0 = predicatedMap0.isSetValueChecking();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      TruePredicate truePredicate0 = (TruePredicate)TruePredicate.INSTANCE;
      Class<Object> class0 = Object.class;
      Predicate predicate0 = InstanceofPredicate.getInstance(class0);
      Map map0 = PredicatedMap.decorate(hashMap0, truePredicate0, predicate0);
      PredicatedMap predicatedMap0 = new PredicatedMap(map0, truePredicate0, (Predicate) null);
      Object object0 = new Object();
      predicatedMap0.put(object0, object0);
      Map map1 = PredicatedMap.decorate(predicatedMap0, truePredicate0, truePredicate0);
      assertNotSame(map0, map1);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      TruePredicate truePredicate0 = (TruePredicate)TruePredicate.INSTANCE;
      Class<Object> class0 = Object.class;
      Predicate predicate0 = InstanceofPredicate.getInstance(class0);
      Map map0 = PredicatedMap.decorate(hashMap0, truePredicate0, predicate0);
      PredicatedMap predicatedMap0 = new PredicatedMap(map0, truePredicate0, (Predicate) null);
      PredicatedMap predicatedMap1 = new PredicatedMap(predicatedMap0, truePredicate0, truePredicate0);
      Object object0 = predicatedMap1.checkSetValue((Object) null);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      HashMap<Object, Object> hashMap0 = new HashMap<Object, Object>();
      AllPredicate allPredicate0 = new AllPredicate((Predicate[]) null);
      PredicatedMap predicatedMap0 = new PredicatedMap(hashMap0, allPredicate0, allPredicate0);
      // Undeclared exception!
      try { 
        predicatedMap0.validate("collections.functors.InstanceofPredicate", (Object) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("collections.functors.AllPredicate", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      TruePredicate truePredicate0 = (TruePredicate)TruePredicate.INSTANCE;
      Class<Object> class0 = Object.class;
      Predicate predicate0 = InstanceofPredicate.getInstance(class0);
      Map map0 = PredicatedMap.decorate(hashMap0, truePredicate0, predicate0);
      PredicatedMap predicatedMap0 = new PredicatedMap(map0, truePredicate0, (Predicate) null);
      predicatedMap0.put(map0, map0);
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
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      NotNullPredicate notNullPredicate0 = (NotNullPredicate)NotNullPredicate.INSTANCE;
      PredicatedMap predicatedMap0 = new PredicatedMap(hashMap0, notNullPredicate0, notNullPredicate0);
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
      HashMap<Integer, String> hashMap0 = new HashMap<Integer, String>();
      AllPredicate allPredicate0 = new AllPredicate((Predicate[]) null);
      PredicatedMap predicatedMap0 = new PredicatedMap(hashMap0, allPredicate0, allPredicate0);
      Object object0 = new Object();
      // Undeclared exception!
      try { 
        predicatedMap0.put(object0, (Object) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("collections.functors.AllPredicate", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      Predicate[] predicateArray0 = new Predicate[2];
      Predicate predicate0 = UniquePredicate.getInstance();
      predicateArray0[0] = predicate0;
      Predicate predicate1 = UniquePredicate.getInstance();
      Object object0 = hashMap0.put("collections.functors.NotNullPredicate", predicate0);
      predicateArray0[1] = predicate1;
      Predicate predicate2 = AllPredicate.getInstance(predicateArray0);
      PredicatedMap predicatedMap0 = new PredicatedMap(hashMap0, predicate2, predicate2);
      predicatedMap0.put(hashMap0, object0);
      // Undeclared exception!
      try { 
        PredicatedMap.decorate(predicatedMap0, predicate2, predicate0);
        fail("Expecting exception: StackOverflowError");
      
      } catch(StackOverflowError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      Predicate[] predicateArray0 = new Predicate[9];
      UniquePredicate uniquePredicate0 = new UniquePredicate();
      hashMap0.put("Cannot set value - Predicate rejected it", "Cannot set value - Predicate rejected it");
      AllPredicate allPredicate0 = new AllPredicate(predicateArray0);
      // Undeclared exception!
      try { 
        PredicatedMap.decorate(hashMap0, allPredicate0, uniquePredicate0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("collections.functors.AllPredicate", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Predicate predicate0 = TruePredicate.getInstance();
      // Undeclared exception!
      try { 
        PredicatedMap.decorate((Map) null, predicate0, predicate0);
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
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      Predicate predicate0 = NotNullPredicate.getInstance();
      Map map0 = PredicatedMap.decorate(hashMap0, predicate0, predicate0);
      PredicatedMap predicatedMap0 = new PredicatedMap(map0, predicate0, (Predicate) null);
      // Undeclared exception!
      try { 
        predicatedMap0.checkSetValue(hashMap0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("collections.map.PredicatedMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      HashMap<Object, String> hashMap0 = new HashMap<Object, String>();
      Predicate predicate0 = UniquePredicate.getInstance();
      Map map0 = PredicatedMap.decorate(hashMap0, predicate0, predicate0);
      hashMap0.put(map0, "8{+K:WKZAh)Qe:V3>5");
      Predicate[] predicateArray0 = new Predicate[4];
      predicateArray0[0] = predicate0;
      Class<Integer> class0 = Integer.class;
      InstanceofPredicate instanceofPredicate0 = new InstanceofPredicate(class0);
      predicateArray0[1] = (Predicate) instanceofPredicate0;
      predicateArray0[2] = predicate0;
      predicateArray0[3] = predicate0;
      Predicate predicate1 = AllPredicate.getInstance(predicateArray0);
      PredicatedMap predicatedMap0 = null;
      try {
        predicatedMap0 = new PredicatedMap(map0, predicate0, predicate1);
        fail("Expecting exception: StackOverflowError");
      
      } catch(StackOverflowError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      HashMap<Object, Object> hashMap0 = new HashMap<Object, Object>();
      Predicate[] predicateArray0 = new Predicate[5];
      TruePredicate truePredicate0 = (TruePredicate)TruePredicate.INSTANCE;
      Object object0 = new Object();
      hashMap0.put(object0, object0);
      AllPredicate allPredicate0 = new AllPredicate(predicateArray0);
      PredicatedMap predicatedMap0 = null;
      try {
        predicatedMap0 = new PredicatedMap(hashMap0, allPredicate0, truePredicate0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("collections.functors.AllPredicate", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Predicate predicate0 = UniquePredicate.getInstance();
      PredicatedMap predicatedMap0 = null;
      try {
        predicatedMap0 = new PredicatedMap((Map) null, predicate0, predicate0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Map must not be null
         //
         verifyException("collections.map.AbstractMapDecorator", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      Class<String> class0 = String.class;
      Predicate predicate0 = InstanceofPredicate.getInstance(class0);
      PredicatedMap predicatedMap0 = new PredicatedMap(hashMap0, predicate0, predicate0);
      // Undeclared exception!
      try { 
        predicatedMap0.validate(predicate0, hashMap0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Cannot add key - Predicate rejected it
         //
         verifyException("collections.map.PredicatedMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      HashMap<Object, String> hashMap0 = new HashMap<Object, String>();
      NotNullPredicate notNullPredicate0 = (NotNullPredicate)NotNullPredicate.INSTANCE;
      Predicate predicate0 = TruePredicate.getInstance();
      PredicatedMap predicatedMap0 = new PredicatedMap(hashMap0, notNullPredicate0, predicate0);
      predicatedMap0.putAll(predicatedMap0);
      assertTrue(predicatedMap0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      Predicate predicate0 = NotNullPredicate.getInstance();
      PredicatedMap predicatedMap0 = new PredicatedMap(hashMap0, predicate0, predicate0);
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
  public void test18()  throws Throwable  {
      HashMap<Object, String> hashMap0 = new HashMap<Object, String>();
      NotNullPredicate notNullPredicate0 = (NotNullPredicate)NotNullPredicate.INSTANCE;
      Object object0 = new Object();
      Predicate predicate0 = TruePredicate.getInstance();
      PredicatedMap predicatedMap0 = new PredicatedMap(hashMap0, notNullPredicate0, predicate0);
      Object object1 = predicatedMap0.checkSetValue(object0);
      assertSame(object1, object0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      HashMap<Object, Integer> hashMap0 = new HashMap<Object, Integer>();
      Class<Object> class0 = Object.class;
      InstanceofPredicate instanceofPredicate0 = new InstanceofPredicate(class0);
      PredicatedMap predicatedMap0 = new PredicatedMap(hashMap0, instanceofPredicate0, instanceofPredicate0);
      // Undeclared exception!
      try { 
        predicatedMap0.put(instanceofPredicate0, (Object) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Cannot add value - Predicate rejected it
         //
         verifyException("collections.map.PredicatedMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      HashMap<Object, Integer> hashMap0 = new HashMap<Object, Integer>();
      Predicate predicate0 = UniquePredicate.getInstance();
      PredicatedMap predicatedMap0 = new PredicatedMap(hashMap0, predicate0, predicate0);
      Integer integer0 = new Integer((-3569));
      predicatedMap0.put(integer0, hashMap0);
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
  public void test21()  throws Throwable  {
      HashMap<String, Integer> hashMap0 = new HashMap<String, Integer>();
      PredicatedMap predicatedMap0 = new PredicatedMap(hashMap0, (Predicate) null, (Predicate) null);
      Integer integer0 = new Integer(623);
      predicatedMap0.validate((Object) null, integer0);
      assertEquals(0, predicatedMap0.size());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      HashMap<Object, String> hashMap0 = new HashMap<Object, String>();
      NotNullPredicate notNullPredicate0 = (NotNullPredicate)NotNullPredicate.INSTANCE;
      Object object0 = new Object();
      hashMap0.put(object0, "$gfD9z");
      Predicate predicate0 = TruePredicate.getInstance();
      PredicatedMap predicatedMap0 = new PredicatedMap(hashMap0, notNullPredicate0, predicate0);
      predicatedMap0.put(object0, (Object) null);
      assertEquals(1, hashMap0.size());
  }
}
