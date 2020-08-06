package net.sendcloud.common.utils.tree;

import java.util.List;

/**
 * @author tangzs
 * @date 2020/8/6
 * @description
 */
public interface  DataTree<T> {
    /**
     *  维护树形关系：元素一
     *
     *  @return Integer
     */
    public Integer getId();

    /**
     *  维护树形关系：元素二
     *
     *  @return Integer
     */
    public Integer getParentId();

    /**
     *  子节点数组
     *
     * @Param List<T></>
     */
    public void setChildren(List<T> children);

    /**
     * 子节点数组
     *
     * @return List<T></>
     */
    public List<T> getChildren();
}
