package com.victoria.xshop.common.tree;

import com.victoria.xshop.project.user.bean.po.Region;
import com.victoria.xshop.project.user.controller.LoginController;

import java.util.*;

public class RegionTree {

    private Set<RegionNode> roots = new HashSet<>();
    private List<RegionNode> nodes = new LinkedList<>();

    public RegionTree() {
    }

    public void add(Region region){
        // 初始化节点
        RegionNode regionNode = new RegionNode(region);

        // 添加父子关系
        for (RegionNode node: nodes ) {
            if(node != null && region.getParentId() != null && node.getSelf() != null && region.getParentId().longValue() == node.getSelf().getId().longValue()){
                regionNode.setParent(node);
                node.getChilds().add(regionNode);


            }
        }

        // 增加节点
        nodes.add(regionNode);

        // 没有父节点则当作根节点
        if(regionNode.getParent() == null){
            roots.add(regionNode);
        }

        // 重置根节点
        Iterator<RegionNode> iterator = roots.iterator();
        while(iterator.hasNext()){
            RegionNode root = iterator.next();
            if(root.getParent() != null){
                iterator.remove();
            }
        }
    }


    public List<Map<String, Object>> printfTree(){
        List<Map<String, Object>> trees = new LinkedList<>();
        for (RegionNode root: roots ) {
            trees.add(printfTree(root));
        }
        return trees;

    }


    private Map<String, Object> printfTree(RegionNode node){
        if(node.getChilds().isEmpty()){
            Map<String, Object> jsonMap = new HashMap<>();
            jsonMap.put("id" , node.getSelf().getId());
            jsonMap.put("name" , node.getSelf().getName());

            return jsonMap;

        } else {
            Map<String, Object> jsonMap = new HashMap<>();
            List<RegionNode> childs = node.getChilds();
            LinkedList<Map<String, Object>> array = new LinkedList<>();
            for (RegionNode child: childs ) {
                array.add(printfTree(child));
            }
            jsonMap.put(node.getSelf().getName(), array);
            jsonMap.put("id", node.getSelf().getId());
            return jsonMap;

        }
    }
}
