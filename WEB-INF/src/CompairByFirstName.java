package youcanthide;

import java.util.Comparator;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Christopher Manglos
 */
public class CompairByFirstName implements Comparator<Player>{
    public int compare(Player p1, Player p2) {
        return p1.getFirstName().compareTo(p2.getFirstName());
    }   
}
