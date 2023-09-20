import org.junit.Assert;
import org.junit.Test;

public class RationalTest {
    @Test
    public void testAdd() {
        Rational x = new Rational();
        x.numerator = 1;
        x.denominator = 2;
        Rational y = new Rational();
        y.numerator = 1;
        y.denominator = 4;
        x.add(y);
        Assert.assertEquals(3, x.numerator);
        Assert.assertEquals(4, x.denominator);
    }
    @Test
    public void testSubtract() {
        Rational x = new Rational();
        x.numerator = 5;
        x.denominator = 6;
        Rational y = new Rational();
        y.numerator = 1;
        y.denominator = 3;
        x.subtract(y);
        Assert.assertEquals(1, x.numerator);
        Assert.assertEquals(2, x.denominator);
    }
    @Test
    public void testMultiply() {
        Rational x = new Rational();
        x.numerator = 1;
        x.denominator = 3;
        Rational y = new Rational();
        y.numerator = 3;
        y.denominator = 5;
        x.multiply(y);
        Assert.assertEquals(1, x.numerator);
        Assert.assertEquals(5, x.denominator);
    }
    @Test
    public void testDivide() {
        Rational x = new Rational();
        x.numerator = 2;
        x.denominator = 5;
        Rational y = new Rational();
        y.numerator = 4;
        y.denominator = 3;
        x.divide(y);
        Assert.assertEquals(3, x.numerator);
        Assert.assertEquals(10, x.denominator);
    }
    
    @Test
    public void testEquals() {
        
        Rational x = new Rational();
        x.numerator = 1;
        x.denominator = 2;
        Rational y = new Rational();
        y.numerator = 2;
        y.denominator = 4;
        Rational z = new Rational();
        z.numerator = 3;
        z.denominator = 4;

        boolean resultXY = x.equals(y);
        Assert.assertTrue(resultXY); 

        boolean resultXZ = x.equals(z);
        Assert.assertFalse(resultXZ);
    }

    @Test
    public void testCompareTo() {
        Rational x = new Rational();
        x.numerator = 1;
        x.denominator = 2;
        Rational y = new Rational();
        y.numerator = 3;
        y.denominator = 5;
        Rational z = new Rational();
        z.numerator = 2;
        z.denominator = 4;

        long resultXY = x.compareTo(y);
        long resultXZ = x.compareTo(z);
        long resultZY = z.compareTo(y);

        Assert.assertEquals(-1, resultXY);

        Assert.assertEquals(0, resultXZ);

        Assert.assertEquals(-1, resultZY);
    }

    @Test
    public void testToString() {
        Rational x = new Rational();
        x.numerator = 1;
        x.denominator = 2;

        Assert.assertEquals("1/2", x.toString());
        
    }
}
