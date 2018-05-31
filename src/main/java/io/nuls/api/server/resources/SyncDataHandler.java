package io.nuls.api.server.resources;

import io.nuls.api.constant.ErrorCode;
import io.nuls.api.entity.BlockHeader;
import io.nuls.api.entity.RpcClientResult;
import io.nuls.api.entity.Transaction;
import io.nuls.api.utils.RestFulUtils;
import io.nuls.api.utils.RpcTransferUtil;
import io.nuls.api.utils.log.Log;
import org.springframework.stereotype.Component;

import java.util.Map;

/**
 * 同步底层数据的处理器
 */
@Component
public class SyncDataHandler {

    private RestFulUtils restFulUtils = RestFulUtils.getInstance();

    /**
     * 按照高度同步区块
     *
     * @param height
     * @return
     */
    public RpcClientResult<BlockHeader> getBlockHeader(long height) {
        RpcClientResult result = restFulUtils.get("/block/height/" + height, null);
        if (result.isFaild()) {
            return result;
        }
        try {
            BlockHeader blockHeader = RpcTransferUtil.toBlockHeader((Map<String, Object>) result.getData());
            result.setData(blockHeader);
        } catch (Exception e) {
            Log.error(e);
            result = RpcClientResult.getFailed(ErrorCode.DATA_PARSE_ERROR);
        }
        return result;
    }


    public RpcClientResult<Transaction> getTransaction(String hash) {
        RpcClientResult result = restFulUtils.get("/tx/hash/" + hash, null);
        if (result.isFaild()) {
            return result;
        }
        try {
            Transaction tx = RpcTransferUtil.toTransaction((Map<String, Object>) result.getData());
            result.setData(tx);
        } catch (Exception e) {
            Log.error(e);
            result = RpcClientResult.getFailed(ErrorCode.DATA_PARSE_ERROR);
        }
        return result;
    }
}
