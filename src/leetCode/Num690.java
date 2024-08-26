package leetCode;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Num690 {
    Map<Integer, Employee> map = new HashMap<>();
    class Employee {
        public int id;
        public int importance;
        public List<Integer> subordinates;
    }
    public int getImportance(List<Employee> employees, int id) {
        int n = employees.size();
        for (int i = 0; i < n; i++) {
            map.put(employees.get(i).id,employees.get(i));
        }
        return getVal(id);
    }

    private int getVal(int id) {
        Employee master = map.get(id);
        int ans = master.importance;
        for(int oid : master.subordinates) {
            Employee other = map.get(oid);
            ans += other.importance;
            for (int sub : other.subordinates) {ans += getVal(sub);}
        }
        return ans;
    }
}
