package InMemoryModel;

import ModelElements.Camera;
import ModelElements.Flash;
import ModelElements.PoligonalModel;
import ModelElements.Scene;

import java.util.ArrayList;
import java.util.List;

public class ModelStore implements IModelChanger{
    public List<PoligonalModel> models;

    public List<Scene> scenes;
    public List<Flash> flashes;
    public List<Camera> cameras;
    private IModelChangeObserver[] changeObservers;

    public ModelStore(IModelChangeObserver[] changedObservers){
        this.changeObservers = changeObservers;
        this.models = new ArrayList<PoligonalModel>();
        this.scenes = new ArrayList<Scene>();
        this.flashes = new ArrayList<Flash>();
        this.cameras = new ArrayList<Camera>();

        models.add(new PoligonalModel());
        scenes.add(new Scene(0, models, flashes));
        flashes.add(new Flash());
        cameras.add(new Camera());

    }

    public Scene GetScena(int id){

        for (Scene scene : scenes) {
            if (scene.getId() == id) {
                return scene;
            }
        }
     return scenes.get(0);
    }
    @Override
    public void notifyChange(IModelChanger sender) {

    }
}
