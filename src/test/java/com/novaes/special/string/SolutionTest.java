/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.novaes.special.string;

import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author kbos
 */
public class SolutionTest {
    
    @Test
    public void test1() {
        Assert.assertSame(Solution.substrCount(5, "asasd"), 7L);
    }
    
    @Test
    public void test2() {
        Assert.assertSame(Solution.substrCount(7, "abcbaba"), 10L);
    }
    
    @Test
    public void test3() {
        Assert.assertSame(Solution.substrCount(4, "aaaa"), 10L);
    }
    
    @Test
    public void test4() {
        Assert.assertEquals("AAA", Solution.getBegin("AAADBBB", 4));
    }
    
    @Test
    public void test5() {
        Assert.assertEquals( "D", Solution.getMiddle("AAADBBB", 4));
    }
    
    @Test
    public void test6() {
        Assert.assertEquals( "BBB", Solution.getEnd("AAADBBB", 4));
    }
    
}
