package demo;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: HHH.Y
 * Date: 2020-05-12
 */
// 使用A这个泛型
class A<T> {
    T value;

    A(T value) {
        this.value = value;
    }

    T get() {
        return value;
    }
}
public class TestDemo1 {
    public static void main(String[] args) {
        A<String> a = new A<>("hello");
        System.out.println(a.get());
    }
}
