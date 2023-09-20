package tests;

import base.BaseTest;
import org.testng.annotations.Test;
import utils.DataUtil;

import java.util.HashMap;

public class dataProviderTest extends BaseTest {
    @Test(dataProviderClass = DataUtil.class, dataProvider = "dataProvider")
    public void test(HashMap<String, String> hashMap){}

}
