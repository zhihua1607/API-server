package io.nuls.api.server.business;

import io.nuls.api.entity.MinedTop;
import io.nuls.api.entity.MinedTopParam;
import io.nuls.api.server.dao.mapper.MinedTopMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class MinedTopBusiness implements CounterInterface<MinedTopParam>{
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table mined_top
     *
     * @mbggenerated
     */
    private static Logger logger = LoggerFactory.getLogger(MinedTopBusiness.class);

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table mined_top
     *
     * @mbggenerated
     */
    @Autowired 
    private MinedTopMapper minedTopMapper;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mined_top
     *
     * @mbggenerated
     */
    @Transactional(propagation=Propagation.REQUIRED,isolation =Isolation.REPEATABLE_READ, rollbackFor = Exception.class)
    public int insertSelective(MinedTop obj) throws Exception {
        if(obj  == null ){
            return 0;
        }
        return this.minedTopMapper.insertSelective(obj);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mined_top
     *
     * @mbggenerated
     */
    @Transactional(propagation=Propagation.REQUIRED,isolation =Isolation.REPEATABLE_READ, rollbackFor = Exception.class)
    public int insertSelective(List<MinedTop> list) throws Exception {
        int insertCount = 0;
        if (list == null || list.size() == 0) {
            return insertCount;
        }
        for (MinedTop  obj : list) {
            if (obj == null) {
                continue;
            }
            try {
                insertCount += this.minedTopMapper.insertSelective(obj);
            } catch (Exception e) {
                throw e;
            }
        }
        return insertCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mined_top
     *
     * @mbggenerated
     */
    public MinedTop getMinedTopByKey(Long key) throws Exception {
        return this.minedTopMapper.selectByPrimaryKey(key);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mined_top
     *
     * @mbggenerated
     */
    @Transactional(propagation=Propagation.REQUIRED,isolation =Isolation.REPEATABLE_READ, rollbackFor = Exception.class)
    public int update(MinedTop obj) throws Exception {
        if(obj  == null ){
            return 0;
        }
        return this.minedTopMapper.updateByPrimaryKeySelective(obj);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mined_top
     *
     * @mbggenerated
     */
    @Transactional(propagation=Propagation.REQUIRED,isolation =Isolation.REPEATABLE_READ, rollbackFor = Exception.class)
    public int update(List<MinedTop> list) throws Exception {
        int updateCount = 0;
        if (list == null || list.size() == 0) {
            return updateCount;
        }
        for (MinedTop  obj : list) {
            if (obj == null || obj.getId() == null || obj.getId() <= 0 ) {
                continue;
            }
            try {
                updateCount += this.minedTopMapper.updateByPrimaryKeySelective(obj);
            } catch (Exception e) {
                throw e;
            }
        }
        return updateCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mined_top
     *
     * @mbggenerated
     */
    public List<MinedTop> selectMinedTopList(MinedTopParam param) throws Exception {
        return this.minedTopMapper.selectByExample(param);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mined_top
     *
     * @mbggenerated
     */
    public int countMinedTopList(MinedTopParam param) {
        return this.minedTopMapper.countByExample(param);
    }

    @Override
    public int countTableList(MinedTopParam param) {
        return this.minedTopMapper.countByExample(param);
    }
}