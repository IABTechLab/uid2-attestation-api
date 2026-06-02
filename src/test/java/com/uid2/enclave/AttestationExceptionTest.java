package com.uid2.enclave;

import org.junit.Test;
import static org.junit.Assert.*;

public class AttestationExceptionTest {
    @Test
    public void testConstructWithMessage() {
        AttestationException e = new AttestationException("boom");
        assertEquals("boom", e.getMessage());
        assertNull(e.getCause());
    }

    @Test
    public void testConstructWithCause() {
        Throwable cause = new RuntimeException("root");
        AttestationException e = new AttestationException(cause);
        assertSame(cause, e.getCause());
    }
}
