class work extends Thread {
   
    int workassign;

    work(int workassign) {        
        this.workassign = workassign;
        start();
    }

    public void run() {
        try {
            for (int i = 0; i < workassign; i++) {
                System.out.println(i + " work in progres");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("work done");
    }

}

class ThreadJoin {
        public static void main(String[] args) {
        System.out.println("maneger work started");
        System.out.println("work assigned");
        Thread te = new work(5);
        try {
            te.join();
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(" worker is alive ?" + te.isAlive());
        System.out.println("maneger is alive ?" + Thread.currentThread().isAlive());
    }
}