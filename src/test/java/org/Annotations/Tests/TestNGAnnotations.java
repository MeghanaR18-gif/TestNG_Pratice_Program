package org.Annotations.Tests;

import org.testng.annotations.*;

public class TestNGAnnotations {

    @BeforeSuite
    public void BeforeSuite()
    {
        System.out.println("Logic-1 -- BeforeSuite will execute only once");
    }

    @BeforeTest
    public void BeforeTest()
    {
        System.out.println("Logic-2 -- BeforeTest will execute only once");
    }

    @BeforeGroups
    public void BeforeGroups()
    {
        System.out.println("I am Before Groups");
    }

    @BeforeClass
    public void BeforeClass()
    {
        System.out.println("Logic-3 -- BeforeClass will execute only once");

        System.out.println("-------------------------------------------------------------");
    }

    @BeforeMethod
    public void BeforeMethod()
    {
        System.out.println("Logic-4 -- BeforeMethod will execute with every TestCases");
    }

    @Test
    public void Test1()
    {
        System.out.println("Test case 1 -- Logic -5");
    }

    @Test
    public void Test2()
    {
        System.out.println("Test case 2 -- Logic -5");
    }


    @Test
    public void Test3()
    {
        System.out.println("Test case 3 -- Logic -5");
    }

    @AfterMethod
    public void AfterMethod()
    {
        System.out.println("Close browser - Logic-6 -- AfterMethod will also execute with every test case");

        System.out.println("-------------------------------------------------------------");
    }

    @AfterClass
    public void AfterClass()
    {
        System.out.println(" Quite browser - Logic-7 -- AfterClass will execute only once");
    }

    @AfterGroups
    public void AfterGroups()
    {
        System.out.println("I am After Groups");
    }

    @AfterTest
    public void AfterTest()
    {
        System.out.println(" Logic -8 -- AfterTest Executes only once");
    }

    @AfterSuite
    public void AfterSuite()
    {
        System.out.println(" Logic -9 -- AfterSuite Executes only once");
    }
}
