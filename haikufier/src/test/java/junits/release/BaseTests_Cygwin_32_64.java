package junits.release;

import java.io.IOException;

import junits.BaseTests;


import org.junit.After;
import org.junit.BeforeClass;
import org.junit.Test;

import base.JUnitSetUp;

import static base.JUnitSetUp.*;

public class BaseTests_Cygwin_32_64 extends BaseTests {

    @BeforeClass
    public static void beforeTests() throws IOException, InterruptedException,
            Exception {
        JUnitSetUp.setTarget("junit.cygwin");
        JUnitSetUp.setMode("32/64");
    }
}
