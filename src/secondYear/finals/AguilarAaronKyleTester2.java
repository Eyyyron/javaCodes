/**
 * Name: Aaron Kyle Aguilar
 * Project: Individual Final Project 1
 * Date: April 28, 2023
 *
 * Problem: Create an application that provides options to compute areas and volumes of geometric figures/solids.
 * Let your class be named <YourName>Tester2.java. Your program should use the reference classes that
 * have been provided in the zipped project folder that comes with this specification file. You will then
 * UPLOAD ONLY ONE FILE (the file named <YourName>Tester2.java) because the files for the source codes
 * of the needed reference classes are already with the instructor. The instructor will use his copies of the
 * source codes for Shape, Circle, Rectangle, Square, Triangle Cylinder, RectangularSolid when he will
 * evaluate and test your program. Be reminded that you have to follow programming conventions, and you have to provide
 * documentations through comments (Present an algorithm through multiline comments where
 * appropriate).
 *
 * Algorithm:
 * 1. Import the necessary libraries: java.util., javax.swing., java.awt., java.awt.event., and javax.swing.event.*
 * 2. Create a class named AguilarAaronKyleTester2 that extends JFrame.
 * 3. Declare instance variables for the JMenu objects mainMenuChoice1, mainMenuChoice2, mainMenuChoice3, and subMenu.
 * 4. Declare instance variables for the JMenuItem objects itemCircle, itemTriangle, itemSquare, itemRectangle, itemCylinder, and itemRectangularSolid.
 * 5. Declare instance variables for the JFrame objects frameForCircle, frameForTriangle, frameForRectangle, frameForSquare, frameForCylinder, and frameForRectangularSolid.
 * 6. Declare an instance variable for the Shape object shape.
 * 7. Define the main() method.
 * 8. Create an object of the AguilarAaronKyleTester2 class inside the main() method.
 * 9. Define a constructor for the AguilarAaronKyleTester2 class that throws an Exception.
 * 10. Set the title of the JFrame to "Computations of Geometric Areas".
 * 11. Create a JPanel named mainPanel and set its layout to a GridLayout with 8 rows and 1 column.
 * 12.Create JLabels named mainLabel1, mainLabel2, mainLabel3, mainLabel4, mainLabel5, mainLabel6, mainLabel7, and mainLabel8 with appropriate messages and add them to mainPanel.
 * 13.Add mainPanel to the JFrame.
 * 14.Create a JMenuBar object named mb.
 * 15. Create JMenu objects named mainMenuChoice1, mainMenuChoice2, and mainMenuChoice3.
 * 16. Create a JMenuItem object named quit with the label "Close this Application" and add an ActionListener to it that will close the application when selected.
 * 17. Add the quit JMenuItem to mainMenuChoice3.
 * 18. Create a JMenu object named subMenu with the label "Area of a Four-sided Polygon".
 * 19. Create JMenuItem objects named itemCircle, itemTriangle, itemRectangle, and itemSquare with appropriate labels.
 * 20. Add an ActionListener to itemCircle that will call the showCircleUI() method when selected.
 * 21. Add an ActionListener to itemTriangle that will call the showTriangleUI() method when selected.
 * 22. Add an ActionListener to itemRectangle that will call the showRectangleUI() method when selected.
 * 23. Add an ActionListener to itemSquare that will call the showSquareUI() method when selected.
 * 24. Create JMenuItem objects named itemCylinder and itemRectangularSolid with appropriate labels.
 * 25. Add an ActionListener to itemCylinder that will call the showCylinderUI() method when selected.
 * 26. Add an ActionListener to itemRectangularSolid that will call the showRectangularSolidUI() method when selected.
 * 27. Add the JMenuItems itemCircle, itemTriangle, itemRectangle, and itemSquare to mainMenuChoice1.
 * 28. Add subMenu to mainMenuChoice1.
 * 29. Add mainMenuChoice1, mainMenuChoice2, and mainMenuChoice3 to mb.
 * 30. Add itemCylinder and itemRectangularSolid to mainMenuChoice2.
 * 31. Set the JMenuBar of the JFrame to mb.
 * 32. Set the size of the JFrame to 500x500 and pack it.
 * 33. Define methods named showCircleUI(), showTriangleUI(), showRectangleUI(), showSquareUI(), showCylinderUI(), and showRectangularSolidUI() that will create JFrames for each geometric figure and compute their respective areas/volumes.
 *
 * Analysis:
 *
 * Input:
 * 1. The user selects a geometric figure from the menu.
 * 2. The user enters the necessary measurements of the selected geometric figure.
 *
 * Process:
 * 1. The program computes the area or volume of the selected figure based on the input measurements.
 * 2. The program displays the computed result in a new window.
 *
 * Output:
 * 1. The computed area or volume of the selected geometric figure is displayed to the user.
 */

