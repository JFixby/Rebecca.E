//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.3 in JDK 1.6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2009.10.16 at 07:12:54 PM CEST 
//


package rebecca.e26.dialogs.xmlmatrix;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.*;
@XmlRootElement

/**
 * <p>Java class for xABoolean complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="xABoolean">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.example.org/rebecca.e.dialogs}xAxis">
 *       &lt;sequence>
 *         &lt;element name="default" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "xABoolean", propOrder = {
    "_default"
})
public class XABoolean
    extends XAxis
{

    @XmlElement(name = "default", required = true)
    protected String _default;

    /**
     * Gets the value of the default property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDefault() {
        return _default;
    }

    /**
     * Sets the value of the default property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDefault(String value) {
        this._default = value;
    }

}
