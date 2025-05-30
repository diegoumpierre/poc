package com.example.problems.dpk12_sort;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DPK12_impl_5Test {
    @Test
    void bubbleSortShouldBeSuccess(){
        int[] expected = {1,2,3,4,5};
        int[] input = {5,4,3,2,1};
        assertArrayEquals(expected,DPK12_impl_5.bubble_sort(input));
    }
}