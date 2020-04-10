package LegoSet;

import lombok.Data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;

@XmlAccessorType(XmlAccessType.FIELD)
@Data
public class Weight{

    @XmlValue
    private double weight ;

    @XmlAttribute
    private String unit;

    public Weight() {}

    public Weight( double weight ,String unit) {
        this.unit = unit;
        this.weight= weight;
    }

}
