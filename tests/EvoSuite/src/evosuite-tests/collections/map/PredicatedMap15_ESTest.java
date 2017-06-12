/*
 * This file was automatically generated by EvoSuite
 * Mon Jun 12 02:16:19 GMT 2017
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
public class PredicatedMap15_ESTest extends PredicatedMap15_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      TruePredicate truePredicate0 = (TruePredicate)TruePredicate.INSTANCE;
      PredicatedMap predicatedMap0 = new PredicatedMap(hashMap0, truePredicate0, truePredicate0);
      Predicate predicate0 = NotNullPredicate.getInstance();
      PredicatedMap predicatedMap1 = new PredicatedMap(predicatedMap0, truePredicate0, predicate0);
      Integer integer0 = new Integer((-1));
      Object object0 = predicatedMap1.checkSetValue(integer0);
      assertEquals((-1), object0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      HashMap<Object, Object> hashMap0 = new HashMap<Object, Object>();
      NotNullPredicate notNullPredicate0 = (NotNullPredicate)NotNullPredicate.INSTANCE;
      Map map0 = PredicatedMap.decorate(hashMap0, notNullPredicate0, notNullPredicate0);
      PredicatedMap predicatedMap0 = new PredicatedMap(map0, notNullPredicate0, notNullPredicate0);
      hashMap0.put("", "");
      Object object0 = new Object();
      predicatedMap0.put("", object0);
      assertEquals(1, predicatedMap0.size());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      TruePredicate truePredicate0 = (TruePredicate)TruePredicate.INSTANCE;
      Map map0 = PredicatedMap.decorate(hashMap0, truePredicate0, truePredicate0);
      PredicatedMap predicatedMap0 = new PredicatedMap(map0, truePredicate0, truePredicate0);
      boolean boolean0 = predicatedMap0.isSetValueChecking();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      HashMap<Object, Object> hashMap0 = new HashMap<Object, Object>();
      LinkedList<String> linkedList0 = new LinkedList<String>();
      Predicate predicate0 = AllPredicate.getInstance((Collection) linkedList0);
      PredicatedMap predicatedMap0 = new PredicatedMap(hashMap0, predicate0, predicate0);
      Object object0 = predicatedMap0.checkSetValue((Object) null);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      AllPredicate allPredicate0 = new AllPredicate((Predicate[]) null);
      PredicatedMap predicatedMap0 = new PredicatedMap(hashMap0, allPredicate0, allPredicate0);
      Object object0 = new Object();
      // Undeclared exception!
      try { 
        predicatedMap0.validate(allPredicate0, object0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      HashMap<Integer, Object> hashMap0 = new HashMap<Integer, Object>();
      NotNullPredicate notNullPredicate0 = (NotNullPredicate)NotNullPredicate.INSTANCE;
      PredicatedMap predicatedMap0 = new PredicatedMap(hashMap0, notNullPredicate0, notNullPredicate0);
      predicatedMap0.put(hashMap0, hashMap0);
      // Undeclared exception!
      try { 
        predicatedMap0.putAll(hashMap0);
        fail("Expecting exception: StackOverflowError");
      
      } catch(StackOverflowError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      HashMap<Object, Integer> hashMap0 = new HashMap<Object, Integer>();
      Predicate predicate0 = UniquePredicate.getInstance();
      PredicatedMap predicatedMap0 = new PredicatedMap(hashMap0, predicate0, predicate0);
      Integer integer0 = new Integer(3754);
      predicatedMap0.put(integer0, predicate0);
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
  public void test07()  throws Throwable  {
      HashMap<Object, Integer> hashMap0 = new HashMap<Object, Integer>();
      Predicate[] predicateArray0 = new Predicate[9];
      TruePredicate truePredicate0 = (TruePredicate)TruePredicate.INSTANCE;
      predicateArray0[0] = (Predicate) truePredicate0;
      predicateArray0[1] = (Predicate) truePredicate0;
      Predicate predicate0 = NotNullPredicate.getInstance();
      predicateArray0[2] = predicate0;
      AllPredicate allPredicate0 = new AllPredicate(predicateArray0);
      predicateArray0[3] = (Predicate) allPredicate0;
      PredicatedMap predicatedMap0 = new PredicatedMap(hashMap0, allPredicate0, predicate0);
      // Undeclared exception!
      predicatedMap0.put(predicate0, (Object) null);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      TruePredicate truePredicate0 = (TruePredicate)TruePredicate.INSTANCE;
      Map map0 = PredicatedMap.decorate(hashMap0, truePredicate0, truePredicate0);
      PredicatedMap predicatedMap0 = new PredicatedMap(map0, truePredicate0, truePredicate0);
      Object object0 = new Object();
      predicatedMap0.put(object0, hashMap0);
      // Undeclared exception!
      try { 
        predicatedMap0.put(map0, object0);
        fail("Expecting exception: StackOverflowError");
      
      } catch(StackOverflowError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      HashMap<Object, Object> hashMap0 = new HashMap<Object, Object>();
      Predicate predicate0 = NotNullPredicate.getInstance();
      PredicatedMap predicatedMap0 = new PredicatedMap(hashMap0, predicate0, predicate0);
      Class<Integer> class0 = Integer.class;
      InstanceofPredicate instanceofPredicate0 = new InstanceofPredicate(class0);
      Object object0 = new Object();
      hashMap0.put(class0, object0);
      // Undeclared exception!
      try { 
        PredicatedMap.decorate(predicatedMap0, instanceofPredicate0, instanceofPredicate0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Cannot add key - Predicate rejected it
         //
         verifyException("collections.map.PredicatedMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      HashMap<String, Integer> hashMap0 = new HashMap<String, Integer>();
      PredicatedMap predicatedMap0 = new PredicatedMap(hashMap0, (Predicate) null, (Predicate) null);
      Object object0 = new Object();
      // Undeclared exception!
      try { 
        predicatedMap0.checkSetValue(object0);
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
      HashMap<Object, Object> hashMap0 = new HashMap<Object, Object>();
      UniquePredicate uniquePredicate0 = new UniquePredicate();
      PredicatedMap predicatedMap0 = new PredicatedMap(hashMap0, uniquePredicate0, uniquePredicate0);
      hashMap0.put(predicatedMap0, uniquePredicate0);
      PredicatedMap predicatedMap1 = null;
      try {
        predicatedMap1 = new PredicatedMap(predicatedMap0, uniquePredicate0, uniquePredicate0);
        fail("Expecting exception: StackOverflowError");
      
      } catch(StackOverflowError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      hashMap0.put("j2OG{3ZS$g", (String) null);
      AllPredicate allPredicate0 = new AllPredicate((Predicate[]) null);
      PredicatedMap predicatedMap0 = null;
      try {
        predicatedMap0 = new PredicatedMap(hashMap0, allPredicate0, allPredicate0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Predicate[] predicateArray0 = new Predicate[0];
      AllPredicate allPredicate0 = new AllPredicate(predicateArray0);
      PredicatedMap predicatedMap0 = null;
      try {
        predicatedMap0 = new PredicatedMap((Map) null, allPredicate0, allPredicate0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Map must not be null
         //
         verifyException("collections.map.AbstractMapDecorator", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      HashMap<Object, Object> hashMap0 = new HashMap<Object, Object>();
      NotNullPredicate notNullPredicate0 = (NotNullPredicate)NotNullPredicate.INSTANCE;
      Map map0 = PredicatedMap.decorate(hashMap0, notNullPredicate0, notNullPredicate0);
      PredicatedMap predicatedMap0 = new PredicatedMap(map0, notNullPredicate0, notNullPredicate0);
      hashMap0.put("", "");
      predicatedMap0.putAll(hashMap0);
      assertEquals(1, hashMap0.size());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      HashMap<Object, String> hashMap0 = new HashMap<Object, String>();
      PredicatedMap predicatedMap0 = new PredicatedMap(hashMap0, (Predicate) null, (Predicate) null);
      boolean boolean0 = predicatedMap0.isSetValueChecking();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      HashMap<Object, String> hashMap0 = new HashMap<Object, String>();
      Class<Object> class0 = Object.class;
      Predicate predicate0 = InstanceofPredicate.getInstance(class0);
      Map map0 = PredicatedMap.decorate(hashMap0, predicate0, predicate0);
      PredicatedMap predicatedMap0 = new PredicatedMap(map0, predicate0, predicate0);
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
  public void test17()  throws Throwable  {
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      Predicate predicate0 = UniquePredicate.getInstance();
      PredicatedMap predicatedMap0 = new PredicatedMap(hashMap0, (Predicate) null, predicate0);
      PredicatedMap predicatedMap1 = new PredicatedMap(predicatedMap0, predicate0, (Predicate) null);
      predicatedMap1.validate("`aB", (Object) null);
      Integer integer0 = new Integer(0);
      // Undeclared exception!
      try { 
        predicatedMap0.put(integer0, "`aB");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Cannot add value - Predicate rejected it
         //
         verifyException("collections.map.PredicatedMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      HashMap<Object, Object> hashMap0 = new HashMap<Object, Object>();
      NotNullPredicate notNullPredicate0 = (NotNullPredicate)NotNullPredicate.INSTANCE;
      Map map0 = PredicatedMap.decorate(hashMap0, notNullPredicate0, notNullPredicate0);
      PredicatedMap predicatedMap0 = new PredicatedMap(map0, notNullPredicate0, notNullPredicate0);
      Object object0 = hashMap0.put("", "");
      // Undeclared exception!
      try { 
        predicatedMap0.validate((Object) null, object0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Cannot add key - Predicate rejected it
         //
         verifyException("collections.map.PredicatedMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      HashMap<Object, String> hashMap0 = new HashMap<Object, String>();
      Integer integer0 = new Integer((-1175));
      hashMap0.put(integer0, (String) null);
      PredicatedMap predicatedMap0 = new PredicatedMap(hashMap0, (Predicate) null, (Predicate) null);
      assertEquals(1, predicatedMap0.size());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      HashMap<Object, Object> hashMap0 = new HashMap<Object, Object>();
      Predicate predicate0 = TruePredicate.getInstance();
      PredicatedMap predicatedMap0 = new PredicatedMap(hashMap0, predicate0, predicate0);
      NotNullPredicate notNullPredicate0 = (NotNullPredicate)NotNullPredicate.INSTANCE;
      predicatedMap0.put(predicatedMap0, "j`0fHd,c@");
      Map map0 = PredicatedMap.decorate(predicatedMap0, predicate0, notNullPredicate0);
      assertEquals(1, map0.size());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      HashMap<Object, Object> hashMap0 = new HashMap<Object, Object>();
      Predicate predicate0 = TruePredicate.getInstance();
      PredicatedMap predicatedMap0 = new PredicatedMap(hashMap0, predicate0, predicate0);
      predicatedMap0.put(predicatedMap0, "j`0fHd,c@");
      Predicate predicate1 = UniquePredicate.getInstance();
      // Undeclared exception!
      try { 
        PredicatedMap.decorate(predicatedMap0, predicate1, predicate0);
        fail("Expecting exception: StackOverflowError");
      
      } catch(StackOverflowError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }
}