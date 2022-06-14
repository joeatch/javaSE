package com.calss;

/*面向对象编程的三大特征：封装、继承、多态
    封装：告诉我们，如何正确设计对象的属性和方法。
       封装的原则：对象代表什么，就得封装对应的数据，并提供数据对应的行为。
       如何进行封装更好？
          一般会把成员变量使用private隐藏起来，对外就不能直接访问了。
*         提供public修饰的getter和setter方法暴露其取值和赋值。

   javaBean
        实体类，其对象可以用于在程序中封装数据。
*       标准JavaBean须满足如下书写要求：
            成员变量使用 private 修饰。
            提供成员变量对应的 setXxx() / getXxx()方法。
            必须提供一个无参构造器；有参数构造器是可写可不写的。
* */
public class classDemo2 {
    /*
    * 使用面向对象编程，模仿电影信息的展示。
    *
    * */
    public static void main(String[] args) {
        Movie movie1=new Movie("长津湖","中国","剧情","陈凯歌","吴京");
        Movie movie2=new Movie("长津湖2","中国","历史","陈凯歌","吴京");
//       数组中存储的元素并不是对象本身，而是对象的地址。
        Movie[] movies={movie1,movie2};
        for(Movie movie:movies){
            System.out.println(movie.name);
            System.out.println(movie.area);
            System.out.println(movie.type);
            System.out.println(movie.director);
            System.out.println(movie.actor);
            System.out.println("===========");
        }
    }

    public static class Movie{
        private String name;
        private String area;
        private String type;
        private String director;
        private String actor;

//        无参构造
        public Movie(){

        }
//        有参构造
        public Movie(String name,String area,String type,String director,String actor){
                this.name=name;
                this.area=area;
                this.type=type;
                this.director=director;
                this.actor=actor;
        }

    }
}
