
public class Artist
{
    private Circle circle;
    private Circle circle2;
    private Circle circle3;
    private Square square;
    private Triangle triangle;
    private Label label;
    private Canvas canvas;
    
    //myScene - background
    private Square sky1;
    private Square sky2;
    private Square grass1;
    private Square grass2;
    private Square road1;
    private Square road2;
    private Square road3;
    
    //myScene - night sky
    private Circle star1;
    private Circle star2;
    private Circle star3;
    private Circle star4;
    private Circle star5;
    private Circle star6;
    private Circle star7;
    private Circle moon1;
    private Circle moon2;
    
    //myScene - train
    private Square body1;
    private Square body2;
    private Square body3;
    private Square body4;
    private Square body5;
    private Square window1;
    private Square window2;
    private Square window3;
    private Square door1;
    private Square door2;
    private Square door3;
    private Circle knob;
    private Square roof1;
    private Square roof2;
    private Square roof3;
    private Square roof4;
    private Square roof5;
    private Square roof6;
    private Square roof7;
    private Square roof8;
    private Square roof9;
    private Square roof10;
    private Triangle front1;
    private Triangle front2;
    private Triangle front3;
    
    //wheels
    private Circle owheel1;
    private Circle iwheel1;
    private Circle owheel2;
    private Circle iwheel2;
    private Circle owheel3;
    private Circle iwheel3;
    private Circle owheel4;
    private Circle iwheel4;
    private Circle owheel5;
    private Circle iwheel5;
    /**
     * Constructor for objects of class Artist.
     */
    public Artist()
    {
        canvas = new Canvas("Shapes");
        circle = new Circle(canvas);
        circle2 = new Circle(canvas);
        circle3 = new Circle(canvas);
        star1 = new Circle(canvas);
        star2 = new Circle(canvas);
        star3 = new Circle(canvas);
        star4 = new Circle(canvas);
        star5 = new Circle(canvas);
        star6 = new Circle(canvas);
        star7 = new Circle(canvas);
        moon1 = new Circle(canvas);
        moon2 = new Circle(canvas);
        knob = new Circle(canvas);
        owheel1 = new Circle(canvas);
        iwheel1 = new Circle(canvas);
        owheel2 = new Circle(canvas);
        iwheel2 = new Circle(canvas);
        owheel3 = new Circle(canvas);
        iwheel3 = new Circle(canvas);
        owheel4 = new Circle(canvas);
        iwheel4 = new Circle(canvas);
        owheel5 = new Circle(canvas);
        iwheel5 = new Circle(canvas);
        square = new Square(canvas);
        sky1 = new Square(canvas);
        sky2 = new Square(canvas);
        grass1 = new Square(canvas);
        grass2 = new Square(canvas);
        road1 = new Square(canvas);
        road2 = new Square(canvas);
        road3 = new Square(canvas);
        body1 = new Square(canvas);
        body2 = new Square(canvas);
        body3 = new Square(canvas);
        body4 = new Square(canvas);
        body5 = new Square(canvas);
        window1 = new Square(canvas);
        window2 = new Square(canvas);
        window3 = new Square(canvas);
        door1 = new Square(canvas);
        door2 = new Square(canvas);
        door3 = new Square(canvas);
        roof1 = new Square(canvas);
        roof2 = new Square(canvas);
        roof3 = new Square(canvas);
        roof4 = new Square(canvas);
        roof5 = new Square(canvas);
        roof6 = new Square(canvas);
        roof7 = new Square(canvas);
        roof8 = new Square(canvas);
        roof9 = new Square(canvas);
        roof10 = new Square(canvas);
        triangle = new Triangle(canvas);
        front1 = new Triangle(canvas);
        front2 = new Triangle(canvas);
        front3 = new Triangle(canvas);
        label = new Label(canvas);
        label.setXCoord(115);
        label.setYCoord(15);
    }
    
