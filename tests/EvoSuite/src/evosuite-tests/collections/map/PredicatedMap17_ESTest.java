/*
 * This file was automatically generated by EvoSuite
 * Mon Jun 12 02:18:43 GMT 2017
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
public class PredicatedMap17_ESTest extends PredicatedMap17_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      HashMap<Integer, String> hashMap0 = new HashMap<Integer, String>();
      Predicate[] predicateArray0 = new Predicate[1];
      AllPredicate allPredicate0 = new AllPredicate(predicateArray0);
      PredicatedMap predicatedMap0 = new PredicatedMap(hashMap0, allPredicate0, predicateArray0[0]);
      PredicatedMap predicatedMap1 = new PredicatedMap(predicatedMap0, predicateArray0[0], allPredicate0);
      assertTrue(predicatedMap1.equals((Object)predicatedMap0));
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      HashMap<Integer, String> hashMap0 = new HashMap<Integer, String>();
      Predicate[] predicateArray0 = new Predicate[1];
      AllPredicate allPredicate0 = new AllPredicate(predicateArray0);
      PredicatedMap predicatedMap0 = new PredicatedMap(hashMap0, allPredicate0, predicateArray0[0]);
      // Undeclared exception!
      try { 
        predicatedMap0.checkSetValue(allPredicate0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("collections.map.PredicatedMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      HashMap<Object, Integer> hashMap0 = new HashMap<Object, Integer>();
      UniquePredicate uniquePredicate0 = new UniquePredicate();
      PredicatedMap predicatedMap0 = new PredicatedMap(hashMap0, uniquePredicate0, uniquePredicate0);
      TruePredicate truePredicate0 = (TruePredicate)TruePredicate.INSTANCE;
      Map map0 = PredicatedMap.decorate(predicatedMap0, uniquePredicate0, truePredicate0);
      assertNotSame(predicatedMap0, map0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      HashMap<Integer, Object> hashMap0 = new HashMap<Integer, Object>();
      TruePredicate truePredicate0 = (TruePredicate)TruePredicate.INSTANCE;
      Map map0 = PredicatedMap.decorate(hashMap0, truePredicate0, truePredicate0);
      PredicatedMap predicatedMap0 = new PredicatedMap(map0, truePredicate0, truePredicate0);
      predicatedMap0.validate(hashMap0, truePredicate0);
      assertTrue(predicatedMap0.equals((Object)map0));
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      HashMap<String, Integer> hashMap0 = new HashMap<String, Integer>();
      UniquePredicate uniquePredicate0 = new UniquePredicate();
      PredicatedMap predicatedMap0 = new PredicatedMap(hashMap0, uniquePredicate0, uniquePredicate0);
      boolean boolean0 = predicatedMap0.isSetValueChecking();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      HashMap<Object, Object> hashMap0 = new HashMap<Object, Object>();
      PredicatedMap predicatedMap0 = new PredicatedMap(hashMap0, (Predicate) null, (Predicate) null);
      boolean boolean0 = predicatedMap0.isSetValueChecking();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      HashMap<Integer, Object> hashMap0 = new HashMap<Integer, Object>();
      Integer integer0 = new Integer(0);
      Object object0 = new Object();
      hashMap0.put(integer0, object0);
      TruePredicate truePredicate0 = (TruePredicate)TruePredicate.INSTANCE;
      Map map0 = PredicatedMap.decorate(hashMap0, truePredicate0, truePredicate0);
      PredicatedMap predicatedMap0 = new PredicatedMap(map0, truePredicate0, truePredicate0);
      predicatedMap0.put(integer0, map0);
      assertEquals(1, hashMap0.size());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      HashMap<String, Integer> hashMap0 = new HashMap<String, Integer>();
      UniquePredicate uniquePredicate0 = new UniquePredicate();
      PredicatedMap predicatedMap0 = new PredicatedMap(hashMap0, uniquePredicate0, uniquePredicate0);
      Object object0 = predicatedMap0.checkSetValue((Object) null);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      AllPredicate allPredicate0 = new AllPredicate((Predicate[]) null);
      PredicatedMap predicatedMap0 = new PredicatedMap(hashMap0, allPredicate0, allPredicate0);
      // Undeclared exception!
      try { 
        predicatedMap0.validate(hashMap0, (Object) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      HashMap<Object, Integer> hashMap0 = new HashMap<Object, Integer>();
      UniquePredicate uniquePredicate0 = new UniquePredicate();
      PredicatedMap predicatedMap0 = new PredicatedMap(hashMap0, uniquePredicate0, uniquePredicate0);
      // Undeclared exception!
      try { 
        predicatedMap0.validate("L", "L");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Cannot add value - Predicate rejected it
         //
         verifyException("collections.map.PredicatedMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      HashMap<Integer, Integer> hashMap0 = new HashMap<Integer, Integer>();
      Predicate predicate0 = TruePredicate.getInstance();
      PredicatedMap predicatedMap0 = new PredicatedMap(hashMap0, predicate0, predicate0);
      predicatedMap0.put(hashMap0, predicate0);
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
  public void test11()  throws Throwable  {
      HashMap<Object, Object> hashMap0 = new HashMap<Object, Object>();
      Predicate predicate0 = TruePredicate.getInstance();
      Map map0 = PredicatedMap.decorate(hashMap0, predicate0, predicate0);
      PredicatedMap predicatedMap0 = new PredicatedMap(map0, predicate0, predicate0);
      predicatedMap0.put("@(\"wH0$,!K", map0);
      // Undeclared exception!
      try { 
        predicatedMap0.put(map0, "vh'nvGj:9#3|Tz:02{;");
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
      AllPredicate allPredicate0 = new AllPredicate((Predicate[]) null);
      PredicatedMap predicatedMap0 = new PredicatedMap(hashMap0, allPredicate0, allPredicate0);
      hashMap0.put("NJA!C|*e&iAH", "collections.map.PredicatedMap");
      // Undeclared exception!
      try { 
        PredicatedMap.decorate(predicatedMap0, allPredicate0, allPredicate0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      HashMap<String, Integer> hashMap0 = new HashMap<String, Integer>();
      Predicate[] predicateArray0 = new Predicate[6];
      Class<Object> class0 = Object.class;
      Integer integer0 = new Integer(0);
      hashMap0.put("n2;^[dFn;}-J-f2I", integer0);
      InstanceofPredicate instanceofPredicate0 = new InstanceofPredicate(class0);
      predicateArray0[0] = (Predicate) instanceofPredicate0;
      TruePredicate truePredicate0 = (TruePredicate)TruePredicate.INSTANCE;
      predicateArray0[1] = (Predicate) truePredicate0;
      Predicate predicate0 = NotNullPredicate.getInstance();
      predicateArray0[2] = predicate0;
      predicateArray0[3] = predicate0;
      AllPredicate allPredicate0 = new AllPredicate(predicateArray0);
      predicateArray0[4] = (Predicate) allPredicate0;
      PredicatedMap predicatedMap0 = new PredicatedMap(hashMap0, allPredicate0, predicate0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      HashMap<Object, String> hashMap0 = new HashMap<Object, String>();
      Predicate predicate0 = UniquePredicate.getInstance();
      Object object0 = new Object();
      hashMap0.put(object0, "_^t-c");
      PredicatedMap predicatedMap0 = new PredicatedMap(hashMap0, predicate0, predicate0);
      PredicatedMap predicatedMap1 = null;
      try {
        predicatedMap1 = new PredicatedMap(predicatedMap0, predicate0, predicate0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Cannot add key - Predicate rejected it
         //
         verifyException("collections.map.PredicatedMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      HashMap<Object, String> hashMap0 = new HashMap<Object, String>(1);
      NotNullPredicate notNullPredicate0 = (NotNullPredicate)NotNullPredicate.INSTANCE;
      PredicatedMap predicatedMap0 = new PredicatedMap(hashMap0, notNullPredicate0, notNullPredicate0);
      Integer integer0 = new Integer(650);
      // Undeclared exception!
      try { 
        predicatedMap0.put((Object) null, integer0);
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
      HashMap<Integer, Object> hashMap0 = new HashMap<Integer, Object>();
      TruePredicate truePredicate0 = (TruePredicate)TruePredicate.INSTANCE;
      Map map0 = PredicatedMap.decorate(hashMap0, truePredicate0, truePredicate0);
      PredicatedMap predicatedMap0 = new PredicatedMap(map0, truePredicate0, truePredicate0);
      predicatedMap0.putAll(map0);
      assertNotSame(predicatedMap0, map0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      HashMap<Object, Object> hashMap0 = new HashMap<Object, Object>();
      Class<String> class0 = String.class;
      Predicate predicate0 = InstanceofPredicate.getInstance(class0);
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
      HashMap<Integer, Object> hashMap0 = new HashMap<Integer, Object>();
      Object object0 = new Object();
      TruePredicate truePredicate0 = (TruePredicate)TruePredicate.INSTANCE;
      Map map0 = PredicatedMap.decorate(hashMap0, truePredicate0, truePredicate0);
      PredicatedMap predicatedMap0 = new PredicatedMap(map0, truePredicate0, truePredicate0);
      Object object1 = predicatedMap0.checkSetValue(object0);
      assertSame(object1, object0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      hashMap0.put("+", "+");
      Predicate predicate0 = UniquePredicate.getInstance();
      // Undeclared exception!
      try { 
        PredicatedMap.decorate(hashMap0, predicate0, predicate0);
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
      HashMap<Object, Object> hashMap0 = new HashMap<Object, Object>();
      PredicatedMap predicatedMap0 = new PredicatedMap(hashMap0, (Predicate) null, (Predicate) null);
      Object object0 = predicatedMap0.put(hashMap0, hashMap0);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      HashMap<Object, Object> hashMap0 = new HashMap<Object, Object>();
      Predicate predicate0 = UniquePredicate.getInstance();
      Object object0 = new Object();
      hashMap0.put(object0, predicate0);
      PredicatedMap predicatedMap0 = new PredicatedMap(hashMap0, predicate0, predicate0);
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
  public void test22()  throws Throwable  {
      HashMap<Object, Integer> hashMap0 = new HashMap<Object, Integer>();
      Integer integer0 = new Integer((-163));
      hashMap0.put("Cannot add key - Predicate rejected it", integer0);
      Predicate[] predicateArray0 = new Predicate[1];
      AllPredicate allPredicate0 = new AllPredicate(predicateArray0);
      PredicatedMap predicatedMap0 = null;
      try {
        predicatedMap0 = new PredicatedMap(hashMap0, (Predicate) null, allPredicate0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      HashMap<Object, String> hashMap0 = new HashMap<Object, String>();
      UniquePredicate uniquePredicate0 = new UniquePredicate();
      PredicatedMap predicatedMap0 = new PredicatedMap(hashMap0, uniquePredicate0, uniquePredicate0);
      predicatedMap0.put(hashMap0, uniquePredicate0);
      // Undeclared exception!
      try { 
        PredicatedMap.decorate(hashMap0, uniquePredicate0, uniquePredicate0);
        fail("Expecting exception: StackOverflowError");
      
      } catch(StackOverflowError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      HashMap<Object, Object> hashMap0 = new HashMap<Object, Object>();
      Predicate[] predicateArray0 = new Predicate[0];
      AllPredicate allPredicate0 = new AllPredicate(predicateArray0);
      Map map0 = PredicatedMap.decorate(hashMap0, allPredicate0, allPredicate0);
      PredicatedMap predicatedMap0 = new PredicatedMap(map0, allPredicate0, allPredicate0);
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
}
