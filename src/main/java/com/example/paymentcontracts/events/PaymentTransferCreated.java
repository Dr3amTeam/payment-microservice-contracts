package com.example.paymentcontracts.events;

import lombok.Value;

import java.math.BigDecimal;
import java.time.Instant;

@Value
public class PaymentTransferCreated {
    private String paymentId;
    private String customerId;
    private String employerId;
    private BigDecimal amount;
    private Instant occurredOn;
}
