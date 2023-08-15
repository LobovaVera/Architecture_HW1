package ModelElements;

import java.util.ArrayList;
import java.util.List;

public class PoligonalModel {
    public List<Poligon> poligons;
    public List<Texture> textures;
    public PoligonalModel(){
        this.poligons = new ArrayList<>();
        this.textures = new ArrayList<>();
    }
}
