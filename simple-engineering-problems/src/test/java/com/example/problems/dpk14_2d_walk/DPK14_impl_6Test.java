package com.example.problems.dpk14_2d_walk;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class DPK14_impl_6Test {

    @Test
    void moveShouldBeSuccess(){
        String[][] grid = {
                {"Ryu", "E.Honda", "Blanka", "Guile", "Balrog", "Vega"},
                {"Ken", "Chun Li", "Zangief", "Dhalsim", "Sagat", "M.Bison"}
        };
        int[] initPos = {0, 0};
        String[] movements = {"up", "left", "down", "right"};
        String[] expected = {"Ken", "M.Bison", "Vega"};
        String[] result = DPK14_impl_6.move(grid, initPos, movements);
        assertArrayEquals(expected,result);
    }

}