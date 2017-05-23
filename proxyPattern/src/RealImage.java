/**
 * Created by Biks on 5/23/2017.
 */
public class RealImage implements Image {

    private String fileName;

    public RealImage(String fileName){
        this.fileName = fileName;
        loadFromDisk(fileName);
    }


    @Override
    public void display() {
        System.out.println("Displaying " + fileName );
    }

    private void loadFromDisk(String fileName){
        System.out.println("Loading " + fileName );
    }
}
