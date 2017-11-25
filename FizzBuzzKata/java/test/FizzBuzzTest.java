import org.junit.Assert;
import org.junit.Test;
import com.odde.kata.FizzBuzz;
public class FizzBuzzTest {

    @Test
    public void test_number_1(){
        String expected="1";
        String actual=FizzBuzz.show(1);

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void test_number_3() {
        String expected = "Fizz";
        String actual = FizzBuzz.show(3);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void test_number_5() {
        String expected = "Buzz";
        String actual = FizzBuzz.show(5);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void test_number_13() {
        String expected = "Fizz";
        String actual = FizzBuzz.show(13);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void test_number_15() {
        String expected = "FizzBuzz";
        String actual = FizzBuzz.show(15);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void test_contain_5() {
        String expected = "Buzz";
        String actural = FizzBuzz.show(52);
        Assert.assertEquals(expected, actural);
    }

    @Test
    public void test_contain_5_3() {
        String expected = "FizzBuzz";
        String actual = FizzBuzz.show(35);
        Assert.assertEquals(expected, actual);
    }
}