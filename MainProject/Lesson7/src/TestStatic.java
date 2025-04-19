import java.time.LocalDateTime;
import java.util.Locale;

public class TestStatic {
    public static int staticProperty = 100;
    public static final float PI =3.14f ;
    public int num =10;
    public TestStatic(){
    }
    public static void print(){
        System.out.println("print");
    }

    public final void doing(){
        System.out.println("doing");
    }

    public void test( int a){
        a =10;
    }


}
