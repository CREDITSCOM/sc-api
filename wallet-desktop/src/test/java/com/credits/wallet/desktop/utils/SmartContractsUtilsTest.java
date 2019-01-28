package com.credits.wallet.desktop.utils;

import com.credits.general.exception.CreditsException;
import org.junit.Test;

import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;

import static com.credits.wallet.desktop.utils.SmartContractsUtils.checkCoinNameExist;
import static org.junit.Assert.assertEquals;

/**
 * Created by Rustem Saidaliyev on 20-Mar-18.
 */
public class SmartContractsUtilsTest {

    @Test
    public void generateSmartContractHashStateTest() throws CreditsException {
        String source = "public class Contract extends SmartContract { public Contract() { total = 0; } }";
        String actual = SmartContractsUtils.generateSmartContractHashState(source.getBytes());
        assertEquals("A2CDBFDF50500999AEE29823F7D284D7", actual);
    }


    @Test
    public void checkCoinNameExistTest() {
        HashMap<String, String> coins = new HashMap<>();
        assertEquals("Contract", checkCoinNameExist("Contract", coins));
    }

    @Test
    public void checkCoinNameExistOneContract() {
        HashMap<String, String> coins = new HashMap<>();
        coins.put("Contract", "");
        assertEquals("Contract(1)", checkCoinNameExist("Contract", coins));
    }

    @Test
    public void checkCoinNameExistMultipleNames() {
        ConcurrentHashMap<String, String> coins = new ConcurrentHashMap<>();
        coins.put("Contract", "");
        coins.put("Contract(3)", "");
        coins.put("Contract(1)", "");
        coins.put("Contract(2)", "");
        assertEquals("Contract(4)", checkCoinNameExist("Contract", coins));
    }
}
