package ejercicios3.observer_5;

import java.util.ArrayList;

public class CanalYoutube implements ISubject {
    private ArrayList<IObserver> observers = new ArrayList<>();

    private ArrayList<Video> videos = new ArrayList<>();

    private String nombreCanal;

    public CanalYoutube(String nombreCanal) {
        this.nombreCanal = nombreCanal;
    }

    @Override
    public void attach(IObserver observer) {
        this.observers.add(observer);
    }

    @Override
    public void deAttach(IObserver observer) {
        this.observers.remove(observer);
    }

    @Override
    public void notifyObserver() {
        for (IObserver observer : observers) {
            if (observer.categorias.contains(videos.get(videos.size()-1).getCategoría())) {
                observer.update(this.nombreCanal + " ha subido un nuevo video.");
            }
        }
    }

    public void subirNuevoVideo(Video v){
        videos.add(v);
        notifyObserver();
    }

}
