package cn.itcast.algorithm.test;

import cn.itcast.algorithm.uf.UF;
import cn.itcast.algorithm.uf.UF_Tree;

import java.util.Scanner;

public class UFTeeTest {

    public static void main(String[] args) {

        //创建并查集对象
        UF_Tree uf = new UF_Tree(5);
        System.out.println("默认情况下，并查集中有："+uf.count()+"个分组");

        //从控制台录入两个要合并的元素，调用union方法合并，观察合并后并查集中的分组是否减少
        Scanner sc = new Scanner(System.in);

        while(true){
            System.out.println("请输入第一个要合并的元素：");
            int p = sc.nextInt();
            System.out.println("请输入第二个要合并的元素：");
            int q = sc.nextInt();

            //判断这两个元素是否已经在同一组了
            if (uf.connected(p,q)){
                System.out.println(p+"元素和"+q+"元素已经在同一个组中了");
                continue;
            }

            uf.union(p,q);
            System.out.println("当前并查集中还有："+uf.count()+"个分组");

        }


    }
}
