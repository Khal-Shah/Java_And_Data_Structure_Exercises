package ch21_notes.sect_05_maps;

import org.junit.Test;

import java.util.*;

public class TestMap_Basic
{
    @Test
    public void testHashMap()
    {
        Map<Integer, String> playerJerseys = new HashMap<>();
        playerJerseys.put(11, "Gallagher");
        playerJerseys.put(92, "Drouin");
        playerJerseys.put(9, "The Rocket");
        playerJerseys.put(22, "Goal Caufield");

//        System.out.println(playerJerseys);
        //^prints {22=Goal Caufield, 9=The Rocket, 11=Gallagher, 92=Drouin}

        //for shortcut
//        for(Integer val: playerJerseys.values())
//        {
//            System.out.println(val);
//        }

//        for(Integer jersey: playerJerseys.keySet())
//        {
//            System.out.println(jersey);
//        }

        for(Map.Entry<Integer, String> entry: playerJerseys.entrySet())
        {
            System.out.println("Key of " + entry.getKey() + " corresponds to the value of " + entry.getValue());
        }

        //with iterator:
//        Iterator<Map.Entry<String, Integer>> iterator = playerJerseys.entrySet().iterator();
        int[]                             keys     = new int[playerJerseys.size()];
        String[] values = new String[playerJerseys.size()];
        int i = 0;

        for(var entry: playerJerseys.entrySet())
        {
            keys[i] = entry.getKey();
            values[i++] = entry.getValue();
        }

        for(int j = 0; j < keys.length; j++)
        {
//            System.out.println(keys[j] + ": " + values[j]);
        }
    }

}
