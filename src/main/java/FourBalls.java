import processing.core.PApplet;

class Balls{
    public int diameter;
    public int xCoordinate;
    public int yCordinate;


    public Balls(int diameter,int xCoordinate, int yCordinate) {
        this.diameter = diameter;
        this.xCoordinate = xCoordinate;
        this.yCordinate = yCordinate;
    }
}




public class FourBalls extends PApplet {

    public static final int WIDTH = 640;
    public static final int HEIGHT = 480;
    int centerShifter;
    Balls[] allBalls =new Balls[4];

    public void createBalls(){
        for (int ballNUmber = 0; ballNUmber <4 ; ballNUmber++) {
            allBalls[ballNUmber]= new Balls(15,0,((ballNUmber+1)*HEIGHT)/5);
        }
    }

    public static void main(String[] args) {
        PApplet.main("FourBalls",args);
    }

    @Override
    public void settings() {
        super.settings();
        size(WIDTH, HEIGHT);
    }

    @Override
    public void draw() {
        createBalls();
        for (int ballNumber = 0; ballNumber <4 ; ballNumber++) {
            getEllipse(ballNumber);
            allBalls[ballNumber].xCoordinate++;
        }
        centerShifter++;

    }

    private void getEllipse(int ballNumber) {
        //System.out.println(ballNumber+' '+allBalls[ballNumber].yCordinate+' '+allBalls[ballNumber].diameter);
        ellipse(centerShifter*(ballNumber+1),allBalls[ballNumber].yCordinate,allBalls[ballNumber].diameter,allBalls[ballNumber].diameter);
    }


}
