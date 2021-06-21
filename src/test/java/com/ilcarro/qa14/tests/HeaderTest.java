package com.ilcarro.qa14.tests;

import org.testng.annotations.Test;

public class HeaderTest extends TestBase {

    @Test
    public void findSearchTest() {
        app.header().checkSearchPageLounch();
    }

}