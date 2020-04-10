package LegoSet;

import album.Album;
import jaxb.JAXBHelper;

import java.net.URL;
import java.time.Year;
import java.util.ArrayList;
import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String[] args) throws Exception {


    Legoset legoset = new Legoset();
        legoset.setNumber("75211");
        legoset.setName("Imperial TIE Fighter");
        legoset.setTheme("Star Wars");
        legoset.setSubtheme("Solo");
        legoset.setYear(Year.of(2018));
        legoset.setPieces(519);
        legoset.setTags(List.of("Starfighter", "Stormtrooper", "Star Wars","Solo"));

        ArrayList<Minifig> minifigs = new ArrayList<>();
        minifigs.add(new Minifig(2, "Imperial Mudtrooper"));
        minifigs.add(new Minifig(1, "Imperial Pilot"));
        minifigs.add(new Minifig(1, "Mimban Stormtrooper"));
        legoset.setMinifigs(minifigs);
        legoset.setWeight(new Weight(0.89,"kg"));
        legoset.setUrl(new URL("https://brickset.com/sets/75211-1/Imperial-TIE-Fighter"));



        JAXBHelper.toXML(legoset, System.out);


}

}

