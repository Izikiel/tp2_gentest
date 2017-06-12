package collections.comparators;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class FixedOrderComparator10_Test0 {

    public static boolean debug = false;

    @Test
    public void test01() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedOrderComparator10_Test0.test01");
        int i0 = collections.comparators.FixedOrderComparator.UNKNOWN_THROW_EXCEPTION;
        org.junit.Assert.assertTrue(i0 == 2);
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedOrderComparator10_Test0.test02");
        java.util.Map map0 = null;
        collections.Predicate predicate1 = null;
        collections.Predicate predicate2 = null;
        try {
            java.util.Map map3 = collections.map.PredicatedMap.decorate(map0, predicate1, predicate2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedOrderComparator10_Test0.test03");
        int i0 = collections.comparators.FixedOrderComparator.UNKNOWN_BEFORE;
        org.junit.Assert.assertTrue(i0 == 0);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedOrderComparator10_Test0.test04");
        java.util.Map map0 = null;
        collections.Factory factory1 = null;
        try {
            java.util.Map map2 = collections.map.DefaultedMap.decorate(map0, factory1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedOrderComparator10_Test0.test05");
        java.lang.Class class0 = null;
        try {
            collections.Predicate predicate1 = collections.PredicateUtils.instanceofPredicate(class0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedOrderComparator10_Test0.test06");
        java.util.Map map0 = null;
        try {
            java.util.Map map2 = collections.map.DefaultedMap.decorate(map0, (java.lang.Object) 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedOrderComparator10_Test0.test07");
        java.util.Map map0 = null;
        collections.Transformer transformer1 = null;
        try {
            java.util.Map map2 = collections.map.DefaultedMap.decorate(map0, transformer1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedOrderComparator10_Test0.test08");
        java.util.Map map0 = null;
        collections.Predicate predicate1 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate2 = collections.PredicateUtils.truePredicate();
        try {
            java.util.Map map3 = collections.map.PredicatedMap.decorate(map0, predicate1, predicate2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(predicate1);
        org.junit.Assert.assertNotNull(predicate2);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedOrderComparator10_Test0.test09");
        java.lang.Object[] obj_array0 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator1 = new collections.comparators.FixedOrderComparator(obj_array0);
        try {
            int i4 = fixedOrderComparator1.compare((java.lang.Object) true, (java.lang.Object) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(obj_array0);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedOrderComparator10_Test0.test10");
        int i0 = collections.comparators.FixedOrderComparator.UNKNOWN_AFTER;
        org.junit.Assert.assertTrue(i0 == 1);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedOrderComparator10_Test0.test11");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        try {
            int i3 = fixedOrderComparator0.compare((java.lang.Object) 0.0f, (java.lang.Object) 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedOrderComparator10_Test0.test12");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        try {
            fixedOrderComparator0.setUnknownObjectBehavior((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedOrderComparator10_Test0.test13");
        java.util.List list0 = null;
        try {
            collections.comparators.FixedOrderComparator fixedOrderComparator1 = new collections.comparators.FixedOrderComparator(list0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedOrderComparator10_Test0.test14");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (-1.0f));
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (-1.0f));
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) (-1.0f));
        java.lang.Object obj7 = defaultedMap5.get((java.lang.Object) (byte) -1);
        defaultedMap3.putAll((java.util.Map) defaultedMap5);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        int i10 = defaultedMap1.size();
        collections.Factory factory11 = null;
        try {
            java.util.Map map12 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + obj7 + "' != '" + (-1.0f) + "'", obj7.equals((-1.0f)));
        org.junit.Assert.assertTrue(i10 == 0);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedOrderComparator10_Test0.test15");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (-1.0f));
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (-1.0f));
        java.lang.Object obj5 = defaultedMap3.get((java.lang.Object) (byte) -1);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        java.util.Set set7 = defaultedMap1.keySet();
        collections.Factory factory8 = null;
        try {
            java.util.Map map9 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + (-1.0f) + "'", obj5.equals((-1.0f)));
        org.junit.Assert.assertNotNull(set7);
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedOrderComparator10_Test0.test16");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        try {
            int i3 = fixedOrderComparator0.compare((java.lang.Object) 0.0f, (java.lang.Object) true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedOrderComparator10_Test0.test17");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (-1.0f));
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (-1.0f));
        java.lang.Object obj5 = defaultedMap3.get((java.lang.Object) (byte) -1);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) (-1.0f));
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) (-1.0f));
        java.lang.Object obj13 = defaultedMap11.get((java.lang.Object) (byte) -1);
        defaultedMap9.putAll((java.util.Map) defaultedMap11);
        java.lang.Object obj15 = defaultedMap3.put((java.lang.Object) (short) 1, (java.lang.Object) defaultedMap11);
        defaultedMap11.clear();
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + (-1.0f) + "'", obj5.equals((-1.0f)));
        org.junit.Assert.assertTrue("'" + obj13 + "' != '" + (-1.0f) + "'", obj13.equals((-1.0f)));
        org.junit.Assert.assertNull(obj15);
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedOrderComparator10_Test0.test18");
        java.lang.Object[] obj_array0 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator1 = new collections.comparators.FixedOrderComparator(obj_array0);
        boolean b2 = fixedOrderComparator1.isLocked();
        try {
            fixedOrderComparator1.setUnknownObjectBehavior((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(obj_array0);
        org.junit.Assert.assertTrue(b2 == false);
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedOrderComparator10_Test0.test19");
        java.lang.Object[] obj_array0 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator1 = new collections.comparators.FixedOrderComparator(obj_array0);
        int i2 = fixedOrderComparator1.getUnknownObjectBehavior();
        org.junit.Assert.assertNotNull(obj_array0);
        org.junit.Assert.assertTrue(i2 == 2);
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedOrderComparator10_Test0.test20");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (-1.0f));
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (-1.0f));
        java.lang.Object obj5 = defaultedMap3.get((java.lang.Object) (byte) -1);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        java.util.Collection collection7 = defaultedMap3.values();
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + (-1.0f) + "'", obj5.equals((-1.0f)));
        org.junit.Assert.assertNotNull(collection7);
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedOrderComparator10_Test0.test21");
        java.lang.Object[] obj_array0 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator1 = new collections.comparators.FixedOrderComparator(obj_array0);
        boolean b2 = fixedOrderComparator1.isLocked();
        java.lang.Object obj4 = null;
        try {
            boolean b5 = fixedOrderComparator1.addAsEqual((java.lang.Object) 0.0f, obj4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(obj_array0);
        org.junit.Assert.assertTrue(b2 == false);
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedOrderComparator10_Test0.test22");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (-1.0f));
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (-1.0f));
        java.lang.Object obj5 = defaultedMap3.get((java.lang.Object) (byte) -1);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        java.util.Set set7 = defaultedMap3.entrySet();
        int i8 = defaultedMap3.size();
        boolean b9 = defaultedMap3.isEmpty();
        java.lang.String str10 = defaultedMap3.toString();
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + (-1.0f) + "'", obj5.equals((-1.0f)));
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "{}" + "'", str10.equals("{}"));
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedOrderComparator10_Test0.test23");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (-1.0f));
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (-1.0f));
        java.lang.Object obj5 = defaultedMap3.get((java.lang.Object) (byte) -1);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) (-1.0f));
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) (-1.0f));
        java.lang.Object obj13 = defaultedMap11.get((java.lang.Object) (byte) -1);
        defaultedMap9.putAll((java.util.Map) defaultedMap11);
        java.lang.Object obj15 = defaultedMap3.put((java.lang.Object) (short) 1, (java.lang.Object) defaultedMap11);
        java.lang.Object obj17 = defaultedMap3.get((java.lang.Object) (byte) 1);
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + (-1.0f) + "'", obj5.equals((-1.0f)));
        org.junit.Assert.assertTrue("'" + obj13 + "' != '" + (-1.0f) + "'", obj13.equals((-1.0f)));
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue("'" + obj17 + "' != '" + (-1.0f) + "'", obj17.equals((-1.0f)));
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedOrderComparator10_Test0.test24");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        java.lang.Object[] obj_array1 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator2 = new collections.comparators.FixedOrderComparator(obj_array1);
        boolean b3 = fixedOrderComparator2.isLocked();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) (-1.0f));
        int i6 = defaultedMap5.size();
        java.lang.Object[] obj_array9 = new java.lang.Object[] { defaultedMap5, 0L, ' ' };
        collections.comparators.FixedOrderComparator fixedOrderComparator10 = new collections.comparators.FixedOrderComparator(obj_array9);
        boolean b11 = fixedOrderComparator2.add((java.lang.Object) fixedOrderComparator10);
        boolean b12 = fixedOrderComparator0.add((java.lang.Object) fixedOrderComparator2);
        collections.comparators.FixedOrderComparator fixedOrderComparator13 = new collections.comparators.FixedOrderComparator();
        java.lang.Object[] obj_array14 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator15 = new collections.comparators.FixedOrderComparator(obj_array14);
        boolean b16 = fixedOrderComparator15.isLocked();
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) (-1.0f));
        int i19 = defaultedMap18.size();
        java.lang.Object[] obj_array22 = new java.lang.Object[] { defaultedMap18, 0L, ' ' };
        collections.comparators.FixedOrderComparator fixedOrderComparator23 = new collections.comparators.FixedOrderComparator(obj_array22);
        boolean b24 = fixedOrderComparator15.add((java.lang.Object) fixedOrderComparator23);
        boolean b25 = fixedOrderComparator13.add((java.lang.Object) fixedOrderComparator15);
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) (-1.0f));
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) (-1.0f));
        java.lang.Object obj31 = defaultedMap29.get((java.lang.Object) (byte) -1);
        defaultedMap27.putAll((java.util.Map) defaultedMap29);
        java.util.Set set33 = defaultedMap27.keySet();
        try {
            int i34 = fixedOrderComparator2.compare((java.lang.Object) b25, (java.lang.Object) defaultedMap27);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(obj_array1);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertNotNull(obj_array9);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertNotNull(obj_array14);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue(i19 == 0);
        org.junit.Assert.assertNotNull(obj_array22);
        org.junit.Assert.assertTrue(b24 == true);
        org.junit.Assert.assertTrue(b25 == true);
        org.junit.Assert.assertTrue("'" + obj31 + "' != '" + (-1.0f) + "'", obj31.equals((-1.0f)));
        org.junit.Assert.assertNotNull(set33);
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedOrderComparator10_Test0.test25");
        java.lang.Object[] obj_array0 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator1 = new collections.comparators.FixedOrderComparator(obj_array0);
        boolean b2 = fixedOrderComparator1.isLocked();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) (-1.0f));
        int i5 = defaultedMap4.size();
        java.lang.Object[] obj_array8 = new java.lang.Object[] { defaultedMap4, 0L, ' ' };
        collections.comparators.FixedOrderComparator fixedOrderComparator9 = new collections.comparators.FixedOrderComparator(obj_array8);
        boolean b10 = fixedOrderComparator1.add((java.lang.Object) fixedOrderComparator9);
        try {
            fixedOrderComparator9.setUnknownObjectBehavior((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(obj_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertNotNull(obj_array8);
        org.junit.Assert.assertTrue(b10 == true);
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedOrderComparator10_Test0.test26");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (-1.0f));
        java.util.Collection collection2 = defaultedMap1.values();
        java.lang.Object obj4 = defaultedMap1.remove((java.lang.Object) 100);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) (-1.0f));
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) (-1.0f));
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) (-1.0f));
        java.lang.Object obj12 = defaultedMap10.get((java.lang.Object) (byte) -1);
        defaultedMap8.putAll((java.util.Map) defaultedMap10);
        defaultedMap6.putAll((java.util.Map) defaultedMap8);
        java.util.Map map16 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap8, (java.lang.Object) (byte) 0);
        java.lang.String str17 = defaultedMap8.toString();
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) (-1.0f));
        java.util.Collection collection20 = defaultedMap19.values();
        java.util.Set set21 = defaultedMap19.entrySet();
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) (-1.0f));
        java.lang.Object obj25 = defaultedMap23.get((java.lang.Object) (byte) -1);
        java.lang.Object obj26 = defaultedMap19.remove((java.lang.Object) (byte) -1);
        defaultedMap8.putAll((java.util.Map) defaultedMap19);
        boolean b28 = defaultedMap1.containsValue((java.lang.Object) defaultedMap19);
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) (-1.0f));
        java.util.Collection collection31 = defaultedMap30.values();
        java.util.Set set32 = defaultedMap30.entrySet();
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) (-1.0f));
        java.lang.Object obj36 = defaultedMap34.get((java.lang.Object) (byte) -1);
        java.lang.Object obj37 = defaultedMap30.remove((java.lang.Object) (byte) -1);
        boolean b38 = defaultedMap1.containsValue(obj37);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + obj12 + "' != '" + (-1.0f) + "'", obj12.equals((-1.0f)));
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "{}" + "'", str17.equals("{}"));
        org.junit.Assert.assertNotNull(collection20);
        org.junit.Assert.assertNotNull(set21);
        org.junit.Assert.assertTrue("'" + obj25 + "' != '" + (-1.0f) + "'", obj25.equals((-1.0f)));
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertNotNull(collection31);
        org.junit.Assert.assertNotNull(set32);
        org.junit.Assert.assertTrue("'" + obj36 + "' != '" + (-1.0f) + "'", obj36.equals((-1.0f)));
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertTrue(b38 == false);
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedOrderComparator10_Test0.test27");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (-1.0f));
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (-1.0f));
        java.lang.Object obj5 = defaultedMap3.get((java.lang.Object) (byte) -1);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) (-1.0f));
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) (-1.0f));
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) (-1.0f));
        java.lang.Object obj14 = defaultedMap12.get((java.lang.Object) (byte) -1);
        defaultedMap10.putAll((java.util.Map) defaultedMap12);
        defaultedMap8.putAll((java.util.Map) defaultedMap10);
        defaultedMap3.putAll((java.util.Map) defaultedMap10);
        java.util.Map map19 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap10, (java.lang.Object) (byte) -1);
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + (-1.0f) + "'", obj5.equals((-1.0f)));
        org.junit.Assert.assertTrue("'" + obj14 + "' != '" + (-1.0f) + "'", obj14.equals((-1.0f)));
        org.junit.Assert.assertNotNull(map19);
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedOrderComparator10_Test0.test28");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        int i1 = fixedOrderComparator0.getUnknownObjectBehavior();
        try {
            fixedOrderComparator0.setUnknownObjectBehavior((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(i1 == 2);
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedOrderComparator10_Test0.test29");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        collections.map.DefaultedMap defaultedMap2 = new collections.map.DefaultedMap((java.lang.Object) (-1.0f));
        java.lang.Object[] obj_array3 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator4 = new collections.comparators.FixedOrderComparator(obj_array3);
        try {
            int i5 = fixedOrderComparator0.compare((java.lang.Object) defaultedMap2, (java.lang.Object) obj_array3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(obj_array3);
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedOrderComparator10_Test0.test30");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (-1.0f));
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (-1.0f));
        java.lang.Object obj5 = defaultedMap3.get((java.lang.Object) (byte) -1);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) (-1.0f));
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) (-1.0f));
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) (-1.0f));
        java.lang.Object obj14 = defaultedMap12.get((java.lang.Object) (byte) -1);
        defaultedMap10.putAll((java.util.Map) defaultedMap12);
        defaultedMap8.putAll((java.util.Map) defaultedMap10);
        defaultedMap3.putAll((java.util.Map) defaultedMap10);
        boolean b18 = defaultedMap3.isEmpty();
        java.util.Collection collection19 = defaultedMap3.values();
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + (-1.0f) + "'", obj5.equals((-1.0f)));
        org.junit.Assert.assertTrue("'" + obj14 + "' != '" + (-1.0f) + "'", obj14.equals((-1.0f)));
        org.junit.Assert.assertTrue(b18 == true);
        org.junit.Assert.assertNotNull(collection19);
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedOrderComparator10_Test0.test31");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (-1.0f));
        java.util.Collection collection2 = defaultedMap1.values();
        boolean b4 = defaultedMap1.containsValue((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) (-1.0f));
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) (-1.0f));
        java.lang.Object obj10 = defaultedMap8.get((java.lang.Object) (byte) -1);
        defaultedMap6.putAll((java.util.Map) defaultedMap8);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) (-1.0f));
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) (-1.0f));
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) (-1.0f));
        java.lang.Object obj19 = defaultedMap17.get((java.lang.Object) (byte) -1);
        defaultedMap15.putAll((java.util.Map) defaultedMap17);
        defaultedMap13.putAll((java.util.Map) defaultedMap15);
        defaultedMap8.putAll((java.util.Map) defaultedMap15);
        collections.Predicate predicate23 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate24 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map25 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap15, predicate23, predicate24);
        java.lang.Object obj26 = defaultedMap1.remove((java.lang.Object) predicate23);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue("'" + obj10 + "' != '" + (-1.0f) + "'", obj10.equals((-1.0f)));
        org.junit.Assert.assertTrue("'" + obj19 + "' != '" + (-1.0f) + "'", obj19.equals((-1.0f)));
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertNotNull(predicate24);
        org.junit.Assert.assertNotNull(map25);
        org.junit.Assert.assertNull(obj26);
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedOrderComparator10_Test0.test32");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (-1.0f));
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (-1.0f));
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) (-1.0f));
        java.lang.Object obj7 = defaultedMap5.get((java.lang.Object) (byte) -1);
        defaultedMap3.putAll((java.util.Map) defaultedMap5);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        int i10 = defaultedMap1.size();
        java.lang.String str11 = defaultedMap1.toString();
        org.junit.Assert.assertTrue("'" + obj7 + "' != '" + (-1.0f) + "'", obj7.equals((-1.0f)));
        org.junit.Assert.assertTrue(i10 == 0);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "{}" + "'", str11.equals("{}"));
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedOrderComparator10_Test0.test33");
        java.lang.Object[] obj_array0 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator1 = new collections.comparators.FixedOrderComparator(obj_array0);
        boolean b2 = fixedOrderComparator1.isLocked();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) (-1.0f));
        int i5 = defaultedMap4.size();
        java.lang.Object[] obj_array8 = new java.lang.Object[] { defaultedMap4, 0L, ' ' };
        collections.comparators.FixedOrderComparator fixedOrderComparator9 = new collections.comparators.FixedOrderComparator(obj_array8);
        boolean b10 = fixedOrderComparator1.add((java.lang.Object) fixedOrderComparator9);
        int i11 = fixedOrderComparator9.getUnknownObjectBehavior();
        org.junit.Assert.assertNotNull(obj_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertNotNull(obj_array8);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertTrue(i11 == 2);
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedOrderComparator10_Test0.test34");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (-1.0f));
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (-1.0f));
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) (-1.0f));
        java.lang.Object obj7 = defaultedMap5.get((java.lang.Object) (byte) -1);
        defaultedMap3.putAll((java.util.Map) defaultedMap5);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) (-1.0f));
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) (-1.0f));
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) (-1.0f));
        java.lang.Object obj17 = defaultedMap15.get((java.lang.Object) (byte) -1);
        defaultedMap13.putAll((java.util.Map) defaultedMap15);
        defaultedMap11.putAll((java.util.Map) defaultedMap13);
        java.util.Map map21 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap13, (java.lang.Object) (byte) 0);
        java.lang.String str22 = defaultedMap13.toString();
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) (-1.0f));
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) (-1.0f));
        java.lang.Object obj28 = defaultedMap26.get((java.lang.Object) (byte) -1);
        defaultedMap24.putAll((java.util.Map) defaultedMap26);
        java.util.Set set30 = defaultedMap26.entrySet();
        int i31 = defaultedMap26.size();
        boolean b33 = defaultedMap26.containsKey((java.lang.Object) (byte) 0);
        boolean b34 = defaultedMap13.containsValue((java.lang.Object) (byte) 0);
        java.util.Map map35 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) (byte) 0);
        org.junit.Assert.assertTrue("'" + obj7 + "' != '" + (-1.0f) + "'", obj7.equals((-1.0f)));
        org.junit.Assert.assertTrue("'" + obj17 + "' != '" + (-1.0f) + "'", obj17.equals((-1.0f)));
        org.junit.Assert.assertNotNull(map21);
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "{}" + "'", str22.equals("{}"));
        org.junit.Assert.assertTrue("'" + obj28 + "' != '" + (-1.0f) + "'", obj28.equals((-1.0f)));
        org.junit.Assert.assertNotNull(set30);
        org.junit.Assert.assertTrue(i31 == 0);
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertNotNull(map35);
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedOrderComparator10_Test0.test35");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (-1.0f));
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (-1.0f));
        java.lang.Object obj5 = defaultedMap3.get((java.lang.Object) (byte) -1);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        java.util.Set set7 = defaultedMap3.entrySet();
        collections.Transformer transformer8 = null;
        try {
            java.util.Map map9 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap3, transformer8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + (-1.0f) + "'", obj5.equals((-1.0f)));
        org.junit.Assert.assertNotNull(set7);
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedOrderComparator10_Test0.test36");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (-1.0f));
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (-1.0f));
        java.lang.Object obj5 = defaultedMap3.get((java.lang.Object) (byte) -1);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) (-1.0f));
        java.util.Set set9 = defaultedMap8.keySet();
        java.lang.Object obj10 = defaultedMap1.get((java.lang.Object) set9);
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + (-1.0f) + "'", obj5.equals((-1.0f)));
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertTrue("'" + obj10 + "' != '" + (-1.0f) + "'", obj10.equals((-1.0f)));
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedOrderComparator10_Test0.test37");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (-1.0f));
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (-1.0f));
        java.lang.Object obj5 = defaultedMap3.get((java.lang.Object) (byte) -1);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) (-1.0f));
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) (-1.0f));
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) (-1.0f));
        java.lang.Object obj14 = defaultedMap12.get((java.lang.Object) (byte) -1);
        defaultedMap10.putAll((java.util.Map) defaultedMap12);
        defaultedMap8.putAll((java.util.Map) defaultedMap10);
        defaultedMap3.putAll((java.util.Map) defaultedMap10);
        boolean b18 = defaultedMap10.isEmpty();
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) (-1.0f));
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) (-1.0f));
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) (-1.0f));
        java.lang.Object obj26 = defaultedMap24.get((java.lang.Object) (byte) -1);
        defaultedMap22.putAll((java.util.Map) defaultedMap24);
        defaultedMap20.putAll((java.util.Map) defaultedMap22);
        java.util.Map map30 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap22, (java.lang.Object) (byte) 0);
        java.lang.String str31 = defaultedMap22.toString();
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) (-1.0f));
        java.util.Collection collection34 = defaultedMap33.values();
        java.util.Set set35 = defaultedMap33.entrySet();
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap((java.lang.Object) (-1.0f));
        java.lang.Object obj39 = defaultedMap37.get((java.lang.Object) (byte) -1);
        java.lang.Object obj40 = defaultedMap33.remove((java.lang.Object) (byte) -1);
        defaultedMap22.putAll((java.util.Map) defaultedMap33);
        collections.comparators.FixedOrderComparator fixedOrderComparator42 = new collections.comparators.FixedOrderComparator();
        boolean b43 = fixedOrderComparator42.isLocked();
        collections.comparators.FixedOrderComparator fixedOrderComparator44 = new collections.comparators.FixedOrderComparator();
        java.lang.Object[] obj_array45 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator46 = new collections.comparators.FixedOrderComparator(obj_array45);
        boolean b47 = fixedOrderComparator46.isLocked();
        collections.map.DefaultedMap defaultedMap49 = new collections.map.DefaultedMap((java.lang.Object) (-1.0f));
        int i50 = defaultedMap49.size();
        java.lang.Object[] obj_array53 = new java.lang.Object[] { defaultedMap49, 0L, ' ' };
        collections.comparators.FixedOrderComparator fixedOrderComparator54 = new collections.comparators.FixedOrderComparator(obj_array53);
        boolean b55 = fixedOrderComparator46.add((java.lang.Object) fixedOrderComparator54);
        boolean b56 = fixedOrderComparator44.add((java.lang.Object) fixedOrderComparator46);
        java.lang.Object obj57 = defaultedMap22.put((java.lang.Object) fixedOrderComparator42, (java.lang.Object) fixedOrderComparator44);
        collections.map.DefaultedMap defaultedMap59 = new collections.map.DefaultedMap((java.lang.Object) (-1.0f));
        collections.map.DefaultedMap defaultedMap61 = new collections.map.DefaultedMap((java.lang.Object) (-1.0f));
        java.lang.Object obj63 = defaultedMap61.get((java.lang.Object) (byte) -1);
        defaultedMap59.putAll((java.util.Map) defaultedMap61);
        collections.map.DefaultedMap defaultedMap66 = new collections.map.DefaultedMap((java.lang.Object) (-1.0f));
        collections.map.DefaultedMap defaultedMap68 = new collections.map.DefaultedMap((java.lang.Object) (-1.0f));
        collections.map.DefaultedMap defaultedMap70 = new collections.map.DefaultedMap((java.lang.Object) (-1.0f));
        java.lang.Object obj72 = defaultedMap70.get((java.lang.Object) (byte) -1);
        defaultedMap68.putAll((java.util.Map) defaultedMap70);
        defaultedMap66.putAll((java.util.Map) defaultedMap68);
        defaultedMap61.putAll((java.util.Map) defaultedMap68);
        collections.Predicate predicate76 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate77 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map78 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap68, predicate76, predicate77);
        boolean b79 = fixedOrderComparator42.add((java.lang.Object) predicate77);
        collections.map.DefaultedMap defaultedMap81 = new collections.map.DefaultedMap((java.lang.Object) (-1.0f));
        java.lang.Object obj83 = defaultedMap81.get((java.lang.Object) (byte) -1);
        java.util.Collection collection84 = defaultedMap81.values();
        java.lang.Object obj85 = defaultedMap10.put((java.lang.Object) b79, (java.lang.Object) defaultedMap81);
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + (-1.0f) + "'", obj5.equals((-1.0f)));
        org.junit.Assert.assertTrue("'" + obj14 + "' != '" + (-1.0f) + "'", obj14.equals((-1.0f)));
        org.junit.Assert.assertTrue(b18 == true);
        org.junit.Assert.assertTrue("'" + obj26 + "' != '" + (-1.0f) + "'", obj26.equals((-1.0f)));
        org.junit.Assert.assertNotNull(map30);
        org.junit.Assert.assertTrue("'" + str31 + "' != '" + "{}" + "'", str31.equals("{}"));
        org.junit.Assert.assertNotNull(collection34);
        org.junit.Assert.assertNotNull(set35);
        org.junit.Assert.assertTrue("'" + obj39 + "' != '" + (-1.0f) + "'", obj39.equals((-1.0f)));
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertTrue(b43 == false);
        org.junit.Assert.assertNotNull(obj_array45);
        org.junit.Assert.assertTrue(b47 == false);
        org.junit.Assert.assertTrue(i50 == 0);
        org.junit.Assert.assertNotNull(obj_array53);
        org.junit.Assert.assertTrue(b55 == true);
        org.junit.Assert.assertTrue(b56 == true);
        org.junit.Assert.assertNull(obj57);
        org.junit.Assert.assertTrue("'" + obj63 + "' != '" + (-1.0f) + "'", obj63.equals((-1.0f)));
        org.junit.Assert.assertTrue("'" + obj72 + "' != '" + (-1.0f) + "'", obj72.equals((-1.0f)));
        org.junit.Assert.assertNotNull(predicate76);
        org.junit.Assert.assertNotNull(predicate77);
        org.junit.Assert.assertNotNull(map78);
        org.junit.Assert.assertTrue(b79 == true);
        org.junit.Assert.assertTrue("'" + obj83 + "' != '" + (-1.0f) + "'", obj83.equals((-1.0f)));
        org.junit.Assert.assertNotNull(collection84);
        org.junit.Assert.assertNull(obj85);
    }

    @Test
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedOrderComparator10_Test0.test38");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (-1.0f));
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (-1.0f));
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) (-1.0f));
        java.lang.Object obj7 = defaultedMap5.get((java.lang.Object) (byte) -1);
        defaultedMap3.putAll((java.util.Map) defaultedMap5);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        java.util.Map map11 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap3, (java.lang.Object) (byte) 0);
        java.lang.String str12 = defaultedMap3.toString();
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) (-1.0f));
        java.util.Collection collection15 = defaultedMap14.values();
        java.util.Set set16 = defaultedMap14.entrySet();
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) (-1.0f));
        java.lang.Object obj20 = defaultedMap18.get((java.lang.Object) (byte) -1);
        java.lang.Object obj21 = defaultedMap14.remove((java.lang.Object) (byte) -1);
        defaultedMap3.putAll((java.util.Map) defaultedMap14);
        collections.comparators.FixedOrderComparator fixedOrderComparator23 = new collections.comparators.FixedOrderComparator();
        boolean b24 = fixedOrderComparator23.isLocked();
        collections.comparators.FixedOrderComparator fixedOrderComparator25 = new collections.comparators.FixedOrderComparator();
        java.lang.Object[] obj_array26 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator27 = new collections.comparators.FixedOrderComparator(obj_array26);
        boolean b28 = fixedOrderComparator27.isLocked();
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) (-1.0f));
        int i31 = defaultedMap30.size();
        java.lang.Object[] obj_array34 = new java.lang.Object[] { defaultedMap30, 0L, ' ' };
        collections.comparators.FixedOrderComparator fixedOrderComparator35 = new collections.comparators.FixedOrderComparator(obj_array34);
        boolean b36 = fixedOrderComparator27.add((java.lang.Object) fixedOrderComparator35);
        boolean b37 = fixedOrderComparator25.add((java.lang.Object) fixedOrderComparator27);
        java.lang.Object obj38 = defaultedMap3.put((java.lang.Object) fixedOrderComparator23, (java.lang.Object) fixedOrderComparator25);
        boolean b39 = fixedOrderComparator23.isLocked();
        org.junit.Assert.assertTrue("'" + obj7 + "' != '" + (-1.0f) + "'", obj7.equals((-1.0f)));
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "{}" + "'", str12.equals("{}"));
        org.junit.Assert.assertNotNull(collection15);
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertTrue("'" + obj20 + "' != '" + (-1.0f) + "'", obj20.equals((-1.0f)));
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertNotNull(obj_array26);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertTrue(i31 == 0);
        org.junit.Assert.assertNotNull(obj_array34);
        org.junit.Assert.assertTrue(b36 == true);
        org.junit.Assert.assertTrue(b37 == true);
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertTrue(b39 == false);
    }

    @Test
    public void test39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedOrderComparator10_Test0.test39");
        java.lang.Object[] obj_array0 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator1 = new collections.comparators.FixedOrderComparator(obj_array0);
        boolean b2 = fixedOrderComparator1.isLocked();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) (-1.0f));
        int i5 = defaultedMap4.size();
        java.lang.Object[] obj_array8 = new java.lang.Object[] { defaultedMap4, 0L, ' ' };
        collections.comparators.FixedOrderComparator fixedOrderComparator9 = new collections.comparators.FixedOrderComparator(obj_array8);
        boolean b10 = fixedOrderComparator1.add((java.lang.Object) fixedOrderComparator9);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) (-1.0f));
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) (-1.0f));
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) (-1.0f));
        java.lang.Object obj18 = defaultedMap16.get((java.lang.Object) (byte) -1);
        defaultedMap14.putAll((java.util.Map) defaultedMap16);
        defaultedMap12.putAll((java.util.Map) defaultedMap14);
        java.util.Map map22 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap14, (java.lang.Object) (byte) 0);
        java.lang.String str23 = defaultedMap14.toString();
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) (-1.0f));
        java.util.Collection collection26 = defaultedMap25.values();
        java.util.Set set27 = defaultedMap25.entrySet();
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) (-1.0f));
        java.lang.Object obj31 = defaultedMap29.get((java.lang.Object) (byte) -1);
        java.lang.Object obj32 = defaultedMap25.remove((java.lang.Object) (byte) -1);
        defaultedMap14.putAll((java.util.Map) defaultedMap25);
        collections.comparators.FixedOrderComparator fixedOrderComparator34 = new collections.comparators.FixedOrderComparator();
        boolean b35 = fixedOrderComparator34.isLocked();
        collections.comparators.FixedOrderComparator fixedOrderComparator36 = new collections.comparators.FixedOrderComparator();
        java.lang.Object[] obj_array37 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator38 = new collections.comparators.FixedOrderComparator(obj_array37);
        boolean b39 = fixedOrderComparator38.isLocked();
        collections.map.DefaultedMap defaultedMap41 = new collections.map.DefaultedMap((java.lang.Object) (-1.0f));
        int i42 = defaultedMap41.size();
        java.lang.Object[] obj_array45 = new java.lang.Object[] { defaultedMap41, 0L, ' ' };
        collections.comparators.FixedOrderComparator fixedOrderComparator46 = new collections.comparators.FixedOrderComparator(obj_array45);
        boolean b47 = fixedOrderComparator38.add((java.lang.Object) fixedOrderComparator46);
        boolean b48 = fixedOrderComparator36.add((java.lang.Object) fixedOrderComparator38);
        java.lang.Object obj49 = defaultedMap14.put((java.lang.Object) fixedOrderComparator34, (java.lang.Object) fixedOrderComparator36);
        boolean b50 = fixedOrderComparator9.add(obj49);
        org.junit.Assert.assertNotNull(obj_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertNotNull(obj_array8);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertTrue("'" + obj18 + "' != '" + (-1.0f) + "'", obj18.equals((-1.0f)));
        org.junit.Assert.assertNotNull(map22);
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "{}" + "'", str23.equals("{}"));
        org.junit.Assert.assertNotNull(collection26);
        org.junit.Assert.assertNotNull(set27);
        org.junit.Assert.assertTrue("'" + obj31 + "' != '" + (-1.0f) + "'", obj31.equals((-1.0f)));
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertTrue(b35 == false);
        org.junit.Assert.assertNotNull(obj_array37);
        org.junit.Assert.assertTrue(b39 == false);
        org.junit.Assert.assertTrue(i42 == 0);
        org.junit.Assert.assertNotNull(obj_array45);
        org.junit.Assert.assertTrue(b47 == true);
        org.junit.Assert.assertTrue(b48 == true);
        org.junit.Assert.assertNull(obj49);
        org.junit.Assert.assertTrue(b50 == true);
    }

    @Test
    public void test40() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedOrderComparator10_Test0.test40");
        java.lang.Object[] obj_array0 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator1 = new collections.comparators.FixedOrderComparator(obj_array0);
        boolean b2 = fixedOrderComparator1.isLocked();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) (-1.0f));
        int i5 = defaultedMap4.size();
        java.lang.Object[] obj_array8 = new java.lang.Object[] { defaultedMap4, 0L, ' ' };
        collections.comparators.FixedOrderComparator fixedOrderComparator9 = new collections.comparators.FixedOrderComparator(obj_array8);
        boolean b10 = fixedOrderComparator1.add((java.lang.Object) fixedOrderComparator9);
        fixedOrderComparator9.checkLocked();
        org.junit.Assert.assertNotNull(obj_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertNotNull(obj_array8);
        org.junit.Assert.assertTrue(b10 == true);
    }

    @Test
    public void test41() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedOrderComparator10_Test0.test41");
        java.lang.Object[] obj_array0 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator1 = new collections.comparators.FixedOrderComparator(obj_array0);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (-1.0f));
        java.util.Collection collection4 = defaultedMap3.values();
        boolean b6 = defaultedMap3.containsValue((java.lang.Object) 100.0f);
        java.lang.Object[] obj_array7 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator8 = new collections.comparators.FixedOrderComparator(obj_array7);
        collections.comparators.FixedOrderComparator fixedOrderComparator9 = new collections.comparators.FixedOrderComparator(obj_array7);
        try {
            boolean b10 = fixedOrderComparator1.addAsEqual((java.lang.Object) 100.0f, (java.lang.Object) obj_array7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(obj_array0);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNotNull(obj_array7);
    }

    @Test
    public void test42() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedOrderComparator10_Test0.test42");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (-1.0f));
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (-1.0f));
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) (-1.0f));
        java.lang.Object obj7 = defaultedMap5.get((java.lang.Object) (byte) -1);
        defaultedMap3.putAll((java.util.Map) defaultedMap5);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        java.util.Map map11 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap3, (java.lang.Object) (byte) 0);
        java.lang.String str12 = defaultedMap3.toString();
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) (-1.0f));
        java.util.Collection collection15 = defaultedMap14.values();
        java.util.Set set16 = defaultedMap14.entrySet();
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) (-1.0f));
        java.lang.Object obj20 = defaultedMap18.get((java.lang.Object) (byte) -1);
        java.lang.Object obj21 = defaultedMap14.remove((java.lang.Object) (byte) -1);
        defaultedMap3.putAll((java.util.Map) defaultedMap14);
        collections.comparators.FixedOrderComparator fixedOrderComparator23 = new collections.comparators.FixedOrderComparator();
        boolean b24 = fixedOrderComparator23.isLocked();
        collections.comparators.FixedOrderComparator fixedOrderComparator25 = new collections.comparators.FixedOrderComparator();
        java.lang.Object[] obj_array26 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator27 = new collections.comparators.FixedOrderComparator(obj_array26);
        boolean b28 = fixedOrderComparator27.isLocked();
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) (-1.0f));
        int i31 = defaultedMap30.size();
        java.lang.Object[] obj_array34 = new java.lang.Object[] { defaultedMap30, 0L, ' ' };
        collections.comparators.FixedOrderComparator fixedOrderComparator35 = new collections.comparators.FixedOrderComparator(obj_array34);
        boolean b36 = fixedOrderComparator27.add((java.lang.Object) fixedOrderComparator35);
        boolean b37 = fixedOrderComparator25.add((java.lang.Object) fixedOrderComparator27);
        java.lang.Object obj38 = defaultedMap3.put((java.lang.Object) fixedOrderComparator23, (java.lang.Object) fixedOrderComparator25);
        collections.Factory factory39 = null;
        try {
            java.util.Map map40 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap3, factory39);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + obj7 + "' != '" + (-1.0f) + "'", obj7.equals((-1.0f)));
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "{}" + "'", str12.equals("{}"));
        org.junit.Assert.assertNotNull(collection15);
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertTrue("'" + obj20 + "' != '" + (-1.0f) + "'", obj20.equals((-1.0f)));
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertNotNull(obj_array26);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertTrue(i31 == 0);
        org.junit.Assert.assertNotNull(obj_array34);
        org.junit.Assert.assertTrue(b36 == true);
        org.junit.Assert.assertTrue(b37 == true);
        org.junit.Assert.assertNull(obj38);
    }

    @Test
    public void test43() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedOrderComparator10_Test0.test43");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        int i1 = fixedOrderComparator0.getUnknownObjectBehavior();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) (-1.0f));
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) (-1.0f));
        java.lang.Object obj8 = defaultedMap6.get((java.lang.Object) (byte) -1);
        defaultedMap4.putAll((java.util.Map) defaultedMap6);
        java.util.Set set10 = defaultedMap6.entrySet();
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap6);
        try {
            int i12 = fixedOrderComparator0.compare((java.lang.Object) '#', (java.lang.Object) defaultedMap6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(i1 == 2);
        org.junit.Assert.assertTrue("'" + obj8 + "' != '" + (-1.0f) + "'", obj8.equals((-1.0f)));
        org.junit.Assert.assertNotNull(set10);
    }

    @Test
    public void test44() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedOrderComparator10_Test0.test44");
        java.lang.Object[] obj_array0 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator1 = new collections.comparators.FixedOrderComparator(obj_array0);
        collections.comparators.FixedOrderComparator fixedOrderComparator2 = new collections.comparators.FixedOrderComparator(obj_array0);
        boolean b3 = fixedOrderComparator2.isLocked();
        boolean b5 = fixedOrderComparator2.add((java.lang.Object) 10.0d);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) (-1.0f));
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) (-1.0f));
        java.lang.Object obj11 = defaultedMap9.get((java.lang.Object) (byte) -1);
        defaultedMap7.putAll((java.util.Map) defaultedMap9);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) (-1.0f));
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) (-1.0f));
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) (-1.0f));
        java.lang.Object obj20 = defaultedMap18.get((java.lang.Object) (byte) -1);
        defaultedMap16.putAll((java.util.Map) defaultedMap18);
        defaultedMap14.putAll((java.util.Map) defaultedMap16);
        defaultedMap9.putAll((java.util.Map) defaultedMap16);
        boolean b24 = defaultedMap16.isEmpty();
        java.lang.Object obj26 = defaultedMap16.get((java.lang.Object) (short) 10);
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) (-1.0f));
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) (-1.0f));
        java.lang.Object obj32 = defaultedMap30.get((java.lang.Object) (byte) -1);
        defaultedMap28.putAll((java.util.Map) defaultedMap30);
        java.util.Set set34 = defaultedMap30.entrySet();
        int i35 = defaultedMap30.size();
        boolean b36 = defaultedMap30.isEmpty();
        try {
            int i37 = fixedOrderComparator2.compare((java.lang.Object) (short) 10, (java.lang.Object) defaultedMap30);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(obj_array0);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue("'" + obj11 + "' != '" + (-1.0f) + "'", obj11.equals((-1.0f)));
        org.junit.Assert.assertTrue("'" + obj20 + "' != '" + (-1.0f) + "'", obj20.equals((-1.0f)));
        org.junit.Assert.assertTrue(b24 == true);
        org.junit.Assert.assertTrue("'" + obj26 + "' != '" + (-1.0f) + "'", obj26.equals((-1.0f)));
        org.junit.Assert.assertTrue("'" + obj32 + "' != '" + (-1.0f) + "'", obj32.equals((-1.0f)));
        org.junit.Assert.assertNotNull(set34);
        org.junit.Assert.assertTrue(i35 == 0);
        org.junit.Assert.assertTrue(b36 == true);
    }

    @Test
    public void test45() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedOrderComparator10_Test0.test45");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (-1.0f));
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (-1.0f));
        java.lang.Object obj5 = defaultedMap3.get((java.lang.Object) (byte) -1);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        java.util.Set set7 = defaultedMap3.entrySet();
        int i8 = defaultedMap3.size();
        boolean b9 = defaultedMap3.isEmpty();
        collections.Transformer transformer10 = null;
        try {
            java.util.Map map11 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap3, transformer10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + (-1.0f) + "'", obj5.equals((-1.0f)));
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertTrue(b9 == true);
    }

    @Test
    public void test46() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedOrderComparator10_Test0.test46");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (-1.0f));
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (-1.0f));
        java.lang.Object obj5 = defaultedMap3.get((java.lang.Object) (byte) -1);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        boolean b8 = defaultedMap3.containsValue((java.lang.Object) (-1.0f));
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + (-1.0f) + "'", obj5.equals((-1.0f)));
        org.junit.Assert.assertTrue(b8 == false);
    }

    @Test
    public void test47() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedOrderComparator10_Test0.test47");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (-1.0f));
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (-1.0f));
        java.lang.Object obj5 = defaultedMap3.get((java.lang.Object) (byte) -1);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) (-1.0f));
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) (-1.0f));
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) (-1.0f));
        java.lang.Object obj14 = defaultedMap12.get((java.lang.Object) (byte) -1);
        defaultedMap10.putAll((java.util.Map) defaultedMap12);
        defaultedMap8.putAll((java.util.Map) defaultedMap10);
        defaultedMap3.putAll((java.util.Map) defaultedMap10);
        java.lang.Object obj19 = defaultedMap3.get((java.lang.Object) false);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) (-1.0f));
        java.lang.Object obj23 = defaultedMap21.get((java.lang.Object) (byte) -1);
        java.util.Collection collection24 = defaultedMap21.values();
        boolean b25 = defaultedMap3.equals((java.lang.Object) defaultedMap21);
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + (-1.0f) + "'", obj5.equals((-1.0f)));
        org.junit.Assert.assertTrue("'" + obj14 + "' != '" + (-1.0f) + "'", obj14.equals((-1.0f)));
        org.junit.Assert.assertTrue("'" + obj19 + "' != '" + (-1.0f) + "'", obj19.equals((-1.0f)));
        org.junit.Assert.assertTrue("'" + obj23 + "' != '" + (-1.0f) + "'", obj23.equals((-1.0f)));
        org.junit.Assert.assertNotNull(collection24);
        org.junit.Assert.assertTrue(b25 == true);
    }

    @Test
    public void test48() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedOrderComparator10_Test0.test48");
        java.lang.Object[] obj_array0 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator1 = new collections.comparators.FixedOrderComparator(obj_array0);
        collections.comparators.FixedOrderComparator fixedOrderComparator2 = new collections.comparators.FixedOrderComparator(obj_array0);
        boolean b3 = fixedOrderComparator2.isLocked();
        boolean b5 = fixedOrderComparator2.add((java.lang.Object) 10.0d);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) (-1.0f));
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) (-1.0f));
        java.lang.Object obj11 = defaultedMap9.get((java.lang.Object) (byte) -1);
        defaultedMap7.putAll((java.util.Map) defaultedMap9);
        java.util.Set set13 = defaultedMap7.keySet();
        java.lang.Object[] obj_array14 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator15 = new collections.comparators.FixedOrderComparator(obj_array14);
        try {
            boolean b16 = fixedOrderComparator2.addAsEqual((java.lang.Object) defaultedMap7, (java.lang.Object) obj_array14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(obj_array0);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue("'" + obj11 + "' != '" + (-1.0f) + "'", obj11.equals((-1.0f)));
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertNotNull(obj_array14);
    }

    @Test
    public void test49() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedOrderComparator10_Test0.test49");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (-1.0f));
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (-1.0f));
        java.lang.Object obj5 = defaultedMap3.get((java.lang.Object) (byte) -1);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        java.util.Set set7 = defaultedMap3.entrySet();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap3);
        collections.Factory factory9 = null;
        try {
            java.util.Map map10 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap8, factory9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + (-1.0f) + "'", obj5.equals((-1.0f)));
        org.junit.Assert.assertNotNull(set7);
    }

    @Test
    public void test50() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedOrderComparator10_Test0.test50");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (-1.0f));
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (-1.0f));
        java.lang.Object obj5 = defaultedMap3.get((java.lang.Object) (byte) -1);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) (-1.0f));
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) (-1.0f));
        java.lang.Object obj13 = defaultedMap11.get((java.lang.Object) (byte) -1);
        defaultedMap9.putAll((java.util.Map) defaultedMap11);
        java.lang.Object obj15 = defaultedMap3.put((java.lang.Object) (short) 1, (java.lang.Object) defaultedMap11);
        java.lang.String str16 = defaultedMap11.toString();
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + (-1.0f) + "'", obj5.equals((-1.0f)));
        org.junit.Assert.assertTrue("'" + obj13 + "' != '" + (-1.0f) + "'", obj13.equals((-1.0f)));
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "{}" + "'", str16.equals("{}"));
    }

    @Test
    public void test51() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedOrderComparator10_Test0.test51");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (-1.0f));
        java.util.Collection collection2 = defaultedMap1.values();
        java.util.Set set3 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) (-1.0f));
        java.lang.Object obj7 = defaultedMap5.get((java.lang.Object) (byte) -1);
        java.lang.Object obj8 = defaultedMap1.remove((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) (-1.0f));
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) (-1.0f));
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) (-1.0f));
        java.lang.Object obj16 = defaultedMap14.get((java.lang.Object) (byte) -1);
        defaultedMap12.putAll((java.util.Map) defaultedMap14);
        defaultedMap10.putAll((java.util.Map) defaultedMap12);
        boolean b19 = defaultedMap12.isEmpty();
        boolean b20 = defaultedMap1.equals((java.lang.Object) defaultedMap12);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) (-1.0f));
        java.lang.Object obj24 = defaultedMap22.get((java.lang.Object) (byte) -1);
        collections.Predicate predicate25 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) (-1.0f));
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) (-1.0f));
        java.lang.Object obj31 = defaultedMap29.get((java.lang.Object) (byte) -1);
        defaultedMap27.putAll((java.util.Map) defaultedMap29);
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) (-1.0f));
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) (-1.0f));
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) (-1.0f));
        java.lang.Object obj40 = defaultedMap38.get((java.lang.Object) (byte) -1);
        defaultedMap36.putAll((java.util.Map) defaultedMap38);
        defaultedMap34.putAll((java.util.Map) defaultedMap36);
        defaultedMap29.putAll((java.util.Map) defaultedMap36);
        collections.Predicate predicate44 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate45 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map46 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap36, predicate44, predicate45);
        java.util.Map map47 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap22, predicate25, predicate44);
        java.lang.Object obj48 = defaultedMap1.get((java.lang.Object) map47);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertTrue("'" + obj7 + "' != '" + (-1.0f) + "'", obj7.equals((-1.0f)));
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue("'" + obj16 + "' != '" + (-1.0f) + "'", obj16.equals((-1.0f)));
        org.junit.Assert.assertTrue(b19 == true);
        org.junit.Assert.assertTrue(b20 == true);
        org.junit.Assert.assertTrue("'" + obj24 + "' != '" + (-1.0f) + "'", obj24.equals((-1.0f)));
        org.junit.Assert.assertNotNull(predicate25);
        org.junit.Assert.assertTrue("'" + obj31 + "' != '" + (-1.0f) + "'", obj31.equals((-1.0f)));
        org.junit.Assert.assertTrue("'" + obj40 + "' != '" + (-1.0f) + "'", obj40.equals((-1.0f)));
        org.junit.Assert.assertNotNull(predicate44);
        org.junit.Assert.assertNotNull(predicate45);
        org.junit.Assert.assertNotNull(map46);
        org.junit.Assert.assertNotNull(map47);
        org.junit.Assert.assertTrue("'" + obj48 + "' != '" + (-1.0f) + "'", obj48.equals((-1.0f)));
    }

    @Test
    public void test52() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedOrderComparator10_Test0.test52");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (-1.0f));
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (-1.0f));
        java.lang.Object obj5 = defaultedMap3.get((java.lang.Object) (byte) -1);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) (-1.0f));
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) (-1.0f));
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) (-1.0f));
        java.lang.Object obj14 = defaultedMap12.get((java.lang.Object) (byte) -1);
        defaultedMap10.putAll((java.util.Map) defaultedMap12);
        defaultedMap8.putAll((java.util.Map) defaultedMap10);
        defaultedMap3.putAll((java.util.Map) defaultedMap10);
        boolean b18 = defaultedMap3.isEmpty();
        boolean b19 = defaultedMap3.isEmpty();
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + (-1.0f) + "'", obj5.equals((-1.0f)));
        org.junit.Assert.assertTrue("'" + obj14 + "' != '" + (-1.0f) + "'", obj14.equals((-1.0f)));
        org.junit.Assert.assertTrue(b18 == true);
        org.junit.Assert.assertTrue(b19 == true);
    }

    @Test
    public void test53() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedOrderComparator10_Test0.test53");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (-1.0f));
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (-1.0f));
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) (-1.0f));
        java.lang.Object obj7 = defaultedMap5.get((java.lang.Object) (byte) -1);
        defaultedMap3.putAll((java.util.Map) defaultedMap5);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        java.util.Map map11 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap3, (java.lang.Object) (byte) 0);
        boolean b12 = defaultedMap3.isEmpty();
        org.junit.Assert.assertTrue("'" + obj7 + "' != '" + (-1.0f) + "'", obj7.equals((-1.0f)));
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertTrue(b12 == true);
    }

    @Test
    public void test54() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedOrderComparator10_Test0.test54");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (-1.0f));
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (-1.0f));
        java.lang.Object obj5 = defaultedMap3.get((java.lang.Object) (byte) -1);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) (-1.0f));
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) (-1.0f));
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) (-1.0f));
        java.lang.Object obj14 = defaultedMap12.get((java.lang.Object) (byte) -1);
        defaultedMap10.putAll((java.util.Map) defaultedMap12);
        defaultedMap8.putAll((java.util.Map) defaultedMap10);
        defaultedMap3.putAll((java.util.Map) defaultedMap10);
        java.lang.Object obj19 = defaultedMap3.get((java.lang.Object) 10.0f);
        java.lang.String str20 = defaultedMap3.toString();
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + (-1.0f) + "'", obj5.equals((-1.0f)));
        org.junit.Assert.assertTrue("'" + obj14 + "' != '" + (-1.0f) + "'", obj14.equals((-1.0f)));
        org.junit.Assert.assertTrue("'" + obj19 + "' != '" + (-1.0f) + "'", obj19.equals((-1.0f)));
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "{}" + "'", str20.equals("{}"));
    }

    @Test
    public void test55() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedOrderComparator10_Test0.test55");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (-1.0f));
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (-1.0f));
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) (-1.0f));
        java.lang.Object obj7 = defaultedMap5.get((java.lang.Object) (byte) -1);
        defaultedMap3.putAll((java.util.Map) defaultedMap5);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        java.util.Map map11 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap3, (java.lang.Object) (byte) 0);
        java.lang.String str12 = defaultedMap3.toString();
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) (-1.0f));
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) (-1.0f));
        java.lang.Object obj18 = defaultedMap16.get((java.lang.Object) (byte) -1);
        defaultedMap14.putAll((java.util.Map) defaultedMap16);
        java.util.Set set20 = defaultedMap16.entrySet();
        int i21 = defaultedMap16.size();
        boolean b23 = defaultedMap16.containsKey((java.lang.Object) (byte) 0);
        boolean b24 = defaultedMap3.containsValue((java.lang.Object) (byte) 0);
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) (-1.0f));
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) (-1.0f));
        java.lang.Object obj30 = defaultedMap28.get((java.lang.Object) (byte) -1);
        defaultedMap26.putAll((java.util.Map) defaultedMap28);
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) (-1.0f));
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) (-1.0f));
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap((java.lang.Object) (-1.0f));
        java.lang.Object obj39 = defaultedMap37.get((java.lang.Object) (byte) -1);
        defaultedMap35.putAll((java.util.Map) defaultedMap37);
        defaultedMap33.putAll((java.util.Map) defaultedMap35);
        defaultedMap28.putAll((java.util.Map) defaultedMap35);
        collections.Predicate predicate43 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate44 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map45 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap35, predicate43, predicate44);
        collections.map.DefaultedMap defaultedMap47 = new collections.map.DefaultedMap((java.lang.Object) (-1.0f));
        collections.map.DefaultedMap defaultedMap49 = new collections.map.DefaultedMap((java.lang.Object) (-1.0f));
        collections.map.DefaultedMap defaultedMap51 = new collections.map.DefaultedMap((java.lang.Object) (-1.0f));
        java.lang.Object obj53 = defaultedMap51.get((java.lang.Object) (byte) -1);
        defaultedMap49.putAll((java.util.Map) defaultedMap51);
        defaultedMap47.putAll((java.util.Map) defaultedMap49);
        java.util.Map map57 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap49, (java.lang.Object) (byte) 0);
        java.lang.String str58 = defaultedMap49.toString();
        collections.map.DefaultedMap defaultedMap60 = new collections.map.DefaultedMap((java.lang.Object) (-1.0f));
        java.util.Collection collection61 = defaultedMap60.values();
        java.util.Set set62 = defaultedMap60.entrySet();
        collections.map.DefaultedMap defaultedMap64 = new collections.map.DefaultedMap((java.lang.Object) (-1.0f));
        java.lang.Object obj66 = defaultedMap64.get((java.lang.Object) (byte) -1);
        java.lang.Object obj67 = defaultedMap60.remove((java.lang.Object) (byte) -1);
        defaultedMap49.putAll((java.util.Map) defaultedMap60);
        collections.comparators.FixedOrderComparator fixedOrderComparator69 = new collections.comparators.FixedOrderComparator();
        boolean b70 = fixedOrderComparator69.isLocked();
        collections.comparators.FixedOrderComparator fixedOrderComparator71 = new collections.comparators.FixedOrderComparator();
        java.lang.Object[] obj_array72 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator73 = new collections.comparators.FixedOrderComparator(obj_array72);
        boolean b74 = fixedOrderComparator73.isLocked();
        collections.map.DefaultedMap defaultedMap76 = new collections.map.DefaultedMap((java.lang.Object) (-1.0f));
        int i77 = defaultedMap76.size();
        java.lang.Object[] obj_array80 = new java.lang.Object[] { defaultedMap76, 0L, ' ' };
        collections.comparators.FixedOrderComparator fixedOrderComparator81 = new collections.comparators.FixedOrderComparator(obj_array80);
        boolean b82 = fixedOrderComparator73.add((java.lang.Object) fixedOrderComparator81);
        boolean b83 = fixedOrderComparator71.add((java.lang.Object) fixedOrderComparator73);
        java.lang.Object obj84 = defaultedMap49.put((java.lang.Object) fixedOrderComparator69, (java.lang.Object) fixedOrderComparator71);
        java.lang.Object obj85 = defaultedMap35.get(obj84);
        boolean b86 = defaultedMap3.containsValue(obj85);
        org.junit.Assert.assertTrue("'" + obj7 + "' != '" + (-1.0f) + "'", obj7.equals((-1.0f)));
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "{}" + "'", str12.equals("{}"));
        org.junit.Assert.assertTrue("'" + obj18 + "' != '" + (-1.0f) + "'", obj18.equals((-1.0f)));
        org.junit.Assert.assertNotNull(set20);
        org.junit.Assert.assertTrue(i21 == 0);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertTrue("'" + obj30 + "' != '" + (-1.0f) + "'", obj30.equals((-1.0f)));
        org.junit.Assert.assertTrue("'" + obj39 + "' != '" + (-1.0f) + "'", obj39.equals((-1.0f)));
        org.junit.Assert.assertNotNull(predicate43);
        org.junit.Assert.assertNotNull(predicate44);
        org.junit.Assert.assertNotNull(map45);
        org.junit.Assert.assertTrue("'" + obj53 + "' != '" + (-1.0f) + "'", obj53.equals((-1.0f)));
        org.junit.Assert.assertNotNull(map57);
        org.junit.Assert.assertTrue("'" + str58 + "' != '" + "{}" + "'", str58.equals("{}"));
        org.junit.Assert.assertNotNull(collection61);
        org.junit.Assert.assertNotNull(set62);
        org.junit.Assert.assertTrue("'" + obj66 + "' != '" + (-1.0f) + "'", obj66.equals((-1.0f)));
        org.junit.Assert.assertNull(obj67);
        org.junit.Assert.assertTrue(b70 == false);
        org.junit.Assert.assertNotNull(obj_array72);
        org.junit.Assert.assertTrue(b74 == false);
        org.junit.Assert.assertTrue(i77 == 0);
        org.junit.Assert.assertNotNull(obj_array80);
        org.junit.Assert.assertTrue(b82 == true);
        org.junit.Assert.assertTrue(b83 == true);
        org.junit.Assert.assertNull(obj84);
        org.junit.Assert.assertTrue("'" + obj85 + "' != '" + (-1.0f) + "'", obj85.equals((-1.0f)));
        org.junit.Assert.assertTrue(b86 == false);
    }

    @Test
    public void test56() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedOrderComparator10_Test0.test56");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (-1.0f));
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (-1.0f));
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) (-1.0f));
        java.lang.Object obj7 = defaultedMap5.get((java.lang.Object) (byte) -1);
        defaultedMap3.putAll((java.util.Map) defaultedMap5);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        java.util.Map map11 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap3, (java.lang.Object) (byte) 0);
        java.lang.String str12 = defaultedMap3.toString();
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) (-1.0f));
        java.util.Collection collection15 = defaultedMap14.values();
        java.util.Set set16 = defaultedMap14.entrySet();
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) (-1.0f));
        java.lang.Object obj20 = defaultedMap18.get((java.lang.Object) (byte) -1);
        java.lang.Object obj21 = defaultedMap14.remove((java.lang.Object) (byte) -1);
        defaultedMap3.putAll((java.util.Map) defaultedMap14);
        collections.comparators.FixedOrderComparator fixedOrderComparator23 = new collections.comparators.FixedOrderComparator();
        boolean b24 = fixedOrderComparator23.isLocked();
        collections.comparators.FixedOrderComparator fixedOrderComparator25 = new collections.comparators.FixedOrderComparator();
        java.lang.Object[] obj_array26 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator27 = new collections.comparators.FixedOrderComparator(obj_array26);
        boolean b28 = fixedOrderComparator27.isLocked();
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) (-1.0f));
        int i31 = defaultedMap30.size();
        java.lang.Object[] obj_array34 = new java.lang.Object[] { defaultedMap30, 0L, ' ' };
        collections.comparators.FixedOrderComparator fixedOrderComparator35 = new collections.comparators.FixedOrderComparator(obj_array34);
        boolean b36 = fixedOrderComparator27.add((java.lang.Object) fixedOrderComparator35);
        boolean b37 = fixedOrderComparator25.add((java.lang.Object) fixedOrderComparator27);
        java.lang.Object obj38 = defaultedMap3.put((java.lang.Object) fixedOrderComparator23, (java.lang.Object) fixedOrderComparator25);
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap((java.lang.Object) (-1.0f));
        java.util.Collection collection41 = defaultedMap40.values();
        java.lang.Object obj43 = defaultedMap40.remove((java.lang.Object) 100);
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap((java.lang.Object) (-1.0f));
        collections.map.DefaultedMap defaultedMap47 = new collections.map.DefaultedMap((java.lang.Object) (-1.0f));
        collections.map.DefaultedMap defaultedMap49 = new collections.map.DefaultedMap((java.lang.Object) (-1.0f));
        java.lang.Object obj51 = defaultedMap49.get((java.lang.Object) (byte) -1);
        defaultedMap47.putAll((java.util.Map) defaultedMap49);
        defaultedMap45.putAll((java.util.Map) defaultedMap47);
        java.util.Map map55 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap47, (java.lang.Object) (byte) 0);
        java.lang.String str56 = defaultedMap47.toString();
        collections.map.DefaultedMap defaultedMap58 = new collections.map.DefaultedMap((java.lang.Object) (-1.0f));
        java.util.Collection collection59 = defaultedMap58.values();
        java.util.Set set60 = defaultedMap58.entrySet();
        collections.map.DefaultedMap defaultedMap62 = new collections.map.DefaultedMap((java.lang.Object) (-1.0f));
        java.lang.Object obj64 = defaultedMap62.get((java.lang.Object) (byte) -1);
        java.lang.Object obj65 = defaultedMap58.remove((java.lang.Object) (byte) -1);
        defaultedMap47.putAll((java.util.Map) defaultedMap58);
        boolean b67 = defaultedMap40.containsValue((java.lang.Object) defaultedMap58);
        boolean b68 = defaultedMap3.containsKey((java.lang.Object) defaultedMap58);
        org.junit.Assert.assertTrue("'" + obj7 + "' != '" + (-1.0f) + "'", obj7.equals((-1.0f)));
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "{}" + "'", str12.equals("{}"));
        org.junit.Assert.assertNotNull(collection15);
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertTrue("'" + obj20 + "' != '" + (-1.0f) + "'", obj20.equals((-1.0f)));
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertNotNull(obj_array26);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertTrue(i31 == 0);
        org.junit.Assert.assertNotNull(obj_array34);
        org.junit.Assert.assertTrue(b36 == true);
        org.junit.Assert.assertTrue(b37 == true);
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertNotNull(collection41);
        org.junit.Assert.assertNull(obj43);
        org.junit.Assert.assertTrue("'" + obj51 + "' != '" + (-1.0f) + "'", obj51.equals((-1.0f)));
        org.junit.Assert.assertNotNull(map55);
        org.junit.Assert.assertTrue("'" + str56 + "' != '" + "{}" + "'", str56.equals("{}"));
        org.junit.Assert.assertNotNull(collection59);
        org.junit.Assert.assertNotNull(set60);
        org.junit.Assert.assertTrue("'" + obj64 + "' != '" + (-1.0f) + "'", obj64.equals((-1.0f)));
        org.junit.Assert.assertNull(obj65);
        org.junit.Assert.assertTrue(b67 == false);
        org.junit.Assert.assertTrue(b68 == false);
    }

    @Test
    public void test57() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedOrderComparator10_Test0.test57");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (-1.0f));
        java.util.Collection collection2 = defaultedMap1.values();
        java.lang.Object obj4 = defaultedMap1.remove((java.lang.Object) 100);
        java.util.Collection collection5 = defaultedMap1.values();
        int i6 = defaultedMap1.size();
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertTrue(i6 == 0);
    }

    @Test
    public void test58() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedOrderComparator10_Test0.test58");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (-1.0f));
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (-1.0f));
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) (-1.0f));
        java.lang.Object obj7 = defaultedMap5.get((java.lang.Object) (byte) -1);
        defaultedMap3.putAll((java.util.Map) defaultedMap5);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        java.util.Map map11 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap3, (java.lang.Object) (byte) 0);
        java.lang.String str12 = defaultedMap3.toString();
        java.util.Set set13 = defaultedMap3.entrySet();
        org.junit.Assert.assertTrue("'" + obj7 + "' != '" + (-1.0f) + "'", obj7.equals((-1.0f)));
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "{}" + "'", str12.equals("{}"));
        org.junit.Assert.assertNotNull(set13);
    }

    @Test
    public void test59() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedOrderComparator10_Test0.test59");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (-1.0f));
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (-1.0f));
        java.lang.Object obj5 = defaultedMap3.get((java.lang.Object) (byte) -1);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        java.util.Set set7 = defaultedMap3.entrySet();
        int i8 = defaultedMap3.size();
        int i9 = defaultedMap3.size();
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + (-1.0f) + "'", obj5.equals((-1.0f)));
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertTrue(i9 == 0);
    }

    @Test
    public void test60() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedOrderComparator10_Test0.test60");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (-1.0f));
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (-1.0f));
        java.lang.Object obj5 = defaultedMap3.get((java.lang.Object) (byte) -1);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        java.util.Set set7 = defaultedMap3.entrySet();
        int i8 = defaultedMap3.size();
        boolean b10 = defaultedMap3.containsValue((java.lang.Object) ' ');
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + (-1.0f) + "'", obj5.equals((-1.0f)));
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertTrue(b10 == false);
    }

    @Test
    public void test61() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedOrderComparator10_Test0.test61");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (-1.0f));
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (-1.0f));
        java.lang.Object obj5 = defaultedMap3.get((java.lang.Object) (byte) -1);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        java.util.Set set7 = defaultedMap1.entrySet();
        java.lang.Object obj9 = defaultedMap1.get((java.lang.Object) 'a');
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + (-1.0f) + "'", obj5.equals((-1.0f)));
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + (-1.0f) + "'", obj9.equals((-1.0f)));
    }

    @Test
    public void test62() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedOrderComparator10_Test0.test62");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (-1.0f));
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (-1.0f));
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) (-1.0f));
        java.lang.Object obj7 = defaultedMap5.get((java.lang.Object) (byte) -1);
        defaultedMap3.putAll((java.util.Map) defaultedMap5);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        java.util.Map map11 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap3, (java.lang.Object) (byte) 0);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) (-1.0f));
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) (-1.0f));
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) (-1.0f));
        java.lang.Object obj19 = defaultedMap17.get((java.lang.Object) (byte) -1);
        defaultedMap15.putAll((java.util.Map) defaultedMap17);
        defaultedMap13.putAll((java.util.Map) defaultedMap15);
        int i22 = defaultedMap13.size();
        java.util.Collection collection23 = defaultedMap13.values();
        java.lang.Object obj24 = defaultedMap3.remove((java.lang.Object) collection23);
        org.junit.Assert.assertTrue("'" + obj7 + "' != '" + (-1.0f) + "'", obj7.equals((-1.0f)));
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertTrue("'" + obj19 + "' != '" + (-1.0f) + "'", obj19.equals((-1.0f)));
        org.junit.Assert.assertTrue(i22 == 0);
        org.junit.Assert.assertNotNull(collection23);
        org.junit.Assert.assertNull(obj24);
    }

    @Test
    public void test63() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedOrderComparator10_Test0.test63");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        fixedOrderComparator0.setUnknownObjectBehavior((int) (short) 0);
    }

    @Test
    public void test64() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedOrderComparator10_Test0.test64");
        java.lang.Object[] obj_array0 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator1 = new collections.comparators.FixedOrderComparator(obj_array0);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (-1.0f));
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) (-1.0f));
        java.lang.Object obj7 = defaultedMap5.get((java.lang.Object) (byte) -1);
        defaultedMap3.putAll((java.util.Map) defaultedMap5);
        java.lang.Object[] obj_array9 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator10 = new collections.comparators.FixedOrderComparator(obj_array9);
        boolean b11 = defaultedMap3.equals((java.lang.Object) obj_array9);
        java.util.Set set12 = defaultedMap3.keySet();
        boolean b13 = fixedOrderComparator1.add((java.lang.Object) set12);
        org.junit.Assert.assertNotNull(obj_array0);
        org.junit.Assert.assertTrue("'" + obj7 + "' != '" + (-1.0f) + "'", obj7.equals((-1.0f)));
        org.junit.Assert.assertNotNull(obj_array9);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNotNull(set12);
        org.junit.Assert.assertTrue(b13 == true);
    }

    @Test
    public void test65() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedOrderComparator10_Test0.test65");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (-1.0f));
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (-1.0f));
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) (-1.0f));
        java.lang.Object obj7 = defaultedMap5.get((java.lang.Object) (byte) -1);
        defaultedMap3.putAll((java.util.Map) defaultedMap5);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        java.util.Map map11 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap3, (java.lang.Object) (byte) 0);
        collections.Factory factory12 = null;
        try {
            java.util.Map map13 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap3, factory12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + obj7 + "' != '" + (-1.0f) + "'", obj7.equals((-1.0f)));
        org.junit.Assert.assertNotNull(map11);
    }

    @Test
    public void test66() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedOrderComparator10_Test0.test66");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (-1.0f));
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (-1.0f));
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) (-1.0f));
        java.lang.Object obj7 = defaultedMap5.get((java.lang.Object) (byte) -1);
        defaultedMap3.putAll((java.util.Map) defaultedMap5);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        java.util.Map map11 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap3, (java.lang.Object) (byte) 0);
        collections.Predicate predicate12 = collections.PredicateUtils.uniquePredicate();
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) (-1.0f));
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) (-1.0f));
        java.lang.Object obj18 = defaultedMap16.get((java.lang.Object) (byte) -1);
        defaultedMap14.putAll((java.util.Map) defaultedMap16);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) (-1.0f));
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) (-1.0f));
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) (-1.0f));
        java.lang.Object obj27 = defaultedMap25.get((java.lang.Object) (byte) -1);
        defaultedMap23.putAll((java.util.Map) defaultedMap25);
        defaultedMap21.putAll((java.util.Map) defaultedMap23);
        defaultedMap16.putAll((java.util.Map) defaultedMap23);
        collections.Predicate predicate31 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate32 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map33 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap23, predicate31, predicate32);
        java.util.Map map34 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap3, predicate12, predicate31);
        collections.Transformer transformer35 = null;
        try {
            java.util.Map map36 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap3, transformer35);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + obj7 + "' != '" + (-1.0f) + "'", obj7.equals((-1.0f)));
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertTrue("'" + obj18 + "' != '" + (-1.0f) + "'", obj18.equals((-1.0f)));
        org.junit.Assert.assertTrue("'" + obj27 + "' != '" + (-1.0f) + "'", obj27.equals((-1.0f)));
        org.junit.Assert.assertNotNull(predicate31);
        org.junit.Assert.assertNotNull(predicate32);
        org.junit.Assert.assertNotNull(map33);
        org.junit.Assert.assertNotNull(map34);
    }

    @Test
    public void test67() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedOrderComparator10_Test0.test67");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (-1.0f));
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (-1.0f));
        java.lang.Object obj5 = defaultedMap3.get((java.lang.Object) (byte) -1);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        java.lang.Object[] obj_array7 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator8 = new collections.comparators.FixedOrderComparator(obj_array7);
        boolean b9 = defaultedMap1.equals((java.lang.Object) obj_array7);
        collections.comparators.FixedOrderComparator fixedOrderComparator10 = new collections.comparators.FixedOrderComparator(obj_array7);
        collections.comparators.FixedOrderComparator fixedOrderComparator11 = new collections.comparators.FixedOrderComparator(obj_array7);
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + (-1.0f) + "'", obj5.equals((-1.0f)));
        org.junit.Assert.assertNotNull(obj_array7);
        org.junit.Assert.assertTrue(b9 == false);
    }

    @Test
    public void test68() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedOrderComparator10_Test0.test68");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (-1.0f));
        java.util.Collection collection2 = defaultedMap1.values();
        java.lang.Object obj4 = defaultedMap1.remove((java.lang.Object) 100);
        java.util.Collection collection5 = defaultedMap1.values();
        java.util.Set set6 = defaultedMap1.entrySet();
        boolean b8 = defaultedMap1.containsKey((java.lang.Object) (short) 100);
        java.util.Collection collection9 = defaultedMap1.values();
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) (-1.0f));
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) (-1.0f));
        java.lang.Object obj15 = defaultedMap13.get((java.lang.Object) (byte) -1);
        defaultedMap11.putAll((java.util.Map) defaultedMap13);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) (-1.0f));
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) (-1.0f));
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) (-1.0f));
        java.lang.Object obj24 = defaultedMap22.get((java.lang.Object) (byte) -1);
        defaultedMap20.putAll((java.util.Map) defaultedMap22);
        defaultedMap18.putAll((java.util.Map) defaultedMap20);
        defaultedMap13.putAll((java.util.Map) defaultedMap20);
        java.lang.Object obj29 = defaultedMap13.get((java.lang.Object) 10.0f);
        java.lang.Object obj31 = defaultedMap1.put(obj29, (java.lang.Object) 1L);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertTrue("'" + obj15 + "' != '" + (-1.0f) + "'", obj15.equals((-1.0f)));
        org.junit.Assert.assertTrue("'" + obj24 + "' != '" + (-1.0f) + "'", obj24.equals((-1.0f)));
        org.junit.Assert.assertTrue("'" + obj29 + "' != '" + (-1.0f) + "'", obj29.equals((-1.0f)));
        org.junit.Assert.assertNull(obj31);
    }

    @Test
    public void test69() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedOrderComparator10_Test0.test69");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (-1.0f));
        java.util.Collection collection2 = defaultedMap1.values();
        java.lang.Object obj4 = defaultedMap1.remove((java.lang.Object) 100);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) (-1.0f));
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) (-1.0f));
        java.lang.Object obj10 = defaultedMap8.get((java.lang.Object) (byte) -1);
        defaultedMap6.putAll((java.util.Map) defaultedMap8);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) (-1.0f));
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) (-1.0f));
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) (-1.0f));
        java.lang.Object obj19 = defaultedMap17.get((java.lang.Object) (byte) -1);
        defaultedMap15.putAll((java.util.Map) defaultedMap17);
        defaultedMap13.putAll((java.util.Map) defaultedMap15);
        defaultedMap8.putAll((java.util.Map) defaultedMap15);
        boolean b23 = defaultedMap8.isEmpty();
        defaultedMap8.clear();
        java.lang.Object obj25 = defaultedMap1.get((java.lang.Object) defaultedMap8);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + obj10 + "' != '" + (-1.0f) + "'", obj10.equals((-1.0f)));
        org.junit.Assert.assertTrue("'" + obj19 + "' != '" + (-1.0f) + "'", obj19.equals((-1.0f)));
        org.junit.Assert.assertTrue(b23 == true);
        org.junit.Assert.assertTrue("'" + obj25 + "' != '" + (-1.0f) + "'", obj25.equals((-1.0f)));
    }

    @Test
    public void test70() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedOrderComparator10_Test0.test70");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (-1.0f));
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (-1.0f));
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) (-1.0f));
        java.lang.Object obj7 = defaultedMap5.get((java.lang.Object) (byte) -1);
        defaultedMap3.putAll((java.util.Map) defaultedMap5);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        java.util.Map map11 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap3, (java.lang.Object) (byte) 0);
        java.lang.String str12 = defaultedMap3.toString();
        java.util.Set set13 = defaultedMap3.keySet();
        java.lang.String str14 = defaultedMap3.toString();
        boolean b15 = defaultedMap3.isEmpty();
        java.lang.Object obj17 = defaultedMap3.get((java.lang.Object) 1);
        org.junit.Assert.assertTrue("'" + obj7 + "' != '" + (-1.0f) + "'", obj7.equals((-1.0f)));
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "{}" + "'", str12.equals("{}"));
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "{}" + "'", str14.equals("{}"));
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertTrue("'" + obj17 + "' != '" + (-1.0f) + "'", obj17.equals((-1.0f)));
    }

    @Test
    public void test71() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedOrderComparator10_Test0.test71");
        java.lang.Object[] obj_array0 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator1 = new collections.comparators.FixedOrderComparator(obj_array0);
        collections.comparators.FixedOrderComparator fixedOrderComparator2 = new collections.comparators.FixedOrderComparator(obj_array0);
        boolean b3 = fixedOrderComparator2.isLocked();
        fixedOrderComparator2.checkLocked();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) (-1.0f));
        java.util.Collection collection7 = defaultedMap6.values();
        java.util.Set set8 = defaultedMap6.entrySet();
        java.util.Set set9 = defaultedMap6.keySet();
        int i10 = defaultedMap6.size();
        boolean b11 = fixedOrderComparator2.add((java.lang.Object) defaultedMap6);
        org.junit.Assert.assertNotNull(obj_array0);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertTrue(i10 == 0);
        org.junit.Assert.assertTrue(b11 == true);
    }

    @Test
    public void test72() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedOrderComparator10_Test0.test72");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (-1.0f));
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (-1.0f));
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) (-1.0f));
        java.lang.Object obj7 = defaultedMap5.get((java.lang.Object) (byte) -1);
        defaultedMap3.putAll((java.util.Map) defaultedMap5);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        java.util.Map map11 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap3, (java.lang.Object) (byte) 0);
        java.lang.String str12 = defaultedMap3.toString();
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) (-1.0f));
        java.util.Collection collection15 = defaultedMap14.values();
        java.util.Set set16 = defaultedMap14.entrySet();
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) (-1.0f));
        java.lang.Object obj20 = defaultedMap18.get((java.lang.Object) (byte) -1);
        java.lang.Object obj21 = defaultedMap14.remove((java.lang.Object) (byte) -1);
        defaultedMap3.putAll((java.util.Map) defaultedMap14);
        collections.comparators.FixedOrderComparator fixedOrderComparator23 = new collections.comparators.FixedOrderComparator();
        boolean b24 = fixedOrderComparator23.isLocked();
        collections.comparators.FixedOrderComparator fixedOrderComparator25 = new collections.comparators.FixedOrderComparator();
        java.lang.Object[] obj_array26 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator27 = new collections.comparators.FixedOrderComparator(obj_array26);
        boolean b28 = fixedOrderComparator27.isLocked();
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) (-1.0f));
        int i31 = defaultedMap30.size();
        java.lang.Object[] obj_array34 = new java.lang.Object[] { defaultedMap30, 0L, ' ' };
        collections.comparators.FixedOrderComparator fixedOrderComparator35 = new collections.comparators.FixedOrderComparator(obj_array34);
        boolean b36 = fixedOrderComparator27.add((java.lang.Object) fixedOrderComparator35);
        boolean b37 = fixedOrderComparator25.add((java.lang.Object) fixedOrderComparator27);
        java.lang.Object obj38 = defaultedMap3.put((java.lang.Object) fixedOrderComparator23, (java.lang.Object) fixedOrderComparator25);
        fixedOrderComparator25.checkLocked();
        org.junit.Assert.assertTrue("'" + obj7 + "' != '" + (-1.0f) + "'", obj7.equals((-1.0f)));
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "{}" + "'", str12.equals("{}"));
        org.junit.Assert.assertNotNull(collection15);
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertTrue("'" + obj20 + "' != '" + (-1.0f) + "'", obj20.equals((-1.0f)));
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertNotNull(obj_array26);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertTrue(i31 == 0);
        org.junit.Assert.assertNotNull(obj_array34);
        org.junit.Assert.assertTrue(b36 == true);
        org.junit.Assert.assertTrue(b37 == true);
        org.junit.Assert.assertNull(obj38);
    }

    @Test
    public void test73() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedOrderComparator10_Test0.test73");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (-1.0f));
        int i2 = defaultedMap1.size();
        java.util.Set set3 = defaultedMap1.entrySet();
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertNotNull(set3);
    }

    @Test
    public void test74() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedOrderComparator10_Test0.test74");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (-1.0f));
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (-1.0f));
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) (-1.0f));
        java.lang.Object obj7 = defaultedMap5.get((java.lang.Object) (byte) -1);
        defaultedMap3.putAll((java.util.Map) defaultedMap5);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        java.util.Map map11 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap3, (java.lang.Object) (byte) 0);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) (-1.0f));
        java.lang.Object obj15 = defaultedMap13.get((java.lang.Object) (byte) -1);
        collections.Predicate predicate16 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) (-1.0f));
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) (-1.0f));
        java.lang.Object obj22 = defaultedMap20.get((java.lang.Object) (byte) -1);
        defaultedMap18.putAll((java.util.Map) defaultedMap20);
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) (-1.0f));
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) (-1.0f));
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) (-1.0f));
        java.lang.Object obj31 = defaultedMap29.get((java.lang.Object) (byte) -1);
        defaultedMap27.putAll((java.util.Map) defaultedMap29);
        defaultedMap25.putAll((java.util.Map) defaultedMap27);
        defaultedMap20.putAll((java.util.Map) defaultedMap27);
        collections.Predicate predicate35 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate36 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map37 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap27, predicate35, predicate36);
        java.util.Map map38 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap13, predicate16, predicate35);
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap((java.lang.Object) (-1.0f));
        java.lang.Object obj42 = defaultedMap40.get((java.lang.Object) (byte) -1);
        collections.Predicate predicate43 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap((java.lang.Object) (-1.0f));
        collections.map.DefaultedMap defaultedMap47 = new collections.map.DefaultedMap((java.lang.Object) (-1.0f));
        java.lang.Object obj49 = defaultedMap47.get((java.lang.Object) (byte) -1);
        defaultedMap45.putAll((java.util.Map) defaultedMap47);
        collections.map.DefaultedMap defaultedMap52 = new collections.map.DefaultedMap((java.lang.Object) (-1.0f));
        collections.map.DefaultedMap defaultedMap54 = new collections.map.DefaultedMap((java.lang.Object) (-1.0f));
        collections.map.DefaultedMap defaultedMap56 = new collections.map.DefaultedMap((java.lang.Object) (-1.0f));
        java.lang.Object obj58 = defaultedMap56.get((java.lang.Object) (byte) -1);
        defaultedMap54.putAll((java.util.Map) defaultedMap56);
        defaultedMap52.putAll((java.util.Map) defaultedMap54);
        defaultedMap47.putAll((java.util.Map) defaultedMap54);
        collections.Predicate predicate62 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate63 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map64 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap54, predicate62, predicate63);
        java.util.Map map65 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap40, predicate43, predicate62);
        java.util.Map map66 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap3, predicate35, predicate62);
        org.junit.Assert.assertTrue("'" + obj7 + "' != '" + (-1.0f) + "'", obj7.equals((-1.0f)));
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertTrue("'" + obj15 + "' != '" + (-1.0f) + "'", obj15.equals((-1.0f)));
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertTrue("'" + obj22 + "' != '" + (-1.0f) + "'", obj22.equals((-1.0f)));
        org.junit.Assert.assertTrue("'" + obj31 + "' != '" + (-1.0f) + "'", obj31.equals((-1.0f)));
        org.junit.Assert.assertNotNull(predicate35);
        org.junit.Assert.assertNotNull(predicate36);
        org.junit.Assert.assertNotNull(map37);
        org.junit.Assert.assertNotNull(map38);
        org.junit.Assert.assertTrue("'" + obj42 + "' != '" + (-1.0f) + "'", obj42.equals((-1.0f)));
        org.junit.Assert.assertNotNull(predicate43);
        org.junit.Assert.assertTrue("'" + obj49 + "' != '" + (-1.0f) + "'", obj49.equals((-1.0f)));
        org.junit.Assert.assertTrue("'" + obj58 + "' != '" + (-1.0f) + "'", obj58.equals((-1.0f)));
        org.junit.Assert.assertNotNull(predicate62);
        org.junit.Assert.assertNotNull(predicate63);
        org.junit.Assert.assertNotNull(map64);
        org.junit.Assert.assertNotNull(map65);
        org.junit.Assert.assertNotNull(map66);
    }

    @Test
    public void test75() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedOrderComparator10_Test0.test75");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (-1.0f));
        java.util.Collection collection2 = defaultedMap1.values();
        collections.Transformer transformer3 = null;
        try {
            java.util.Map map4 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(collection2);
    }

    @Test
    public void test76() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedOrderComparator10_Test0.test76");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (-1.0f));
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (-1.0f));
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) (-1.0f));
        java.lang.Object obj7 = defaultedMap5.get((java.lang.Object) (byte) -1);
        defaultedMap3.putAll((java.util.Map) defaultedMap5);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        java.util.Map map11 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap3, (java.lang.Object) (byte) 0);
        java.lang.String str12 = defaultedMap3.toString();
        java.util.Set set13 = defaultedMap3.keySet();
        java.lang.String str14 = defaultedMap3.toString();
        boolean b15 = defaultedMap3.isEmpty();
        java.util.Set set16 = defaultedMap3.entrySet();
        org.junit.Assert.assertTrue("'" + obj7 + "' != '" + (-1.0f) + "'", obj7.equals((-1.0f)));
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "{}" + "'", str12.equals("{}"));
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "{}" + "'", str14.equals("{}"));
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertNotNull(set16);
    }

    @Test
    public void test77() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedOrderComparator10_Test0.test77");
        java.lang.Object[] obj_array0 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator1 = new collections.comparators.FixedOrderComparator(obj_array0);
        boolean b2 = fixedOrderComparator1.isLocked();
        boolean b3 = fixedOrderComparator1.isLocked();
        org.junit.Assert.assertNotNull(obj_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue(b3 == false);
    }

    @Test
    public void test78() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedOrderComparator10_Test0.test78");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        int i1 = fixedOrderComparator0.getUnknownObjectBehavior();
        int i2 = fixedOrderComparator0.getUnknownObjectBehavior();
        int i3 = fixedOrderComparator0.getUnknownObjectBehavior();
        org.junit.Assert.assertTrue(i1 == 2);
        org.junit.Assert.assertTrue(i2 == 2);
        org.junit.Assert.assertTrue(i3 == 2);
    }

    @Test
    public void test79() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedOrderComparator10_Test0.test79");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (-1.0f));
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (-1.0f));
        java.lang.Object obj5 = defaultedMap3.get((java.lang.Object) (byte) -1);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        java.util.Set set7 = defaultedMap3.entrySet();
        int i8 = defaultedMap3.size();
        java.lang.Object obj10 = defaultedMap3.remove((java.lang.Object) 10.0f);
        java.util.Collection collection11 = defaultedMap3.values();
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + (-1.0f) + "'", obj5.equals((-1.0f)));
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(collection11);
    }

    @Test
    public void test80() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedOrderComparator10_Test0.test80");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (-1.0f));
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (-1.0f));
        java.lang.Object obj5 = defaultedMap3.get((java.lang.Object) (byte) -1);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) (-1.0f));
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) (-1.0f));
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) (-1.0f));
        java.lang.Object obj14 = defaultedMap12.get((java.lang.Object) (byte) -1);
        defaultedMap10.putAll((java.util.Map) defaultedMap12);
        defaultedMap8.putAll((java.util.Map) defaultedMap10);
        defaultedMap3.putAll((java.util.Map) defaultedMap10);
        java.lang.Object obj19 = defaultedMap3.get((java.lang.Object) 10.0f);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) (-1.0f));
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) (-1.0f));
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) (-1.0f));
        java.lang.Object obj27 = defaultedMap25.get((java.lang.Object) (byte) -1);
        defaultedMap23.putAll((java.util.Map) defaultedMap25);
        defaultedMap21.putAll((java.util.Map) defaultedMap23);
        java.util.Map map31 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap23, (java.lang.Object) (byte) 0);
        collections.Predicate predicate32 = collections.PredicateUtils.uniquePredicate();
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) (-1.0f));
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) (-1.0f));
        java.lang.Object obj38 = defaultedMap36.get((java.lang.Object) (byte) -1);
        defaultedMap34.putAll((java.util.Map) defaultedMap36);
        collections.map.DefaultedMap defaultedMap41 = new collections.map.DefaultedMap((java.lang.Object) (-1.0f));
        collections.map.DefaultedMap defaultedMap43 = new collections.map.DefaultedMap((java.lang.Object) (-1.0f));
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap((java.lang.Object) (-1.0f));
        java.lang.Object obj47 = defaultedMap45.get((java.lang.Object) (byte) -1);
        defaultedMap43.putAll((java.util.Map) defaultedMap45);
        defaultedMap41.putAll((java.util.Map) defaultedMap43);
        defaultedMap36.putAll((java.util.Map) defaultedMap43);
        collections.Predicate predicate51 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate52 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map53 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap43, predicate51, predicate52);
        java.util.Map map54 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap23, predicate32, predicate51);
        boolean b55 = defaultedMap3.containsKey((java.lang.Object) defaultedMap23);
        collections.map.DefaultedMap defaultedMap57 = new collections.map.DefaultedMap((java.lang.Object) (-1.0f));
        java.util.Map map58 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap23, (java.lang.Object) (-1.0f));
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + (-1.0f) + "'", obj5.equals((-1.0f)));
        org.junit.Assert.assertTrue("'" + obj14 + "' != '" + (-1.0f) + "'", obj14.equals((-1.0f)));
        org.junit.Assert.assertTrue("'" + obj19 + "' != '" + (-1.0f) + "'", obj19.equals((-1.0f)));
        org.junit.Assert.assertTrue("'" + obj27 + "' != '" + (-1.0f) + "'", obj27.equals((-1.0f)));
        org.junit.Assert.assertNotNull(map31);
        org.junit.Assert.assertNotNull(predicate32);
        org.junit.Assert.assertTrue("'" + obj38 + "' != '" + (-1.0f) + "'", obj38.equals((-1.0f)));
        org.junit.Assert.assertTrue("'" + obj47 + "' != '" + (-1.0f) + "'", obj47.equals((-1.0f)));
        org.junit.Assert.assertNotNull(predicate51);
        org.junit.Assert.assertNotNull(predicate52);
        org.junit.Assert.assertNotNull(map53);
        org.junit.Assert.assertNotNull(map54);
        org.junit.Assert.assertTrue(b55 == false);
        org.junit.Assert.assertNotNull(map58);
    }

    @Test
    public void test81() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedOrderComparator10_Test0.test81");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (-1.0f));
        java.util.Collection collection2 = defaultedMap1.values();
        java.lang.Object obj4 = defaultedMap1.remove((java.lang.Object) 100);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) (-1.0f));
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) (-1.0f));
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) (-1.0f));
        java.lang.Object obj12 = defaultedMap10.get((java.lang.Object) (byte) -1);
        defaultedMap8.putAll((java.util.Map) defaultedMap10);
        defaultedMap6.putAll((java.util.Map) defaultedMap8);
        java.util.Map map16 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap8, (java.lang.Object) (byte) 0);
        java.lang.String str17 = defaultedMap8.toString();
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) (-1.0f));
        java.util.Collection collection20 = defaultedMap19.values();
        java.util.Set set21 = defaultedMap19.entrySet();
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) (-1.0f));
        java.lang.Object obj25 = defaultedMap23.get((java.lang.Object) (byte) -1);
        java.lang.Object obj26 = defaultedMap19.remove((java.lang.Object) (byte) -1);
        defaultedMap8.putAll((java.util.Map) defaultedMap19);
        boolean b28 = defaultedMap1.containsValue((java.lang.Object) defaultedMap19);
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) (-1.0f));
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) (-1.0f));
        java.lang.Object obj34 = defaultedMap32.get((java.lang.Object) (byte) -1);
        defaultedMap30.putAll((java.util.Map) defaultedMap32);
        java.util.Set set36 = defaultedMap32.entrySet();
        boolean b37 = defaultedMap1.equals((java.lang.Object) defaultedMap32);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + obj12 + "' != '" + (-1.0f) + "'", obj12.equals((-1.0f)));
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "{}" + "'", str17.equals("{}"));
        org.junit.Assert.assertNotNull(collection20);
        org.junit.Assert.assertNotNull(set21);
        org.junit.Assert.assertTrue("'" + obj25 + "' != '" + (-1.0f) + "'", obj25.equals((-1.0f)));
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertTrue("'" + obj34 + "' != '" + (-1.0f) + "'", obj34.equals((-1.0f)));
        org.junit.Assert.assertNotNull(set36);
        org.junit.Assert.assertTrue(b37 == true);
    }

    @Test
    public void test82() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedOrderComparator10_Test0.test82");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (-1.0f));
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (-1.0f));
        java.lang.Object obj5 = defaultedMap3.get((java.lang.Object) (byte) -1);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        java.util.Set set7 = defaultedMap3.entrySet();
        int i8 = defaultedMap3.size();
        java.lang.Object obj10 = defaultedMap3.remove((java.lang.Object) 10.0f);
        java.util.Set set11 = defaultedMap3.entrySet();
        java.util.Collection collection12 = defaultedMap3.values();
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + (-1.0f) + "'", obj5.equals((-1.0f)));
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertNotNull(collection12);
    }

    @Test
    public void test83() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedOrderComparator10_Test0.test83");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (-1.0f));
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (-1.0f));
        java.lang.Object obj5 = defaultedMap3.get((java.lang.Object) (byte) -1);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        java.lang.Object[] obj_array7 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator8 = new collections.comparators.FixedOrderComparator(obj_array7);
        boolean b9 = defaultedMap1.equals((java.lang.Object) obj_array7);
        java.lang.String str10 = defaultedMap1.toString();
        java.lang.Object[] obj_array11 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator12 = new collections.comparators.FixedOrderComparator(obj_array11);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) (-1.0f));
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) (-1.0f));
        java.lang.Object obj18 = defaultedMap16.get((java.lang.Object) (byte) -1);
        defaultedMap14.putAll((java.util.Map) defaultedMap16);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) (-1.0f));
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) (-1.0f));
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) (-1.0f));
        java.lang.Object obj27 = defaultedMap25.get((java.lang.Object) (byte) -1);
        defaultedMap23.putAll((java.util.Map) defaultedMap25);
        defaultedMap21.putAll((java.util.Map) defaultedMap23);
        defaultedMap16.putAll((java.util.Map) defaultedMap23);
        collections.Predicate predicate31 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate32 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map33 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap23, predicate31, predicate32);
        java.lang.Object obj34 = defaultedMap1.put((java.lang.Object) fixedOrderComparator12, (java.lang.Object) predicate32);
        boolean b35 = fixedOrderComparator12.isLocked();
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + (-1.0f) + "'", obj5.equals((-1.0f)));
        org.junit.Assert.assertNotNull(obj_array7);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "{}" + "'", str10.equals("{}"));
        org.junit.Assert.assertNotNull(obj_array11);
        org.junit.Assert.assertTrue("'" + obj18 + "' != '" + (-1.0f) + "'", obj18.equals((-1.0f)));
        org.junit.Assert.assertTrue("'" + obj27 + "' != '" + (-1.0f) + "'", obj27.equals((-1.0f)));
        org.junit.Assert.assertNotNull(predicate31);
        org.junit.Assert.assertNotNull(predicate32);
        org.junit.Assert.assertNotNull(map33);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertTrue(b35 == false);
    }

    @Test
    public void test84() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedOrderComparator10_Test0.test84");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (-1.0f));
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (-1.0f));
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) (-1.0f));
        java.lang.Object obj7 = defaultedMap5.get((java.lang.Object) (byte) -1);
        defaultedMap3.putAll((java.util.Map) defaultedMap5);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        java.util.Map map11 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap3, (java.lang.Object) (byte) 0);
        java.lang.String str12 = defaultedMap3.toString();
        java.util.Set set13 = defaultedMap3.keySet();
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) (-1.0f));
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) (-1.0f));
        java.lang.Object obj19 = defaultedMap17.get((java.lang.Object) (byte) -1);
        defaultedMap15.putAll((java.util.Map) defaultedMap17);
        java.util.Set set21 = defaultedMap17.entrySet();
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap17);
        boolean b23 = defaultedMap3.containsKey((java.lang.Object) defaultedMap22);
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) (-1.0f));
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) (-1.0f));
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) (-1.0f));
        java.lang.Object obj31 = defaultedMap29.get((java.lang.Object) (byte) -1);
        defaultedMap27.putAll((java.util.Map) defaultedMap29);
        defaultedMap25.putAll((java.util.Map) defaultedMap27);
        java.util.Map map35 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap27, (java.lang.Object) (byte) 0);
        java.util.Set set36 = defaultedMap27.keySet();
        collections.comparators.FixedOrderComparator fixedOrderComparator37 = new collections.comparators.FixedOrderComparator();
        java.lang.Object[] obj_array38 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator39 = new collections.comparators.FixedOrderComparator(obj_array38);
        boolean b40 = fixedOrderComparator39.isLocked();
        collections.map.DefaultedMap defaultedMap42 = new collections.map.DefaultedMap((java.lang.Object) (-1.0f));
        int i43 = defaultedMap42.size();
        java.lang.Object[] obj_array46 = new java.lang.Object[] { defaultedMap42, 0L, ' ' };
        collections.comparators.FixedOrderComparator fixedOrderComparator47 = new collections.comparators.FixedOrderComparator(obj_array46);
        boolean b48 = fixedOrderComparator39.add((java.lang.Object) fixedOrderComparator47);
        boolean b49 = fixedOrderComparator37.add((java.lang.Object) fixedOrderComparator39);
        java.lang.Object obj50 = defaultedMap22.put((java.lang.Object) defaultedMap27, (java.lang.Object) fixedOrderComparator37);
        int i51 = fixedOrderComparator37.getUnknownObjectBehavior();
        int i52 = fixedOrderComparator37.getUnknownObjectBehavior();
        org.junit.Assert.assertTrue("'" + obj7 + "' != '" + (-1.0f) + "'", obj7.equals((-1.0f)));
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "{}" + "'", str12.equals("{}"));
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertTrue("'" + obj19 + "' != '" + (-1.0f) + "'", obj19.equals((-1.0f)));
        org.junit.Assert.assertNotNull(set21);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertTrue("'" + obj31 + "' != '" + (-1.0f) + "'", obj31.equals((-1.0f)));
        org.junit.Assert.assertNotNull(map35);
        org.junit.Assert.assertNotNull(set36);
        org.junit.Assert.assertNotNull(obj_array38);
        org.junit.Assert.assertTrue(b40 == false);
        org.junit.Assert.assertTrue(i43 == 0);
        org.junit.Assert.assertNotNull(obj_array46);
        org.junit.Assert.assertTrue(b48 == true);
        org.junit.Assert.assertTrue(b49 == true);
        org.junit.Assert.assertNull(obj50);
        org.junit.Assert.assertTrue(i51 == 2);
        org.junit.Assert.assertTrue(i52 == 2);
    }

    @Test
    public void test85() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedOrderComparator10_Test0.test85");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (-1.0f));
        java.util.Collection collection2 = defaultedMap1.values();
        boolean b4 = defaultedMap1.containsValue((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) (-1.0f));
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) (-1.0f));
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) (-1.0f));
        java.lang.Object obj12 = defaultedMap10.get((java.lang.Object) (byte) -1);
        defaultedMap8.putAll((java.util.Map) defaultedMap10);
        defaultedMap6.putAll((java.util.Map) defaultedMap8);
        java.util.Map map16 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap8, (java.lang.Object) (byte) 0);
        collections.Predicate predicate17 = collections.PredicateUtils.uniquePredicate();
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) (-1.0f));
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) (-1.0f));
        java.lang.Object obj23 = defaultedMap21.get((java.lang.Object) (byte) -1);
        defaultedMap19.putAll((java.util.Map) defaultedMap21);
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) (-1.0f));
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) (-1.0f));
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) (-1.0f));
        java.lang.Object obj32 = defaultedMap30.get((java.lang.Object) (byte) -1);
        defaultedMap28.putAll((java.util.Map) defaultedMap30);
        defaultedMap26.putAll((java.util.Map) defaultedMap28);
        defaultedMap21.putAll((java.util.Map) defaultedMap28);
        collections.Predicate predicate36 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate37 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map38 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap28, predicate36, predicate37);
        java.util.Map map39 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap8, predicate17, predicate36);
        collections.Predicate predicate40 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map41 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate36, predicate40);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue("'" + obj12 + "' != '" + (-1.0f) + "'", obj12.equals((-1.0f)));
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertTrue("'" + obj23 + "' != '" + (-1.0f) + "'", obj23.equals((-1.0f)));
        org.junit.Assert.assertTrue("'" + obj32 + "' != '" + (-1.0f) + "'", obj32.equals((-1.0f)));
        org.junit.Assert.assertNotNull(predicate36);
        org.junit.Assert.assertNotNull(predicate37);
        org.junit.Assert.assertNotNull(map38);
        org.junit.Assert.assertNotNull(map39);
        org.junit.Assert.assertNotNull(predicate40);
        org.junit.Assert.assertNotNull(map41);
    }

    @Test
    public void test86() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedOrderComparator10_Test0.test86");
        java.lang.Object[] obj_array0 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator1 = new collections.comparators.FixedOrderComparator(obj_array0);
        collections.comparators.FixedOrderComparator fixedOrderComparator2 = new collections.comparators.FixedOrderComparator(obj_array0);
        collections.comparators.FixedOrderComparator fixedOrderComparator3 = new collections.comparators.FixedOrderComparator(obj_array0);
        org.junit.Assert.assertNotNull(obj_array0);
    }

    @Test
    public void test87() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedOrderComparator10_Test0.test87");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (-1.0f));
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (-1.0f));
        java.lang.Object obj5 = defaultedMap3.get((java.lang.Object) (byte) -1);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) (-1.0f));
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) (-1.0f));
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) (-1.0f));
        java.lang.Object obj14 = defaultedMap12.get((java.lang.Object) (byte) -1);
        defaultedMap10.putAll((java.util.Map) defaultedMap12);
        defaultedMap8.putAll((java.util.Map) defaultedMap10);
        defaultedMap3.putAll((java.util.Map) defaultedMap10);
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) (-1.0f));
        java.lang.Object obj21 = defaultedMap19.get((java.lang.Object) (byte) -1);
        java.util.Map map22 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap3, obj21);
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + (-1.0f) + "'", obj5.equals((-1.0f)));
        org.junit.Assert.assertTrue("'" + obj14 + "' != '" + (-1.0f) + "'", obj14.equals((-1.0f)));
        org.junit.Assert.assertTrue("'" + obj21 + "' != '" + (-1.0f) + "'", obj21.equals((-1.0f)));
        org.junit.Assert.assertNotNull(map22);
    }

    @Test
    public void test88() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedOrderComparator10_Test0.test88");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (-1.0f));
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (-1.0f));
        java.lang.Object obj5 = defaultedMap3.get((java.lang.Object) (byte) -1);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        java.lang.Object[] obj_array7 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator8 = new collections.comparators.FixedOrderComparator(obj_array7);
        boolean b9 = defaultedMap1.equals((java.lang.Object) obj_array7);
        collections.comparators.FixedOrderComparator fixedOrderComparator10 = new collections.comparators.FixedOrderComparator(obj_array7);
        java.lang.Object[] obj_array11 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator12 = new collections.comparators.FixedOrderComparator(obj_array11);
        collections.comparators.FixedOrderComparator fixedOrderComparator13 = new collections.comparators.FixedOrderComparator(obj_array11);
        boolean b14 = fixedOrderComparator13.isLocked();
        fixedOrderComparator13.checkLocked();
        boolean b16 = fixedOrderComparator10.add((java.lang.Object) fixedOrderComparator13);
        collections.PredicateUtils predicateUtils17 = new collections.PredicateUtils();
        java.lang.Object[] obj_array18 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator19 = new collections.comparators.FixedOrderComparator(obj_array18);
        try {
            int i20 = fixedOrderComparator10.compare((java.lang.Object) predicateUtils17, (java.lang.Object) fixedOrderComparator19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + (-1.0f) + "'", obj5.equals((-1.0f)));
        org.junit.Assert.assertNotNull(obj_array7);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNotNull(obj_array11);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(b16 == true);
        org.junit.Assert.assertNotNull(obj_array18);
    }

    @Test
    public void test89() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedOrderComparator10_Test0.test89");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (-1.0f));
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (-1.0f));
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) (-1.0f));
        java.lang.Object obj7 = defaultedMap5.get((java.lang.Object) (byte) -1);
        defaultedMap3.putAll((java.util.Map) defaultedMap5);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        java.util.Map map11 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap3, (java.lang.Object) (byte) 0);
        collections.Predicate predicate12 = collections.PredicateUtils.uniquePredicate();
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) (-1.0f));
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) (-1.0f));
        java.lang.Object obj18 = defaultedMap16.get((java.lang.Object) (byte) -1);
        defaultedMap14.putAll((java.util.Map) defaultedMap16);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) (-1.0f));
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) (-1.0f));
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) (-1.0f));
        java.lang.Object obj27 = defaultedMap25.get((java.lang.Object) (byte) -1);
        defaultedMap23.putAll((java.util.Map) defaultedMap25);
        defaultedMap21.putAll((java.util.Map) defaultedMap23);
        defaultedMap16.putAll((java.util.Map) defaultedMap23);
        collections.Predicate predicate31 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate32 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map33 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap23, predicate31, predicate32);
        java.util.Map map34 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap3, predicate12, predicate31);
        defaultedMap3.clear();
        int i36 = defaultedMap3.size();
        org.junit.Assert.assertTrue("'" + obj7 + "' != '" + (-1.0f) + "'", obj7.equals((-1.0f)));
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertTrue("'" + obj18 + "' != '" + (-1.0f) + "'", obj18.equals((-1.0f)));
        org.junit.Assert.assertTrue("'" + obj27 + "' != '" + (-1.0f) + "'", obj27.equals((-1.0f)));
        org.junit.Assert.assertNotNull(predicate31);
        org.junit.Assert.assertNotNull(predicate32);
        org.junit.Assert.assertNotNull(map33);
        org.junit.Assert.assertNotNull(map34);
        org.junit.Assert.assertTrue(i36 == 0);
    }

    @Test
    public void test90() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedOrderComparator10_Test0.test90");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (-1.0f));
        java.util.Collection collection2 = defaultedMap1.values();
        java.lang.Object obj4 = defaultedMap1.remove((java.lang.Object) 100);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) (-1.0f));
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) (-1.0f));
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) (-1.0f));
        java.lang.Object obj12 = defaultedMap10.get((java.lang.Object) (byte) -1);
        defaultedMap8.putAll((java.util.Map) defaultedMap10);
        defaultedMap6.putAll((java.util.Map) defaultedMap8);
        java.util.Map map16 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap8, (java.lang.Object) (byte) 0);
        java.lang.String str17 = defaultedMap8.toString();
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) (-1.0f));
        java.util.Collection collection20 = defaultedMap19.values();
        java.util.Set set21 = defaultedMap19.entrySet();
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) (-1.0f));
        java.lang.Object obj25 = defaultedMap23.get((java.lang.Object) (byte) -1);
        java.lang.Object obj26 = defaultedMap19.remove((java.lang.Object) (byte) -1);
        defaultedMap8.putAll((java.util.Map) defaultedMap19);
        boolean b28 = defaultedMap1.containsValue((java.lang.Object) defaultedMap19);
        java.lang.Object obj31 = defaultedMap19.put((java.lang.Object) 10.0f, (java.lang.Object) 100);
        java.lang.Object[] obj_array32 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator33 = new collections.comparators.FixedOrderComparator(obj_array32);
        collections.comparators.FixedOrderComparator fixedOrderComparator34 = new collections.comparators.FixedOrderComparator(obj_array32);
        boolean b35 = fixedOrderComparator34.isLocked();
        fixedOrderComparator34.checkLocked();
        java.util.Map map37 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap19, (java.lang.Object) fixedOrderComparator34);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + obj12 + "' != '" + (-1.0f) + "'", obj12.equals((-1.0f)));
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "{}" + "'", str17.equals("{}"));
        org.junit.Assert.assertNotNull(collection20);
        org.junit.Assert.assertNotNull(set21);
        org.junit.Assert.assertTrue("'" + obj25 + "' != '" + (-1.0f) + "'", obj25.equals((-1.0f)));
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNotNull(obj_array32);
        org.junit.Assert.assertTrue(b35 == false);
        org.junit.Assert.assertNotNull(map37);
    }

    @Test
    public void test91() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedOrderComparator10_Test0.test91");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) true);
    }

    @Test
    public void test92() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedOrderComparator10_Test0.test92");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (-1.0f));
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (-1.0f));
        java.lang.Object obj5 = defaultedMap3.get((java.lang.Object) (byte) -1);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        java.util.Set set7 = defaultedMap3.entrySet();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap3);
        java.lang.String str9 = defaultedMap8.toString();
        int i10 = defaultedMap8.size();
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + (-1.0f) + "'", obj5.equals((-1.0f)));
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "{}" + "'", str9.equals("{}"));
        org.junit.Assert.assertTrue(i10 == 0);
    }

    @Test
    public void test93() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedOrderComparator10_Test0.test93");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (-1.0f));
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (-1.0f));
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) (-1.0f));
        java.lang.Object obj7 = defaultedMap5.get((java.lang.Object) (byte) -1);
        defaultedMap3.putAll((java.util.Map) defaultedMap5);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        java.util.Map map11 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap3, (java.lang.Object) (byte) 0);
        collections.Predicate predicate12 = collections.PredicateUtils.uniquePredicate();
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) (-1.0f));
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) (-1.0f));
        java.lang.Object obj18 = defaultedMap16.get((java.lang.Object) (byte) -1);
        defaultedMap14.putAll((java.util.Map) defaultedMap16);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) (-1.0f));
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) (-1.0f));
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) (-1.0f));
        java.lang.Object obj27 = defaultedMap25.get((java.lang.Object) (byte) -1);
        defaultedMap23.putAll((java.util.Map) defaultedMap25);
        defaultedMap21.putAll((java.util.Map) defaultedMap23);
        defaultedMap16.putAll((java.util.Map) defaultedMap23);
        collections.Predicate predicate31 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate32 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map33 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap23, predicate31, predicate32);
        java.util.Map map34 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap3, predicate12, predicate31);
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) (-1.0f));
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) (-1.0f));
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap((java.lang.Object) (-1.0f));
        java.lang.Object obj42 = defaultedMap40.get((java.lang.Object) (byte) -1);
        defaultedMap38.putAll((java.util.Map) defaultedMap40);
        defaultedMap36.putAll((java.util.Map) defaultedMap38);
        java.util.Map map46 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap38, (java.lang.Object) (byte) 0);
        java.lang.String str47 = defaultedMap38.toString();
        java.util.Set set48 = defaultedMap38.keySet();
        defaultedMap3.putAll((java.util.Map) defaultedMap38);
        java.util.Set set50 = defaultedMap38.keySet();
        org.junit.Assert.assertTrue("'" + obj7 + "' != '" + (-1.0f) + "'", obj7.equals((-1.0f)));
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertTrue("'" + obj18 + "' != '" + (-1.0f) + "'", obj18.equals((-1.0f)));
        org.junit.Assert.assertTrue("'" + obj27 + "' != '" + (-1.0f) + "'", obj27.equals((-1.0f)));
        org.junit.Assert.assertNotNull(predicate31);
        org.junit.Assert.assertNotNull(predicate32);
        org.junit.Assert.assertNotNull(map33);
        org.junit.Assert.assertNotNull(map34);
        org.junit.Assert.assertTrue("'" + obj42 + "' != '" + (-1.0f) + "'", obj42.equals((-1.0f)));
        org.junit.Assert.assertNotNull(map46);
        org.junit.Assert.assertTrue("'" + str47 + "' != '" + "{}" + "'", str47.equals("{}"));
        org.junit.Assert.assertNotNull(set48);
        org.junit.Assert.assertNotNull(set50);
    }
}

