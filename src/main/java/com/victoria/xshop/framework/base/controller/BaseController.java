package com.victoria.xshop.framework.base.controller;


import java.util.List;

public interface BaseController<E> {
    /**
     * @Title save
     * @param record
     * @return int
     */
    E save(E record);

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
    List<E> listByPost(E record);

    /**
     * @Title list
     * @param record
     * @return E>
     */
    List<E> listByGet(E record);

    /**
     * @Title count
     * @param record
     * @return int
     */
    int countByPost(E record);

    /**
     * @Title count
     * @param record
     * @return int
     */
    int countByGet(E record);
}
