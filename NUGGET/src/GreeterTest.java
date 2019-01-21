import com.persistent.app.*;


public class GreeterTest {
public static void main(String[] args) {
	Greeter n1=new Greeter(args[0]);
	Greeter n2=new Greeter(args[1]);
	Advisor a=new Advisor();
	System.out.println(n1.sayHello());
	System.out.println(n2.sayHello());
	System.out.println("Advice: "+a.getAdvice());
	System.out.println(n1.sayGoodBye());
	System.out.println(n2.sayGoodBye());
}
}
