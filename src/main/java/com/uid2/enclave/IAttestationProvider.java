package com.uid2.enclave;

public interface IAttestationProvider {
    /**
     * Indicates whether a provider is ready to serve getAttestationRequest
     * @return is ready or not
     */
    default boolean isReady() { return true; }

    byte[] getAttestationRequest(byte[] publicKey) throws AttestationException;
}
