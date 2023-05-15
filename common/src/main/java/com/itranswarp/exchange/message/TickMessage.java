package com.itranswarp.exchange.message;

import com.itranswarp.exchange.model.quotation.TickEntity;

import java.util.List;

public class TickMessage extends AbstractMessage {

    public long sequenceId;

    public List<TickEntity> ticks;

}
