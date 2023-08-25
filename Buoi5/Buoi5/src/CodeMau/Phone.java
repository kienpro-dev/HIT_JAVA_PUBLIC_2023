/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CodeMau;

/**
 *
 * @author PC ACER
 */
public class Phone {
    private int id;
    private String name;
    private String colour;
    private String type;

    public void in(){
        System.out.println("Id phone:" + id);
        System.out.println("Name of phone: " + name);
        System.out.println("Colour of phone: " + colour);
        System.out.println("type of phone: " + type);
    }
    
    public Phone() {
    }

    public Phone(int id, String name, String colour, String type) {
        this.id = id;
        this.name = name;
        this.colour = colour;
        this.type = type;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    
    
}
