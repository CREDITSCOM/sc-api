package com.credits.service.contract;

import com.credits.classload.BytecodeContractClassLoader;
import com.credits.exception.ContractExecutorException;
import com.credits.general.pojo.ByteCodeObjectData;
import com.credits.general.thrift.generated.Variant;
import com.credits.pojo.MethodData;
import com.credits.service.ServiceTest;
import com.credits.thrift.utils.ContractExecutorUtils;
import org.junit.Before;
import org.junit.Test;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import static com.credits.general.thrift.generated.Variant.v_boolean;
import static com.credits.general.thrift.generated.Variant.v_double;
import static com.credits.general.thrift.generated.Variant.v_double_box;
import static com.credits.general.thrift.generated.Variant.v_int;
import static com.credits.general.thrift.generated.Variant.v_int_box;
import static com.credits.general.thrift.generated.Variant.v_list;
import static com.credits.general.thrift.generated.Variant.v_long;
import static com.credits.general.thrift.generated.Variant.v_string;
import static java.util.Arrays.asList;

public class MethodParametersTest extends ServiceTest {

    private BytecodeContractClassLoader classLoader;
    private Class<?> contractClass;
    List<ByteCodeObjectData> byteCodeObjects;
    private byte[] contractState;

    @Before
    @Override
    public void setUp() throws Exception {
        super.setUp();
        String sourceCodePath = "/methodParametersTest/MethodParametersTest.java";
        byteCodeObjects = compileSourceCodeFromFile(sourceCodePath);
        classLoader = new BytecodeContractClassLoader();
        contractClass = ContractExecutorUtils.compileSmartContractByteCode(byteCodeObjects, classLoader);
        //fixme
//        contractState = ceService.execute(0, initiatorAddress, contractAddress, byteCodeObjects, null, null, null, 500L).getContractState();
    }


    @Test
    public void findVoidMethod() throws InvocationTargetException, IllegalAccessException {
        Variant[] voidParams = {};
        MethodData voidMethod =
            ContractExecutorServiceImpl.getMethodArgumentsValuesByNameAndParams(contractClass, "foo", voidParams);
        //fixme
//        Assert.assertEquals(voidMethod.getMethod().toString(), "public static java.lang.Integer MethodParametersTest.foo()");
//        Object invoke =
//            voidMethod.getMethod().invoke(deserialize(contractState, classLoader), ContractExecutorServiceUtils.castValues(voidMethod.getArgTypes(),voidMethod.getArgValues()));
//        Integer invokeResult = (Integer) invoke;
//        Assert.assertEquals(new Integer(1), invokeResult);
    }

    @Test
    public void findSimpleMethod() throws InvocationTargetException, IllegalAccessException {

        Variant[] simpleParams = {v_double(3f), v_double_box(4f), v_int(1), v_int_box(2), v_double(200d), v_double_box(220d)};
        MethodData simpleMethod =
            ContractExecutorServiceImpl.getMethodArgumentsValuesByNameAndParams(contractClass, "foo", simpleParams);
        //fixme
//        Assert.assertEquals(simpleMethod.getMethod().toString(),
//            "public java.lang.Integer MethodParametersTest.foo(double,java.lang.Double,int,java.lang.Integer,double,java.lang.Double)");
//        Object invoke = simpleMethod.getMethod()
//            .invoke(deserialize(contractState, classLoader), ContractExecutorServiceUtils.castValues(simpleMethod.getArgTypes(),simpleMethod.getArgValues()));
//        Integer invokeResult = (Integer) invoke;
//        Assert.assertEquals(new Integer(1), invokeResult);

    }

    @Test
    public void findMethodWithArrayList() throws InvocationTargetException, IllegalAccessException {

        Variant[] arrayList = {v_list(new ArrayList<>(asList(v_int(1), v_int(2), v_int(3))))};


        //fixme
        MethodData arrayListMethod =
            ContractExecutorServiceImpl.getMethodArgumentsValuesByNameAndParams(contractClass, "foo", arrayList);
//        Assert.assertEquals(arrayListMethod.getMethod().toString(),
//            "public java.lang.Integer MethodParametersTest.foo(java.util.List)");
//        Object invoke = arrayListMethod.getMethod()
//            .invoke(deserialize(contractState, classLoader), ContractExecutorServiceUtils.castValues(arrayListMethod.getArgTypes(),arrayListMethod.getArgValues()));
//        Integer invokeResult = (Integer) invoke;
//        Assert.assertEquals(new Integer(1), invokeResult);

    }

