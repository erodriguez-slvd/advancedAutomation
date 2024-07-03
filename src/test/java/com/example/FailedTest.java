package com.example;

import com.zebrunner.agent.core.annotation.TestCaseKey;
import org.example.RetryAnalyzer;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FailedTest {
    @Test(retryAnalyzer = RetryAnalyzer.class)
    @TestCaseKey("ERA-2")
    public void testTrue() {
        Assert.assertTrue(true);
    }

    @Test(retryAnalyzer = RetryAnalyzer.class)
    @TestCaseKey("ERA-1")
    public void testFail() {
        Assert.fail("Test failed on purpose");
    }

    @Test(retryAnalyzer = RetryAnalyzer.class)
    @TestCaseKey("ERA-3")
    public void testFailCondition() {
        Assert.assertTrue(false, "Test failed on purpose");
    }
}
