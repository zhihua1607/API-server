package io.nuls.api.server.business;

import io.nuls.api.server.dao.mapper.AliasMapper;
import io.nuls.api.entity.Alias;
import io.nuls.api.entity.AliasParam;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class AliasBusiness {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table alias
     *
     * @mbggenerated
     */
    private static Logger logger = LoggerFactory.getLogger(AliasBusiness.class);

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table alias
     *
     * @mbggenerated
     */
    @Autowired 
    private AliasMapper aliasMapper;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table alias
     *
     * @mbggenerated
     */
    @Transactional(propagation=Propagation.REQUIRED,isolation =Isolation.REPEATABLE_READ, rollbackFor = Exception.class)
    public int insertSelective(Alias obj) throws Exception {
        if(obj  == null ){
            return 0;
        }
        return this.aliasMapper.insertSelective(obj);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table alias
     *
     * @mbggenerated
     */
    @Transactional(propagation=Propagation.REQUIRED,isolation =Isolation.REPEATABLE_READ, rollbackFor = Exception.class)
    public int insertSelective(List<Alias> list) throws Exception {
        int insertCount = 0;
        if (list == null || list.size() == 0) {
            return insertCount;
        }
        for (Alias  obj : list) {
            if (obj == null) {
                continue;
            }
            try {
                insertCount += this.aliasMapper.insertSelective(obj);
            } catch (Exception e) {
                throw e;
            }
        }
        return insertCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table alias
     *
     * @mbggenerated
     */
    @Transactional(propagation=Propagation.REQUIRED,isolation =Isolation.REPEATABLE_READ, rollbackFor = Exception.class)
    public int update(Alias obj) throws Exception {
        if(obj  == null ){
            return 0;
        }
        return this.aliasMapper.updateByPrimaryKeySelective(obj);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table alias
     *
     * @mbggenerated
     */
    @Transactional(propagation=Propagation.REQUIRED,isolation =Isolation.REPEATABLE_READ, rollbackFor = Exception.class)
    public int update(List<Alias> list) throws Exception {
        int updateCount = 0;
        if (list == null || list.size() == 0) {
            return updateCount;
        }
        for (Alias  obj : list) {
            if (obj == null) {
                continue;
            }
            try {
                updateCount += this.aliasMapper.updateByPrimaryKeySelective(obj);
            } catch (Exception e) {
                throw e;
            }
        }
        return updateCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table alias
     *
     * @mbggenerated
     */
    public List<Alias> selectAliasList(AliasParam param) throws Exception {
        return this.aliasMapper.selectByExample(param);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table alias
     *
     * @mbggenerated
     */
    public int countAliasList(AliasParam param) throws Exception {
        return this.aliasMapper.countByExample(param);
    }
}