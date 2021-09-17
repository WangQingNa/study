package com.soap.flink.udf;

import org.apache.flink.table.annotation.DataTypeHint;
import org.apache.flink.table.annotation.FunctionHint;
import org.apache.flink.table.functions.FunctionContext;
import org.apache.flink.table.functions.TableFunction;
import org.apache.flink.types.Row;

/**
 * @author yangfuzhao on 2021/6/2.
 */

public class MyTableFunc extends TableFunction<Row> {

    @FunctionHint(output = @DataTypeHint("ROW< i INT, s STRING >"))
    public void eval(Integer i) {
        super.collect(Row.of(i, "s"));
        super.collect(Row.of(i, "A"));
    }

    @Override
    public void open(FunctionContext context) throws Exception {
        super.open(context);
    }
}
