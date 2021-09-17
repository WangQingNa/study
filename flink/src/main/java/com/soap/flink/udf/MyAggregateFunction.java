package com.soap.flink.udf;

import org.apache.flink.table.functions.AggregateFunction;

/**
 * @author yangfuzhao on 2021/6/2.
 */
public class MyAggregateFunction extends AggregateFunction {
    @Override
    public Object getValue(Object accumulator) {
        return null;
    }

    @Override
    public Object createAccumulator() {
        return null;
    }


}
