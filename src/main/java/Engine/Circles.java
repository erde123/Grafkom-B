package Engine;

import org.joml.Vector3f;
import org.joml.Vector4f;

import java.util.List;

public class Circles extends Object2d{
    public Circles(List<ShaderModuleData> shaderModuleDataList, List<Vector3f> vertices, Vector4f color) {
        super(shaderModuleDataList, vertices, color);
    }

    public void createCircle(){
        float centerX = 0.1f;
        float centerY = 0.1f;
        float r = 0.03f;
        //vertices -> clear
        for(double i = 0; i<360; i+=0.01f){
            float x = (float) (centerX + r*Math.cos(i));
            float y = (float) (centerY + r*Math.sin(i));
            vertices.add(new Vector3f(x,y,0.0f));

        }
    }

    public void draw(){
        drawSetup();

    }
}
//    public void createdRectangle(){
//        int degree = 45;
//        //vertices -> clear
//        for(double i = 0; i<360; i+=0.01f){
//            double x = centerpoint.x + r*cos(teta);
//            double y = centerpoint.y + r*sin(teta);
//            vertices.add(new Vector3f(x,y,0,0f));
//            degree += 90;
//
//        }
//    }
//    public void createdTriangle(){
//        int degree = 45;
//        //vertices -> clear
//        for(double i = 0; i<360; i+=0.01f){
//            double x = centerpoint.x + r*cos(teta);
//            double y = centerpoint.y + r*sin(teta);
//            vertices.add(new Vector3f(x,y,0,0f));
//            degree += 90;
//
//        }
//}
