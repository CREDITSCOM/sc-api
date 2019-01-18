package com.credits.service.contract;

import com.credits.general.pojo.ByteCodeObjectData;
import com.credits.general.thrift.generated.Variant;
import com.credits.service.ServiceTest;
import com.credits.thrift.ReturnValue;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static com.credits.general.thrift.generated.Variant.v_int;
import static com.credits.general.thrift.generated.Variant.v_string;

public class CompilationTest extends ServiceTest {

    @Before
    public void setUp() throws Exception {
        super.setUp();
    }

    @Test
    public void initiator_init() throws Exception {
        String sourceCode = readSourceCode("/compilationTest/Contract.java");
        List<ByteCodeObjectData> byteCodeObjects =
            compileSourceCode(sourceCode);

        byte[] contractState =
            ceService.execute(initiatorAddress, contractAddress, byteCodeObjects, null, null, null, 500L).getContractState();

        ReturnValue result = ceService.execute(initiatorAddress, contractAddress, byteCodeObjects, contractState, "addBalance",
            new Variant[][] {{v_string("5B3YXqDTcWQFGAqEJQJP3Bg1ZK8FFtHtgCiFLT5VAxpe"), v_int(4)}}, 500L);
        ReturnValue result1 =
            ceService.execute(initiatorAddress, contractAddress, byteCodeObjects, result.getContractState(), "getUserBalance",
                new Variant[][] {{v_string("5B3YXqDTcWQFGAqEJQJP3Bg1ZK8FFtHtgCiFLT5VAxpe")}}, 500L);
    }
}