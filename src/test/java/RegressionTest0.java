import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

    public static boolean debug = false;

    @Test
    public void test01() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test01");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test02");
        Calcolatrice calcolatrice0 = new Calcolatrice();
        int int3 = calcolatrice0.sottrazione((int) (byte) 1, (int) (byte) 10);
        int int6 = calcolatrice0.somma((int) (byte) 10, 100);
        java.lang.Class<?> wildcardClass7 = calcolatrice0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-9) + "'", int3 == (-9));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 110 + "'", int6 == 110);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test03");
        Calcolatrice calcolatrice0 = new Calcolatrice();
        int int3 = calcolatrice0.somma((int) (byte) 1, (int) (short) 100);
        float float6 = calcolatrice0.divisione((int) '4', 0);
        int int9 = calcolatrice0.moltiplicazione(32, 0);
        float float12 = calcolatrice0.divisione((int) (byte) 10, (int) 'a');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 101 + "'", int3 == 101);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + Float.POSITIVE_INFINITY + "'", float6 == Float.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.10309278f + "'", float12 == 0.10309278f);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test04");
        Calcolatrice calcolatrice0 = new Calcolatrice();
        int int3 = calcolatrice0.sottrazione((int) (byte) 1, (int) (byte) 10);
        int int6 = calcolatrice0.sottrazione((int) (byte) 10, 101);
        java.lang.Class<?> wildcardClass7 = calcolatrice0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-9) + "'", int3 == (-9));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-91) + "'", int6 == (-91));
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test05");
        Calcolatrice calcolatrice0 = new Calcolatrice();
        int int3 = calcolatrice0.somma((int) (short) -1, 101);
        int int6 = calcolatrice0.moltiplicazione((int) (short) 1, 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test06");
        Calcolatrice calcolatrice0 = new Calcolatrice();
        float float3 = calcolatrice0.divisione(10, (int) (byte) 10);
        int int6 = calcolatrice0.somma((int) (short) 10, 0);
        java.lang.Class<?> wildcardClass7 = calcolatrice0.getClass();
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 1.0f + "'", float3 == 1.0f);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test07");
        Calcolatrice calcolatrice0 = new Calcolatrice();
        float float3 = calcolatrice0.divisione(10, (int) (byte) 10);
        int int6 = calcolatrice0.somma((int) (short) 10, 0);
        int int9 = calcolatrice0.sottrazione((int) (short) -1, (int) (short) 0);
        int int12 = calcolatrice0.moltiplicazione((int) (byte) 10, 100);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 1.0f + "'", float3 == 1.0f);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1000 + "'", int12 == 1000);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test08");
        Calcolatrice calcolatrice0 = new Calcolatrice();
        float float3 = calcolatrice0.divisione(10, (int) (byte) 10);
        int int6 = calcolatrice0.somma((int) (short) 10, 0);
        int int9 = calcolatrice0.sottrazione((int) (short) -1, (int) (short) 0);
        int int12 = calcolatrice0.moltiplicazione(101, (-110));
        int int15 = calcolatrice0.somma(1000, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 1.0f + "'", float3 == 1.0f);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-11110) + "'", int12 == (-11110));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1000 + "'", int15 == 1000);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test09");
        Calcolatrice calcolatrice0 = new Calcolatrice();
        int int3 = calcolatrice0.somma((int) (byte) 1, (int) (short) 100);
        float float6 = calcolatrice0.divisione((int) '4', 0);
        int int9 = calcolatrice0.somma((int) (short) 1, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 101 + "'", int3 == 101);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + Float.POSITIVE_INFINITY + "'", float6 == Float.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 101 + "'", int9 == 101);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test10");
        Calcolatrice calcolatrice0 = new Calcolatrice();
        int int3 = calcolatrice0.sottrazione((-9), (-91));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 82 + "'", int3 == 82);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test11");
        Calcolatrice calcolatrice0 = new Calcolatrice();
        int int3 = calcolatrice0.somma((int) (byte) 1, (int) (short) 100);
        float float6 = calcolatrice0.divisione((int) '4', 0);
        int int9 = calcolatrice0.sottrazione((int) (short) 100, (-1));
        float float12 = calcolatrice0.divisione((int) (short) 100, 0);
        float float15 = calcolatrice0.divisione((-11), 110);
        int int18 = calcolatrice0.somma((-91), (int) '#');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 101 + "'", int3 == 101);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + Float.POSITIVE_INFINITY + "'", float6 == Float.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 101 + "'", int9 == 101);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + Float.POSITIVE_INFINITY + "'", float12 == Float.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + (-0.1f) + "'", float15 == (-0.1f));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-56) + "'", int18 == (-56));
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test12");
        Calcolatrice calcolatrice0 = new Calcolatrice();
        int int3 = calcolatrice0.sottrazione((int) (byte) 1, (int) (byte) 10);
        int int6 = calcolatrice0.somma((int) (byte) 10, 100);
        int int9 = calcolatrice0.sottrazione(10, (int) '#');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-9) + "'", int3 == (-9));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 110 + "'", int6 == 110);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-25) + "'", int9 == (-25));
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test13");
        Calcolatrice calcolatrice0 = new Calcolatrice();
        float float3 = calcolatrice0.divisione(10, (int) (byte) 10);
        int int6 = calcolatrice0.somma((-9), 10);
        int int9 = calcolatrice0.moltiplicazione((-25), 82);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 1.0f + "'", float3 == 1.0f);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-2050) + "'", int9 == (-2050));
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test14");
        Calcolatrice calcolatrice0 = new Calcolatrice();
        int int3 = calcolatrice0.somma((int) (byte) 1, (int) (short) 100);
        float float6 = calcolatrice0.divisione((int) '4', 0);
        int int9 = calcolatrice0.moltiplicazione((int) ' ', (int) (short) 1);
        int int12 = calcolatrice0.sottrazione((-1), (-91));
        java.lang.Class<?> wildcardClass13 = calcolatrice0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 101 + "'", int3 == 101);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + Float.POSITIVE_INFINITY + "'", float6 == Float.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 90 + "'", int12 == 90);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test15");
        Calcolatrice calcolatrice0 = new Calcolatrice();
        int int3 = calcolatrice0.somma((int) (byte) 1, (int) (short) 100);
        float float6 = calcolatrice0.divisione((int) '4', 0);
        float float9 = calcolatrice0.divisione((int) (short) 1, 0);
        int int12 = calcolatrice0.sottrazione((int) ' ', 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 101 + "'", int3 == 101);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + Float.POSITIVE_INFINITY + "'", float6 == Float.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + Float.POSITIVE_INFINITY + "'", float9 == Float.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-68) + "'", int12 == (-68));
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test16");
        Calcolatrice calcolatrice0 = new Calcolatrice();
        int int3 = calcolatrice0.sottrazione((int) (byte) 1, (int) (byte) 10);
        int int6 = calcolatrice0.somma((int) (byte) 10, 100);
        int int9 = calcolatrice0.moltiplicazione((-110), 10);
        java.lang.Class<?> wildcardClass10 = calcolatrice0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-9) + "'", int3 == (-9));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 110 + "'", int6 == 110);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1100) + "'", int9 == (-1100));
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test17");
        Calcolatrice calcolatrice0 = new Calcolatrice();
        float float3 = calcolatrice0.divisione(10, (int) (byte) 10);
        int int6 = calcolatrice0.somma((-1100), 1);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 1.0f + "'", float3 == 1.0f);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1099) + "'", int6 == (-1099));
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test18");
        Calcolatrice calcolatrice0 = new Calcolatrice();
        int int3 = calcolatrice0.sottrazione((int) (byte) 1, (int) (byte) 10);
        int int6 = calcolatrice0.somma(82, 32);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-9) + "'", int3 == (-9));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 114 + "'", int6 == 114);
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test19");
        Calcolatrice calcolatrice0 = new Calcolatrice();
        float float3 = calcolatrice0.divisione(10, (int) (byte) 10);
        int int6 = calcolatrice0.somma((int) (short) 10, 0);
        int int9 = calcolatrice0.sottrazione((int) (short) -1, (int) (short) 0);
        int int12 = calcolatrice0.moltiplicazione(101, (-110));
        float float15 = calcolatrice0.divisione(110, (int) '#');
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 1.0f + "'", float3 == 1.0f);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-11110) + "'", int12 == (-11110));
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 3.142857f + "'", float15 == 3.142857f);
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test20");
        Calcolatrice calcolatrice0 = new Calcolatrice();
        int int3 = calcolatrice0.somma((int) (byte) 1, (int) (short) 100);
        float float6 = calcolatrice0.divisione((int) '4', 0);
        int int9 = calcolatrice0.moltiplicazione((int) ' ', (int) (short) 1);
        float float12 = calcolatrice0.divisione((int) 'a', (-110));
        int int15 = calcolatrice0.sottrazione(100, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 101 + "'", int3 == 101);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + Float.POSITIVE_INFINITY + "'", float6 == Float.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + (-0.8818182f) + "'", float12 == (-0.8818182f));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 90 + "'", int15 == 90);
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test21");
        Calcolatrice calcolatrice0 = new Calcolatrice();
        int int3 = calcolatrice0.sottrazione((int) (byte) 1, (int) (byte) 10);
        int int6 = calcolatrice0.somma((int) (byte) 10, 100);
        int int9 = calcolatrice0.moltiplicazione((int) (byte) 0, 32);
        int int12 = calcolatrice0.moltiplicazione((int) (byte) 0, 110);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-9) + "'", int3 == (-9));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 110 + "'", int6 == 110);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test22");
        Calcolatrice calcolatrice0 = new Calcolatrice();
        int int3 = calcolatrice0.somma((int) (byte) 1, (int) (short) 100);
        int int6 = calcolatrice0.sottrazione((int) 'a', (-1));
        int int9 = calcolatrice0.somma((int) (short) 0, (-9));
        int int12 = calcolatrice0.moltiplicazione((-100), 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 101 + "'", int3 == 101);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 98 + "'", int6 == 98);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-9) + "'", int9 == (-9));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test23");
        Calcolatrice calcolatrice0 = new Calcolatrice();
        int int3 = calcolatrice0.somma((int) (byte) 1, (int) (short) 100);
        float float6 = calcolatrice0.divisione((int) '4', 0);
        int int9 = calcolatrice0.moltiplicazione((int) ' ', (int) (short) 1);
        float float12 = calcolatrice0.divisione((int) 'a', (-110));
        float float15 = calcolatrice0.divisione((int) (short) 1, 114);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 101 + "'", int3 == 101);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + Float.POSITIVE_INFINITY + "'", float6 == Float.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + (-0.8818182f) + "'", float12 == (-0.8818182f));
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 0.00877193f + "'", float15 == 0.00877193f);
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test24");
        Calcolatrice calcolatrice0 = new Calcolatrice();
        int int3 = calcolatrice0.sottrazione((int) (byte) 1, (int) (byte) 10);
        int int6 = calcolatrice0.sottrazione((int) (byte) 10, 101);
        int int9 = calcolatrice0.moltiplicazione((int) (short) 10, 32);
        int int12 = calcolatrice0.somma((int) (short) 10, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-9) + "'", int3 == (-9));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-91) + "'", int6 == (-91));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 320 + "'", int9 == 320);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 9 + "'", int12 == 9);
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test25");
        Calcolatrice calcolatrice0 = new Calcolatrice();
        int int3 = calcolatrice0.sottrazione((int) (byte) 1, (int) (byte) 10);
        float float6 = calcolatrice0.divisione(0, (int) ' ');
        int int9 = calcolatrice0.somma(0, (-11));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-9) + "'", int3 == (-9));
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 0.0f + "'", float6 == 0.0f);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-11) + "'", int9 == (-11));
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test26");
        Calcolatrice calcolatrice0 = new Calcolatrice();
        int int3 = calcolatrice0.somma((int) (byte) 1, (int) (short) 100);
        float float6 = calcolatrice0.divisione((int) '4', 0);
        int int9 = calcolatrice0.sottrazione((int) (short) 100, (-1));
        int int12 = calcolatrice0.sottrazione((int) (byte) 100, 110);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 101 + "'", int3 == 101);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + Float.POSITIVE_INFINITY + "'", float6 == Float.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 101 + "'", int9 == 101);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-10) + "'", int12 == (-10));
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test27");
        Calcolatrice calcolatrice0 = new Calcolatrice();
        int int3 = calcolatrice0.sottrazione((int) (byte) 1, (int) (byte) 10);
        int int6 = calcolatrice0.sottrazione((-9), 101);
        float float9 = calcolatrice0.divisione(10, 110);
        float float12 = calcolatrice0.divisione((int) (byte) 1, (int) ' ');
        int int15 = calcolatrice0.sottrazione((int) (short) -1, 10);
        java.lang.Class<?> wildcardClass16 = calcolatrice0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-9) + "'", int3 == (-9));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-110) + "'", int6 == (-110));
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.09090909f + "'", float9 == 0.09090909f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.03125f + "'", float12 == 0.03125f);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-11) + "'", int15 == (-11));
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test28");
        Calcolatrice calcolatrice0 = new Calcolatrice();
        float float3 = calcolatrice0.divisione(10, (int) (byte) 10);
        int int6 = calcolatrice0.somma((-9), 10);
        int int9 = calcolatrice0.moltiplicazione(100, (-1));
        int int12 = calcolatrice0.moltiplicazione((-25), (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 1.0f + "'", float3 == 1.0f);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-100) + "'", int9 == (-100));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-250) + "'", int12 == (-250));
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test29");
        Calcolatrice calcolatrice0 = new Calcolatrice();
        int int3 = calcolatrice0.sottrazione((int) (byte) 1, (int) (byte) 10);
        int int6 = calcolatrice0.sottrazione((-9), 101);
        float float9 = calcolatrice0.divisione(10, 110);
        float float12 = calcolatrice0.divisione((-100), (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-9) + "'", int3 == (-9));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-110) + "'", int6 == (-110));
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.09090909f + "'", float9 == 0.09090909f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + (-1.0f) + "'", float12 == (-1.0f));
    }
}

