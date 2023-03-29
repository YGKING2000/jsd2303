package ooday03;

/**
 * @Description 引用数据类型数组的演示
 * @ClassName RefArrayDemo
 * @Author YGKING  e-mail:hrd18960706057@163.com
 * @Date 2023/03/28 15:48
 * @Version 1.0
 */
public class RefArrayDemo {
    public static void main(String[] args) {
        // 声明一个int类型数组arr，包含10个元素，每个元素都是int类型，默认值是0
        int[] arr = new int[10];
        
        // 声明Dog类型数组dogs，包含3个元素，每个元素都是Dog类型，默认值是null
        Dog[] dogs = new Dog[3];
        dogs[0] = new Dog("小黑", 1, "黑色");
        dogs[1] = new Dog("小白", 2, "白色");
        dogs[2] = new Dog("小灰", 3, "灰色");
        for (Dog dog : dogs) {
            dog.lookHome();
            System.out.println(dog.age);
        }
        System.out.println();
    
        // 声明Chick类型数组chicks，包含3个元素，每个元素都是Chick类型，默认值是null
        Chick[] chicks = new Chick[2];
        chicks[0] = new Chick("小红", 4, "红色");
        chicks[1] = new Chick("小青", 5, "青色");
        for (Chick chick : chicks) {
            chick.layEggs();
            System.out.println(chick.color);
        }
        System.out.println();
        
        // 声明Fish类型数组fish，包含2个元素，每个元素都是Fish类型，默认值是null
        Fish[] fish = new Fish[4];
        fish[0] = new Fish("小蓝", 6, "蓝色");
        fish[1] = new Fish("小橙", 7, "橙色");
        fish[2] = new Fish("小兰", 8, "金色");
        fish[3] = new Fish("小河", 9, "褐色");
        for (Fish item : fish) {
            item.swim();
            System.out.println(item.name);
        }
    }
}
