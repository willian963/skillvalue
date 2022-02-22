package com.rackerrank.marsexploration;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("MarsExplorationTest")
public class MarsExplorationTest {
    @Test
    void MarsExploration(){
        String s = "SOSSPSSQSSOR";
        int result = MarsExploration.run(s);
        Assertions.assertEquals(3,result);

        String s2 = "SOSSOT";
        result = MarsExploration.run(s2);
        Assertions.assertEquals(1,result);

        String s3 = "SOSSOSSOS";
        result = MarsExploration.run(s3);
        Assertions.assertEquals(0,result);
    }
}
