/*
 * Copyright Elasticsearch B.V. and/or licensed to Elasticsearch B.V. under one
 * or more contributor license agreements. Licensed under the Elastic License;
 * you may not use this file except in compliance with the Elastic License.
 */

package org.elasticsearch.xpack.aggregatemetric.fielddata;

import org.elasticsearch.index.fielddata.IndexFieldData;
import org.elasticsearch.search.aggregations.support.ValuesSourceType;

/**
 * Specialization of {@link IndexFieldData} for aggregate_metric.
 */
public abstract class IndexAggregateDoubleMetricFieldData implements IndexFieldData<LeafAggregateDoubleMetricFieldData> {

    protected final String fieldName;
    protected final ValuesSourceType valuesSourceType;

    public IndexAggregateDoubleMetricFieldData(String fieldName, ValuesSourceType valuesSourceType) {
        this.fieldName = fieldName;
        this.valuesSourceType = valuesSourceType;
    }

    @Override
    public final String getFieldName() {
        return fieldName;
    }

    @Override
    public ValuesSourceType getValuesSourceType() {
        return valuesSourceType;
    }
}
