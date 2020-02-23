import org.testng.Assert;
import org.testng.annotations.Test;

public class SimpleTest {
    @Test
    public void Tset(){
        System.out.println("This test will always pass");
    }
    @Test
    public void secondTest(){
        System.out.println("Do not fail again");
    }
    @Test
    public void FailTest(){
        Assert.fail(" fail");
    }
    @Test
    public void test1(){
        System.out.println("dfewg");
    }




}
