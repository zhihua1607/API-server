package io.nuls.api.server.task;

import io.nuls.api.counter.QueryCounter;
import io.nuls.api.server.dao.ReportDAO;
import io.nuls.api.server.resources.QueryHelper;
import io.nuls.api.utils.log.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Component
public class MinedTask {

    @Autowired
    private ReportDAO reportDAO;

    @Transactional(propagation= Propagation.REQUIRED,isolation = Isolation.REPEATABLE_READ, rollbackFor = Exception.class)
    public void execute() {
        Log.debug("start to execute mined report");
        reportDAO.mined();
        TaskHelper.HELPER.queryReset(this);
        Log.debug("the mined report completed");
    }
}


