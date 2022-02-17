package com.rackerrank.jumponclouds;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("JumpingOnCloudsTest")
public class JumpingOnCloudsTest {
    @Test
    void JumpingOnCloudsTest(){
        int [] c = {0, 0, 1, 0, 0, 1, 1, 0};
        int k = 2;
        int result = JumpingOnClouds.run(c,2);
        Assertions.assertEquals(92,result);
    }
}
