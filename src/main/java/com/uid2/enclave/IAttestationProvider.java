package com.uid2.enclave;

public interface IAttestationProvider {
    // isReady indicates whether a provider is ready to serve getAttestationRequest
    default boolean isReady() { return true; }

    byte[] getAttestationRequest(byte[] publicKey) throws AttestationException;
}
