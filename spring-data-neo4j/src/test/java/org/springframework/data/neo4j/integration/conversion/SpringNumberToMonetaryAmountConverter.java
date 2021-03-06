/*
 * Copyright (c)  [2011-2016] "Pivotal Software, Inc." / "Neo Technology" / "Graph Aware Ltd."
 *
 * This product is licensed to you under the Apache License, Version 2.0 (the "License").
 * You may not use this product except in compliance with the License.
 *
 * This product may include a number of subcomponents with
 * separate copyright notices and license terms. Your use of the source
 * code for these subcomponents is subject to the terms and
 * conditions of the subcomponent's license, as noted in the LICENSE file.
 *
 */

package org.springframework.data.neo4j.integration.conversion;

import org.springframework.core.convert.converter.Converter;
import org.springframework.data.neo4j.integration.conversion.domain.MonetaryAmount;

public class SpringNumberToMonetaryAmountConverter implements Converter<Number, MonetaryAmount> {

	@Override
	public MonetaryAmount convert(Number source) {
		return source != null ? new MonetaryAmount(source.intValue() / 100, source.intValue() % 100) : null;
	}

}
