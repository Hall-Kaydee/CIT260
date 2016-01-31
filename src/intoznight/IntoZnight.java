/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package intoznight;

import byui.cit260.intoZnight.model.ConversationScene;
import byui.cit260.intoZnight.model.EventScene;
import byui.cit260.intoZnight.model.Locations;
import byui.cit260.intoZnight.model.NormalScene;

/**
 *
 * @author kaydee
 */
public class IntoZnight {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Locations locationOne = new Locations();
        
        locationOne.setType("firestation");
        locationOne.setTimeOfDay(7.00);
        
        String locationInfo = locationOne.toString();
        System.out.println(locationInfo);
       //instantiating a normal scene   
        NormalScene normalScene = new NormalScene();
        
        normalScene.setDescription("Normal");
        normalScene.setTravelDistance(7.00);
        
        normalScene.leaveArea();
        normalScene.searchArea();
        
        //instantiating a conversation scene
        ConversationScene conversationScene = new ConversationScene();
        
        conversationScene.setDescription("location info?");
        conversationScene.setTravelDistance(7.00);
        
        conversationScene.leaveArea();
        conversationScene.searchArea();
        conversationScene.talk();
        
        //instantiating an event scene
        EventScene eventScene = new EventScene();
        
        eventScene.setDescription("location info?");
        eventScene.setTravelDistance(7.00);
        
        eventScene.leaveArea();
        eventScene.searchArea();
        eventScene.attack();
        eventScene.sneak();
        eventScene.waitScene();
        
    }
    
}
