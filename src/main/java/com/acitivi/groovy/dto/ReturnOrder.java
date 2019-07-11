/**   
 * Copyright © 2017 北京易酒批电子商务有限公司. All rights reserved.
 */
package com.acitivi.groovy.dto;

import java.math.BigDecimal;

/**
 * @ClassName: ReturnOrder
 * @Description:
 * @author wangran
 * @date Jul 8, 2019 3:50:20 PM
 */
public class ReturnOrder {

	private String name;

	private BigDecimal amount;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public BigDecimal getAmount() {
		return amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "ReturnOrder [name=" + name + ", amount=" + amount + "]";
	}

}
