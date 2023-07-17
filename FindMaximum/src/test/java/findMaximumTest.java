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
}
