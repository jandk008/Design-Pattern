package design.pattern;
/*
* This class is usded to see how the callback works and how useful inner class is 
*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class TestInnerClass {
	class A {
		void a(){
			System.out.println( "a");
		}
	}
	Father g(String s){
		return new Father(s){
			void f(){
				System.out.println(s);
			}
		};
	}
	A getA(){
		return new A();
	}
    	public	 void f(){
    			 System.out.println("here is ");
    		 }
     public static void main (String[] args){
    	 TestInnerClass innerClass = new TestInnerClass();
    	 innerClass.getA().a();
    	Father f = innerClass.g("hello");
    	f.f();
    	Collection<String> collection = new ArrayList<String>();
//        Collections.addAll(collection, "hello","i","love","you");
    	collection.addAll(Arrays.asList( "hello","i","love","you"));
    	 System.out.println(collection);
     }
  }
  class Father{
	   String s ;
	   Father(String s ){
		   this.s = s;
	   }
	   void f (){
	   }
  }



