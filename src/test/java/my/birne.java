package my;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;
import java.lang.*;

public class birne {

    @Test
    public void test41c() {
                 try 
            {
                //Thread.sleep(1);
            Thread.sleep(15);
            } 
            catch(InterruptedException e)
            {
            // this part is executed when an exception (in this example InterruptedException) occurs
            }
        //if (System.currentTimeMillis()%3==1){
        //}
        //else {
            Assert.fail("fail mkhg");
System.out.print("GfG1s");
        //};

    };
    @Test
    public void test42c() {
        try 
            {
                //Thread.sleep(90000);
            Thread.sleep(150);
            } 
            catch(InterruptedException e)
            {
            // this part is executed when an exception (in this example InterruptedException) occurs
            }
        if (System.currentTimeMillis()%3==1){
        }
        else {
          //
        };

    };
    @Test
    public void test43c() {
                 try 
            {
                //Thread.sleep(90000);
            Thread.sleep(150);
            } 
            catch(InterruptedException e)
            {
            // this part is executed when an exception (in this example InterruptedException) occurs
            }
        if (System.currentTimeMillis()%1==1){
        }
        else {
            Assert.fail("fail messajge2");
            System.out.print("GfG1");
        };

    };

}
