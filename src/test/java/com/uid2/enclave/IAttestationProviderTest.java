package com.uid2.enclave;

import org.junit.Test;
import static org.junit.Assert.assertTrue;

public class IAttestationProviderTest {
    @Test
    public void testIsReadyDefaultsTrue() {
        IAttestationProvider p = (publicKey, userData) -> new byte[0];
        assertTrue(p.isReady());
    }
}
