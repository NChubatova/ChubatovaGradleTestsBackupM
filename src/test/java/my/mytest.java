package my;

import org.junit.jupiter.api.*;
mport static org.junit.jupiter.api.Assertions.assertEquals;
import java.lang.*;

public class mytest {

    @Test
public void testAdd() {
    assertEquals(42, Integer.sum(19, 23));
};

}
