package ModelElements;

import java.util.ArrayList;
import java.util.List;

public class Scene {


    public int id;
    public List<PoligonalModel> models = new ArrayList<>();
    public List<Flash> flashes;
    public List<Camera> cameras = new ArrayList<>(); //тут я не уверена в схеме камера не прописана, а стрелочка есть

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Scene(int id, List<PoligonalModel> models, List<Flash> flashes) {
        this.id = id;
        //можно проверить id на уникальность
        this.models = models;
        this.flashes = flashes;


    }

    
    public <T> Object method1(T type){
        return type;
    }

    // тут я не очень поняла, как нужно было сделать
    public <T, t> Object method1(T type1, t type2){
        return type2;
    }


}
