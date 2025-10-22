package ureksempel;

// Observer
public class AnalogtUrDisplay implements UrEngineObserver {

    @Override
    public void update(int tid) { // push
        System.out.println("Analogt " + tid);
    }

//    @Override
//    public void update(UrEngine ur) { // pull
//        int tid = ur.getTid();
//        System.out.println("Analogt " + tid);
//    }

//    private UrEngine ur; // generalized pull
//
//    public void setUrEngine(UrEngine ur) {
//        this.ur = ur;
//    }
//
//    @Override
//    public void update() { // pull generalized
//        int tid = ur.getTid();
//        System.out.println("Analogt " + tid);
//    }
}
