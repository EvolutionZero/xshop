package com.victoria.xshop.tree;

import com.victoria.xshop.model.Region;

import java.util.LinkedList;
import java.util.List;

public class RegionNode {

    private RegionNode parent;
    private Region self;
    private List<RegionNode> childs = new LinkedList<>();

    public RegionNode(Region self) {
        this.self = self;
    }

    public Region getSelf() {
        return self;
    }

    public void setSelf(Region self) {
        this.self = self;
    }

    public RegionNode getParent() {
        return parent;
    }

    public void setParent(RegionNode parent) {
        this.parent = parent;
    }

    public List<RegionNode> getChilds() {
        return childs;
    }

    public void setChilds(List<RegionNode> childs) {
        this.childs = childs;
    }
}
