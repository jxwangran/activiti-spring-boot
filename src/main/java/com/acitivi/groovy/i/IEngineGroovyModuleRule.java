/**   
 * Copyright © 2017 北京易酒批电子商务有限公司. All rights reserved.
 */
package com.acitivi.groovy.i;

import com.acitivi.groovy.dto.ReturnOrder;
import com.acitivi.groovy.dto.ReturnOrderGenRule;

/** 
* @ClassName: EngineGroovyModuleRule 
* @Description: 
* @author wangran
* @date Jul 9, 2019 7:05:51 PM 
*/
public interface IEngineGroovyModuleRule {
	boolean run(Object context);
	ReturnOrder getReturnOrder(ReturnOrderGenRule context);
}
