
package utility.json;

import org.codehaus.jackson.map.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class JSONParserWriter{

    public static void main(String[] args) {

        Country countryObj = new Country();
        countryObj.setName("India");
        countryObj.setPopulation(1000000);

        List<String> listOfStates = new ArrayList<String>();
        listOfStates.add("Madhya Pradesh");
        listOfStates.add("Maharastra");
        listOfStates.add("Rajasthan");

        //countryObj.states.addAll(listOfStates);
        countryObj.states.add(0,"TamilNadu");




        ObjectMapper mapper = new ObjectMapper();

        try {

            // Writing to a file
            mapper.writeValue(new File("src/main/resources/country.json"), countryObj );

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}