package demo;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * Description: 杨辉三角
 * 给定一个非负整数 numRows，生成杨辉三角的前 numRows 行。
 * User: HHH.Y
 * Date: 2020-05-12
 */

public class TestDemo {
    public static List<List<Integer>> generate(int numRows) {
        // 1. 将杨辉三角的每一行都当成一个集合, 将每一行都存储到一个集合中
        List< List<Integer> > ret = new ArrayList<>();
        // 2. 如果当前行为0, 就应该返回一个空的集合
        if(numRows == 0) {
            return ret;
        }
        // 3. 每一行都是一个集合, 都需要被创建. 创建第一行
        ret.add(new ArrayList<>());
        // 4. 第一行元素只有1
        ret.get(0).add(1);
        // 5. 从第二行开始, 每一行的第一个元素和最后一个元素都是1
        for (int i = 1; i < numRows; i++) {
            List<Integer> curRow = new ArrayList<>();
            curRow.add(1);
            // 获得前一行
            List<Integer> prevRow = ret.get(i - 1);
            for (int j = 1; j < i; j++) {
                // 添加中间的元素
                // [i, j] = [i-1, j] + [i-1, j-1]
                int x = prevRow.get(j);
                int y = prevRow.get(j-1);
                curRow.add(x + y);
            }
            curRow.add(1);
            ret.add(curRow);
        }
        return ret;
    }

    public static void main(String[] args) {
        List<List<Integer>> ret = generate(5);
        for (List<Integer> list:ret) {
            System.out.println(list);
        }
        System.out.println();
    }
}
