package io.nuls.api.client.resource;

import io.nuls.api.entity.RpcClientResult;
import io.nuls.api.utils.RestFulUtils;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * @author: Charlie
 * @date: 2018/3/19
 */
public class ConsensusResourceTest {
    private static RestFulUtils util;
    private static String serverUri;

    @BeforeClass
    public static void init(){
        serverUri = "http://127.0.0.1:8765/nuls";
        util = RestFulUtils.getInstance();
        util.init(serverUri);
    }

    @Test
    public void addressTest(){
        RpcClientResult result = this.util.get("/consensus/address/2ChegErt2tJLC7Pp62p1wrqPz49w3Xo", null);
        System.out.println(result.toString());
    }
}
