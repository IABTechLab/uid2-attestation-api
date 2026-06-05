package com.uid2.enclave;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class IOperatorKeyRetrieverTest {
    @Test
    public void testRetrieveReturnsKey() {
        IOperatorKeyRetriever retriever = () -> "test-key";
        assertEquals("test-key", retriever.retrieve());
    }
}