package secondYear.finals;
// Import necessary classes and packages
import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.event.MenuEvent;
import javax.swing.event.MenuListener;

// Define the class and inherit from JFrame
public class AguilarAaronKyleTester2 extends JFrame{

    // Define the menu items and frames needed
    private JMenu mainMenuChoice1;
    private JMenu mainMenuChoice2;
    //private JMenu mainMenuExitChoice;
    private JMenu mainMenuChoice3;
    private JMenu subMenu;
    private JMenuItem itemCircle;
    private JMenuItem itemTriangle;
    private JMenuItem itemSquare;
    private JMenuItem itemRectangle;
    private JMenuItem itemCylinder;
    private JMenuItem itemRectangularSolid;
    private JFrame frameForCircle;
    private JFrame frameForTriangle;
    private JFrame frameForRectangle;
    private JFrame frameForSquare;
    private JFrame frameForCylinder;
    private JFrame frameForRectangularSolid;
    private Shape shape;

    // Main method to instantiate the class
    public static void main(String[] args){
        AguilarAaronKyleTester2 program;
        try {
            program = new AguilarAaronKyleTester2();
        } catch(Exception exx){
            exx.printStackTrace();
        }
    }  // end of main method

    // Constructor method to set up the GUI
    public AguilarAaronKyleTester2() throws Exception{
        setTitle("Computations of Geometric Areas" );

        // Create a JPanel to hold the labels and add it to the frame
        JPanel mainPanel = new JPanel();
        //mainPanel.setFont(new Font(Font.SANS_SERIF, Font.BOLD,60));
        mainPanel.setLayout(new GridLayout(8,1));
        JLabel mainLabel1 = new JLabel("Hello User!");
        JLabel mainLabel2 = new JLabel("This application helps you compute the area of a simple geometric figure.");
        JLabel mainLabel3 = new JLabel("Please choose the geometric figure from the menu.");
        JLabel mainLabel6 = new JLabel("----------------------------------------------------------------------------------------");
        JLabel mainLabel7 = new JLabel("Close the window showing the data for a geometric figure before choosing another figure.");
        JLabel mainLabel8 = new JLabel("----------------------------------------------------------------------------------------");
        JLabel mainLabel4 = new JLabel("Programmer: Aaron Kyle Aguilar");
        GregorianCalendar dateToday = new GregorianCalendar();
        String today = "Today is "+ dateToday.getTime() +".";
        JLabel mainLabel5 = new JLabel(today);
        mainPanel.add(mainLabel5);
        mainPanel.add(mainLabel1);
        mainPanel.add(mainLabel2);
        mainPanel.add(mainLabel3);
        mainPanel.add(mainLabel6);
        mainPanel.add(mainLabel7);
        mainPanel.add(mainLabel8);
        mainPanel.add(mainLabel4);
        add(mainPanel);

        // Create a JMenuBar and menu items
        JMenuBar mb =new JMenuBar();
        mainMenuChoice1 = new JMenu("AREA of a Geometric Figure");
        mainMenuChoice2 = new JMenu("VOLUME of a Solid");
        mainMenuChoice3 = new JMenu("Exit");
        /*
        // The following may replace mainMenuChoice2 so that exit may be done immediately after choosing Exit
        mainMenuExitChoice = new JMenu("Exit");
        mainMenuExitChoice.addMenuListener(new MenuListener() {
            public void menuSelected(MenuEvent e) {
                System.exit(0);
            }

            public void menuDeselected(MenuEvent e) {
               // System.out.println("menuDeselected");
               // This method must be implemented here because it is an abstract method of the MenuListener interface

            }

            public void menuCanceled(MenuEvent e) {
                //System.out.println("menuCanceled");
                // This method must be implemented here because it is an abstract method of the MenuListener interface

            }
        });
        */

        // Add a quit menu item to exit the program
        JMenuItem quit = new JMenuItem("Close this Application");
        quit.addActionListener((e)-> System.exit(0));
        /* An anonymous function (i.e. lambda expression) may be used because ActionListener is a Functional Interface, */
        mainMenuChoice3.add(quit);

        // Create submenus and menu items for each shape and add action listeners to show their respective frames
        subMenu = new JMenu("Area of a Four-sided Polygon");
        itemCircle=new JMenuItem("Area of a Circle");

        // Add an action listener to show the UI for calculating the area of a circle
        itemCircle.addActionListener((e)-> {
            try {
                showCircleUI();
            } catch (Exception ex){
                ex.printStackTrace();
            }
        });
        itemTriangle=new JMenuItem("Area of a Triangle");
        // Add an action listener to show the UI for calculating the area of a triangle
        itemTriangle.addActionListener((e)-> {
            try {
                showTriangleUI();
            } catch (Exception e2){
                e2.printStackTrace();
            }
        });
        itemRectangle=new JMenuItem("Area of a Rectangle");
        // Add an action listener to show the UI for calculating the area of a rectangle
        itemRectangle.addActionListener((e)-> {
            try {
                showRectangleUI();
            } catch (Exception e3){
                e3.printStackTrace();
            }
        });
        itemSquare=new JMenuItem("Area of a Square");
        // Add an action listener to show the UI for calculating the area of a square
        itemSquare.addActionListener((e)-> {
            try {
                showSquareUI();
            } catch (Exception e4){
                e4.printStackTrace();
            }
        });

        itemCylinder=new JMenuItem("Volume of a Cylinder");
        // Add an action listener to show the UI for calculating the volume of a cylinder
        itemCylinder.addActionListener((e)-> {
            try {
                showCylinderUI();
            } catch (Exception e5){
                e5.printStackTrace();
            }
        });

        itemRectangularSolid=new JMenuItem("Volume of a Rectangular Box");
        // Add an action listener to show the UI for calculating the volume of a rectangular box
        itemRectangularSolid.addActionListener((e)-> {
            try {
                showRectangularSolidUI();
            } catch (Exception e6){
                e6.printStackTrace();
            }
        });

        // Add menu items to the main menu and sub-menu
        mainMenuChoice1.add(itemCircle);
        mainMenuChoice1.add(itemTriangle);

        subMenu.add(itemRectangle);
        subMenu.add(itemSquare);

        // Add the sub-menu to the main menu bar
        mainMenuChoice1.add(subMenu);
        mb.add(mainMenuChoice1);
        mb.add(mainMenuChoice2);
        //mb.add(mainMenuExitChoice); /* needed in place of add(mainMenuChoice2 with the code in above comment */
        mb.add(mainMenuChoice3);

        // Add menu items to the second main menu
        mainMenuChoice2.add(itemCylinder);
        mainMenuChoice2.add(itemRectangularSolid);

        // Set the menu bar and window size, and make the window visible
        setJMenuBar(mb);
        setSize(500,500);
        pack();

        setVisible(true);
        // Set the close operation when the window is closed
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }  // end of AguilarAaronKyleTester2

