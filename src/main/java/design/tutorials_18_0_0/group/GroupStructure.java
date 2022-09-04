package design.tutorials_18_0_0.group;

import design.tutorials_18_0_0.lang.Collection;
import design.tutorials_18_0_0.lang.Iterator;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class GroupStructure implements Collection<Employee, Link> {

    private String groupId;
    private String groupName;

    private Map<String, Employee> employeeMap = new ConcurrentHashMap<>();
    private Map<String, List<Link>> linkMap = new ConcurrentHashMap<>();
    private Map<String, String> invertedMap = new ConcurrentHashMap<>();

    public GroupStructure(String groupId, String groupName){
        this.groupId = groupId;
        this.groupName = groupName;
    }

    @Override
    public boolean add(Employee employee) {
        return null != employeeMap.put(employee.getUId(), employee);
    }

    @Override
    public boolean remove(Employee employee) {
        return null != employeeMap.remove(employee.getUId());
    }

    @Override
    public boolean addLink(String key, Link link) {
        invertedMap.put(link.getToId(), link.getFromId());
        if(linkMap.containsKey(key)){
            return linkMap.get(key).add(link);
        } else{
            LinkedList<Link> links = new LinkedList<>();
            links.add(link);
            linkMap.put(key, links);
            return true;
        }
    }

    @Override
    public boolean removeLink(String key) {
        return null != linkMap.remove(key);
    }

    @Override
    public Iterator<Employee> iterator() {
        return new Iterator<Employee>() {

            HashMap<String, Integer> keyMap = new HashMap<>();

            int totalIdx = 0;
            private String fromId = groupId;
            private String toId = groupId;

            @Override
            public boolean hasNext() {
                return totalIdx < employeeMap.size();
            }

            @Override
            public Employee next() {

                List<Link> links = linkMap.get(toId);
                int cursorIdx = getCursorIdx(toId);

                //同级节点扫描
                if(null == links){
                    cursorIdx = getCursorIdx(fromId);
                    links = linkMap.get(fromId);
                }

                //上级节点扫描
                while (cursorIdx > links.size() - 1){
                    fromId = invertedMap.get(fromId);
                    cursorIdx = getCursorIdx(fromId);
                    links = linkMap.get(fromId);
                }

                //获取节点
                Link link = links.get(cursorIdx);
                toId = link.getToId();
                fromId = link.getFromId();
                totalIdx++;

                return employeeMap.get(link.getToId());
            }

            public int getCursorIdx(String key){
                int idx = 0;
                if(keyMap.containsKey(key)){
                    idx = keyMap.get(key);
                    keyMap.put(key, ++idx);
                } else{
                    keyMap.put(key,idx);
                }
                return idx;
            }
        };
    }
}
