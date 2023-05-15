package com.itranswarp.exchange.match;

import com.itranswarp.exchange.model.trade.OrderEntity;

import java.math.BigDecimal;

public record MatchDetailRecord(BigDecimal price, BigDecimal quantity, OrderEntity takerOrder, OrderEntity makerOrder) {
}
