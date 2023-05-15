package com.itranswarp.exchange.model.quotation;

import com.itranswarp.exchange.model.support.AbstractBarEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

/**
 * Store bars of minute.
 */
@Entity
@Table(name = "min_bars")
public class MinBarEntity extends AbstractBarEntity {

}
