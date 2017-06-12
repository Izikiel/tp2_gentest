package collections.map;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class PredicatedMap26_Test0 {

    public static boolean debug = false;

    @Test
    public void test01() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PredicatedMap26_Test0.test01");
        java.util.Map map0 = null;
        collections.Transformer transformer1 = null;
        try {
            java.util.Map map2 = collections.map.DefaultedMap.decorate(map0, transformer1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PredicatedMap26_Test0.test02");
        java.util.Map map0 = null;
        collections.Factory factory1 = null;
        try {
            java.util.Map map2 = collections.map.DefaultedMap.decorate(map0, factory1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PredicatedMap26_Test0.test03");
        java.util.Map map0 = null;
        try {
            collections.map.DefaultedMap defaultedMap2 = new collections.map.DefaultedMap(map0, (java.lang.Object) (-1.0d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PredicatedMap26_Test0.test04");
        collections.PredicateUtils predicateUtils0 = new collections.PredicateUtils();
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PredicatedMap26_Test0.test05");
        java.util.Map map0 = null;
        try {
            collections.map.DefaultedMap defaultedMap2 = new collections.map.DefaultedMap(map0, (java.lang.Object) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PredicatedMap26_Test0.test06");
        java.util.Map map0 = null;
        try {
            java.util.Map map2 = collections.map.DefaultedMap.decorate(map0, (java.lang.Object) 1.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PredicatedMap26_Test0.test07");
        java.util.Map map0 = null;
        try {
            collections.map.DefaultedMap defaultedMap2 = new collections.map.DefaultedMap(map0, (java.lang.Object) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PredicatedMap26_Test0.test08");
        java.util.Map map0 = null;
        collections.Predicate predicate1 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate2 = collections.PredicateUtils.truePredicate();
        try {
            collections.map.PredicatedMap predicatedMap3 = new collections.map.PredicatedMap(map0, predicate1, predicate2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(predicate1);
        org.junit.Assert.assertNotNull(predicate2);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PredicatedMap26_Test0.test09");
        java.util.Map map0 = null;
        collections.Predicate predicate1 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate2 = collections.PredicateUtils.uniquePredicate();
        try {
            collections.map.PredicatedMap predicatedMap3 = new collections.map.PredicatedMap(map0, predicate1, predicate2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(predicate1);
        org.junit.Assert.assertNotNull(predicate2);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PredicatedMap26_Test0.test10");
        java.lang.Class class0 = null;
        try {
            collections.Predicate predicate1 = collections.PredicateUtils.instanceofPredicate(class0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PredicatedMap26_Test0.test11");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0f);
        java.lang.String str2 = defaultedMap1.toString();
        collections.Transformer transformer3 = null;
        try {
            java.util.Map map4 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PredicatedMap26_Test0.test12");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0f);
        collections.Transformer transformer2 = null;
        try {
            java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PredicatedMap26_Test0.test13");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0f);
        java.lang.String str2 = defaultedMap1.toString();
        java.lang.Object obj3 = null;
        java.lang.Object obj4 = defaultedMap1.get(obj3);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 0.0f);
        java.util.Set set7 = defaultedMap6.keySet();
        java.util.Map map9 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap6, (java.lang.Object) (byte) -1);
        boolean b10 = defaultedMap1.equals((java.lang.Object) defaultedMap6);
        java.lang.Object obj12 = defaultedMap6.get((java.lang.Object) "hi!");
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertTrue("'" + obj4 + "' != '" + 0.0f + "'", obj4.equals(0.0f));
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertTrue("'" + obj12 + "' != '" + 0.0f + "'", obj12.equals(0.0f));
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PredicatedMap26_Test0.test14");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0f);
        java.lang.String str2 = defaultedMap1.toString();
        java.lang.Object obj3 = null;
        java.lang.Object obj4 = defaultedMap1.get(obj3);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 0.0f);
        java.util.Set set7 = defaultedMap6.keySet();
        defaultedMap1.putAll((java.util.Map) defaultedMap6);
        boolean b9 = defaultedMap6.isEmpty();
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertTrue("'" + obj4 + "' != '" + 0.0f + "'", obj4.equals(0.0f));
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertTrue(b9 == true);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PredicatedMap26_Test0.test15");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0f);
        java.util.Set set2 = defaultedMap1.keySet();
        java.util.Collection collection3 = defaultedMap1.values();
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(collection3);
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PredicatedMap26_Test0.test16");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0f);
        java.lang.String str2 = defaultedMap1.toString();
        java.lang.Object obj3 = null;
        java.lang.Object obj4 = defaultedMap1.get(obj3);
        java.util.Set set5 = defaultedMap1.keySet();
        java.lang.Object obj7 = defaultedMap1.remove((java.lang.Object) 0L);
        collections.Transformer transformer8 = null;
        try {
            java.util.Map map9 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertTrue("'" + obj4 + "' != '" + 0.0f + "'", obj4.equals(0.0f));
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertNull(obj7);
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PredicatedMap26_Test0.test17");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PredicatedMap26_Test0.test18");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0f);
        int i2 = defaultedMap1.size();
        org.junit.Assert.assertTrue(i2 == 0);
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PredicatedMap26_Test0.test19");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0f);
        java.util.Set set2 = defaultedMap1.keySet();
        collections.Predicate predicate3 = null;
        collections.Predicate predicate4 = collections.PredicateUtils.truePredicate();
        collections.map.PredicatedMap predicatedMap5 = new collections.map.PredicatedMap((java.util.Map) defaultedMap1, predicate3, predicate4);
        collections.Factory factory6 = null;
        try {
            java.util.Map map7 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(predicate4);
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PredicatedMap26_Test0.test20");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0f);
        java.util.Set set2 = defaultedMap1.keySet();
        collections.Predicate predicate3 = null;
        collections.Predicate predicate4 = collections.PredicateUtils.truePredicate();
        collections.map.PredicatedMap predicatedMap5 = new collections.map.PredicatedMap((java.util.Map) defaultedMap1, predicate3, predicate4);
        boolean b6 = predicatedMap5.isEmpty();
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertTrue(b6 == true);
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PredicatedMap26_Test0.test21");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0f);
        java.lang.String str2 = defaultedMap1.toString();
        java.lang.Object obj3 = null;
        java.lang.Object obj4 = defaultedMap1.get(obj3);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 0.0f);
        java.util.Set set7 = defaultedMap6.keySet();
        java.util.Map map9 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap6, (java.lang.Object) (byte) -1);
        boolean b10 = defaultedMap1.equals((java.lang.Object) defaultedMap6);
        java.lang.Object obj12 = defaultedMap1.get((java.lang.Object) 1);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertTrue("'" + obj4 + "' != '" + 0.0f + "'", obj4.equals(0.0f));
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertTrue("'" + obj12 + "' != '" + 0.0f + "'", obj12.equals(0.0f));
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PredicatedMap26_Test0.test22");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0f);
        java.util.Set set2 = defaultedMap1.keySet();
        collections.Predicate predicate3 = null;
        collections.Predicate predicate4 = collections.PredicateUtils.truePredicate();
        collections.map.PredicatedMap predicatedMap5 = new collections.map.PredicatedMap((java.util.Map) defaultedMap1, predicate3, predicate4);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 0.0f);
        java.lang.String str8 = defaultedMap7.toString();
        java.lang.Object obj9 = null;
        java.lang.Object obj10 = defaultedMap7.get(obj9);
        java.util.Set set11 = defaultedMap7.keySet();
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) 0.0f);
        collections.Predicate predicate14 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate15 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map16 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap13, predicate14, predicate15);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) 0.0f);
        java.util.Set set19 = defaultedMap18.entrySet();
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) 0.0f);
        collections.Predicate predicate22 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate23 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map24 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap21, predicate22, predicate23);
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) 0.0f);
        collections.Predicate predicate27 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate28 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map29 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap26, predicate27, predicate28);
        java.util.Map map30 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap18, predicate22, predicate28);
        java.util.Map map31 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap7, predicate15, predicate28);
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) 0.0f);
        java.util.Set set34 = defaultedMap33.keySet();
        collections.Predicate predicate35 = null;
        collections.Predicate predicate36 = collections.PredicateUtils.truePredicate();
        collections.map.PredicatedMap predicatedMap37 = new collections.map.PredicatedMap((java.util.Map) defaultedMap33, predicate35, predicate36);
        collections.Predicate predicate38 = predicatedMap37.keyPredicate;
        collections.Predicate predicate39 = predicatedMap37.valuePredicate;
        java.util.Map map40 = collections.map.PredicatedMap.decorate((java.util.Map) predicatedMap5, predicate28, predicate39);
        collections.Predicate predicate41 = predicatedMap5.valuePredicate;
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "{}" + "'", str8.equals("{}"));
        org.junit.Assert.assertTrue("'" + obj10 + "' != '" + 0.0f + "'", obj10.equals(0.0f));
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertNotNull(predicate15);
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertNotNull(predicate22);
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertNotNull(predicate27);
        org.junit.Assert.assertNotNull(predicate28);
        org.junit.Assert.assertNotNull(map29);
        org.junit.Assert.assertNotNull(map30);
        org.junit.Assert.assertNotNull(map31);
        org.junit.Assert.assertNotNull(set34);
        org.junit.Assert.assertNotNull(predicate36);
        org.junit.Assert.assertNull(predicate38);
        org.junit.Assert.assertNotNull(predicate39);
        org.junit.Assert.assertNotNull(map40);
        org.junit.Assert.assertNotNull(predicate41);
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PredicatedMap26_Test0.test23");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0f);
        java.util.Set set2 = defaultedMap1.keySet();
        collections.Predicate predicate3 = null;
        collections.Predicate predicate4 = collections.PredicateUtils.truePredicate();
        collections.map.PredicatedMap predicatedMap5 = new collections.map.PredicatedMap((java.util.Map) defaultedMap1, predicate3, predicate4);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 0.0f);
        java.lang.Object obj8 = null;
        boolean b9 = defaultedMap7.equals(obj8);
        predicatedMap5.validate((java.lang.Object) b9, (java.lang.Object) (short) 100);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) 0.0f);
        java.lang.String str14 = defaultedMap13.toString();
        java.lang.Object obj15 = null;
        java.lang.Object obj16 = defaultedMap13.get(obj15);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) 0.0f);
        java.util.Set set19 = defaultedMap18.keySet();
        defaultedMap13.putAll((java.util.Map) defaultedMap18);
        predicatedMap5.putAll((java.util.Map) defaultedMap13);
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) 0.0f);
        java.lang.String str24 = defaultedMap23.toString();
        java.lang.Object obj25 = null;
        java.lang.Object obj26 = defaultedMap23.get(obj25);
        java.util.Set set27 = defaultedMap23.keySet();
        java.util.Set set28 = defaultedMap23.keySet();
        predicatedMap5.putAll((java.util.Map) defaultedMap23);
        collections.Transformer transformer30 = null;
        try {
            java.util.Map map31 = collections.map.DefaultedMap.decorate((java.util.Map) predicatedMap5, transformer30);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "{}" + "'", str14.equals("{}"));
        org.junit.Assert.assertTrue("'" + obj16 + "' != '" + 0.0f + "'", obj16.equals(0.0f));
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "{}" + "'", str24.equals("{}"));
        org.junit.Assert.assertTrue("'" + obj26 + "' != '" + 0.0f + "'", obj26.equals(0.0f));
        org.junit.Assert.assertNotNull(set27);
        org.junit.Assert.assertNotNull(set28);
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PredicatedMap26_Test0.test24");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0f);
        java.util.Set set2 = defaultedMap1.keySet();
        collections.Predicate predicate3 = null;
        collections.Predicate predicate4 = collections.PredicateUtils.truePredicate();
        collections.map.PredicatedMap predicatedMap5 = new collections.map.PredicatedMap((java.util.Map) defaultedMap1, predicate3, predicate4);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 0.0f);
        java.util.Set set8 = defaultedMap7.keySet();
        collections.Predicate predicate9 = null;
        collections.Predicate predicate10 = collections.PredicateUtils.truePredicate();
        collections.map.PredicatedMap predicatedMap11 = new collections.map.PredicatedMap((java.util.Map) defaultedMap7, predicate9, predicate10);
        collections.Predicate predicate12 = predicatedMap11.keyPredicate;
        collections.Predicate predicate13 = predicatedMap11.valuePredicate;
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) 0.0f);
        java.util.Set set16 = defaultedMap15.entrySet();
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) 0.0f);
        collections.Predicate predicate19 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate20 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map21 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap18, predicate19, predicate20);
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) 0.0f);
        collections.Predicate predicate24 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate25 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map26 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap23, predicate24, predicate25);
        java.util.Map map27 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap15, predicate19, predicate25);
        java.util.Map map28 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate13, predicate25);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNull(predicate12);
        org.junit.Assert.assertNotNull(predicate13);
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertNotNull(map21);
        org.junit.Assert.assertNotNull(predicate24);
        org.junit.Assert.assertNotNull(predicate25);
        org.junit.Assert.assertNotNull(map26);
        org.junit.Assert.assertNotNull(map27);
        org.junit.Assert.assertNotNull(map28);
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PredicatedMap26_Test0.test25");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0f);
        java.lang.String str2 = defaultedMap1.toString();
        java.lang.Object obj3 = null;
        java.lang.Object obj4 = defaultedMap1.get(obj3);
        java.util.Set set5 = defaultedMap1.keySet();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 0.0f);
        collections.Predicate predicate8 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate9 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map10 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap7, predicate8, predicate9);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) 0.0f);
        java.util.Set set13 = defaultedMap12.entrySet();
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) 0.0f);
        collections.Predicate predicate16 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate17 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map18 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap15, predicate16, predicate17);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) 0.0f);
        collections.Predicate predicate21 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate22 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map23 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap20, predicate21, predicate22);
        java.util.Map map24 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap12, predicate16, predicate22);
        java.util.Map map25 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate9, predicate22);
        boolean b27 = defaultedMap1.containsValue((java.lang.Object) '#');
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertTrue("'" + obj4 + "' != '" + 0.0f + "'", obj4.equals(0.0f));
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertNotNull(predicate21);
        org.junit.Assert.assertNotNull(predicate22);
        org.junit.Assert.assertNotNull(map23);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertNotNull(map25);
        org.junit.Assert.assertTrue(b27 == false);
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PredicatedMap26_Test0.test26");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0f);
        java.util.Set set2 = defaultedMap1.keySet();
        collections.Predicate predicate3 = null;
        collections.Predicate predicate4 = collections.PredicateUtils.truePredicate();
        collections.map.PredicatedMap predicatedMap5 = new collections.map.PredicatedMap((java.util.Map) defaultedMap1, predicate3, predicate4);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 0.0f);
        java.lang.Object obj8 = null;
        boolean b9 = defaultedMap7.equals(obj8);
        predicatedMap5.validate((java.lang.Object) b9, (java.lang.Object) (short) 100);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) 0.0f);
        java.lang.String str14 = defaultedMap13.toString();
        java.lang.Object obj15 = null;
        java.lang.Object obj16 = defaultedMap13.get(obj15);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) 0.0f);
        java.util.Set set19 = defaultedMap18.keySet();
        defaultedMap13.putAll((java.util.Map) defaultedMap18);
        predicatedMap5.putAll((java.util.Map) defaultedMap13);
        java.util.Map map23 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap13, (java.lang.Object) (byte) -1);
        java.lang.Object obj25 = defaultedMap13.remove((java.lang.Object) 100.0f);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "{}" + "'", str14.equals("{}"));
        org.junit.Assert.assertTrue("'" + obj16 + "' != '" + 0.0f + "'", obj16.equals(0.0f));
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertNotNull(map23);
        org.junit.Assert.assertNull(obj25);
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PredicatedMap26_Test0.test27");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0f);
        java.util.Set set2 = defaultedMap1.keySet();
        collections.Predicate predicate3 = null;
        collections.Predicate predicate4 = collections.PredicateUtils.truePredicate();
        collections.map.PredicatedMap predicatedMap5 = new collections.map.PredicatedMap((java.util.Map) defaultedMap1, predicate3, predicate4);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 0.0f);
        java.util.Set set8 = defaultedMap7.keySet();
        collections.Predicate predicate9 = null;
        collections.Predicate predicate10 = collections.PredicateUtils.truePredicate();
        collections.map.PredicatedMap predicatedMap11 = new collections.map.PredicatedMap((java.util.Map) defaultedMap7, predicate9, predicate10);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) 0.0f);
        java.lang.Object obj14 = null;
        boolean b15 = defaultedMap13.equals(obj14);
        predicatedMap11.validate((java.lang.Object) b15, (java.lang.Object) (short) 100);
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.util.Map) predicatedMap11, (java.lang.Object) (-1L));
        java.util.Set set20 = predicatedMap11.entrySet();
        predicatedMap5.putAll((java.util.Map) predicatedMap11);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertNotNull(set20);
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PredicatedMap26_Test0.test28");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0f);
        java.util.Set set2 = defaultedMap1.keySet();
        collections.Predicate predicate3 = null;
        collections.Predicate predicate4 = collections.PredicateUtils.truePredicate();
        collections.map.PredicatedMap predicatedMap5 = new collections.map.PredicatedMap((java.util.Map) defaultedMap1, predicate3, predicate4);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 0.0f);
        java.lang.Object obj8 = null;
        boolean b9 = defaultedMap7.equals(obj8);
        predicatedMap5.validate((java.lang.Object) b9, (java.lang.Object) (short) 100);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) 0.0f);
        java.lang.String str14 = defaultedMap13.toString();
        java.lang.Object obj15 = null;
        java.lang.Object obj16 = defaultedMap13.get(obj15);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) 0.0f);
        java.util.Set set19 = defaultedMap18.keySet();
        defaultedMap13.putAll((java.util.Map) defaultedMap18);
        predicatedMap5.putAll((java.util.Map) defaultedMap13);
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) 0.0f);
        collections.Predicate predicate24 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate25 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map26 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap23, predicate24, predicate25);
        boolean b28 = defaultedMap23.containsKey((java.lang.Object) 0.0d);
        boolean b29 = defaultedMap13.equals((java.lang.Object) defaultedMap23);
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) 0.0f);
        collections.Predicate predicate32 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate33 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map34 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap31, predicate32, predicate33);
        defaultedMap23.putAll(map34);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "{}" + "'", str14.equals("{}"));
        org.junit.Assert.assertTrue("'" + obj16 + "' != '" + 0.0f + "'", obj16.equals(0.0f));
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertNotNull(predicate24);
        org.junit.Assert.assertNotNull(predicate25);
        org.junit.Assert.assertNotNull(map26);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertTrue(b29 == true);
        org.junit.Assert.assertNotNull(predicate32);
        org.junit.Assert.assertNotNull(predicate33);
        org.junit.Assert.assertNotNull(map34);
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PredicatedMap26_Test0.test29");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100);
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PredicatedMap26_Test0.test30");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0f);
        java.util.Set set2 = defaultedMap1.keySet();
        collections.Predicate predicate3 = null;
        collections.Predicate predicate4 = collections.PredicateUtils.truePredicate();
        collections.map.PredicatedMap predicatedMap5 = new collections.map.PredicatedMap((java.util.Map) defaultedMap1, predicate3, predicate4);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 0.0f);
        java.lang.Object obj8 = null;
        boolean b9 = defaultedMap7.equals(obj8);
        predicatedMap5.validate((java.lang.Object) b9, (java.lang.Object) (short) 100);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.util.Map) predicatedMap5, (java.lang.Object) (-1L));
        defaultedMap13.clear();
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertTrue(b9 == false);
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PredicatedMap26_Test0.test31");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (-1.0f));
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PredicatedMap26_Test0.test32");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0f);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 0.0f);
        java.util.Set set4 = defaultedMap3.entrySet();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 0.0f);
        collections.Predicate predicate7 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate8 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map9 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap6, predicate7, predicate8);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) 0.0f);
        collections.Predicate predicate12 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate13 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map14 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap11, predicate12, predicate13);
        java.util.Map map15 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap3, predicate7, predicate13);
        java.lang.Object obj16 = defaultedMap1.get((java.lang.Object) defaultedMap3);
        int i17 = defaultedMap1.size();
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertNotNull(predicate13);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertTrue("'" + obj16 + "' != '" + 0.0f + "'", obj16.equals(0.0f));
        org.junit.Assert.assertTrue(i17 == 0);
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PredicatedMap26_Test0.test33");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0f);
        java.util.Set set2 = defaultedMap1.keySet();
        collections.Predicate predicate3 = null;
        collections.Predicate predicate4 = collections.PredicateUtils.truePredicate();
        collections.map.PredicatedMap predicatedMap5 = new collections.map.PredicatedMap((java.util.Map) defaultedMap1, predicate3, predicate4);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 0.0f);
        java.lang.Object obj8 = null;
        boolean b9 = defaultedMap7.equals(obj8);
        predicatedMap5.validate((java.lang.Object) b9, (java.lang.Object) (short) 100);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) 0.0f);
        java.lang.String str15 = defaultedMap14.toString();
        java.lang.Object obj16 = null;
        java.lang.Object obj17 = defaultedMap14.get(obj16);
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) 0.0f);
        java.util.Set set20 = defaultedMap19.keySet();
        defaultedMap14.putAll((java.util.Map) defaultedMap19);
        java.lang.String str22 = defaultedMap14.toString();
        java.util.Collection collection23 = defaultedMap14.values();
        java.lang.Object obj24 = predicatedMap5.put((java.lang.Object) 10.0d, (java.lang.Object) collection23);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "{}" + "'", str15.equals("{}"));
        org.junit.Assert.assertTrue("'" + obj17 + "' != '" + 0.0f + "'", obj17.equals(0.0f));
        org.junit.Assert.assertNotNull(set20);
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "{}" + "'", str22.equals("{}"));
        org.junit.Assert.assertNotNull(collection23);
        org.junit.Assert.assertNull(obj24);
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PredicatedMap26_Test0.test34");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0f);
        java.lang.String str2 = defaultedMap1.toString();
        java.lang.Object obj3 = null;
        java.lang.Object obj4 = defaultedMap1.get(obj3);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 0.0f);
        java.util.Set set7 = defaultedMap6.keySet();
        defaultedMap1.putAll((java.util.Map) defaultedMap6);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) 0.0f);
        collections.Predicate predicate11 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate12 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map13 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap10, predicate11, predicate12);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) 0.0f);
        java.util.Set set16 = defaultedMap15.keySet();
        collections.Predicate predicate17 = null;
        collections.Predicate predicate18 = collections.PredicateUtils.truePredicate();
        collections.map.PredicatedMap predicatedMap19 = new collections.map.PredicatedMap((java.util.Map) defaultedMap15, predicate17, predicate18);
        collections.Predicate predicate20 = predicatedMap19.keyPredicate;
        collections.Predicate predicate21 = predicatedMap19.valuePredicate;
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) 0.0f);
        collections.Predicate predicate25 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate26 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map27 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap24, predicate25, predicate26);
        boolean b28 = defaultedMap24.isEmpty();
        java.lang.Object obj29 = predicatedMap19.put((java.lang.Object) 1, (java.lang.Object) defaultedMap24);
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.util.Map) defaultedMap10, obj29);
        java.lang.Object obj31 = defaultedMap1.get((java.lang.Object) defaultedMap30);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertTrue("'" + obj4 + "' != '" + 0.0f + "'", obj4.equals(0.0f));
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertNull(predicate20);
        org.junit.Assert.assertNotNull(predicate21);
        org.junit.Assert.assertNotNull(predicate25);
        org.junit.Assert.assertNotNull(predicate26);
        org.junit.Assert.assertNotNull(map27);
        org.junit.Assert.assertTrue(b28 == true);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertTrue("'" + obj31 + "' != '" + 0.0f + "'", obj31.equals(0.0f));
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PredicatedMap26_Test0.test35");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0f);
        java.lang.String str2 = defaultedMap1.toString();
        java.lang.Object obj3 = null;
        java.lang.Object obj4 = defaultedMap1.get(obj3);
        java.util.Set set5 = defaultedMap1.keySet();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 0.0f);
        java.lang.String str8 = defaultedMap7.toString();
        java.lang.Object obj9 = null;
        java.lang.Object obj10 = defaultedMap7.get(obj9);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) 0.0f);
        java.util.Set set13 = defaultedMap12.keySet();
        java.util.Map map15 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap12, (java.lang.Object) (byte) -1);
        boolean b16 = defaultedMap7.equals((java.lang.Object) defaultedMap12);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.util.Map) defaultedMap12, (java.lang.Object) "");
        defaultedMap18.clear();
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) 0.0f);
        java.lang.String str22 = defaultedMap21.toString();
        java.lang.Object obj23 = null;
        java.lang.Object obj24 = defaultedMap21.get(obj23);
        java.util.Set set25 = defaultedMap21.keySet();
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) 0.0f);
        collections.Predicate predicate28 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate29 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map30 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap27, predicate28, predicate29);
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) 0.0f);
        java.util.Set set33 = defaultedMap32.entrySet();
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) 0.0f);
        collections.Predicate predicate36 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate37 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map38 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap35, predicate36, predicate37);
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap((java.lang.Object) 0.0f);
        collections.Predicate predicate41 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate42 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map43 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap40, predicate41, predicate42);
        java.util.Map map44 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap32, predicate36, predicate42);
        java.util.Map map45 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap21, predicate29, predicate42);
        collections.map.DefaultedMap defaultedMap47 = new collections.map.DefaultedMap((java.lang.Object) 0.0f);
        java.util.Set set48 = defaultedMap47.entrySet();
        collections.map.DefaultedMap defaultedMap50 = new collections.map.DefaultedMap((java.lang.Object) 0.0f);
        collections.Predicate predicate51 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate52 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map53 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap50, predicate51, predicate52);
        collections.map.DefaultedMap defaultedMap55 = new collections.map.DefaultedMap((java.lang.Object) 0.0f);
        collections.Predicate predicate56 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate57 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map58 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap55, predicate56, predicate57);
        java.util.Map map59 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap47, predicate51, predicate57);
        java.util.Map map60 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap18, predicate29, predicate51);
        boolean b61 = defaultedMap1.containsValue((java.lang.Object) predicate51);
        java.util.Collection collection62 = defaultedMap1.values();
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertTrue("'" + obj4 + "' != '" + 0.0f + "'", obj4.equals(0.0f));
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "{}" + "'", str8.equals("{}"));
        org.junit.Assert.assertTrue("'" + obj10 + "' != '" + 0.0f + "'", obj10.equals(0.0f));
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertTrue(b16 == true);
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "{}" + "'", str22.equals("{}"));
        org.junit.Assert.assertTrue("'" + obj24 + "' != '" + 0.0f + "'", obj24.equals(0.0f));
        org.junit.Assert.assertNotNull(set25);
        org.junit.Assert.assertNotNull(predicate28);
        org.junit.Assert.assertNotNull(predicate29);
        org.junit.Assert.assertNotNull(map30);
        org.junit.Assert.assertNotNull(set33);
        org.junit.Assert.assertNotNull(predicate36);
        org.junit.Assert.assertNotNull(predicate37);
        org.junit.Assert.assertNotNull(map38);
        org.junit.Assert.assertNotNull(predicate41);
        org.junit.Assert.assertNotNull(predicate42);
        org.junit.Assert.assertNotNull(map43);
        org.junit.Assert.assertNotNull(map44);
        org.junit.Assert.assertNotNull(map45);
        org.junit.Assert.assertNotNull(set48);
        org.junit.Assert.assertNotNull(predicate51);
        org.junit.Assert.assertNotNull(predicate52);
        org.junit.Assert.assertNotNull(map53);
        org.junit.Assert.assertNotNull(predicate56);
        org.junit.Assert.assertNotNull(predicate57);
        org.junit.Assert.assertNotNull(map58);
        org.junit.Assert.assertNotNull(map59);
        org.junit.Assert.assertNotNull(map60);
        org.junit.Assert.assertTrue(b61 == false);
        org.junit.Assert.assertNotNull(collection62);
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PredicatedMap26_Test0.test36");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0f);
        java.util.Set set2 = defaultedMap1.keySet();
        collections.Predicate predicate3 = null;
        collections.Predicate predicate4 = collections.PredicateUtils.truePredicate();
        collections.map.PredicatedMap predicatedMap5 = new collections.map.PredicatedMap((java.util.Map) defaultedMap1, predicate3, predicate4);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 0.0f);
        java.lang.String str8 = defaultedMap7.toString();
        java.lang.Object obj9 = null;
        java.lang.Object obj10 = defaultedMap7.get(obj9);
        java.util.Set set11 = defaultedMap7.keySet();
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) 0.0f);
        collections.Predicate predicate14 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate15 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map16 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap13, predicate14, predicate15);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) 0.0f);
        java.util.Set set19 = defaultedMap18.entrySet();
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) 0.0f);
        collections.Predicate predicate22 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate23 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map24 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap21, predicate22, predicate23);
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) 0.0f);
        collections.Predicate predicate27 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate28 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map29 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap26, predicate27, predicate28);
        java.util.Map map30 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap18, predicate22, predicate28);
        java.util.Map map31 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap7, predicate15, predicate28);
        defaultedMap1.putAll(map31);
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) 0.0f);
        java.util.Set set35 = defaultedMap34.keySet();
        collections.Predicate predicate36 = null;
        collections.Predicate predicate37 = collections.PredicateUtils.truePredicate();
        collections.map.PredicatedMap predicatedMap38 = new collections.map.PredicatedMap((java.util.Map) defaultedMap34, predicate36, predicate37);
        java.lang.String str39 = predicatedMap38.toString();
        java.lang.Object obj40 = defaultedMap1.get((java.lang.Object) predicatedMap38);
        java.util.Collection collection41 = predicatedMap38.values();
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "{}" + "'", str8.equals("{}"));
        org.junit.Assert.assertTrue("'" + obj10 + "' != '" + 0.0f + "'", obj10.equals(0.0f));
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertNotNull(predicate15);
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertNotNull(predicate22);
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertNotNull(predicate27);
        org.junit.Assert.assertNotNull(predicate28);
        org.junit.Assert.assertNotNull(map29);
        org.junit.Assert.assertNotNull(map30);
        org.junit.Assert.assertNotNull(map31);
        org.junit.Assert.assertNotNull(set35);
        org.junit.Assert.assertNotNull(predicate37);
        org.junit.Assert.assertTrue("'" + str39 + "' != '" + "{}" + "'", str39.equals("{}"));
        org.junit.Assert.assertTrue("'" + obj40 + "' != '" + 0.0f + "'", obj40.equals(0.0f));
        org.junit.Assert.assertNotNull(collection41);
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PredicatedMap26_Test0.test37");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0f);
        java.lang.String str2 = defaultedMap1.toString();
        java.lang.Object obj3 = null;
        java.lang.Object obj4 = defaultedMap1.get(obj3);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 0.0f);
        java.util.Set set7 = defaultedMap6.keySet();
        java.util.Map map9 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap6, (java.lang.Object) (byte) -1);
        boolean b10 = defaultedMap1.equals((java.lang.Object) defaultedMap6);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.util.Map) defaultedMap6, (java.lang.Object) "");
        defaultedMap12.clear();
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) 0.0f);
        java.lang.String str16 = defaultedMap15.toString();
        java.lang.Object obj17 = null;
        java.lang.Object obj18 = defaultedMap15.get(obj17);
        java.util.Set set19 = defaultedMap15.keySet();
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) 0.0f);
        collections.Predicate predicate22 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate23 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map24 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap21, predicate22, predicate23);
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) 0.0f);
        java.util.Set set27 = defaultedMap26.entrySet();
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) 0.0f);
        collections.Predicate predicate30 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate31 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map32 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap29, predicate30, predicate31);
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) 0.0f);
        collections.Predicate predicate35 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate36 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map37 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap34, predicate35, predicate36);
        java.util.Map map38 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap26, predicate30, predicate36);
        java.util.Map map39 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap15, predicate23, predicate36);
        collections.map.DefaultedMap defaultedMap41 = new collections.map.DefaultedMap((java.lang.Object) 0.0f);
        java.util.Set set42 = defaultedMap41.entrySet();
        collections.map.DefaultedMap defaultedMap44 = new collections.map.DefaultedMap((java.lang.Object) 0.0f);
        collections.Predicate predicate45 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate46 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map47 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap44, predicate45, predicate46);
        collections.map.DefaultedMap defaultedMap49 = new collections.map.DefaultedMap((java.lang.Object) 0.0f);
        collections.Predicate predicate50 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate51 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map52 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap49, predicate50, predicate51);
        java.util.Map map53 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap41, predicate45, predicate51);
        java.util.Map map54 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap12, predicate23, predicate45);
        boolean b55 = defaultedMap12.isEmpty();
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertTrue("'" + obj4 + "' != '" + 0.0f + "'", obj4.equals(0.0f));
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "{}" + "'", str16.equals("{}"));
        org.junit.Assert.assertTrue("'" + obj18 + "' != '" + 0.0f + "'", obj18.equals(0.0f));
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertNotNull(predicate22);
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertNotNull(set27);
        org.junit.Assert.assertNotNull(predicate30);
        org.junit.Assert.assertNotNull(predicate31);
        org.junit.Assert.assertNotNull(map32);
        org.junit.Assert.assertNotNull(predicate35);
        org.junit.Assert.assertNotNull(predicate36);
        org.junit.Assert.assertNotNull(map37);
        org.junit.Assert.assertNotNull(map38);
        org.junit.Assert.assertNotNull(map39);
        org.junit.Assert.assertNotNull(set42);
        org.junit.Assert.assertNotNull(predicate45);
        org.junit.Assert.assertNotNull(predicate46);
        org.junit.Assert.assertNotNull(map47);
        org.junit.Assert.assertNotNull(predicate50);
        org.junit.Assert.assertNotNull(predicate51);
        org.junit.Assert.assertNotNull(map52);
        org.junit.Assert.assertNotNull(map53);
        org.junit.Assert.assertNotNull(map54);
        org.junit.Assert.assertTrue(b55 == true);
    }

    @Test
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PredicatedMap26_Test0.test38");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0f);
        java.lang.String str2 = defaultedMap1.toString();
        java.lang.Object obj3 = null;
        java.lang.Object obj4 = defaultedMap1.get(obj3);
        java.util.Set set5 = defaultedMap1.entrySet();
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertTrue("'" + obj4 + "' != '" + 0.0f + "'", obj4.equals(0.0f));
        org.junit.Assert.assertNotNull(set5);
    }

    @Test
    public void test39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PredicatedMap26_Test0.test39");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0f);
        java.lang.Object obj2 = null;
        boolean b3 = defaultedMap1.equals(obj2);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 0.0f);
        java.util.Set set6 = defaultedMap5.keySet();
        collections.Predicate predicate7 = null;
        collections.Predicate predicate8 = collections.PredicateUtils.truePredicate();
        collections.map.PredicatedMap predicatedMap9 = new collections.map.PredicatedMap((java.util.Map) defaultedMap5, predicate7, predicate8);
        collections.Predicate predicate10 = predicatedMap9.keyPredicate;
        collections.Predicate predicate11 = predicatedMap9.valuePredicate;
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) 0.0f);
        collections.Predicate predicate15 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate16 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map17 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap14, predicate15, predicate16);
        boolean b18 = defaultedMap14.isEmpty();
        java.lang.Object obj19 = predicatedMap9.put((java.lang.Object) 1, (java.lang.Object) defaultedMap14);
        boolean b20 = defaultedMap1.containsKey((java.lang.Object) 1);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNull(predicate10);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(predicate15);
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertTrue(b18 == true);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertTrue(b20 == false);
    }

    @Test
    public void test40() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PredicatedMap26_Test0.test40");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0f);
        java.lang.String str2 = defaultedMap1.toString();
        java.lang.Object obj3 = null;
        java.lang.Object obj4 = defaultedMap1.get(obj3);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 0.0f);
        java.util.Set set7 = defaultedMap6.keySet();
        java.util.Map map9 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap6, (java.lang.Object) (byte) -1);
        boolean b10 = defaultedMap1.equals((java.lang.Object) defaultedMap6);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.util.Map) defaultedMap6, (java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) 0.0f);
        java.util.Set set15 = defaultedMap14.keySet();
        collections.Predicate predicate16 = null;
        collections.Predicate predicate17 = collections.PredicateUtils.truePredicate();
        collections.map.PredicatedMap predicatedMap18 = new collections.map.PredicatedMap((java.util.Map) defaultedMap14, predicate16, predicate17);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) 0.0f);
        java.lang.Object obj21 = null;
        boolean b22 = defaultedMap20.equals(obj21);
        predicatedMap18.validate((java.lang.Object) b22, (java.lang.Object) (short) 100);
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.util.Map) predicatedMap18, (java.lang.Object) (-1L));
        java.util.Set set27 = predicatedMap18.entrySet();
        java.util.Set set28 = predicatedMap18.entrySet();
        java.lang.Object obj29 = defaultedMap6.get((java.lang.Object) predicatedMap18);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertTrue("'" + obj4 + "' != '" + 0.0f + "'", obj4.equals(0.0f));
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertNotNull(set15);
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertNotNull(set27);
        org.junit.Assert.assertNotNull(set28);
        org.junit.Assert.assertTrue("'" + obj29 + "' != '" + 0.0f + "'", obj29.equals(0.0f));
    }

    @Test
    public void test41() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PredicatedMap26_Test0.test41");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0f);
        java.util.Set set2 = defaultedMap1.keySet();
        collections.Predicate predicate3 = null;
        collections.Predicate predicate4 = collections.PredicateUtils.truePredicate();
        collections.map.PredicatedMap predicatedMap5 = new collections.map.PredicatedMap((java.util.Map) defaultedMap1, predicate3, predicate4);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 0.0f);
        java.lang.Object obj8 = null;
        boolean b9 = defaultedMap7.equals(obj8);
        predicatedMap5.validate((java.lang.Object) b9, (java.lang.Object) (short) 100);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) 0.0f);
        java.lang.String str14 = defaultedMap13.toString();
        java.lang.Object obj15 = null;
        java.lang.Object obj16 = defaultedMap13.get(obj15);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) 0.0f);
        java.util.Set set19 = defaultedMap18.keySet();
        defaultedMap13.putAll((java.util.Map) defaultedMap18);
        predicatedMap5.putAll((java.util.Map) defaultedMap13);
        java.util.Set set22 = predicatedMap5.entrySet();
        boolean b24 = predicatedMap5.containsValue((java.lang.Object) (byte) 100);
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) 0.0f);
        java.util.Set set27 = defaultedMap26.keySet();
        predicatedMap5.putAll((java.util.Map) defaultedMap26);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "{}" + "'", str14.equals("{}"));
        org.junit.Assert.assertTrue("'" + obj16 + "' != '" + 0.0f + "'", obj16.equals(0.0f));
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertNotNull(set22);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertNotNull(set27);
    }

    @Test
    public void test42() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PredicatedMap26_Test0.test42");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0f);
        java.util.Set set2 = defaultedMap1.keySet();
        java.util.Map map4 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 0.0f);
        java.util.Set set7 = defaultedMap6.keySet();
        collections.Predicate predicate8 = null;
        collections.Predicate predicate9 = collections.PredicateUtils.truePredicate();
        collections.map.PredicatedMap predicatedMap10 = new collections.map.PredicatedMap((java.util.Map) defaultedMap6, predicate8, predicate9);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) 0.0f);
        java.lang.Object obj13 = null;
        boolean b14 = defaultedMap12.equals(obj13);
        predicatedMap10.validate((java.lang.Object) b14, (java.lang.Object) (short) 100);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.util.Map) predicatedMap10, (java.lang.Object) (-1L));
        java.util.Set set19 = predicatedMap10.entrySet();
        java.lang.Object obj20 = defaultedMap1.get((java.lang.Object) set19);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertTrue("'" + obj20 + "' != '" + 0.0f + "'", obj20.equals(0.0f));
    }

    @Test
    public void test43() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PredicatedMap26_Test0.test43");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0f);
        java.util.Set set2 = defaultedMap1.keySet();
        collections.Predicate predicate3 = null;
        collections.Predicate predicate4 = collections.PredicateUtils.truePredicate();
        collections.map.PredicatedMap predicatedMap5 = new collections.map.PredicatedMap((java.util.Map) defaultedMap1, predicate3, predicate4);
        collections.Predicate predicate6 = predicatedMap5.keyPredicate;
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 0.0f);
        java.util.Set set9 = defaultedMap8.keySet();
        collections.Predicate predicate10 = null;
        collections.Predicate predicate11 = collections.PredicateUtils.truePredicate();
        collections.map.PredicatedMap predicatedMap12 = new collections.map.PredicatedMap((java.util.Map) defaultedMap8, predicate10, predicate11);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) 0.0f);
        java.lang.Object obj15 = null;
        boolean b16 = defaultedMap14.equals(obj15);
        predicatedMap12.validate((java.lang.Object) b16, (java.lang.Object) (short) 100);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) 0.0f);
        java.lang.String str21 = defaultedMap20.toString();
        java.lang.Object obj22 = null;
        java.lang.Object obj23 = defaultedMap20.get(obj22);
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) 0.0f);
        java.util.Set set26 = defaultedMap25.keySet();
        defaultedMap20.putAll((java.util.Map) defaultedMap25);
        predicatedMap12.putAll((java.util.Map) defaultedMap20);
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) 0.0f);
        collections.Predicate predicate31 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate32 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map33 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap30, predicate31, predicate32);
        boolean b35 = defaultedMap30.containsKey((java.lang.Object) 0.0d);
        boolean b36 = defaultedMap20.equals((java.lang.Object) defaultedMap30);
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap((java.lang.Object) 0.0f);
        java.lang.String str40 = defaultedMap39.toString();
        java.lang.Object obj41 = null;
        java.lang.Object obj42 = defaultedMap39.get(obj41);
        collections.map.DefaultedMap defaultedMap44 = new collections.map.DefaultedMap((java.lang.Object) 0.0f);
        java.util.Set set45 = defaultedMap44.keySet();
        java.util.Map map47 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap44, (java.lang.Object) (byte) -1);
        boolean b48 = defaultedMap39.equals((java.lang.Object) defaultedMap44);
        java.lang.Object obj49 = defaultedMap20.put((java.lang.Object) 100.0d, (java.lang.Object) defaultedMap39);
        java.lang.Object obj50 = predicatedMap5.checkSetValue((java.lang.Object) defaultedMap20);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertNull(predicate6);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "{}" + "'", str21.equals("{}"));
        org.junit.Assert.assertTrue("'" + obj23 + "' != '" + 0.0f + "'", obj23.equals(0.0f));
        org.junit.Assert.assertNotNull(set26);
        org.junit.Assert.assertNotNull(predicate31);
        org.junit.Assert.assertNotNull(predicate32);
        org.junit.Assert.assertNotNull(map33);
        org.junit.Assert.assertTrue(b35 == false);
        org.junit.Assert.assertTrue(b36 == true);
        org.junit.Assert.assertTrue("'" + str40 + "' != '" + "{}" + "'", str40.equals("{}"));
        org.junit.Assert.assertTrue("'" + obj42 + "' != '" + 0.0f + "'", obj42.equals(0.0f));
        org.junit.Assert.assertNotNull(set45);
        org.junit.Assert.assertNotNull(map47);
        org.junit.Assert.assertTrue(b48 == true);
        org.junit.Assert.assertNull(obj49);
        org.junit.Assert.assertNotNull(obj50);
    }
}

