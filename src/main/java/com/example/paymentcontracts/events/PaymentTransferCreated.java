package com.example.paymentcontracts.events;

import lombok.Value;

import java.math.BigDecimal;
import java.time.Instant;

@Value
public class PaymentTransferCreated {
    private String paymentId;
    private String fromAccountId;
    private String toAccountId;
    private BigDecimal amount;
    /*
    private String payMethodId;
    private String appointmentId;
     */
    private Instant occurredOn;
}
