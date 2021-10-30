package com.example.paymentcontracts.events;

import lombok.Value;

import java.time.Instant;

@Value
public class PaymentTransferCompleted {
    private String paymentId;
    private Instant occurredOn;
}
