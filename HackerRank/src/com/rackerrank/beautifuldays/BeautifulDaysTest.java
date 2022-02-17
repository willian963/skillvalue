package com.rackerrank.beautifuldays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("BeautifulDaysTest")
public class BeautifulDaysTest {

    @Test
    void BeautifulDaysTest(){
        int result = BeautifulDays.run(20,23,6);
        Assertions.assertEquals(2,result);
    }
}
