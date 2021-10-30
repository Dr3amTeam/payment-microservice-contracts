package com.example.paymentcontracts.events;

import lombok.Value;

import java.time.Instant;

@Value
public class PaymentTransferFailed {
    private String paymentId;
    private Instant occurredOn;
}
