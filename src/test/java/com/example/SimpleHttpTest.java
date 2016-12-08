package com.example;


import com.example.Models.User;
import com.google.gson.Gson;
import com.sun.xml.internal.ws.api.pipe.FiberContextSwitchInterceptor;
import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


import java.io.IOException;

import static org.testng.Assert.assertEquals;


/**
 * Created by agab on 12/7/2016.
 */
public class SimpleHttpTest {
    private CloseableHttpClient httpClient;
    @BeforeClass
    public void setUp(){
        httpClient = HttpClients.createDefault();
    }
    @AfterClass
    public void tearDown() throws IOException{
        httpClient.close();
    }
    @Test
    public void getUserById() throws IOException {
        int userId = 1;
        String url = "http://localhost:3000/users/" + userId;

        //CloseableHttpClient httpclient = HttpClients.createDefault();
        HttpGet httpGet = new HttpGet(url);


        CloseableHttpResponse response = httpClient.execute(httpGet);

        int code = response.getStatusLine().getStatusCode();
        assertEquals(code, 200, "User list are empty!");
        //System.out.println(EntityUtils.toString((HttpEntity) response.getEntity()));
    }
    @Test
    public void getUserByIdWithModel() throws IOException {
        int userId = 10;
        String url = "http://localhost:3000/users/" + userId;

        //CloseableHttpClient httpclient = HttpClients.createDefault();
        HttpGet httpGet = new HttpGet(url);


        CloseableHttpResponse response = httpClient.execute(httpGet);

        int code = response.getStatusLine().getStatusCode();
        String responseBody = EntityUtils.toString(response.getEntity());
        assertEquals(code, 200, "User list are empty!");


        Gson gson = new Gson();
        User user = gson.fromJson(responseBody, User.class);

        assertEquals(user.getName(),"Clementina DuBuque");
        assertEquals(user.getUsername(),"Moriah.Stanton");
        assertEquals(user.getEmail(),"Rey.Padberg@karina.biz");
        /*
    
         */
    }

}
