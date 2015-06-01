
package com.wty.client;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.wty.client package. 
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

    private final static QName _SetResponse_QNAME = new QName("http://service.wty.com/", "setResponse");
    private final static QName _MultiResponse_QNAME = new QName("http://service.wty.com/", "multiResponse");
    private final static QName _Multi_QNAME = new QName("http://service.wty.com/", "multi");
    private final static QName _HashGet_QNAME = new QName("http://service.wty.com/", "hash_get");
    private final static QName _HashGetResponse_QNAME = new QName("http://service.wty.com/", "hash_getResponse");
    private final static QName _HashSetResponse_QNAME = new QName("http://service.wty.com/", "hash_setResponse");
    private final static QName _HashSet_QNAME = new QName("http://service.wty.com/", "hash_set");
    private final static QName _HincreResponse_QNAME = new QName("http://service.wty.com/", "hincreResponse");
    private final static QName _GetValue_QNAME = new QName("http://service.wty.com/", "getValue");
    private final static QName _Set_QNAME = new QName("http://service.wty.com/", "set");
    private final static QName _SelectDB_QNAME = new QName("http://service.wty.com/", "selectDB");
    private final static QName _Get_QNAME = new QName("http://service.wty.com/", "get");
    private final static QName _GetValueResponse_QNAME = new QName("http://service.wty.com/", "getValueResponse");
    private final static QName _SelectDBResponse_QNAME = new QName("http://service.wty.com/", "selectDBResponse");
    private final static QName _GetResponse_QNAME = new QName("http://service.wty.com/", "getResponse");
    private final static QName _FlushDBResponse_QNAME = new QName("http://service.wty.com/", "flushDBResponse");
    private final static QName _StartRedisResponse_QNAME = new QName("http://service.wty.com/", "startRedisResponse");
    private final static QName _StartRedis_QNAME = new QName("http://service.wty.com/", "startRedis");
    private final static QName _FlushDB_QNAME = new QName("http://service.wty.com/", "flushDB");
    private final static QName _Hincre_QNAME = new QName("http://service.wty.com/", "hincre");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.wty.client
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetValue }
     * 
     */
    public GetValue createGetValue() {
        return new GetValue();
    }

    /**
     * Create an instance of {@link HincreResponse }
     * 
     */
    public HincreResponse createHincreResponse() {
        return new HincreResponse();
    }

    /**
     * Create an instance of {@link HashSet }
     * 
     */
    public HashSet createHashSet() {
        return new HashSet();
    }

    /**
     * Create an instance of {@link Get }
     * 
     */
    public Get createGet() {
        return new Get();
    }

    /**
     * Create an instance of {@link GetValueResponse }
     * 
     */
    public GetValueResponse createGetValueResponse() {
        return new GetValueResponse();
    }

    /**
     * Create an instance of {@link SelectDB }
     * 
     */
    public SelectDB createSelectDB() {
        return new SelectDB();
    }

    /**
     * Create an instance of {@link Set }
     * 
     */
    public Set createSet() {
        return new Set();
    }

    /**
     * Create an instance of {@link SelectDBResponse }
     * 
     */
    public SelectDBResponse createSelectDBResponse() {
        return new SelectDBResponse();
    }

    /**
     * Create an instance of {@link GetResponse }
     * 
     */
    public GetResponse createGetResponse() {
        return new GetResponse();
    }

    /**
     * Create an instance of {@link FlushDB }
     * 
     */
    public FlushDB createFlushDB() {
        return new FlushDB();
    }

    /**
     * Create an instance of {@link Hincre }
     * 
     */
    public Hincre createHincre() {
        return new Hincre();
    }

    /**
     * Create an instance of {@link StartRedisResponse }
     * 
     */
    public StartRedisResponse createStartRedisResponse() {
        return new StartRedisResponse();
    }

    /**
     * Create an instance of {@link StartRedis }
     * 
     */
    public StartRedis createStartRedis() {
        return new StartRedis();
    }

    /**
     * Create an instance of {@link FlushDBResponse }
     * 
     */
    public FlushDBResponse createFlushDBResponse() {
        return new FlushDBResponse();
    }

    /**
     * Create an instance of {@link Multi }
     * 
     */
    public Multi createMulti() {
        return new Multi();
    }

    /**
     * Create an instance of {@link MultiResponse }
     * 
     */
    public MultiResponse createMultiResponse() {
        return new MultiResponse();
    }

    /**
     * Create an instance of {@link SetResponse }
     * 
     */
    public SetResponse createSetResponse() {
        return new SetResponse();
    }

    /**
     * Create an instance of {@link HashSetResponse }
     * 
     */
    public HashSetResponse createHashSetResponse() {
        return new HashSetResponse();
    }

    /**
     * Create an instance of {@link HashGetResponse }
     * 
     */
    public HashGetResponse createHashGetResponse() {
        return new HashGetResponse();
    }

    /**
     * Create an instance of {@link HashGet }
     * 
     */
    public HashGet createHashGet() {
        return new HashGet();
    }

    /**
     * Create an instance of {@link Transaction }
     * 
     */
    public Transaction createTransaction() {
        return new Transaction();
    }

    /**
     * Create an instance of {@link BinaryTransaction }
     * 
     */
    public BinaryTransaction createBinaryTransaction() {
        return new BinaryTransaction();
    }

    /**
     * Create an instance of {@link Queable }
     * 
     */
    public Queable createQueable() {
        return new Queable();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.wty.com/", name = "setResponse")
    public JAXBElement<SetResponse> createSetResponse(SetResponse value) {
        return new JAXBElement<SetResponse>(_SetResponse_QNAME, SetResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MultiResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.wty.com/", name = "multiResponse")
    public JAXBElement<MultiResponse> createMultiResponse(MultiResponse value) {
        return new JAXBElement<MultiResponse>(_MultiResponse_QNAME, MultiResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Multi }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.wty.com/", name = "multi")
    public JAXBElement<Multi> createMulti(Multi value) {
        return new JAXBElement<Multi>(_Multi_QNAME, Multi.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HashGet }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.wty.com/", name = "hash_get")
    public JAXBElement<HashGet> createHashGet(HashGet value) {
        return new JAXBElement<HashGet>(_HashGet_QNAME, HashGet.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HashGetResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.wty.com/", name = "hash_getResponse")
    public JAXBElement<HashGetResponse> createHashGetResponse(HashGetResponse value) {
        return new JAXBElement<HashGetResponse>(_HashGetResponse_QNAME, HashGetResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HashSetResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.wty.com/", name = "hash_setResponse")
    public JAXBElement<HashSetResponse> createHashSetResponse(HashSetResponse value) {
        return new JAXBElement<HashSetResponse>(_HashSetResponse_QNAME, HashSetResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HashSet }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.wty.com/", name = "hash_set")
    public JAXBElement<HashSet> createHashSet(HashSet value) {
        return new JAXBElement<HashSet>(_HashSet_QNAME, HashSet.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HincreResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.wty.com/", name = "hincreResponse")
    public JAXBElement<HincreResponse> createHincreResponse(HincreResponse value) {
        return new JAXBElement<HincreResponse>(_HincreResponse_QNAME, HincreResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetValue }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.wty.com/", name = "getValue")
    public JAXBElement<GetValue> createGetValue(GetValue value) {
        return new JAXBElement<GetValue>(_GetValue_QNAME, GetValue.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Set }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.wty.com/", name = "set")
    public JAXBElement<Set> createSet(Set value) {
        return new JAXBElement<Set>(_Set_QNAME, Set.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SelectDB }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.wty.com/", name = "selectDB")
    public JAXBElement<SelectDB> createSelectDB(SelectDB value) {
        return new JAXBElement<SelectDB>(_SelectDB_QNAME, SelectDB.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Get }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.wty.com/", name = "get")
    public JAXBElement<Get> createGet(Get value) {
        return new JAXBElement<Get>(_Get_QNAME, Get.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetValueResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.wty.com/", name = "getValueResponse")
    public JAXBElement<GetValueResponse> createGetValueResponse(GetValueResponse value) {
        return new JAXBElement<GetValueResponse>(_GetValueResponse_QNAME, GetValueResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SelectDBResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.wty.com/", name = "selectDBResponse")
    public JAXBElement<SelectDBResponse> createSelectDBResponse(SelectDBResponse value) {
        return new JAXBElement<SelectDBResponse>(_SelectDBResponse_QNAME, SelectDBResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.wty.com/", name = "getResponse")
    public JAXBElement<GetResponse> createGetResponse(GetResponse value) {
        return new JAXBElement<GetResponse>(_GetResponse_QNAME, GetResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FlushDBResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.wty.com/", name = "flushDBResponse")
    public JAXBElement<FlushDBResponse> createFlushDBResponse(FlushDBResponse value) {
        return new JAXBElement<FlushDBResponse>(_FlushDBResponse_QNAME, FlushDBResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StartRedisResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.wty.com/", name = "startRedisResponse")
    public JAXBElement<StartRedisResponse> createStartRedisResponse(StartRedisResponse value) {
        return new JAXBElement<StartRedisResponse>(_StartRedisResponse_QNAME, StartRedisResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StartRedis }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.wty.com/", name = "startRedis")
    public JAXBElement<StartRedis> createStartRedis(StartRedis value) {
        return new JAXBElement<StartRedis>(_StartRedis_QNAME, StartRedis.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FlushDB }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.wty.com/", name = "flushDB")
    public JAXBElement<FlushDB> createFlushDB(FlushDB value) {
        return new JAXBElement<FlushDB>(_FlushDB_QNAME, FlushDB.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Hincre }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.wty.com/", name = "hincre")
    public JAXBElement<Hincre> createHincre(Hincre value) {
        return new JAXBElement<Hincre>(_Hincre_QNAME, Hincre.class, null, value);
    }

}
