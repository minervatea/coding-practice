import java.util.concurrent.atomic.AtomicInteger;  

class FooBar {
    private int n;
    private AtomicInteger fooDone = new AtomicInteger(0);
    private AtomicInteger barDone = new AtomicInteger(0);

        
    public FooBar(int n) {
        this.n = n;

    }

    public void foo(Runnable printFoo) throws InterruptedException {
        
        for (int i = 0; i < n; i++) {
            while(fooDone.get() ==1 && barDone.get() == 0){
                
            }
            printFoo.run();
            fooDone.incrementAndGet();
            if(barDone.get() ==1){
                barDone.decrementAndGet();
            }else{}
            }
        }
    

    public void bar(Runnable printBar) throws InterruptedException {
        
        for (int i = 0; i < n; i++) {
            
            // printBar.run() outputs "bar". Do not change or remove this line.
            while(fooDone.get() == 0){

            }

            printBar.run();
            fooDone.decrementAndGet();
            barDone.incrementAndGet();
            
        }
    }
}