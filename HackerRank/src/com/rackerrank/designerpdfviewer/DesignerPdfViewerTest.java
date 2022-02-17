package com.rackerrank.designerpdfviewer;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

@DisplayName("DesignerPdfViewerTest")
public class DesignerPdfViewerTest {

    @Test
    void DesignerPdfViewerTest(){
        List<Integer> h = List.of(1,3,1,3,1,4,1,3,2,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5);
        String word = "abc";
        int result = DesignerPdfViewer.run(h,word);
        Assertions.assertEquals(9,result);
    }
}
