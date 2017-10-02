package main;

import views.*;
import models.*;
import controllers.*;
/**
 *
 * @author Azael_Mendoza
 */
public class Main {
    private static ViewMain view_main;
    private static ModelMain model_main;
    private static ControllerMain controller_main;
    
    private static ViewMessage view_message;
    private static ModelMessage model_message;
    private static ControllerMessage controller_message;
    
    public static void main (String oamg[]){
        view_message = new ViewMessage();
        model_message = new ModelMessage();
        controller_message = new ControllerMessage(view_message, model_message);
        
        view_main = new ViewMain();
        model_main = new ModelMain();
        controller_main = new ControllerMain(view_main, view_message, model_main);
    }
    
}