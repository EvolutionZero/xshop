package com.victoria.xshop.common.tree;

import com.victoria.xshop.project.user.controller.LoginController;
import  com.victoria.xshop.project.user.model.Region;

import java.util.*;

public class RegionTree {

    private Set<LoginController.RegionNode> roots = new HashSet<>();
    private List<LoginController.RegionNode> nodes = new LinkedList<>();

    public RegionTree() {
    }

    public void add(Region region){
        // 初始化节点
        LoginController.RegionNode regionNode = new LoginController.RegionNode(region);

        // 添加父子关系
        for (LoginController.RegionNode node: nodes ) {
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
        Iterator<LoginController.RegionNode> iterator = roots.iterator();
        while(iterator.hasNext()){
            LoginController.RegionNode root = iterator.next();
            if(root.getParent() != null){
                iterator.remove();
            }
        }
    }


    public List<Map<String, Object>> printfTree(){
        List<Map<String, Object>> trees = new LinkedList<>();
        for (LoginController.RegionNode root: roots ) {
            trees.add(printfTree(root));
        }
        return trees;

    }


    private Map<String, Object> printfTree(LoginController.RegionNode node){
        if(node.getChilds().isEmpty()){
            Map<String, Object> jsonMap = new HashMap<>();
            jsonMap.put("id" , node.getSelf().getId());
            jsonMap.put("name" , node.getSelf().getName());

            return jsonMap;

        } else {
            Map<String, Object> jsonMap = new HashMap<>();
            List<LoginController.RegionNode> childs = node.getChilds();
            LinkedList<Map<String, Object>> array = new LinkedList<>();
            for (LoginController.RegionNode child: childs ) {
                array.add(printfTree(child));
            }
            jsonMap.put(node.getSelf().getName(), array);
            jsonMap.put("id", node.getSelf().getId());
            return jsonMap;

        }
    }
}
