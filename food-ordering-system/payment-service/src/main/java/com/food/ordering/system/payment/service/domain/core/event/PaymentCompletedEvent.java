package com.food.ordering.system.payment.service.domain.core.event;

import com.food.ordering.system.payment.service.domain.core.entity.Payment;

import java.time.ZonedDateTime;
import java.util.Collections;
import java.util.List;

public class PaymentCompletedEvent extends PaymentEvent {

  public PaymentCompletedEvent(Payment payment, ZonedDateTime createdAt) {
    super(payment, createdAt, Collections.emptyList());
  }
}
