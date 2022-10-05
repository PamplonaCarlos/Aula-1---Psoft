import java.util.Map;
import java.util.HashMap;

public class LoteRepositorio {
    private Lote[] lotes = new Lote[10];
    private int counter = 0;

    public void addProduct(Lote lote) {
        lotes[counter] = lote;
        counter++;
        if (counter == lotes.length){
            resize();
        }
    }

    private void resize(){
        Lote[] lotesTemp = lotes;
        this.lotes = new Lote[lotes.length * 2];
        for(int i = 0; i<lotesTemp.length; i++){
            this.lotes[i] = lotesTemp[i];
        }
    }

    public Lote[] getLote(int index){
        return lotes;
    }
}
