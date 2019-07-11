/**   
 * Copyright © 2017 北京易酒批电子商务有限公司. All rights reserved.
 */
package com.acitivi.groovy;

import org.springframework.stereotype.Service;

import com.acitivi.groovy.dto.ReturnOrder;
import com.acitivi.groovy.dto.ReturnOrderGenRule;


/**
 * @ClassName: ReturnService
 * @Description:
 * @author wangran
 * @date Jul 8, 2019 3:50:04 PM
 */
@Service
public class ReturnService {

	public ReturnOrder getFirstReturnOrder(ReturnOrderGenRule rule) {
		ReturnOrder returnOrder = new ReturnOrder();
		returnOrder.setName("firstRule");
		returnOrder.setAmount(rule.getAmount());
		return returnOrder;
	}

	public ReturnOrder getSecondReturnOrder(ReturnOrderGenRule rule) {
		ReturnOrder returnOrder = new ReturnOrder();
		returnOrder.setName("secondRule");
		returnOrder.setAmount(rule.getAmount());
		return returnOrder;
	}

}
