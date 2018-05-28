package com.credits.thrift;

import com.credits.exception.ContractExecutorException;
import com.credits.service.contract.ContractExecutorService;
import com.credits.service.usercode.UserCodeStorageService;
import org.apache.commons.io.FileUtils;
import org.apache.thrift.TException;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.List;

@Component
public class ContractExecutorHandler implements ContractExecutor.Iface {

    private final static String SER_SOURCE_FOLDER_PATH = System.getProperty("user.dir") + File.separator + "credits";
    private final static String SER_TEMP_FOLDER_PATH = File.separator + "temp" + File.separator;

    @Resource
    private UserCodeStorageService storageService;

    @Resource
    private ContractExecutorService service;


    @Override
    public APIResponse store(ContractFile file, String address, String specialProperty) {
        String fileName = file.getName();
        byte[] fileContent = file.getFile();
        File sourceFile = new File(SER_SOURCE_FOLDER_PATH + File.separator + address + SER_TEMP_FOLDER_PATH + fileName);
        File tempFolder = sourceFile.getParentFile();

        APIResponse response = new APIResponse((byte) 0, "");
        try {
            FileUtils.writeByteArrayToFile(sourceFile, fileContent);
            storageService.store(sourceFile, address);
            sourceFile.delete();
            tempFolder.delete();
            service.execute(address, specialProperty);
        } catch (ContractExecutorException | IOException e) {
            response.setCode((byte) 1);
            response.setMessage(e.getMessage());
            return response;
        }
        return response;
    }

    @Override
    public APIResponse execute(String address, String method, List<String> params) {
        String[] paramsArray = params == null ? null : params.toArray(new String[0]);
        APIResponse response = new APIResponse((byte) 0, "");
        try {
            service.execute(address, method, paramsArray);
        } catch (ContractExecutorException e) {
            response.setCode((byte) 1);
            response.setMessage(e.getMessage());
            return response;
        }
        return response;
    }

    @Override
    public APIResponse executeByteCode(String address, ByteBuffer byteCode, String method, List<String> params)
        throws TException {
        String[] paramsArray = params == null ? null : params.toArray(new String[0]);
        APIResponse response = new APIResponse((byte) 0, "");
        try {
            service.execute(address, byteCode.array(), method, paramsArray);
        } catch (ContractExecutorException e) {
            response.setCode((byte) 1);
            response.setMessage(e.getMessage());
            return response;
        }
        return response;
    }
}
