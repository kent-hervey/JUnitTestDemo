package com.hervey.app;

import static org.junit.Assert.*;

import org.junit.Test;


public class MyUnitTest {

    @Test
    public void testConcatenate() {
        MyUnit myUnit = new MyUnit();

        String result = myUnit.concatenate("one", "two");

        assertEquals("onetwo", result);  //Failure result nothing
        assertEquals("onetwothree", result); //Failure result org.junit.ComparisonFailure: expected:<onetwo[three]> but was:<onetwo[]>
        //Per guide:  this method does the actual testing. In this method we compare the output of the called method (concatenate()) with the expected output.
        //The assertEquals() method is a statically imported method, which normally resides in the org.junit.Assert class. Notice the static import of this class at the top of MyUnitTest. Using the static import of the method is shorter than writing Assert.assertEquals().
        
    }
    
    
    @Test
    public void testGetTheStringArray() {
        MyUnit myUnit = new MyUnit();

        String[] expectedArray = {"one", "two", "three"};

        String[] resultArray =  myUnit.getTheStringArray();// over in myUnit the array is set to {"one", "two", "three"}, but can be changed to obtain a failure

        assertArrayEquals(expectedArray, resultArray);
        System.out.println("this won't print of failure results from assesrtArrayEquals");
        
    }
    
    
    
    
    
    
    
    
    
    
}
