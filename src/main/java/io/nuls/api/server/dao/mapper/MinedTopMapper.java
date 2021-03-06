package io.nuls.api.server.dao.mapper;

import io.nuls.api.entity.MinedTop;
import io.nuls.api.entity.MinedTopParam;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface MinedTopMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mined_top
     *
     * @mbggenerated
     */
    int countByExample(MinedTopParam example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mined_top
     *
     * @mbggenerated
     */
    int deleteByExample(MinedTopParam example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mined_top
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mined_top
     *
     * @mbggenerated
     */
    int insert(MinedTop record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mined_top
     *
     * @mbggenerated
     */
    int insertSelective(MinedTop record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mined_top
     *
     * @mbggenerated
     */
    List<MinedTop> selectByExample(MinedTopParam example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mined_top
     *
     * @mbggenerated
     */
    MinedTop selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mined_top
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") MinedTop record, @Param("example") MinedTopParam example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mined_top
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") MinedTop record, @Param("example") MinedTopParam example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mined_top
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(MinedTop record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mined_top
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(MinedTop record);
}