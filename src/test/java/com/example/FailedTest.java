package com.example;

import org.example.RetryAnalyzer;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FailedTest {
    @Test(retryAnalyzer = RetryAnalyzer.class)
    public void testTrue() {
        Assert.assertTrue(true);
    }

    @Test(retryAnalyzer = RetryAnalyzer.class)
    public void testFail() {
        Assert.fail("Test failed on purpose");
    }

    @Test(retryAnalyzer = RetryAnalyzer.class)
    public void testFailCondition() {
        Assert.assertTrue(false, "Test failed on purpose");
    }
}
