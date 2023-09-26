package temp;

public class SingleTest {

    // 懒汉式
    public static class Singleton {

        private static final Singleton singleton =  new Singleton();;
        private Singleton(){

        }
        public static Singleton getSingleton(){
            return singleton;
        }
    }

    // 饿汉式
    public static class Singleton1 {

        private static Singleton1 singleton =  null;;
        private Singleton1(){

        }
        public static Singleton1 getSingleton(){
            singleton = new Singleton1();
            return singleton;
        }
    }
    // DDC

    public static class Singleton2 {
        private static Singleton2 singleton2 = null;

        private Singleton2() {
        }

        public static Singleton2 getSingleton2(){
            if (singleton2 == null) {
                synchronized (Singleton2.class) {
                    if (singleton2 == null) {
                        singleton2 = new Singleton2();
                    }
                }
            }
            return singleton2;
        }
    }

    public static void main(String[] args) {
        Singleton singleton = Singleton.getSingleton();
    }
}