    @Test
    public void findAnotherMethodWithArrayList() throws InvocationTargetException, IllegalAccessException {

        Variant[] arrayList = {v_list(new ArrayList<>(asList(v_int(1), v_int(2), v_int(3))))};
        MethodData arrayListMethod =
            ContractExecutorServiceImpl.getMethodArgumentsValuesByNameAndParams(contractClass, "fooInteger",
                arrayList);
        //fixme
//        Assert.assertEquals(arrayListMethod.getMethod().toString(),
//            "public java.lang.Integer MethodParametersTest.fooInteger(java.util.List)");
//        Object invoke = arrayListMethod.getMethod()
//            .invoke(deserialize(contractState, classLoader), ContractExecutorServiceUtils.castValues(arrayListMethod.getArgTypes(),arrayListMethod.getArgValues()));
//        Integer invokeResult = (Integer) invoke;
//        Assert.assertEquals(new Integer(1), invokeResult);

    }


    @Test
    public void findMethodWithSimpleParamsAndArrayList() throws InvocationTargetException, IllegalAccessException {

        List<Variant> list = new ArrayList<>();
        list.add(v_string("string01"));
        list.add(v_string("string01"));
        list.add(v_string("string01"));

        Variant[] simpleParamsWithList =
            {v_double(3f), v_double(4f), v_int(1), v_int(2), v_double(200d), v_double(220d), v_list(list)};

        MethodData simpleAndArrayListMethod =
            ContractExecutorServiceImpl.getMethodArgumentsValuesByNameAndParams(contractClass, "foo",
                simpleParamsWithList);

        //fixme
//        Assert.assertEquals(simpleAndArrayListMethod.getMethod().toString(),
//            "public java.lang.Integer MethodParametersTest.foo(double,java.lang.Double,int,java.lang.Integer,double,java.lang.Double,java.util.ArrayList)");
//        Object invoke = simpleAndArrayListMethod.getMethod()
//            .invoke(deserialize(contractState, classLoader), ContractExecutorServiceUtils.castValues(simpleAndArrayListMethod.getArgTypes(),simpleAndArrayListMethod.getArgValues()));
//        Integer invokeResult = (Integer) invoke;
//        Assert.assertEquals(new Integer(1), invokeResult);
    }

    @Test
    public void moreVariousParameters()
        throws ContractExecutorException, InvocationTargetException, IllegalAccessException {
        List<Variant> list = new LinkedList<>();
        list.add(v_string("string01"));
        list.add(v_string("string01"));
        list.add(v_string("string01"));
        Variant[] params =
            {v_double(3f), v_double(4f), v_int(1), v_int(2), v_double(200d), v_double(220d), v_list(list),
                v_list(new ArrayList<>(asList(v_int(1), v_int(2), v_int(3), v_int(4)))),
                v_list(new ArrayList<>(asList(v_int(5), v_int(6), v_int(7), v_int(8)))),
                v_list(new ArrayList<>(asList(v_double(1d), v_double(2d), v_double(3d)))),
                v_list(new ArrayList<>(asList(v_double(4d), v_double(5d), v_double(6d)))),
                v_list(new ArrayList<>(asList(v_boolean(true), v_boolean(true), v_boolean(false)))),
                v_list(new ArrayList<>(asList(v_boolean(true), v_boolean(true), v_boolean(false)))),
                v_list(new ArrayList<>(asList(v_int((short) 1), v_int((short) 2)))),
                v_list(new ArrayList<>(asList(v_long(1L), v_long(2L), v_long(3L)))),
                v_list(new ArrayList<>(asList(v_long(4L), v_long(5L), v_long(6L)))),
                v_list(new ArrayList<>(asList(v_double(1f), v_double(.2f)))),
                v_list(new ArrayList<>(asList(v_double(3f), v_double(.4f))))};

        MethodData moreVariousParametersMethod =
            ContractExecutorServiceImpl.getMethodArgumentsValuesByNameAndParams(contractClass, "foo", params);
        //fixme
//        Assert.assertEquals(moreVariousParametersMethod.getMethod().toString(),
//            "public java.lang.Integer MethodParametersTest.foo(double,java.lang.Double,int,java.lang.Integer,double,java.lang.Double,java.util.List,java.util.List,java.util.List,java.util.List,java.util.List,java.util.List,java.util.List,java.util.List,java.util.List,java.util.List,java.util.List,java.util.List)");
//        Object invoke = moreVariousParametersMethod.getMethod()
//            .invoke(deserialize(contractState, classLoader), ContractExecutorServiceUtils.castValues(moreVariousParametersMethod.getArgTypes(), moreVariousParametersMethod.getArgValues()));
//        Integer invokeResult = (Integer) invoke;
//        Assert.assertEquals(new Integer(1), invokeResult);

    }

}
