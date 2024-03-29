package com.poc;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.text.SimpleDateFormat;
import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

/**
 * The proposal for the class it is show the basic structure for a test class.
 *
 * @author diegoUmpierre
 * @since Sep 12 2023
 */
class SolutionTest {
    private Solution solution;
    @BeforeEach
    void init(){
        solution = new Solution();
    }
    @Test
    void ifTheParameterAreBiggerThenTwoShouldReturnTrue() throws Exception{

        Date execD = new Date();
        String execDParam = "2024-03-04";
            SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
            execD = df.parse(execDParam.trim());

        assertTrue(solution.basicMethod(4));
    }
    @Test
    void ifTheParameterAreLessThenTwoShouldReturnFalse() {
        assertFalse(solution.basicMethod(1));
    }

}