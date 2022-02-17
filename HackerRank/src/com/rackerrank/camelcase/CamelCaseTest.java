package com.rackerrank.camelcase;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("CamelCaseTest")
public class CamelCaseTest {

    @Test
    void CamelCaseTest(){
        String s = "saveChangesInTheEditor";
        int result = CamelCase.run(s);
        Assertions.assertEquals(5,result);
    }
}
