import com.bridgelabz.find_maximum.FindMaximum;
import org.junit.jupiter.api.Assertions;
import org.junit.Test;

public class findMaximumTest {
    @Test
    public void findMax1(){
        Assertions.assertEquals(6,FindMaximum.findMaximum(6,1,2));
    }
    @Test
    public void findMax2(){
        Assertions.assertEquals(8,FindMaximum.findMaximum(6,8,5));
    }
    @Test
    public void findMax3(){
        Assertions.assertEquals(9,FindMaximum.findMaximum(6,8,9));
    }
    @Test
    public void findMaximumFloat1(){

        Assertions.assertEquals(7.80f,FindMaximum.findMaximum(7.80f,5.21f,6.47f));
    }
    @Test
    public void findMaximumFloat2(){

        Assertions.assertEquals(9.62f,FindMaximum.findMaximum(7.80f,9.62f,8.47f));
    }
    @Test
    public void findMaximumFloat3(){

        Assertions.assertEquals(16.77f,FindMaximum.findMaximum(11.25f,3.71f,16.77f));
    }
    @Test
    public void findMaximumString1(){
        Assertions.assertEquals("Peach",FindMaximum.findMaximum("Apple","Banana","Peach"));
    }
}
