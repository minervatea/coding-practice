/**
  Suppose we have a class:

public class Foo {
    public void first() { print("first"); }
    public void second() { print("second"); }
    public void third() { print("third"); }
  }
  
  The same instance of Foo will be passed to three different threads. 
  Thread A will call first(), thread B will call second(), and thread C will call third(). 
  Design a mechanism and modify the program to ensure that second() is executed after first(), and third() is executed after second().

*/
class Foo {

    public Foo() {
        
    }
    public static int calls;

    public void first(Runnable printFirst) throws InterruptedException {
        synchronized(this){
            try{
                if(calls==0){
                    printFirst.run();
                    calls++;
                    notify();
                }else{
                    wait();
                }
            }catch (InterruptedException e){
                e.printStackTrace();                
            }
        }
    }
        

    public void second(Runnable printSecond) throws InterruptedException {
   synchronized(this){
            try{
                if(calls==1){
                    printSecond.run();
                    calls++;
                    notify();
                    System.out.println("second done and notified");
                }else{
                    wait();
                    System.out.println("second waiting");
                }
            }catch (InterruptedException e){
                e.printStackTrace();                
            }
        }
    }

    public void third(Runnable printThird) throws InterruptedException {
       synchronized(this){
            try{
                if(calls==2){
                    printThird.run();
                    calls++;
                    notify();
                }else{
                    wait();
                }
            }catch (InterruptedException e){
                e.printStackTrace();                
            }
        }
}
}