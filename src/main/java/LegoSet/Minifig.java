package LegoSet;

import lombok.Data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;

@XmlAccessorType(XmlAccessType.FIELD)

public class Minifig {

    @XmlAttribute
    private int count ;


    @XmlValue
    private String charachter;

    public Minifig( int count,String charachter) {
        this.charachter = charachter ;
        this.count= count;
    }



}
