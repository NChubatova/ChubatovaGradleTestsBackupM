package my;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;
import java.lang.*;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;
import org.junit.Rule;
import org.junit.contrib.java.lang.system.SystemOutRule;



public class mytest1 {
Logger log = LogManager.getLogger();
    
@Rule
public final SystemOutRule systemOutRule = new SystemOutRule().enableLog();
    
    @Test
    public void test11c() {
        //if (System.currentTimeMillis()%3==1){
        //}
        //else {
           System.out.print("##teamcity[setParameter name='ddd' value='fff']");
          System.out.print("teamcity[setParameter name='ddd' value='fff']");
            Assert.fail("fail mk6");

        //};

    };
    @Test
    public void test12c() {
        try 
            {
                //Thread.sleep(180000);
            Thread.sleep(90);
            } 
            catch(InterruptedException e)
            {
            // this part is executed when an exception (in this example InterruptedException) occurssss
            }
        if (System.currentTimeMillis()%3==1){
        }
        else {
          //
        };

    };
    @Test
    public void test13c() {
        if (System.currentTimeMillis()%1==1){
        }
        else {
            Assert.fail("fail messajge5");
            

        };

    };

}
