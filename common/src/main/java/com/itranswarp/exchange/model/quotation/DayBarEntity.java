package com.itranswarp.exchange.model.quotation;

import com.itranswarp.exchange.model.support.AbstractBarEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

/**
 * Store bars of day.
 */
@Entity
@Table(name = "day_bars")
public class DayBarEntity extends AbstractBarEntity {

}
