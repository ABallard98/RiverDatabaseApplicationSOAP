
package riverservice;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the riverservice package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _AllRiversToString_QNAME = new QName("http://RiverService/", "allRiversToString");
    private final static QName _SearchRiver_QNAME = new QName("http://RiverService/", "searchRiver");
    private final static QName _AddRiverResponse_QNAME = new QName("http://RiverService/", "addRiverResponse");
    private final static QName _UpdateLengthResponse_QNAME = new QName("http://RiverService/", "updateLengthResponse");
    private final static QName _AddRiver_QNAME = new QName("http://RiverService/", "addRiver");
    private final static QName _AllRiversToStringResponse_QNAME = new QName("http://RiverService/", "allRiversToStringResponse");
    private final static QName _MakeTributary_QNAME = new QName("http://RiverService/", "makeTributary");
    private final static QName _MakeTributaryResponse_QNAME = new QName("http://RiverService/", "makeTributaryResponse");
    private final static QName _UpdateLength_QNAME = new QName("http://RiverService/", "updateLength");
    private final static QName _SearchByLength_QNAME = new QName("http://RiverService/", "searchByLength");
    private final static QName _SearchByLengthResponse_QNAME = new QName("http://RiverService/", "searchByLengthResponse");
    private final static QName _SearchRiverResponse_QNAME = new QName("http://RiverService/", "searchRiverResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: riverservice
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link MakeTributary }
     * 
     */
    public MakeTributary createMakeTributary() {
        return new MakeTributary();
    }

    /**
     * Create an instance of {@link AddRiver }
     * 
     */
    public AddRiver createAddRiver() {
        return new AddRiver();
    }

    /**
     * Create an instance of {@link AllRiversToStringResponse }
     * 
     */
    public AllRiversToStringResponse createAllRiversToStringResponse() {
        return new AllRiversToStringResponse();
    }

    /**
     * Create an instance of {@link UpdateLength }
     * 
     */
    public UpdateLength createUpdateLength() {
        return new UpdateLength();
    }

    /**
     * Create an instance of {@link MakeTributaryResponse }
     * 
     */
    public MakeTributaryResponse createMakeTributaryResponse() {
        return new MakeTributaryResponse();
    }

    /**
     * Create an instance of {@link SearchByLengthResponse }
     * 
     */
    public SearchByLengthResponse createSearchByLengthResponse() {
        return new SearchByLengthResponse();
    }

    /**
     * Create an instance of {@link SearchRiverResponse }
     * 
     */
    public SearchRiverResponse createSearchRiverResponse() {
        return new SearchRiverResponse();
    }

    /**
     * Create an instance of {@link SearchByLength }
     * 
     */
    public SearchByLength createSearchByLength() {
        return new SearchByLength();
    }

    /**
     * Create an instance of {@link AllRiversToString }
     * 
     */
    public AllRiversToString createAllRiversToString() {
        return new AllRiversToString();
    }

    /**
     * Create an instance of {@link SearchRiver }
     * 
     */
    public SearchRiver createSearchRiver() {
        return new SearchRiver();
    }

    /**
     * Create an instance of {@link UpdateLengthResponse }
     * 
     */
    public UpdateLengthResponse createUpdateLengthResponse() {
        return new UpdateLengthResponse();
    }

    /**
     * Create an instance of {@link AddRiverResponse }
     * 
     */
    public AddRiverResponse createAddRiverResponse() {
        return new AddRiverResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AllRiversToString }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://RiverService/", name = "allRiversToString")
    public JAXBElement<AllRiversToString> createAllRiversToString(AllRiversToString value) {
        return new JAXBElement<AllRiversToString>(_AllRiversToString_QNAME, AllRiversToString.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchRiver }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://RiverService/", name = "searchRiver")
    public JAXBElement<SearchRiver> createSearchRiver(SearchRiver value) {
        return new JAXBElement<SearchRiver>(_SearchRiver_QNAME, SearchRiver.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddRiverResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://RiverService/", name = "addRiverResponse")
    public JAXBElement<AddRiverResponse> createAddRiverResponse(AddRiverResponse value) {
        return new JAXBElement<AddRiverResponse>(_AddRiverResponse_QNAME, AddRiverResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateLengthResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://RiverService/", name = "updateLengthResponse")
    public JAXBElement<UpdateLengthResponse> createUpdateLengthResponse(UpdateLengthResponse value) {
        return new JAXBElement<UpdateLengthResponse>(_UpdateLengthResponse_QNAME, UpdateLengthResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddRiver }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://RiverService/", name = "addRiver")
    public JAXBElement<AddRiver> createAddRiver(AddRiver value) {
        return new JAXBElement<AddRiver>(_AddRiver_QNAME, AddRiver.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AllRiversToStringResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://RiverService/", name = "allRiversToStringResponse")
    public JAXBElement<AllRiversToStringResponse> createAllRiversToStringResponse(AllRiversToStringResponse value) {
        return new JAXBElement<AllRiversToStringResponse>(_AllRiversToStringResponse_QNAME, AllRiversToStringResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MakeTributary }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://RiverService/", name = "makeTributary")
    public JAXBElement<MakeTributary> createMakeTributary(MakeTributary value) {
        return new JAXBElement<MakeTributary>(_MakeTributary_QNAME, MakeTributary.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MakeTributaryResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://RiverService/", name = "makeTributaryResponse")
    public JAXBElement<MakeTributaryResponse> createMakeTributaryResponse(MakeTributaryResponse value) {
        return new JAXBElement<MakeTributaryResponse>(_MakeTributaryResponse_QNAME, MakeTributaryResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateLength }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://RiverService/", name = "updateLength")
    public JAXBElement<UpdateLength> createUpdateLength(UpdateLength value) {
        return new JAXBElement<UpdateLength>(_UpdateLength_QNAME, UpdateLength.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchByLength }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://RiverService/", name = "searchByLength")
    public JAXBElement<SearchByLength> createSearchByLength(SearchByLength value) {
        return new JAXBElement<SearchByLength>(_SearchByLength_QNAME, SearchByLength.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchByLengthResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://RiverService/", name = "searchByLengthResponse")
    public JAXBElement<SearchByLengthResponse> createSearchByLengthResponse(SearchByLengthResponse value) {
        return new JAXBElement<SearchByLengthResponse>(_SearchByLengthResponse_QNAME, SearchByLengthResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchRiverResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://RiverService/", name = "searchRiverResponse")
    public JAXBElement<SearchRiverResponse> createSearchRiverResponse(SearchRiverResponse value) {
        return new JAXBElement<SearchRiverResponse>(_SearchRiverResponse_QNAME, SearchRiverResponse.class, null, value);
    }

}
