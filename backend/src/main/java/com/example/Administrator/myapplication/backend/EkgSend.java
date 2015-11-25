/*
   For step-by-step instructions on connecting your Android application to this backend module,
   see "App Engine Java Endpoints Module" template documentation at
   https://github.com/GoogleCloudPlatform/gradle-appengine-templates/tree/master/HelloEndpoints
*/

package com.example.Administrator.myapplication.backend;

import com.google.api.server.spi.config.Api;
import com.google.api.server.spi.config.ApiMethod;
import com.google.api.server.spi.config.ApiNamespace;

import javax.inject.Named;

/**
 *  An endpoint class we are exposing
 */
@Api(
        name = "sendEKG",
        version = "v1",
        namespace = @ApiNamespace(
                ownerDomain = "backend.myapplication.Administrator.example.com",
                ownerName = "backend.myapplication.Administrator.example.com",
                packagePath = ""
        )
)
public class EkgSend {

    /**
     * A simple endpoint method that takes a name and says Hi back
     */
    @ApiMethod(name = "sendEkg")
    public dataSend sendData(@Named("name") String name, @Named("timeStamp") float timeStamp, @Named("x") float x, @Named("y") float y ,@Named("z") float z){
        dataSend response = new dataSend();
        response.setX(x);
        response.setY(y);
        response.setZ(z);
        response.setTimestamp(timeStamp);
        response.setData("Hi, " + name);
        return response;
    }

}
