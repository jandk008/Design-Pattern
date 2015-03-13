package design.pattern;
/*

*/

public class TestFactory {
	public static void main (String[] args){
	      Consumer.useService(ServiceImplement.factory1);
	      Consumer.useService(ServiceImplement.factory2);
	      ServiceImplement s = new ServiceImplement();
	      ServiceImplement.b b = new ServiceImplement.b();
	      b.f();
	 }
}

 interface Service {
	 void service1();
	 void service2();
 }

 interface Factory {
	 Service getService();
 }

 class ServiceImplement {
	 public static Factory factory1 = new Factory() {
		public Service getService() {
			// TODO 自動生成されたメソッド・スタブ
			class Imp1 implements Service{
				public void service1(){
					System.out.println("1"+2+2);
				}
				public void service2() {
					System.out.println("2"+(1+2));
				}
			}
			return new Imp1();
		}
	 };
	 public static Factory factory2 = new Factory() {
			public Service getService() {
				// TODO 自動生成されたメソッド・スタブ
				class Imp2 implements Service{
					public void service1(){
						System.out.println("here is in service1 of  Imp2 ");
					}
					public void service2() {
						System.out.println("here is in service2 of imp2");
					}
				}
				return new Imp2();
			}
		 };
		 static class b {
			 int n = 1;
			 void f(){
				 System.out.println("here is inner class b");
			 }
		 }
 }

 class Consumer{
	 public static void useService (Factory f){
		 Service s = f.getService();
		  s.service1();
		  s.service2();
	 }

 }
