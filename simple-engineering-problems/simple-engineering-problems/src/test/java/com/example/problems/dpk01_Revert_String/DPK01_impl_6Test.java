package com.example.problems.dpk01_Revert_String;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DPK01_impl_6Test {

    @Test
    void nullShouldSuccess(){
        assertNull(DPK01_impl_6.revert(null));
    }

    @Test
    void helloShouldSuccess(){
        assertEquals("olleh",DPK01_impl_6.revert("hello"));
    }
}