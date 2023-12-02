package d8.stream;

// 인터페이스의 구현체
public class NoArgRetFunctionImpl implements NoArgRetFunction{
    @Override
    public void noArgNoReturn() {
        System.out.println("Traditional Implementation");
    }
}
