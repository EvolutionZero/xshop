package com.victoria.xshop.project.goods.mapper;


import java.util.List;

public interface BaseMapper<E> {
    /**
     * @Title save
     * @param record
     * @return int
     */
    int save(E record);

    /**
     * @Title updateById
     * @param record
     * @return int
     */
    int updateById(E record);

    /**
     * @Title findById
     * @param id
     * @return E
     */
    E findById(Integer id);

    /**
     * @Title deleteById
     * @param id
     * @return int
     */
    int deleteById(Integer id);

    /**
     * @Title list
     * @param record
     * @return E>
     */
    List<E> list(E record);

    /**
     * @Title count
     * @param record
     * @return int
     */
    int count(E record);
}
