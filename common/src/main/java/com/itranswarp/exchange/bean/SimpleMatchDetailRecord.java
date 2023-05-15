package com.itranswarp.exchange.bean;

import com.itranswarp.exchange.enums.MatchType;

import java.math.BigDecimal;

public record SimpleMatchDetailRecord(BigDecimal price, BigDecimal quantity, MatchType type) {
}
