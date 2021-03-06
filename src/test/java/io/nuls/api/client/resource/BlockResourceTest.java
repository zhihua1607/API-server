package io.nuls.api.client.resource;

import io.nuls.api.entity.RpcClientResult;
import io.nuls.api.utils.RestFulUtils;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import java.util.HashMap;
import java.util.Map;

/**
 * @author: Charlie
 * @date: 2018/3/16
 */
public class BlockResourceTest {
    private static RestFulUtils util;
    private static String serverUri;

    @BeforeClass
    public static void init(){
        //serverUri = "http://192.168.1.201:8001";
        serverUri = "http://127.0.0.1:8765/nuls";
        util = RestFulUtils.getInstance();
       util.init(serverUri);
    }

    @Test
    public void loadBlockTest(){
        RpcClientResult result = RestFulUtils.getInstance().get("/block/hash/000020001bb7c923c3b8ef383baf8950337e8e7a4d836fedfae5888305781dba7a9a93",null);
        System.out.println(result.toString());
        Assert.assertTrue(result.isSuccess());
    }

    @Test
    public void getBlockTest(){
        RpcClientResult result = RestFulUtils.getInstance().get("/block/height/5",null);
        System.out.println(result.toString());
        Assert.assertTrue(result.isSuccess());
    }

    @Test
    public void newest(){
        RpcClientResult result = RestFulUtils.getInstance().get("/block/newest",null);
        System.out.println(result.toString());
        Assert.assertTrue(result.isSuccess());
    }


    @Test
    public void getHeaderByHeight(){
        RpcClientResult result = RestFulUtils.getInstance().get("/block/header/height/9",null);
        System.out.println(result.toString());
        Assert.assertTrue(result.isSuccess());
    }

    @Test
    public void getHeader(){
        RpcClientResult result = RestFulUtils.getInstance().get("/block/header/hash/000020001bb7c923c3b8ef383baf8950337e8e7a4d836fedfae5888305781dba7a9a93",null);
        System.out.println(result.toString());
        Assert.assertTrue(result.isSuccess());
    }

    @Test
    public void getList(){
        Integer pageSize = 20;
        Integer pageNumber = 1;
        Map<String, String> param = new HashMap<>();
        param.put("pageNumber", String.valueOf(pageNumber));
        param.put("pageSize", String.valueOf(pageSize));
        RpcClientResult result = RestFulUtils.getInstance().get("/block/list",param);
        System.out.println(result.toString());
        Assert.assertTrue(result.isSuccess());
    }

    @Test
    public void getListByAddress(){
        Integer pageSize = 10;
        Integer pageNumber = 1;
        String address = "2CW2BDqPPba3BDCsiocEDsTHqqqcwFN";
        int type = 1;
        Map<String, String> param = new HashMap<>();
        param.put("address",address);
        param.put("pageNumber", String.valueOf(pageNumber));
        param.put("pageSize", String.valueOf(pageSize));
        param.put("type", String.valueOf(type));
        RpcClientResult result = RestFulUtils.getInstance().get("/block/list/address",param);
        System.out.println(result.toString());
        Assert.assertTrue(result.isSuccess());
    }
}
