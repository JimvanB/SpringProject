package project1;

/**
 * Created by Jim on 4-3-2016.
 */
public class Triangle {

    private String type;

    public void draw(){
        System.out.println("triangle drawn "+getType());
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
