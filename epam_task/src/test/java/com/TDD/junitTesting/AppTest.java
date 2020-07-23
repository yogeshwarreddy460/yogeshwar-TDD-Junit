package com.TDD.junitTesting;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

@SuppressWarnings("unused")
public class AppTest 
{
    StringOperations stringOperations;

    @Before
    public void initiateClass(){
        this.stringOperations=new StringOperations();
    }

    @Test
    public void test1RemoveA(){
        String result=stringOperations.removeA("ABCD");
        assertEquals("BCD",result);
    }
    @Test
    public void test2RemoveA(){
        String result=stringOperations.removeA("AACD");
        assertEquals("CD",result);
    }
    @Test
    public void test3RemoveA(){
        String result=stringOperations.removeA("BACD");
        assertEquals("BCD",result);
    }
    @Test
    public void test4RemoveA(){
        String result=stringOperations.removeA("BBAA");
        assertEquals("BBAA",result);
    }
    @Test
    public void test5RemoveA(){
        String result=stringOperations.removeA("AABAA");
        assertEquals("BAA",result);
    }
}

