
package com.example.springwsclient.jaxb;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "productAction", targetNamespace = "http://www.sample.com/schemas")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@XmlSeeAlso({
    ObjectFactory.class
})
public interface ProductAction {


    /**
     * 
     * @param productRequest
     * @return
     *     returns com.sample.schemas.ProductResponse
     */
    @WebMethod
    @WebResult(name = "productResponse", targetNamespace = "http://www.sample.com/schemas", partName = "productResponse")
    public ProductResponse product(
        @WebParam(name = "productRequest", targetNamespace = "http://www.sample.com/schemas", partName = "productRequest")
        ProductRequest productRequest);

}