    public void myScence()
    {
        //Background
        canvas.eraseAll();
        label.setText("The Night Train");
        label.makeVisible();
        sky1.moveTo(0,20);
        sky1.changeSize(150);
        sky1.changeColor("black");
        sky1.makeVisible();
        sky2.moveTo(150,20);
        sky2.changeSize(150);
        sky2.changeColor("black");
        sky2.makeVisible();
        grass1.moveTo(0,135);
        grass1.changeSize(180);
        grass1.changeColor("green");
        grass1.makeVisible();
        grass2.moveTo(150,135);
        grass2.changeSize(180);
        grass2.changeColor("green");
        grass2.makeVisible();
        road1.moveTo(0,180);
        road1.changeSize(100);
        road1.changeColor("light gray");
        road1.makeVisible();
        road2.moveTo(100,180);
        road2.changeSize(100);
        road2.changeColor("light gray");
        road2.makeVisible();
        road3.moveTo(200,180);
        road3.changeSize(100);
        road3.changeColor("light gray");
        road3.makeVisible();
        
        //NightSky
        star1.moveTo(10,30);
        star1.changeSize(6);
        star1.changeColor("white");
        star1.makeVisible();
        star2.moveTo(70,50);
        star2.changeSize(6);
        star2.changeColor("white");
        star2.makeVisible();
        star3.moveTo(140,50);
        star3.changeSize(6);
        star3.changeColor("white");
        star3.makeVisible();
        star4.moveTo(210,40);
        star4.changeSize(6);
        star4.changeColor("white");
        star4.makeVisible();
        star5.moveTo(180,90);
        star5.changeSize(6);
        star5.changeColor("white");
        star5.makeVisible();
        star6.moveTo(100,100);
        star6.changeSize(6);
        star6.changeColor("white");
        star6.makeVisible();
        star7.moveTo(40,80);
        star7.changeSize(6);
        star7.changeColor("white");
        star7.makeVisible();
        moon1.moveTo(260,60);
        moon1.changeSize(70);
        moon1.changeColor("yellow");
        moon1.makeVisible();
        moon2.moveTo(240,60);
        moon2.changeSize(70);
        moon2.changeColor("black");
        moon2.makeVisible();
        
        //train
        body1.moveTo(20,155);
        body1.changeSize(90);
        body1.changeColor("gray");
        body1.makeVisible();
        body2.moveTo(130,155);
        body2.changeSize(90);
        body2.changeColor("gray");
        body2.makeVisible();
        body3.moveTo(218,193);
        body3.changeSize(54);
        body3.changeColor("black");
        body3.makeVisible();
        body4.moveTo(220,195);
        body4.changeSize(50);
        body4.changeColor("dark gray");
        body4.makeVisible();
        body5.moveTo(110,210);
        body5.changeSize(20);
        body5.changeColor("black");
        body5.makeVisible();
        window1.moveTo(30,185);
        window1.changeSize(30);
        window1.changeColor("yellow");
        window1.makeVisible();
        window2.moveTo(70,185);
        window2.changeSize(30);
        window2.changeColor("yellow");
        window2.makeVisible();
        window3.moveTo(135,185);
        window3.changeSize(30);
        window3.changeColor("yellow");
        window3.makeVisible();
        door1.moveTo(190,190);
        door1.changeSize(30);
        door1.changeColor("black");
        door1.makeVisible();
        door2.moveTo(190,215);
        door2.changeSize(30);
        door2.changeColor("black");
        door2.makeVisible();
        door3.moveTo(195,195);
        door3.changeSize(20);
        door3.changeColor("light gray");
        door3.makeVisible();
        knob.moveTo(215,222);
        knob.changeSize(5);
        knob.changeColor("light gray");
        knob.makeVisible();
        front1.moveTo(270,202);
        front1.changeSize(50,15);
        front1.changeColor("gray");
        front1.makeVisible();
        front2.moveTo(270,220);
        front2.changeSize(50,15);
        front2.changeColor("gray");
        front2.makeVisible();
        front3.moveTo(270,238);
        front3.changeSize(50,15);
        front3.changeColor("gray");
        front3.makeVisible();
        roof1.moveTo(16,150);
        roof1.changeSize(20);
        roof1.changeColor("red");
        roof1.makeVisible();
        roof2.moveTo(36,150);
        roof2.changeSize(20);
        roof2.changeColor("red");
        roof2.makeVisible();
        roof3.moveTo(56,150);
        roof3.changeSize(20);
        roof3.changeColor("red");
        roof3.makeVisible();
        roof4.moveTo(76,150);
        roof4.changeSize(20);
        roof4.changeColor("red");
        roof4.makeVisible();
        roof5.moveTo(96,150);
        roof5.changeSize(20);
        roof5.changeColor("red");
        roof5.makeVisible();
        roof6.moveTo(126,150);
        roof6.changeSize(20);
        roof6.changeColor("red");
        roof6.makeVisible();
        roof7.moveTo(146,150);
        roof7.changeSize(20);
        roof7.changeColor("red");
        roof7.makeVisible();
        roof8.moveTo(166,150);
        roof8.changeSize(20);
        roof8.changeColor("red");
        roof8.makeVisible();
        roof9.moveTo(186,150);
        roof9.changeSize(20);
        roof9.changeColor("red");
        roof9.makeVisible();
        roof10.moveTo(206,150);
        roof10.changeSize(20);
        roof10.changeColor("red");
        roof10.makeVisible();
        
        //wheels
        owheel1.moveTo(40,252);
        owheel1.changeSize(25);
        owheel1.changeColor("black");
        owheel1.makeVisible();
        iwheel1.moveTo(40,252);
        iwheel1.changeSize(15);
        iwheel1.changeColor("gray");
        iwheel1.makeVisible();
        owheel2.moveTo(87,252);
        owheel2.changeSize(25);
        owheel2.changeColor("black");
        owheel2.makeVisible();
        iwheel2.moveTo(87,252);
        iwheel2.changeSize(15);
        iwheel2.changeColor("gray");
        iwheel2.makeVisible();
        owheel3.moveTo(150,252);
        owheel3.changeSize(25);
        owheel3.changeColor("black");
        owheel3.makeVisible();
        iwheel3.moveTo(150,252);
        iwheel3.changeSize(15);
        iwheel3.changeColor("gray");
        iwheel3.makeVisible();
        owheel4.moveTo(203,252);
        owheel4.changeSize(25);
        owheel4.changeColor("black");
        owheel4.makeVisible();
        iwheel4.moveTo(203,252);
        iwheel4.changeSize(15);
        iwheel4.changeColor("gray");
        iwheel4.makeVisible();
        owheel5.moveTo(250,252);
        owheel5.changeSize(25);
        owheel5.changeColor("black");
        owheel5.makeVisible();
        iwheel5.moveTo(250,252);
        iwheel5.changeSize(15);
        iwheel5.changeColor("gray");
        iwheel5.makeVisible();
    
    
    }
    /**
     * Render a scene with circle, triangle and square having default object settings 
     */
    public void scene1()
    {
        canvas.eraseAll();
        label.setText("Scene One");
        label.makeVisible();
        circle.moveTo(140,140);
        circle.changeSize(22);
        circle.changeColor("yellow");
        circle.makeVisible();
        circle2.moveTo(165,115);
        circle2.changeSize(22);
        circle2.changeColor("red");
        circle2.makeVisible();
        circle3.moveTo(180,80);
        circle3.changeSize(22);
        circle3.changeColor("green");
        circle3.makeVisible();
        square.moveTo(100,150);
        square.changeSize(30);
        square.changeColor("red");
        square.makeVisible();
        triangle.moveTo(130,130);
        triangle.changeSize(30,40);
        triangle.changeColor("green");
        triangle.makeVisible();
    }

    /**
     * Render a scene with circle, triangle and square having changed colors, sizes and positions 
     */
    public void scene2()
    {
        canvas.eraseAll();
        label.setText("Scene Two");
        label.makeVisible();
        circle.moveTo(50,50);
        circle.changeSize(50);
        circle.changeColor("red");
        circle.makeVisible();
        square.moveTo(50,60);
        square.changeSize(10);
        square.changeColor("blue");
        square.makeVisible();
        triangle.moveTo(50,15);
        triangle.changeSize(70,20);
        triangle.changeColor("black");
        triangle.makeVisible();
    }

    /**
     * Render a scene with current circle, triangle and square 
     */
    public void scene3()
    {
        canvas.eraseAll();
        label.setText("Scene Three");
        label.makeVisible();
        circle.moveTo(150,150);
        circle.makeVisible();
        square.moveTo(15,150);
        square.makeVisible();
        triangle.moveTo(285,150);
        triangle.makeVisible();
    }
}