    // This method shows a UI for calculating the area of a circle
    private void showCircleUI() throws Exception{

        // Creates a new JFrame object with title "Area of a Circle"
        frameForCircle = new JFrame("Area of a Circle");

        JPanel circlePanel = new JPanel();
        JLabel radiusInputLabel = new JLabel("Enter the radius of the circle ");
        JTextField radiusTextField = new JTextField(20);
        JTextField circleOutputTextField = new JTextField(60);
        circleOutputTextField.setEditable(false);
        JButton circleOutputButton = new JButton("Click to show area of the circle");
        circlePanel.setLayout(new GridLayout(2,2));
        circlePanel.add(radiusInputLabel);
        circlePanel.add(radiusTextField);
        circlePanel.add(circleOutputButton);
        circlePanel.add(circleOutputTextField);

        circleOutputButton.addActionListener((e) -> {
            if (!radiusTextField.getText().equals("")) {
                double radius = Double.parseDouble(radiusTextField.getText());
                //shape = new Circle("circle", radius);
                //if (shape instanceof Circle)
                    //circleOutputTextField.setText("The area of " + ((Circle) shape).toString() + " is " + ((Circle) shape).area() + " square units.");
                //else
                    circleOutputTextField.setText("No circle has been instantiated.");
            }
            else
                circleOutputTextField.setText("You have to enter the radius of the circle.");
        });

        frameForCircle.getContentPane().add(circlePanel);
        frameForCircle.pack();
        frameForCircle.setVisible(true);
        frameForCircle.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);


    } // end showCircleUI method


    // This method shows a UI for calculating the area of a triangle
    private void showTriangleUI(){

        frameForTriangle = new JFrame("Area of a Triangle");

        JLabel inputLabel1 = new JLabel("Enter the length of the first side of the triangle");
        JLabel inputLabel2 = new JLabel("Enter the length of the second side of the triangle");
        JLabel inputLabel3 = new JLabel("Enter the length of the third side of the triangle");

        JTextField side1TextField = new JTextField(20);
        JTextField side2TextField = new JTextField(20);
        JTextField side3TextField = new JTextField(20);
        JButton triangleOutputButton = new JButton("Click to show area of the triangle");
        JTextField triangleOutputTextField = new JTextField(60);
        triangleOutputTextField.setEditable(false);

        JPanel trianglePanel = new JPanel();
        trianglePanel.setLayout(new GridLayout(4,2));

        trianglePanel.add(inputLabel1);
        trianglePanel.add(side1TextField);
        trianglePanel.add(inputLabel2);
        trianglePanel.add(side2TextField);
        trianglePanel.add(inputLabel3);
        trianglePanel.add(side3TextField);
        trianglePanel.add(triangleOutputButton);
        trianglePanel.add(triangleOutputTextField);

        triangleOutputButton.addActionListener((e)->{
            if (side1TextField.getText().equals("")|| side2TextField.getText().equals("")|| side3TextField.getText().equals(""))
                triangleOutputTextField.setText("You have to enter the length of each of the 3 sides");
            else {
                double side1 = Double.parseDouble(side1TextField.getText());
                double side2 = Double.parseDouble(side2TextField.getText());
                double side3 = Double.parseDouble(side3TextField.getText());

                if (!(((side1 + side2) > side3) && ((side1 + side3) > side2) && ((side2 + side3) > side1))) {
                    triangleOutputTextField.setText("The area cannot be computed because the given lengths of sides do not form a valid triangle.");
                } else {
                    //shape = new Triangle("triangle", side1, side2, side3);
                    //if (shape instanceof Triangle)
                        //triangleOutputTextField.setText("The area of " + shape.toString() + " is " + ((Triangle) shape).area() + " square units.");
                    //else
                        triangleOutputTextField.setText("No triangle has been instantiated");
                }
            }
        });

        frameForTriangle.getContentPane().add(trianglePanel);
        frameForTriangle.pack();
        frameForTriangle.setVisible(true);
        frameForTriangle.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);


    } // end showTriangleUI method

    // This method shows a UI for calculating the area of a square
    private void showSquareUI() throws Exception{
        frameForSquare = new JFrame("Area of a Square");

        JLabel inputLabel = new JLabel("Enter the length of the side of the square");

        JTextField sideTextField = new JTextField(20);

        JButton squareOutputButton = new JButton("Click to show area of the square");
        JTextField squareOutputTextField = new JTextField(60);
        squareOutputTextField.setEditable(false);

        JPanel squarePanel = new JPanel();
        squarePanel.setLayout(new GridLayout(2,2));

        squarePanel.add(inputLabel);
        squarePanel.add(sideTextField);
        squarePanel.add(squareOutputButton);
        squarePanel.add(squareOutputTextField);

        squareOutputButton.addActionListener((e)->{
            if (!sideTextField.getText().equals("")) {
                double side = Double.parseDouble(sideTextField.getText());
                //shape = new Square("square", side);
                //if (shape instanceof  Square)
                    //squareOutputTextField.setText("The area of " + shape.toString() + " is " + ((Square) shape).area() + " square units.");
                //else
                    squareOutputTextField.setText("No square has been instantiated");
            }
            else
                squareOutputTextField.setText("You have to enter the measurement of the side of the square.");
        });

        frameForSquare.getContentPane().add(squarePanel);
        frameForSquare.pack();
        frameForSquare.setVisible(true);
        frameForSquare.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    } // end of showSquareUI method

    // This method shows a UI for calculating the area of a rectangle
    private void showRectangleUI() throws Exception{

        frameForRectangle = new JFrame("Area of a Rectangle");

        JLabel inputLabel1 = new JLabel("Enter the length of the rectangle");
        JTextField lengthTextField = new JTextField(20);
        JLabel inputLabel2 = new JLabel("Enter the width of the rectangle");
        JTextField widthTextField = new JTextField(20);

        JButton rectangleOutputButton = new JButton("Click to show area of the rectangle");
        JTextField rectangleOutputTextField = new JTextField(60);
        rectangleOutputTextField.setEditable(false);

        JPanel rectanglePanel = new JPanel();
        rectanglePanel.setLayout(new GridLayout(3,2));

        rectanglePanel.add(inputLabel1);
        rectanglePanel.add(lengthTextField);
        rectanglePanel.add(inputLabel2);
        rectanglePanel.add(widthTextField);
        rectanglePanel.add(rectangleOutputButton);
        rectanglePanel.add(rectangleOutputTextField);

        rectangleOutputButton.addActionListener((e)->{
            if (lengthTextField.getText().equals("") || widthTextField.getText().equals(""))
                rectangleOutputTextField.setText("You have to enter the length and width of the rectangle.");
            else {
                double length = Double.parseDouble(lengthTextField.getText());
                double width = Double.parseDouble(widthTextField.getText());
                //shape = new Rectangle("rectangle", length, width);
                if (shape instanceof Rectangle)
                    //rectangleOutputTextField.setText("The area of " + shape.toString() + " is " + ((Rectangle) shape).area() + " square units.");
                //else
                    rectangleOutputTextField.setText("No rectangle has been instantiated.");
            }
        });

        frameForRectangle.getContentPane().add(rectanglePanel);
        frameForRectangle.pack();
        frameForRectangle.setVisible(true);
        frameForRectangle.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    } // end of showRectangleUI method


    // This method shows a UI for calculating the volume of a cylinder
    private void showCylinderUI() throws Exception{

        frameForCylinder = new JFrame("Volume of a Cylinder");

        JPanel cylinderPanel = new JPanel();
        JLabel radiusInputLabel = new JLabel("Enter the radius of the Cylinder");
        JTextField radiusTextField = new JTextField(20);
        JLabel heightInputLabel = new JLabel("Enter the height of the Cylinder");
        JTextField heightTextField = new JTextField(20);

        JTextField cylinderOutputTextField = new JTextField(60);
        cylinderOutputTextField.setEditable(false);

        JButton cylinderOutputButton = new JButton("Click to show area of the Cylinder");
        cylinderPanel.setLayout(new GridLayout(3,2));

        cylinderPanel.add(radiusInputLabel);
        cylinderPanel.add(radiusTextField);
        cylinderPanel.add(heightInputLabel);
        cylinderPanel.add(heightTextField);
        cylinderPanel.add(cylinderOutputButton);
        cylinderPanel.add(cylinderOutputTextField);

        cylinderOutputButton.addActionListener((e) -> {
            if (!radiusTextField.getText().equals("") && !heightTextField.getText().equals("")) {
                double radius = Double.parseDouble(radiusTextField.getText());
                double height = Double.parseDouble(heightTextField.getText());
                //shape = new Cylinder("cylinder", radius, height);
                //cylinderOutputTextField.setText("The volume of " + shape.toString() + " is " + ((Cylinder) shape).volume() + " cubic units.");
            }
            else
                cylinderOutputTextField.setText("You have to enter both the radius and height of the Cylinder.");
        });

        frameForCylinder.getContentPane().add(cylinderPanel);
        frameForCylinder.pack();
        frameForCylinder.setVisible(true);
        frameForCylinder.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    } // end of showCylinderUI method


    // This method shows a UI for calculating the volume of a rectangular solid
    private void showRectangularSolidUI() throws Exception {

        frameForRectangularSolid = new JFrame("Volume of a Rectangular Solid");

        JLabel inputLabel1 = new JLabel("Enter the length of the Rectangular Solid");
        JTextField lengthTextField = new JTextField(20);
        JLabel inputLabel2 = new JLabel("Enter the width of the Rectangular Solid");
        JTextField widthTextField = new JTextField(20);
        JLabel inputLabel3 = new JLabel("Enter the height of the Rectangular Solid");
        JTextField heightTextField = new JTextField(20);

        JButton rectangularSolidOutputButton = new JButton("Click to show volume of the Rectangular Solid");
        JTextField rectangularSolidOutputTextField = new JTextField(60);
        rectangularSolidOutputTextField.setEditable(false);

        JPanel rectangularSolidPanel = new JPanel();
        rectangularSolidPanel.setLayout(new GridLayout(4, 2));

        rectangularSolidPanel.add(inputLabel1);
        rectangularSolidPanel.add(lengthTextField);
        rectangularSolidPanel.add(inputLabel2);
        rectangularSolidPanel.add(widthTextField);
        rectangularSolidPanel.add(inputLabel3);
        rectangularSolidPanel.add(heightTextField);
        rectangularSolidPanel.add(rectangularSolidOutputButton);
        rectangularSolidPanel.add(rectangularSolidOutputTextField);

        rectangularSolidOutputButton.addActionListener((e) -> {
            if (lengthTextField.getText().equals("") || widthTextField.getText().equals("") || heightTextField.getText().equals(""))
                rectangularSolidOutputTextField.setText("You have to enter the length, width and height of the Rectangular Solid.");
            else {
                double length = Double.parseDouble(lengthTextField.getText());
                double width = Double.parseDouble(widthTextField.getText());
                double height = Double.parseDouble(heightTextField.getText());
                //shape = new RectangularSolid("rectangular solid", length, width, height);
                //if (shape instanceof RectangularSolid)
                    //rectangularSolidOutputTextField.setText("The volume of " + shape.toString() + " is " + ((RectangularSolid) shape).volume() + " cubic units.");
                //else
                    rectangularSolidOutputTextField.setText("No Rectangular Solid has been instantiated.");
            }
        });

        frameForRectangularSolid.getContentPane().add(rectangularSolidPanel);
        frameForRectangularSolid.pack();
        frameForRectangularSolid.setVisible(true);
        frameForRectangularSolid.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    } // end of showRectangularSolidUI method

} // end of class AguilarAaronKyleTester2