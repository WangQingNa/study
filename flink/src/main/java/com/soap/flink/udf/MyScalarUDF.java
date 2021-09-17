package com.soap.flink.udf;

import org.apache.flink.table.functions.FunctionContext;
import org.apache.flink.table.functions.FunctionRequirement;
import org.apache.flink.table.functions.ScalarFunction;

import java.util.Set;

/**
 * @author yangfuzhao on 2021/6/2.
 */
public class MyScalarUDF extends ScalarFunction {

    public MyScalarUDF() {
    }

    @Override
    public void open(FunctionContext context) throws Exception {
        // access the global "hashcode_factor" parameter
        // "12" would be the default value if the parameter does not exist
        Integer.parseInt(context.getJobParameter("hashcode_factor", "12"));
    }

    @Override
    public Set<FunctionRequirement> getRequirements() {
        return super.getRequirements();
    }

    @Override
    public boolean isDeterministic() {
        return super.isDeterministic();
    }

    public String eval() {
        return "";
    }

    public String eval(String str) {
        return str;
    }

    public String eval(Integer integer) {
        return String.valueOf(integer * 2);
    }
}
