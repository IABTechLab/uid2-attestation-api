package com.uid2.enclave;

import org.junit.Test;
import static org.junit.Assert.*;

public class IAttestationProviderTest {
    @Test
    public void testIsReadyDefaultsTrue() {
        IAttestationProvider p = (publicKey, userData) -> new byte[0];
        assertTrue(p.isReady());
    }

    @Test
    public void testGetAttestationRequestReturnsBytes() throws AttestationException {
        byte[] expected = new byte[]{0x01, 0x02};
        IAttestationProvider p = (publicKey, userData) -> expected;
        assertArrayEquals(expected, p.getAttestationRequest(new byte[0], new byte[0]));
    }

    @Test(expected = AttestationException.class)
    public void testGetAttestationRequestCanThrowAttestationException() throws AttestationException {
        IAttestationProvider p = (publicKey, userData) -> { throw new AttestationException("fail"); };
        p.getAttestationRequest(new byte[0], new byte[0]);
    }
}
